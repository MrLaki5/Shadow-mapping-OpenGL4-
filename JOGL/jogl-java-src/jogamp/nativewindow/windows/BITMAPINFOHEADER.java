/* !---- DO NOT EDIT: This file autogenerated by com/jogamp/gluegen/JavaEmitter.java on Sat Oct 10 03:10:34 CEST 2015 ----! */


package jogamp.nativewindow.windows;

import java.nio.*;

import com.jogamp.gluegen.runtime.*;
import com.jogamp.common.os.*;
import com.jogamp.common.nio.*;
import jogamp.common.os.MachineDataInfoRuntime;

import com.jogamp.nativewindow.util.Point;
import com.jogamp.nativewindow.NativeWindowException;
import jogamp.nativewindow.NWJNILibLoader;
import jogamp.nativewindow.Debug;

public class BITMAPINFOHEADER {

  StructAccessor accessor;

  private static final int mdIdx = MachineDataInfoRuntime.getStatic().ordinal();
  private final MachineDataInfo md;

  private static final int[] BITMAPINFOHEADER_size = new int[] { 40 /* ARM_MIPS_32 */, 40 /* X86_32_UNIX */, 40 /* X86_32_MACOS */, 40 /* PPC_32_UNIX */, 40 /* SPARC_32_SUNOS */, 40 /* X86_32_WINDOWS */, 40 /* LP64_UNIX */, 40 /* X86_64_WINDOWS */  };
  private static final int[] biSize_offset = new int[] { 0 /* ARM_MIPS_32 */, 0 /* X86_32_UNIX */, 0 /* X86_32_MACOS */, 0 /* PPC_32_UNIX */, 0 /* SPARC_32_SUNOS */, 0 /* X86_32_WINDOWS */, 0 /* LP64_UNIX */, 0 /* X86_64_WINDOWS */ };
//private static final int[] biSize_size = new int[] { 4 /* ARM_MIPS_32 */, 4 /* X86_32_UNIX */, 4 /* X86_32_MACOS */, 4 /* PPC_32_UNIX */, 4 /* SPARC_32_SUNOS */, 4 /* X86_32_WINDOWS */, 4 /* LP64_UNIX */, 4 /* X86_64_WINDOWS */  };
  private static final int[] biWidth_offset = new int[] { 4 /* ARM_MIPS_32 */, 4 /* X86_32_UNIX */, 4 /* X86_32_MACOS */, 4 /* PPC_32_UNIX */, 4 /* SPARC_32_SUNOS */, 4 /* X86_32_WINDOWS */, 4 /* LP64_UNIX */, 4 /* X86_64_WINDOWS */ };
//private static final int[] biWidth_size = new int[] { 4 /* ARM_MIPS_32 */, 4 /* X86_32_UNIX */, 4 /* X86_32_MACOS */, 4 /* PPC_32_UNIX */, 4 /* SPARC_32_SUNOS */, 4 /* X86_32_WINDOWS */, 4 /* LP64_UNIX */, 4 /* X86_64_WINDOWS */  };
  private static final int[] biHeight_offset = new int[] { 8 /* ARM_MIPS_32 */, 8 /* X86_32_UNIX */, 8 /* X86_32_MACOS */, 8 /* PPC_32_UNIX */, 8 /* SPARC_32_SUNOS */, 8 /* X86_32_WINDOWS */, 8 /* LP64_UNIX */, 8 /* X86_64_WINDOWS */ };
//private static final int[] biHeight_size = new int[] { 4 /* ARM_MIPS_32 */, 4 /* X86_32_UNIX */, 4 /* X86_32_MACOS */, 4 /* PPC_32_UNIX */, 4 /* SPARC_32_SUNOS */, 4 /* X86_32_WINDOWS */, 4 /* LP64_UNIX */, 4 /* X86_64_WINDOWS */  };
  private static final int[] biPlanes_offset = new int[] { 12 /* ARM_MIPS_32 */, 12 /* X86_32_UNIX */, 12 /* X86_32_MACOS */, 12 /* PPC_32_UNIX */, 12 /* SPARC_32_SUNOS */, 12 /* X86_32_WINDOWS */, 12 /* LP64_UNIX */, 12 /* X86_64_WINDOWS */ };
//private static final int[] biPlanes_size = new int[] { 2 /* ARM_MIPS_32 */, 2 /* X86_32_UNIX */, 2 /* X86_32_MACOS */, 2 /* PPC_32_UNIX */, 2 /* SPARC_32_SUNOS */, 2 /* X86_32_WINDOWS */, 2 /* LP64_UNIX */, 2 /* X86_64_WINDOWS */  };
  private static final int[] biBitCount_offset = new int[] { 14 /* ARM_MIPS_32 */, 14 /* X86_32_UNIX */, 14 /* X86_32_MACOS */, 14 /* PPC_32_UNIX */, 14 /* SPARC_32_SUNOS */, 14 /* X86_32_WINDOWS */, 14 /* LP64_UNIX */, 14 /* X86_64_WINDOWS */ };
//private static final int[] biBitCount_size = new int[] { 2 /* ARM_MIPS_32 */, 2 /* X86_32_UNIX */, 2 /* X86_32_MACOS */, 2 /* PPC_32_UNIX */, 2 /* SPARC_32_SUNOS */, 2 /* X86_32_WINDOWS */, 2 /* LP64_UNIX */, 2 /* X86_64_WINDOWS */  };
  private static final int[] biCompression_offset = new int[] { 16 /* ARM_MIPS_32 */, 16 /* X86_32_UNIX */, 16 /* X86_32_MACOS */, 16 /* PPC_32_UNIX */, 16 /* SPARC_32_SUNOS */, 16 /* X86_32_WINDOWS */, 16 /* LP64_UNIX */, 16 /* X86_64_WINDOWS */ };
//private static final int[] biCompression_size = new int[] { 4 /* ARM_MIPS_32 */, 4 /* X86_32_UNIX */, 4 /* X86_32_MACOS */, 4 /* PPC_32_UNIX */, 4 /* SPARC_32_SUNOS */, 4 /* X86_32_WINDOWS */, 4 /* LP64_UNIX */, 4 /* X86_64_WINDOWS */  };
  private static final int[] biSizeImage_offset = new int[] { 20 /* ARM_MIPS_32 */, 20 /* X86_32_UNIX */, 20 /* X86_32_MACOS */, 20 /* PPC_32_UNIX */, 20 /* SPARC_32_SUNOS */, 20 /* X86_32_WINDOWS */, 20 /* LP64_UNIX */, 20 /* X86_64_WINDOWS */ };
//private static final int[] biSizeImage_size = new int[] { 4 /* ARM_MIPS_32 */, 4 /* X86_32_UNIX */, 4 /* X86_32_MACOS */, 4 /* PPC_32_UNIX */, 4 /* SPARC_32_SUNOS */, 4 /* X86_32_WINDOWS */, 4 /* LP64_UNIX */, 4 /* X86_64_WINDOWS */  };
  private static final int[] biXPelsPerMeter_offset = new int[] { 24 /* ARM_MIPS_32 */, 24 /* X86_32_UNIX */, 24 /* X86_32_MACOS */, 24 /* PPC_32_UNIX */, 24 /* SPARC_32_SUNOS */, 24 /* X86_32_WINDOWS */, 24 /* LP64_UNIX */, 24 /* X86_64_WINDOWS */ };
//private static final int[] biXPelsPerMeter_size = new int[] { 4 /* ARM_MIPS_32 */, 4 /* X86_32_UNIX */, 4 /* X86_32_MACOS */, 4 /* PPC_32_UNIX */, 4 /* SPARC_32_SUNOS */, 4 /* X86_32_WINDOWS */, 4 /* LP64_UNIX */, 4 /* X86_64_WINDOWS */  };
  private static final int[] biYPelsPerMeter_offset = new int[] { 28 /* ARM_MIPS_32 */, 28 /* X86_32_UNIX */, 28 /* X86_32_MACOS */, 28 /* PPC_32_UNIX */, 28 /* SPARC_32_SUNOS */, 28 /* X86_32_WINDOWS */, 28 /* LP64_UNIX */, 28 /* X86_64_WINDOWS */ };
//private static final int[] biYPelsPerMeter_size = new int[] { 4 /* ARM_MIPS_32 */, 4 /* X86_32_UNIX */, 4 /* X86_32_MACOS */, 4 /* PPC_32_UNIX */, 4 /* SPARC_32_SUNOS */, 4 /* X86_32_WINDOWS */, 4 /* LP64_UNIX */, 4 /* X86_64_WINDOWS */  };
  private static final int[] biClrUsed_offset = new int[] { 32 /* ARM_MIPS_32 */, 32 /* X86_32_UNIX */, 32 /* X86_32_MACOS */, 32 /* PPC_32_UNIX */, 32 /* SPARC_32_SUNOS */, 32 /* X86_32_WINDOWS */, 32 /* LP64_UNIX */, 32 /* X86_64_WINDOWS */ };
//private static final int[] biClrUsed_size = new int[] { 4 /* ARM_MIPS_32 */, 4 /* X86_32_UNIX */, 4 /* X86_32_MACOS */, 4 /* PPC_32_UNIX */, 4 /* SPARC_32_SUNOS */, 4 /* X86_32_WINDOWS */, 4 /* LP64_UNIX */, 4 /* X86_64_WINDOWS */  };
  private static final int[] biClrImportant_offset = new int[] { 36 /* ARM_MIPS_32 */, 36 /* X86_32_UNIX */, 36 /* X86_32_MACOS */, 36 /* PPC_32_UNIX */, 36 /* SPARC_32_SUNOS */, 36 /* X86_32_WINDOWS */, 36 /* LP64_UNIX */, 36 /* X86_64_WINDOWS */ };
//private static final int[] biClrImportant_size = new int[] { 4 /* ARM_MIPS_32 */, 4 /* X86_32_UNIX */, 4 /* X86_32_MACOS */, 4 /* PPC_32_UNIX */, 4 /* SPARC_32_SUNOS */, 4 /* X86_32_WINDOWS */, 4 /* LP64_UNIX */, 4 /* X86_64_WINDOWS */  };

  public static int size() {
    return BITMAPINFOHEADER_size[mdIdx];
  }

  public static BITMAPINFOHEADER create() {
    return create(Buffers.newDirectByteBuffer(size()));
  }

  public static BITMAPINFOHEADER create(java.nio.ByteBuffer buf) {
      return new BITMAPINFOHEADER(buf);
  }

  BITMAPINFOHEADER(java.nio.ByteBuffer buf) {
    md = MachineDataInfo.StaticConfig.values()[mdIdx].md;
    accessor = new StructAccessor(buf);
  }

  public java.nio.ByteBuffer getBuffer() {
    return accessor.getBuffer();
  }

  /** Setter for native field <code>biSize</code>: CType[(IntType) typedef 'DWORD', size [fixed true, lnx64 4], [const[false], int]] */
  public BITMAPINFOHEADER setBiSize(int val) {
    accessor.setIntAt(biSize_offset[mdIdx], val);
    return this;
  }

  /** Getter for native field <code>biSize</code>: CType[(IntType) typedef 'DWORD', size [fixed true, lnx64 4], [const[false], int]] */
  public int getBiSize() {
    return accessor.getIntAt(biSize_offset[mdIdx]);
  }

  /** Setter for native field <code>biWidth</code>: CType[(IntType) typedef 'LONG', size [fixed true, lnx64 4], [const[false], int]] */
  public BITMAPINFOHEADER setBiWidth(int val) {
    accessor.setIntAt(biWidth_offset[mdIdx], val);
    return this;
  }

  /** Getter for native field <code>biWidth</code>: CType[(IntType) typedef 'LONG', size [fixed true, lnx64 4], [const[false], int]] */
  public int getBiWidth() {
    return accessor.getIntAt(biWidth_offset[mdIdx]);
  }

  /** Setter for native field <code>biHeight</code>: CType[(IntType) typedef 'LONG', size [fixed true, lnx64 4], [const[false], int]] */
  public BITMAPINFOHEADER setBiHeight(int val) {
    accessor.setIntAt(biHeight_offset[mdIdx], val);
    return this;
  }

  /** Getter for native field <code>biHeight</code>: CType[(IntType) typedef 'LONG', size [fixed true, lnx64 4], [const[false], int]] */
  public int getBiHeight() {
    return accessor.getIntAt(biHeight_offset[mdIdx]);
  }

  /** Setter for native field <code>biPlanes</code>: CType[(IntType) typedef 'WORD', size [fixed true, lnx64 2], [const[false], int]] */
  public BITMAPINFOHEADER setBiPlanes(short val) {
    accessor.setShortAt(biPlanes_offset[mdIdx], val);
    return this;
  }

  /** Getter for native field <code>biPlanes</code>: CType[(IntType) typedef 'WORD', size [fixed true, lnx64 2], [const[false], int]] */
  public short getBiPlanes() {
    return accessor.getShortAt(biPlanes_offset[mdIdx]);
  }

  /** Setter for native field <code>biBitCount</code>: CType[(IntType) typedef 'WORD', size [fixed true, lnx64 2], [const[false], int]] */
  public BITMAPINFOHEADER setBiBitCount(short val) {
    accessor.setShortAt(biBitCount_offset[mdIdx], val);
    return this;
  }

  /** Getter for native field <code>biBitCount</code>: CType[(IntType) typedef 'WORD', size [fixed true, lnx64 2], [const[false], int]] */
  public short getBiBitCount() {
    return accessor.getShortAt(biBitCount_offset[mdIdx]);
  }

  /** Setter for native field <code>biCompression</code>: CType[(IntType) typedef 'DWORD', size [fixed true, lnx64 4], [const[false], int]] */
  public BITMAPINFOHEADER setBiCompression(int val) {
    accessor.setIntAt(biCompression_offset[mdIdx], val);
    return this;
  }

  /** Getter for native field <code>biCompression</code>: CType[(IntType) typedef 'DWORD', size [fixed true, lnx64 4], [const[false], int]] */
  public int getBiCompression() {
    return accessor.getIntAt(biCompression_offset[mdIdx]);
  }

  /** Setter for native field <code>biSizeImage</code>: CType[(IntType) typedef 'DWORD', size [fixed true, lnx64 4], [const[false], int]] */
  public BITMAPINFOHEADER setBiSizeImage(int val) {
    accessor.setIntAt(biSizeImage_offset[mdIdx], val);
    return this;
  }

  /** Getter for native field <code>biSizeImage</code>: CType[(IntType) typedef 'DWORD', size [fixed true, lnx64 4], [const[false], int]] */
  public int getBiSizeImage() {
    return accessor.getIntAt(biSizeImage_offset[mdIdx]);
  }

  /** Setter for native field <code>biXPelsPerMeter</code>: CType[(IntType) typedef 'LONG', size [fixed true, lnx64 4], [const[false], int]] */
  public BITMAPINFOHEADER setBiXPelsPerMeter(int val) {
    accessor.setIntAt(biXPelsPerMeter_offset[mdIdx], val);
    return this;
  }

  /** Getter for native field <code>biXPelsPerMeter</code>: CType[(IntType) typedef 'LONG', size [fixed true, lnx64 4], [const[false], int]] */
  public int getBiXPelsPerMeter() {
    return accessor.getIntAt(biXPelsPerMeter_offset[mdIdx]);
  }

  /** Setter for native field <code>biYPelsPerMeter</code>: CType[(IntType) typedef 'LONG', size [fixed true, lnx64 4], [const[false], int]] */
  public BITMAPINFOHEADER setBiYPelsPerMeter(int val) {
    accessor.setIntAt(biYPelsPerMeter_offset[mdIdx], val);
    return this;
  }

  /** Getter for native field <code>biYPelsPerMeter</code>: CType[(IntType) typedef 'LONG', size [fixed true, lnx64 4], [const[false], int]] */
  public int getBiYPelsPerMeter() {
    return accessor.getIntAt(biYPelsPerMeter_offset[mdIdx]);
  }

  /** Setter for native field <code>biClrUsed</code>: CType[(IntType) typedef 'DWORD', size [fixed true, lnx64 4], [const[false], int]] */
  public BITMAPINFOHEADER setBiClrUsed(int val) {
    accessor.setIntAt(biClrUsed_offset[mdIdx], val);
    return this;
  }

  /** Getter for native field <code>biClrUsed</code>: CType[(IntType) typedef 'DWORD', size [fixed true, lnx64 4], [const[false], int]] */
  public int getBiClrUsed() {
    return accessor.getIntAt(biClrUsed_offset[mdIdx]);
  }

  /** Setter for native field <code>biClrImportant</code>: CType[(IntType) typedef 'DWORD', size [fixed true, lnx64 4], [const[false], int]] */
  public BITMAPINFOHEADER setBiClrImportant(int val) {
    accessor.setIntAt(biClrImportant_offset[mdIdx], val);
    return this;
  }

  /** Getter for native field <code>biClrImportant</code>: CType[(IntType) typedef 'DWORD', size [fixed true, lnx64 4], [const[false], int]] */
  public int getBiClrImportant() {
    return accessor.getIntAt(biClrImportant_offset[mdIdx]);
  }
}
