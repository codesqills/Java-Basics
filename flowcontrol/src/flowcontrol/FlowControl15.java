package flowcontrol;

public class FlowControl15 {
	   static boolean foo(char c) 
	    {
	        System.out.print(c); 
	        return true; 
	    } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   int i = 0; 
		        for (foo('A'); foo('B') && (i < 2); foo('C')) 
		        {
		            i++; 
		            foo('D'); 
		        } 
	}

}
