package week1.day1homework;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int count=7,firstNum=0, secNum=1;
		
		System.out.println(firstNum);
		
		for (int i = 1; i <= count; i++) {
					
			
		int	sum = firstNum+secNum; 
			firstNum = secNum;
			secNum = sum;
			System.out.println(firstNum);	
			
		}
	}

}
