import java.util.*; //iterator, HashMap

public class Exam2 
{
	public static void main (String [] args)
	{
		HashMap<String, String>  map = new HashMap<String, String> ();
		
		map.put("head", "머리");
		map.put("teacher", "선생님");
		map.put("cat", "고양이");
		map.put("aunt", "아주머니");
		map.put("noodle", "국수");
		map.put("child", "아이");
		
		Set<String> keys = map.keySet();
		Iterator<String> iter = keys.iterator();
		
		for(int i = 0; i<map.size(); i++)
		{
			String Eng = iter.next();
			String Kor = map.get(Eng);
			if (i +1 == map.size())
			{
				System.out.print(Eng + "=" + Kor);
				break;
			}
			System.out.print(Eng + "=" + Kor + ", ");
		}
		
	}
}
