package com.practice;

public class CalculateArea {
	public static final float pi=3.14f;
	/**
	 * calculates area of circle 
	 * @param value representing (radius or diameter).
	 * @param isredius boolean which represents value is radius or diameter.
	 * @return  returns area of circle.
	 */
	
    public static float ofcircle(float value,boolean isradius) {
    	 return isradius ? pi*value*value :pi*(value/2)*(value/2);   	 
//     	if (isradius) {
// 			return pi*value*value;
// 		}else {
// 			return pi*(value/2)*(value/2);
// 		}
    	 
    }
	
	
}
