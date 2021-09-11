package exam;

class Tree implements Countable
{
	@Override
	public void count() 
	{
		System.out.println(name + " 나무가 5그루 있다.");
	}
	private String name;
	
	Tree(String input)
	{
		name = input;
		count();
	}
	void ripen()
	{
		System.out.println(name + " 열매가 잘 익었다.");
	}
}