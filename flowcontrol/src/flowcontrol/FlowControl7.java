package flowcontrol;

public class FlowControl7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//case1
//		do{
//			System.out.println("do");
//		}while(true);
//		System.out.println("outside");
		
		
		//Case2
		
//		do{
//		System.out.println("do");
//		}while(false);
//		System.out.println("outside");
//		}
		
//		//case3
//		int a=10, b=20;
//		do{
//		System.out.println("do");
//		}while(a<b);
//		System.out.println("outside");
//		
		//case4
//		final int a=10, b=20;
//		do{
//		System.out.println("do");
//		}while(a<b);
//		System.out.println("outside");

		
		//case5
		final int a=10, b=20;
		do{
		System.out.println("do");
		}while(a>b);
		System.out.println("outside");
	}
}
