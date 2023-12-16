package week1.home_practice;
import java.util.Arrays;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= new int [] {1,4,3,2,8,6,7};
		
		int arr_length=arr1.length;   //6
		Arrays.sort(arr1);
		String arrsort = Arrays.toString(arr1);
		
		
		
		for(int i=0;i<arr_length;i++)
		{
		if(i==5) {
			System.out.println("The Missing no is "+ i );
			break;
		}
			
	    }

}
	
}
