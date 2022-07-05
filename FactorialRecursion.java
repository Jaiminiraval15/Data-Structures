import java.util.Scanner;
class Calculate{
	int fact=1;
	public int printMethod(int n){
		if(n==0 || n==1){
			return 1;
		}
		else{
			return n*printMethod(n-1);
		}

	}
}
public class FactorialRecursion{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n=sc.nextInt();
		Calculate fact = new Calculate();
		int ans=fact.printMethod(n);
		System.out.println("Factorial is "+ans);
	}
}