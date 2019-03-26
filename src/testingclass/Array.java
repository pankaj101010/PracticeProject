package testingclass;

public class Array {
/**
 * This method reverse the array .
 * @param src array which we want to reverse.
 * @return reverse array.
 */
public static int[] reverse(int[]src) {
	int [] dest =new int[src.length];
	for (int i = src.length-1; i>=0; i--) {
		dest[src.length-1-i]=src[i];
	}
	return dest;
}
/**
 *  this is used to find the index of number from array which number we want to find
 * @param src array 
 * @param numberToFind 
 * @return
 */
public static int findIndex(int[]src, int numberToFind) {
	int index =-1;
	boolean flag = false;
	for (int i = 0; i < src.length; i++) {
		if (src[i]==numberToFind) {
			flag = true;
			index =i; 
		}
	}
	if (flag) {
		return index;
	}
	return index;
}


}
  