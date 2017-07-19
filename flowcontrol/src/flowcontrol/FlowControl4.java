/*
 * Case 3 is not allowed because it exceeds byte range
 */

package flowcontrol;

public class FlowControl4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=10;
		switch (b) {
		case 10:
			System.out.println("10");
			break;

		case 100:
			System.out.println("10");
			break;
//		case 1000:
//			System.out.println("10");
//			break;
		default:
			break;
		}
	}

}
