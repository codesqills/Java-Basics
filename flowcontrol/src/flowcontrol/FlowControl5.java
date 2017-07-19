/*
 * Case3 is allowed coz the switch expression is expecting a int value
 * 
 */
package flowcontrol;

public class FlowControl5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b=10;
		switch (b+1) {
		case 10:
			System.out.println("10");
			break;

		case 100:
			System.out.println("10");
			break;
		case 1000:
			System.out.println("10");
			break;
		default:
			break;
		}
	}

}
