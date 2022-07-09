import java.util.Scanner;
public class SwapNumber{
	public static void Swap(int a,int b){
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Numbers after swapping");
		System.out.println(a+" "+b);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int a=sc.nextInt();
		System.out.println("Enter number");
		int b=sc.nextInt();
		Swap(a,b);
	}
}