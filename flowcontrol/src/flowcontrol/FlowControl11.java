
/*
 * Using labeled
 * 
 */
  package flowcontrol;
 

public class FlowControl11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int y=10;
		
		l1:{
			if(y==10){
				break l1;
			}
			System.out.println("Inside block");
		}
		System.out.println("outside block");
	}

}
