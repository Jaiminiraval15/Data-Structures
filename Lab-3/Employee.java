import java.util.Scanner;
class EmployeeDetails{
	int Emp_id;
	String Name,Designation;
	double Salary;
	public void getDetail(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Emp_id");
		Emp_id=sc.nextInt();
		System.out.println("Enter Name");
		Name=sc.next();
		System.out.println("Enter Designation");
		Designation=sc.next();
		System.out.println("Enter salary");
		Salary=sc.nextDouble();
	} 
	public void printDetail(){
		System.out.println("Emp_id: "+Emp_id);
		System.out.println("Emp_Name: "+Name);
		System.out.println("Emp_designation: "+Designation);
		System.out.println("Emp_salary: "+Salary);
	}
}
	public class Employee{
		public static void main(String[] args){
			EmployeeDetails e1=new EmployeeDetails();
			e1.getDetail();
			e1.printDetail();
		}
	}

