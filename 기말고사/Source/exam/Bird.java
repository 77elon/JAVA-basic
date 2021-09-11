package exam;

class Bird implements Countable
{
	@Override
	public void count() 
	{
		System.out.println(name + "가 2마리 있다.");
	}
	private String name;
	
	Bird(String input)
	{
		name = input;
		count();
	}
	void fly()
	{
		System.out.println(name + "가 날아간다.");
	}
}