/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.microsoft.adaptivecards.objectmodel;

public class ImageSet extends BaseCardElement {
  private transient long swigCPtr;
  private transient boolean swigCMemOwnDerived;

  protected ImageSet(long cPtr, boolean cMemoryOwn) {
    super(AdaptiveCardObjectModelJNI.ImageSet_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(ImageSet obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        AdaptiveCardObjectModelJNI.delete_ImageSet(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public ImageSet() {
    this(AdaptiveCardObjectModelJNI.new_ImageSet__SWIG_0(), true);
  }

  public ImageSet(SeparationStyle separation, String speak) {
    this(AdaptiveCardObjectModelJNI.new_ImageSet__SWIG_1(separation.swigValue(), speak), true);
  }

  public ImageSet(SeparationStyle separation, String speak, SWIGTYPE_p_std__vectorT_std__shared_ptrT_AdaptiveCards__Image_t_t images) {
    this(AdaptiveCardObjectModelJNI.new_ImageSet__SWIG_2(separation.swigValue(), speak, SWIGTYPE_p_std__vectorT_std__shared_ptrT_AdaptiveCards__Image_t_t.getCPtr(images)), true);
  }

  public String Serialize() {
    return AdaptiveCardObjectModelJNI.ImageSet_Serialize(swigCPtr, this);
  }

  public ImageSize GetImageSize() {
    return ImageSize.swigToEnum(AdaptiveCardObjectModelJNI.ImageSet_GetImageSize(swigCPtr, this));
  }

  public void SetImageSize(ImageSize value) {
    AdaptiveCardObjectModelJNI.ImageSet_SetImageSize(swigCPtr, this, value.swigValue());
  }

  public SWIGTYPE_p_std__vectorT_std__shared_ptrT_AdaptiveCards__Image_t_t GetImages() {
    return new SWIGTYPE_p_std__vectorT_std__shared_ptrT_AdaptiveCards__Image_t_t(AdaptiveCardObjectModelJNI.ImageSet_GetImages__SWIG_0(swigCPtr, this), false);
  }

  public static ImageSet Deserialize(SWIGTYPE_p_Json__Value root) {
    long cPtr = AdaptiveCardObjectModelJNI.ImageSet_Deserialize(SWIGTYPE_p_Json__Value.getCPtr(root));
    return (cPtr == 0) ? null : new ImageSet(cPtr, true);
  }

  public static ImageSet dynamic_cast(BaseCardElement baseCardElement) {
    long cPtr = AdaptiveCardObjectModelJNI.ImageSet_dynamic_cast(BaseCardElement.getCPtr(baseCardElement), baseCardElement);
    return (cPtr == 0) ? null : new ImageSet(cPtr, true);
  }

}