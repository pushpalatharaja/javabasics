package week1.home_practice;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNumber = 0;
		int secondNumber = 1;
		System.out.println(firstNumber );
		System.out.println(secondNumber);
		for(int i=1;i<7;i++) {
			
			int thirdNumber= firstNumber + secondNumber;
			System.out.println(thirdNumber);
			firstNumber = secondNumber; 
			secondNumber = thirdNumber; 
						
		}

	}

}
