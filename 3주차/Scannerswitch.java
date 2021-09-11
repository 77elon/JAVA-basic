import java.util.Scanner;

public class Scannerswitch {

	public static void main(String[] args) 
	{
			Scanner scanner = new Scanner(System.in);
			double num1, num2, result = 0;
			String operator;
			System.out.print("연산 >>");
			num1 = scanner.nextDouble();
			operator = scanner.next();
			num2 = scanner.nextDouble();
			// System.out.printf("%d %s %d",num1, operator, num2);

			switch (operator)
			{
			case "+" :
				result = num1 + num2;
				break;
			case "-" :
				result = num1 - num2;
				break;
			case "*" :
				result = num1 * num2;
				break;
			case "/" :
				if(num1 != 0 && num2 != 0) 
				{
					result = num1 / num2;
					break;
				}
				else
				{
					System.out.println("0으로 나눌 수 없습니다.");
				}
			}
			if(!(operator.equals("/")))
			{
				System.out.printf("%f %s %f의 계산 결과는 %f입니다.",num1, operator, num2, result);
			}
			else if (num1 != 0 && num2 != 0)
			{
				System.out.printf("%f %s %f의 계산 결과는 %f입니다.",num1, operator, num2, result);
			}
			scanner.close();
	}

}
