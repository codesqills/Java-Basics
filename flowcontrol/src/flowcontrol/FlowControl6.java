/*
 * un reachable code
 * case 1 unreachable code
 * case 2 a and b is int and it will change
 * case 3 its final variable hence it will change and hence 
 * unreachablevalue
 */
package flowcontrol;

public class FlowControl6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		while(false){
//			System.out.println("hello");
//		}
//		System.out.println("hi");
		
		int a=10;int b=20;
		while(a<b){
			System.out.println("true");
		}
		{
			System.out.println("false");
		}
		
//		final int x=10;final int y=20;
//		while(x<y){
//			System.out.println("true");
//		}
//		{
//			System.out.println("false");
//		}
	}

}
