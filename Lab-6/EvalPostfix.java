import java.util.Scanner;
class EvalPostfix{
	static EvalPostfix e1=new EvalPostfix();
	static int top=-1;
	static int[] a=new int[100];
	public static void push(int p){
		if(top>=99){
			System.out.println("StackOverFlow");
		}
		else{
			top++;
			a[top]=p;
		}
	}
	public static int pop(){
		if(top<=-1){
			System.out.println("StackUnderFlow");
		}
		return a[top--];
	}
	public static int EvalPostfixExp(int operand1, int operand2,char ch){
		int value=0;
		if(ch=='+'){
			value=operand1+operand2;
		}
		else if(ch=='-'){
			value=operand1-operand2;
		}
		else if(ch=='*'){
			value=operand1*operand2;
		}
		else if(ch=='/'){
			value=operand1/operand2;
		}
		else if (ch == '^') {
            value = (int) Math.pow(operand1, operand2);
        }
        return value;
	}
	public static int evalPostfix(String s){
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			int temp=(int)ch - 48;
			if(Character.isDigit(ch)){
				e1.push(temp);
			}
			else{
				int operand2=pop();
				int operand1=pop();
				int value=EvalPostfixExp(operand1,operand2,ch);
				e1.push(value);
			}
		}
		return e1.pop();
	}
	
public static void main(String[] args){
		System.out.println("Enter Expression");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int ans=evalPostfix(s);
		System.out.println("ANSWER: "+ans);
	}
}
