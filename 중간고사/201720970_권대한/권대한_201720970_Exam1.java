import java.util.Scanner;

public class 권대한_201720970_Exam1 {
	
	public static void main(String[] args) {
			
		int resultary [] = new int [4];
		
		int result = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < resultary.length; i++) // 숫자 입력받는 반복문
		{
				System.out.print(i+1 +"번째 숫자를 입력하세요 : ");
				resultary[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < resultary.length; i++) // 배열에 들어간 숫자를 모두 더하는 반복문
		{
				result += resultary[i];
		}
		System.out.println("합계는 " + result + " 입니다.");
	}

}
