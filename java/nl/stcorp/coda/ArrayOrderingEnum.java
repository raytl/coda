/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package nl.stcorp.coda;

public enum ArrayOrderingEnum {
  coda_array_ordering_c,
  coda_array_ordering_fortran;

  public final int swigValue() {
    return swigValue;
  }

  public static ArrayOrderingEnum swigToEnum(int swigValue) {
    ArrayOrderingEnum[] swigValues = ArrayOrderingEnum.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (ArrayOrderingEnum swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + ArrayOrderingEnum.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private ArrayOrderingEnum() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private ArrayOrderingEnum(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private ArrayOrderingEnum(ArrayOrderingEnum swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

