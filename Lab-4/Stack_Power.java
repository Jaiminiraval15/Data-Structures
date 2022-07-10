import java.util.Scanner;
	class Stack{
		int top=-1;
		char[] a=new char[100];
		void push(char n){
			if(top>=99){
				System.out.println("Stack OverFlow");
			}
			else{
				top++;
				a[top]=n;
			}
		}
		void pop(){
			if(top<=-1){
				System.out.println("Stack UnderFlow");
			}
			else{
				top--;
			}
		}
}
	public class Stack_Power{
		public static void main(String[] args){
			int count_b=0;
			Stack s1=new Stack();
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter String");
			String s=sc.next();
			int len=s.length();
			for(int i=0;i<len;i++){
				char ch=s.charAt(i);
				if(ch=='a'){
					s1.push(ch);
				}
				else{
					count_b++;
				}
			}
			while(s1.top!=-1){
				s1.pop();
				count_b--;
			}
			if(count_b==0){
				System.out.println("Valid String");
			}
			else{
				System.out.println("Invalid String");
			}
		}
	}