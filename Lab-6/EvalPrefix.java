import java.util.Scanner;
class EvalPrefix{
	int arr=100;
	static EvalPrefix e1=new EvalPrefix();
	static int top=-1;
	 int[] a=new int[arr];
	public  void push(int n){
		if(top>=arr-1){
			System.out.println("Stack OverFlow");
		}
		else{
			top++;
			a[top]=n;
		}
	}
	public int pop(){
		if(top<=-1){
			System.out.println("Stack UnderFlow");
		}
		return a[top--];
	}
	public static int EvalPrefixExp(int operand1,int operand2,char ch){
		int value=0;
		if(ch=='+'){
			value=operand1=operand2;
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
		else if(ch=='^'){
			value=(int)Math.pow(operand1,operand2);
		}
		return value;
	}
	public static int evalPrefix(String s){
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if(Character.isDigit(ch)){
				int temp=(int)ch-48;
				e1.push(temp);
			}
			else{
				int operand1=e1.pop();
				int operand2=e1.pop();
				int value=EvalPrefixExp(operand1,operand2,ch);
				e1.push(value);
			}
		}
			return e1.pop();
		}

public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Expression");
			String s2=sc.nextLine();
			String s="";
			for(int i=s2.length()-1;i>=0;i--){
				s+=s2.charAt(i);
			}
			int ans=evalPrefix(s);
			System.out.println("ANSWER: "+ans);
		}

	}

