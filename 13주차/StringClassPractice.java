import java.util.Scanner;
public class StringClassPractice 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���ڿ��� �Է��ϼ���. ��ĭ�� �־ �Ǹ�, ����, �ѱ� ��� �����մϴ�.");
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
