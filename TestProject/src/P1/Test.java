package P1;

public class Test {

	int a;
	int b;
	String s = "kranti";
	//s="kp";
	String str[]=new String[3];
	int jk[]=new int[10];
	Test(int i,int j)
	{
		a=i;
		b=j;		
	}
	
	void math(Test o)
	{
		o.a += o.b;
		o.b *= o.a;
	}

	public static void main(String args[])  {
		Test t1=new Test(10,20);
		t1.math(t1);
		System.out.println(t1.a);
		System.out.println(t1.b);
	}
}
