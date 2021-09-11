import java.util.Scanner;

public class 권대한_201720970_Exam2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int Input1;
		int result = 1;
		System.out.print("양의 정수를 입력하세요 : ");
		Input1 = scanner.nextInt(); // 정수 입력받기

		if(Input1 > 0)
		{
		System.out.println(Input1 + "의 약수는 다음과 같습니다.");
		while (result != Input1) // result가 input보다 작다는 약수의 특성
		{
			if(Input1 % result == 0 && Input1 != result) // input 숫자가 result에 나누어져야 약수, 깔끔한 처리를 위해 마지막 숫자는 따로 출력시켰습니다.
			{
				System.out.print(result + ", ");
			}
			result++;
		}
		System.out.println(result); // 마지막 숫자, while문에서 result가 input이 아닐때까지 더하므로 result는 input값과 같습니다.

		}
		else
		{
			System.out.println("양의 정수를 입력해주세요."); // 양의 정수가 입력되지 않았을때, 갑자기 종료되며 당황하는 것을 방지
		}
	}
}
