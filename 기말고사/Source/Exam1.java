class Pet
{
	private int age;
	Pet()
	{
		
	}
	static void move()
	{
		System.out.println("애완동물이 움직입니다.");
	}
}
class Dog extends Pet
{
	private String name;
	private double Weight;
	Dog()
	{
		getWeight();
		System.out.println("강아지의 이름은 " + name + "이며, 몸무게는 " + Weight + "Kg입니다." );
	}
	void getWeight() // 인수로 입력을 받아야 되는데 출력 결과에 입력 받는 부분이 없어서 이대로 진행하겠습니다.
	{
		name = "누렁이";
		Weight = 10;
	}
}
class Bird extends Pet
{
	private String type;
	private boolean flightYN = false;
	Bird()
	{
		getFlight();
		System.out.print("새의 종류는 " + type + "이며, " );
		if(flightYN == true)
		{
			System.out.println("날 수 있습니다.");
		}
		else
		{
			System.out.println("날 수 없습니다.");
		}
	}
	void getFlight()
	{
		type = "앵무새";
		
		if(type =="앵무새")
		{
			flightYN = true;
		}
	}
}

public class Exam1 
{
	public static void main(String[] args)
	{
		Dog.move();
		Bird.move();
		Dog dog = new Dog();
		Bird bird = new Bird();
	}
}
