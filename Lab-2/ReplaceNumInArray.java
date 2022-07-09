import java.util.Scanner;
public class ReplaceNumInArray{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of array elements: ");
		int n=sc.nextInt();
		int[] a=new int[n];
		boolean flag=true;
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Enter number which you want to replace");
		int b=sc.nextInt();
		System.out.println("Enter new number to replace");
		int c=sc.nextInt();
		for(int i=0;i<n;i++){
			if(a[i]==b){
				System.out.println("Index of number "+i);
				a[i]=c;
				flag=false;
			}
		}
		if(flag){
			System.out.println("Number not found");
		}
		if(!flag){
			for(int i=0;i<n;i++){
				System.out.println("New array "+a[i]);
			}
		}

	}
}