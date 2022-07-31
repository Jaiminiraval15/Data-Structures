import java.util.Scanner;
class InfixToPostfix{
	static int n=100;
	static char[] stack=new char[n];
	static int top=-1;
	static void push(char c){
		if(top>=n-1){
			System.out.println("StackOverFlow");
		}
		else{
			top++;
			stack[top]=c;
		}
	}
	static void pop(){
		if(top<=-1){
			System.out.println("StackUnderFlow");
		}
		else{
			top--;
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		char in='(';
		System.out.println("Enter Expression");
		String c=sc.next();
		c = in + c + ')';
		char[] infix = c.toCharArray();
        int i = 0;
        while(i<infix.length){
        	if(infix[i]=='('){
        		push(infix[i]);
        	}
        else if(infix[i]==')'){
        	while(stack[top]!='('){
        		System.out.println(stack[top]);
        			pop();
        		}
        		pop();
        	}
        	else if(infix[i] == '+' || infix[i] == '-' || infix[i] == '*' || infix[i] == '/'){
        	while(top != -1 && stack[top] != '('&& (stack[top] == '+' || stack[top] == '-' || stack[top] == '*' || stack[top] == '/')){
        		 System.out.print(stack[top]);
                    pop();
        	}
        	push(infix[i]);
        	}
        	else{
        		System.out.print(infix[i]);
        	}
        	i++;
        }

	}
}