/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.igtl;

public class ImageServer {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected ImageServer(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ImageServer obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        igtljavaJNI.delete_ImageServer(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  static public class ImgMsg {
    private transient long swigCPtr;
    protected transient boolean swigCMemOwn;
  
    protected ImgMsg(long cPtr, boolean cMemoryOwn) {
      swigCMemOwn = cMemoryOwn;
      swigCPtr = cPtr;
    }
  
    protected static long getCPtr(ImgMsg obj) {
      return (obj == null) ? 0 : obj.swigCPtr;
    }
  
    @SuppressWarnings("deprecation")
    protected void finalize() {
      delete();
    }
  
    public synchronized void delete() {
      if (swigCPtr != 0) {
        if (swigCMemOwn) {
          swigCMemOwn = false;
          igtljavaJNI.delete_ImageServer_ImgMsg(swigCPtr);
        }
        swigCPtr = 0;
      }
    }
  
    public ImgMsg() {
      this(igtljavaJNI.new_ImageServer_ImgMsg(), true);
    }
  
    public final static int COORDINATE_RAS = igtljavaJNI.ImageServer_ImgMsg_COORDINATE_RAS_get();
    public final static int COORDINATE_LPS = igtljavaJNI.ImageServer_ImgMsg_COORDINATE_LPS_get();
  
    public final static int ENDIAN_BIG = igtljavaJNI.ImageServer_ImgMsg_ENDIAN_BIG_get();
    public final static int ENDIAN_LITTLE = igtljavaJNI.ImageServer_ImgMsg_ENDIAN_LITTLE_get();
  
    public final static int DTYPE_SCALAR = igtljavaJNI.ImageServer_ImgMsg_DTYPE_SCALAR_get();
    public final static int DTYPE_VECTOR = igtljavaJNI.ImageServer_ImgMsg_DTYPE_VECTOR_get();
  
    public final static int TYPE_INT8 = igtljavaJNI.ImageServer_ImgMsg_TYPE_INT8_get();
    public final static int TYPE_UINT8 = igtljavaJNI.ImageServer_ImgMsg_TYPE_UINT8_get();
    public final static int TYPE_INT16 = igtljavaJNI.ImageServer_ImgMsg_TYPE_INT16_get();
    public final static int TYPE_UINT16 = igtljavaJNI.ImageServer_ImgMsg_TYPE_UINT16_get();
    public final static int TYPE_INT32 = igtljavaJNI.ImageServer_ImgMsg_TYPE_INT32_get();
    public final static int TYPE_UINT32 = igtljavaJNI.ImageServer_ImgMsg_TYPE_UINT32_get();
    public final static int TYPE_FLOAT32 = igtljavaJNI.ImageServer_ImgMsg_TYPE_FLOAT32_get();
    public final static int TYPE_FLOAT64 = igtljavaJNI.ImageServer_ImgMsg_TYPE_FLOAT64_get();
  
  }

  public ImageServer() {
    this(igtljavaJNI.new_ImageServer(), true);
  }

  public int CreateServer(int arg0) {
    return igtljavaJNI.ImageServer_CreateServer(swigCPtr, this, arg0);
  }

  public void SendImageBasic(int[] arg0, float[] arg1, int arg2, int arg3, String arg4, byte[] imageData) {
    igtljavaJNI.ImageServer_SendImageBasic(swigCPtr, this, arg0, arg1, arg2, arg3, arg4, imageData);
  }

}
