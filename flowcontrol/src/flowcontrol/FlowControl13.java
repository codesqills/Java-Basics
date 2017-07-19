
/*
 * 
 * Using break in do while control goes outside while
 * while using continue the control goes to while and repeats
 * do depending on the condition
 */
package flowcontrol;

public class FlowControl13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0;
		do{
			x++;
			System.out.println(x);
			if(++x<5)
			//continue;
			break;
			x++;
			System.out.println(x);
		}while(++x<10);
	}

}
