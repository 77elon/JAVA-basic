public class Array 
{

	public static void main(String[] args) 
	{
		int array[][] = new int [4][4];
		int check = 0;
		for (int num1 = 0; num1<array.length; num1++) // array value reset
		{
			for (int num2 = 0; num2<array[num1].length; num2++)
			{
				array[num1][num2]=0;
			}
		}
		while(check <10)
		{
			int a = (int)(Math.random()*4); // 0~3
			int b = (int)(Math.random()*4); // 0~3
			if(array[a][b]!=0)
			{
				continue;
			}
			else 
			{
				array[a][b] = (int)(Math.random()*10 +1);
				check++;
			}
			
		}
		for (int num1 = 0; num1<array.length; num1++) // array value print
		{
			System.out.print("{");
			for (int num2 = 0; num2<array[num1].length; num2++)
			{
				if(num2+1 == array[num1].length)
				{
					System.out.print(array[num1][num2]);
				}
				else
				{
					System.out.print(array[num1][num2] +" ,");
				}
			}
			System.out.println("}");
		}
			
		
	}

}
