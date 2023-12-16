package week1.home_practice;
import java.util.Arrays;

public class FineTheIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {3,2,11,4,6,7};
		int b[]= {1,2,8,4,9,7};
		
		
		int arr_a=a.length;
		int arr_b=b.length;
		System.out.println("Intersection Numbers:");
		for(int i=0;i<arr_a;i++) {
			for(int j=0;j<arr_b;j++) {
				if(a[i]==b[j]) {
					System.out.println(a[i]);
				}
			}
			
		}
		

	}

}
