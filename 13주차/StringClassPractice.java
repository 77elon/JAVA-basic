import java.util.Scanner;
public class StringClassPractice 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요. 빈칸이 있어도 되며, 영어, 한글 모두 가능합니다.");
		String input = scanner.nextLine();
		
		for (int i =0; i< input.length(); i++)
		{
			String First = input.substring(0, 1);
			String Last = input.substring(1);
			input = Last.concat(First);
			System.out.println(input);
		}
		scanner.close();
	}

}
