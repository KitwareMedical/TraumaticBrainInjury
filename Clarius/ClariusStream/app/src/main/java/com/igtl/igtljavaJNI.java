/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.igtl;

public class igtljavaJNI {
  public final static native int ImageServer_ImgMsg_COORDINATE_RAS_get();
  public final static native int ImageServer_ImgMsg_COORDINATE_LPS_get();
  public final static native int ImageServer_ImgMsg_ENDIAN_BIG_get();
  public final static native int ImageServer_ImgMsg_ENDIAN_LITTLE_get();
  public final static native int ImageServer_ImgMsg_DTYPE_SCALAR_get();
  public final static native int ImageServer_ImgMsg_DTYPE_VECTOR_get();
  public final static native int ImageServer_ImgMsg_TYPE_INT8_get();
  public final static native int ImageServer_ImgMsg_TYPE_UINT8_get();
  public final static native int ImageServer_ImgMsg_TYPE_INT16_get();
  public final static native int ImageServer_ImgMsg_TYPE_UINT16_get();
  public final static native int ImageServer_ImgMsg_TYPE_INT32_get();
  public final static native int ImageServer_ImgMsg_TYPE_UINT32_get();
  public final static native int ImageServer_ImgMsg_TYPE_FLOAT32_get();
  public final static native int ImageServer_ImgMsg_TYPE_FLOAT64_get();
  public final static native long new_ImageServer_ImgMsg();
  public final static native void delete_ImageServer_ImgMsg(long jarg1);
  public final static native long new_ImageServer();
  public final static native void delete_ImageServer(long jarg1);
  public final static native int ImageServer_CreateServer(long jarg1, ImageServer jarg1_, int jarg2);
  public final static native void ImageServer_SendImageBasic(long jarg1, ImageServer jarg1_, int[] jarg2, float[] jarg3, int jarg4, int jarg5, String jarg6, byte[] jarg7);
}