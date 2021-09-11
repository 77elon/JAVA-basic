import java.util.Scanner;

interface Movement
{
	String fish_char();
	String mam_char();
	public default String fun1()
	{
		return "움직입니다.";
	}
	public default String fun2()
	{
		return "낳습니다.";
	}
}

abstract class Mammal
{
	public abstract String mam_char(); // 출산
	
}

abstract class Fish extends Mammal
{
	public abstract String fish_char(); //물고기는 헤엄치며
	
}

class Whale extends Fish implements Movement
{
	
	public String mam_char()
	{
		return "새끼를 ";
	}
	public String fish_char()
	{
		return "헤엄치며 ";
	}
}
 
public class Whale1 extends Whale
{
	
	public static void main(String[] args) 
	{
		String input1, input2;
		Scanner scanner = new Scanner(System.in);
		Whale whale = new Whale();
		
		System.out.println("출력하고 싶은 생물의 범주는 무엇입니까?");
		System.out.print(">>");
		input1 = scanner.next();
		
		System.out.println("출력하고 싶은 생물은 무엇입니까?");
		System.out.print(">>");
		input2 = scanner.next();
		
		System.out.println(input1 + "는 " + whale.fish_char() + whale.fun1());
		System.out.println(input2 + "는 " + whale.mam_char() + whale.fun2());

		
		scanner.close();
	}

}
