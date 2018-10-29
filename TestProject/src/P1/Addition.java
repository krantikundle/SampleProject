package P1;

public class Addition {

	int a;
	int b;
	
	
	Addition(int a,int b)
	{
		int x;
		x=a+b;
		x=0;
		x=5/0;
		System.out.println("Addition of two int numbers: " + x) ;
		
	}
	
	Addition(double a,double b)
	{
		double x;
		x=a+b;
		System.out.println("Addition of two double numbers: " + x) ;
		
	}
	
	Addition(int a)
	{
		int x;
		b=a;
		x=a+b;
		System.out.println("Addition of two same numbers: " + x) ;
	}
	
	
	public static void main(String[] args) {
		
		Addition add;
		add= new Addition(10);
		add= new Addition(10,20);
		

	}

}
