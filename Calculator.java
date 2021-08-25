package Week3.Day1;

public class Calculator {
	
	public  void Sum(int a ,int b)
	{
		int Sum = a+b;
	System.out.println("Addtion on 1 method with 2 int args :" + Sum);
	
		}
	public  void Sum(int a ,int b, int c)
	{
	 int Sum = a+b+c;
	System.out.println("Addition on 1 method with 3 int args : " +Sum );
	
		}
	
	public  void Multiplication(int a ,int b)
	{
	 int Mul = a*b;
	System.out.println("Multiplication on 1 method with 2 int args : " +Mul );
	
		}
	public  void Multiplication(int a , double b)
	{
	 double Mul = a*b;
	System.out.println("Multiplication on  1method with 1 int and 1 double args :" +Mul );
	
		}
	
	public  void Sub(int a , int b)
	{
	 int Sub = a-b;
	System.out.println("Sub on 1 method with 2 int args :" +Sub );
	
		}
	public  void Sub(int a , double b)
	{
	 double Sub = a-b;
	System.out.println("Sub on 1 method with 2 double args :" +Sub );
	
		}
	public  void div(int a , int b)
	{
	 int div = a/b;
	System.out.println("div on 1 method with 2 int args :" +div );
	
		}
	public  void div(int a , double b)
	{
	 double div = a-b;
	System.out.println("div on 1 method with one double number and one int: " +div );
	
		}
	
	public static void main(String[] args) {
		Calculator obj= new Calculator();
		obj.Sum(1, 2);
		obj.Sum(1, 2, 3);
		System.out.println("------");
		obj.Sub(1, 1.5);
		obj.Sub(5, 2);
		System.out.println("------");
		obj.Multiplication(5, 2);
		obj.Multiplication(5, 1.5);
		System.out.println("------");
		obj.div(8, 4);
		obj.div(7, 4.5);
		System.out.println("------");
	}
	
	
	
	
}
