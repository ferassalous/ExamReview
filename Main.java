
public class Main {
	public static void main(String[]args)
	{
		int a = 2;
		int b = 3;
		int c = 5;
		System.out.println(c + b * 2 );// over here because b came after a, a got casted into a String.
		X x = new X("Hello",2);
		x.printId();
	}

}
