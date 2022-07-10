import java.util.Scanner;
class Stack{
	int top=-1;
	int[] a=new int[100];
	public void push(int n){
		if(top>=99){
			System.out.println("StackOverFlow");
		}
		else{
			top++;
			a[top]=n;
		}
	}
	public void pop(){
		if(top<=-1){
			System.out.println("StackUnderFow");
		}
		else{
			top--;
		}
	}
	public void display(){
		for(int i=0;i<=top;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	public int peek(){
		if(top<0){
			System.out.println("StackUnderFlow");
			return 0;
		}
		else{
			return a[top];
		}
	}
	public int peep(int i){
		if(top-i+1<0){
			System.out.println("StackUnderFlow");
			return 0;
		}
		else{
			return a[top-i+1];
		}
	}
	public void change(int i,int n){
		if(top-i+1<0){
			System.out.println("StackUnderFlow");
		}
		else{
			a[top-i+1]=n;
		}
	}
}
public class StackDemo{
	public static void main(String[] args){
		Stack s1=new Stack();
		s1.push(5);
		s1.push(10);
		s1.push(15);
		s1.push(20);
		s1.display();
		s1.pop();
		s1.display();
		s1.peek();
		s1.display();
		s1.peep(5);
		s1.change(2,35);
		s1.display();
	}
}