import java.util.Scanner;
class StudentDetail{
	int EnrollmentNo,Sem;
	String Name;
	double Cpi;
	public void readDetail(){
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		for(int i=0;i<5;i++){
			System.out.println("Student "+(i+1));
			System.out.println("Enter EnrollmentNo");
			EnrollmentNo=sc.nextInt();
			System.out.println("Enter Name");
			Name=sc.next();
			System.out.println("Enter Sem");
			Sem=sc.nextInt();
			System.out.println("Enter CPI");
			Cpi=sc.nextDouble();
		}
	}
	public void print(){
		for(int i=0;i<5;i++){
			System.out.println("Student "+(i+1));
			System.out.println("EnrollmentNo: "+EnrollmentNo);
			System.out.println("Name: "+Name);
			System.out.println("Sem: "+Sem);
			System.out.println("CPI: "+Cpi);
		}
	}
}
public class Student{
	public static void main(String[] args){
		StudentDetail s1=new StudentDetail();
		s1.readDetail();
		s1.print();

	}
}