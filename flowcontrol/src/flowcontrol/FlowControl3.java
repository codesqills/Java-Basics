package flowcontrol;

public class FlowControl3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int x=10;
		 int y=20;
		final int z=30;
		 switch	(x){
		 case 10:{
			 System.out.println("hello");
			 break;
		 }
		// case y:{// this not valid coz y is not contstant
		//	 System.out.println("hi");
		//	 break;
		// }
		 case z:{
			 System.out.println("bye");
			 break;
		 }
		 
		 }
	}

}
