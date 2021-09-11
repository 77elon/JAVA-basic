class TV 
{
	private int size;
	public TV(int size) 
	{ 
		this.size = size; 
	}
	protected int getSize() 
	{ 
		return size; 
	}
}

class ColorTV extends TV 
{
	private int ColorScale;
	public ColorTV(int size, int Color) 
	{
		super(size);
		ColorScale = Color;
	}
	protected int getColor()
	{
		return ColorScale;
	}
	public void printProperty()
	{
		System.out.println(getSize() + "인치 " + ColorScale + "컬러");
	}
}

class IPTV extends ColorTV
{
	private String address;
	public IPTV(String ip, int size, int Color) 
	{
		super(size, Color);
		address = ip;
	}
	@Override
	public void printProperty()
	{
		System.out.println("나의 IPTV는 " + address + " 주소의 " + getSize() + "인치 " + getColor() +"컬러");
	}
}
public class ColorTV1 {

	public static void main(String[] args) 
	{
		ColorTV myTV = new ColorTV(32, 1024);
		myTV.printProperty();
		
		IPTV iptv = new IPTV("192.1.1.2", 32, 2048);
		iptv.printProperty();
		
	}
}
