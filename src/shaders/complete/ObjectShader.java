package shaders.complete;

import com.jogamp.opengl.GL4;

public class ObjectShader extends CompleteShader {

    public static final String vertexSrc =
            "#version 410 core \n" +
            "layout(location = 0) in vec3 vertexPosition;\n" +
            "layout(location = 1) in vec2 vertexTexPos;\n" +
            "layout(location = 2) in vec3 vertexNormal;\n"+
            "out VS_OUT{\n" +
            "vec3 FragPos;\n"+
            "vec3 Normal;\n"+
            "vec2 TexCords;\n"+
            "vec4 FragPosLightSpace;\n"+
            "} vs_out;\n"+
            "uniform mat4 viewProjection;\n" +
            "uniform mat4 model;\n"+
            "uniform mat4 lightSpace;"+
            "void main()\n" +
            "{\n" +
            "vs_out.FragPos = vec3(model * vec4(vertexPosition, 1.0));\n"+
            "vs_out.Normal = transpose(inverse(mat3(model))) * vertexNormal;\n"+
            "vs_out.TexCords = vertexTexPos;\n"+
            "vs_out.FragPosLightSpace = lightSpace * vec4(vs_out.FragPos, 1.0);\n"+
            "gl_Position = viewProjection * model * vec4(vertexPosition, 1.0);\n"+
            "}\n";

    public static final String fragmentSrc =
            "#version 410\n" +
            "in VS_OUT{\n" +
            "vec3 FragPos;\n"+
            "vec3 Normal;\n"+
            "vec2 TexCords;\n"+
            "vec4 FragPosLightSpace;\n"+
            "} fs_in;\n"+
            "out vec4 FragColor;\n" +
            "uniform sampler2D texMap;\n" +
            "uniform sampler2D shadowMap;\n"+
            "uniform vec3 lightPos;\n"+
            "uniform vec3 viewPos;\n"+
            "float ShadowCalculation(vec4 fragPosLightSpace, vec3 fragNormal, vec3 lightDir)\n"+
            "{\n"+
            //Perform perspective divide
            "vec3 projCords = fragPosLightSpace.xyz / fragPosLightSpace.w;\n"+
            //Transform to [0,1] range
            "projCords = projCords * 0.5 + 0.5;\n"+
            //Get closest depth value from light's perspective (using [0.1] range fragPosLightSpace as cords)
            "float closestDepth = texture(shadowMap, projCords.xy).r;\n"+
            //Get depth of current fragment fragment from light's perspective
            "float currentDepth = projCords.z;\n"+
            //Check if current frag position is in shadow
            "float bias =  max(0.01 * (1.0 - dot(fragNormal, lightDir)), 0.005);\n"+
            "float shadow = 0.0;\n"+
            "vec2 texelSize = 1.0 / textureSize(shadowMap, 0);\n"+
            "for(int x = -1; x <= 1; ++x)\n"+
            "{\n"+
            "for(int y = -1; y <= 1; ++y)\n"+
            "{\n"+
            "float pcfDepth = texture(shadowMap, projCords.xy + vec2(x, y) * texelSize).r; \n"+
            "shadow += currentDepth - bias > pcfDepth ? 1.0 : 0.0; \n"+
            "}\n"+
            "}\n"+
            "shadow /= 9.0;\n"+
            "if(currentDepth > 1.0){\n"+
            "shadow = 0.0;\n"+
            "}\n"+
            "return shadow;\n"+
            "}\n"+
            "void main()\n" +
            "{\n" +
            "vec3 color = texture(texMap, fs_in.TexCords).rgb;\n" +
            "vec3 normal = normalize(fs_in.Normal);\n"+
            "vec3 lightColor = vec3(1.0);"+
            //Ambient
            "vec3 ambient = 0.15 * color;\n"+
            //Diffuse
            "vec3 lightDir = normalize(lightPos - fs_in.FragPos);\n"+
            "float diff = max(dot(lightDir, normal), 0.0);\n"+
            "vec3 diffuse = diff * lightColor;\n"+
            //Specular
            "vec3 viewDir = normalize(viewPos - fs_in.FragPos);\n"+
            "float spec = 0.0;\n"+
            "vec3 halfwayDir = normalize(lightDir + viewDir);\n"+
            "spec = pow(max(dot(normal, halfwayDir), 0.0), 64.0);\n"+
            "vec3 specular = spec * lightColor;\n"+
            //Calculate shadow
            "float shadow = ShadowCalculation(fs_in.FragPosLightSpace, normal, lightDir);\n"+
            "vec3 lighting = ambient + ((1.0 - shadow) * (diffuse + specular)) * color;\n"+
            "FragColor = vec4(lighting, 1.0);\n"+
            "}\n";

    public static final String geometrySrc = "";

    public ObjectShader(GL4 gl) {
        super(gl, "Object shader", true, true, false, vertexSrc, fragmentSrc, geometrySrc);
    }
}
