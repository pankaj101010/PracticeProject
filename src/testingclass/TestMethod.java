package testingclass;

public class TestMethod {

	public static void main(String[] args) {
		int [] src= {1,2,3,4,5,6};
		int [] dest =Array.reverse(src);
		for (int i : dest) {
			System.out.print(i+" ");
		}
		System.out.println();
	System.out.println(Array.findIndex(src, 4));
	}
/*
 * findmin
 * findodds
 * findevens
 * sortascending
 * sortdescending
 * compare two array
 * addelements
 */
}
