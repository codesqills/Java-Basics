/*
 * 
 * 
 */
  package flowcontrol;
 
public class FlowControl9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr={{10,20,30},{40,50}};
		
		for(int[]a1:arr){
			for(int  a2:a1){
			//	System.out.println(a2);
			}
		}
		
		int[][][] newArr= 
			{{{10,20},{30,40}},{{50,60},{70}}};
		System.out.println("new arr "+newArr[1][0][0]);
		for(int[][] arr1:newArr){
			for(int[] arr2:arr1){
				for(int arr3:arr2){
					System.out.println(arr3);
				}
			}
		}
	}

}
