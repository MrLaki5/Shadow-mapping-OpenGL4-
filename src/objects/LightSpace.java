package objects;

import cameras.Camera;
import com.jogamp.common.nio.Buffers;
import com.jogamp.opengl.GL4;
import lights.Light;
import org.joml.Matrix4f;

import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public class LightSpace extends SimpleObject {

    private int vertexArrayID;
    private int vertexBufferID;
    private int vertexIndexBufferID;
    private float VPMatrixArr[] = new float[16];

    public LightSpace(){
        super();
    }

    @Override
    public void init(GL4 gl) {
        float a = 1.0f;

        float []vertexData = {
                -a, -a, -a,
                -a, -a, a,
                a, -a, a,
                a, -a, -a,

                -a, a, -a,
                -a, a, a,
                a, a, a,
                a, a, -a
        };

        int []indexArr = new int[] { 0, 1, 1, 2, 2, 3, 3, 0, 4, 5, 5, 6, 6, 7, 7, 4, 0, 4, 1, 5, 2, 6, 3, 7};

        IntBuffer intBuffer = IntBuffer.allocate(1);
        gl.glGenVertexArrays(1, intBuffer);
        vertexArrayID = intBuffer.get(0);
        gl.glBindVertexArray(vertexArrayID);

        FloatBuffer vertexBuffer = Buffers.newDirectFloatBuffer(vertexData, 0);
        IntBuffer vertexIndexBuffer = Buffers.newDirectIntBuffer(indexArr, 0);

        intBuffer.rewind();
        gl.glGenBuffers(1, intBuffer);
        vertexBufferID = intBuffer.get(0);
        gl.glBindBuffer(GL4.GL_ARRAY_BUFFER, vertexBufferID);
        gl.glBufferData(GL4.GL_ARRAY_BUFFER, vertexData.length * Float.BYTES, vertexBuffer, GL4.GL_STATIC_DRAW);
        gl.glEnableVertexAttribArray(0);
        gl.glVertexAttribPointer(0, 3, GL4.GL_FLOAT, false, 0, 0);

        intBuffer.rewind();
        gl.glGenBuffers(1, intBuffer);
        vertexIndexBufferID = intBuffer.get(0);
        gl.glBindBuffer(GL4.GL_ELEMENT_ARRAY_BUFFER, vertexIndexBufferID);
        gl.glBufferData(GL4.GL_ELEMENT_ARRAY_BUFFER, indexArr.length * Integer.BYTES, vertexIndexBuffer, GL4.GL_STATIC_DRAW);
    }

    @Override
    public void render(GL4 gl, Camera camera, Light light) {
        if( shader == null ) {
            return;
        }

        shader.bindProgram(gl);
        gl.glBindVertexArray(vertexArrayID);

        transform = light.getViewProjection().invert();

        int VPMatrixLoc = gl.glGetUniformLocation(shader.getProgramID(), "transform");
        Matrix4f vpMat = camera.getViewProjection();
        vpMat.mul(transform);
        vpMat.get(VPMatrixArr);
        gl.glUniformMatrix4fv(VPMatrixLoc, 1, false, VPMatrixArr, 0);

        gl.glDrawElements(GL4.GL_LINES, 24, GL4.GL_UNSIGNED_INT, 0);

        shader.unbindProgram(gl);
        gl.glBindVertexArray(0);
    }

    @Override
    public void renderLightPerspective(GL4 gl, Light light) {

    }

    @Override
    public void destroy(GL4 gl) {
        IntBuffer buffer = Buffers.newDirectIntBuffer(2);
        buffer.put(vertexBufferID);
        buffer.put(vertexIndexBufferID);
        buffer.rewind();
        gl.glDeleteBuffers(2, buffer);

        buffer.rewind();
        buffer.put(vertexArrayID);
        buffer.rewind();
        gl.glDeleteVertexArrays(1, buffer);
    }

    @Override
    public void update() {

    }
}
