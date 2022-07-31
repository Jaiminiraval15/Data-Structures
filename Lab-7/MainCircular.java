class Circular{
	int[] a=new int[5];
	int rear=-1, front=-1;
	public void enqueue(int e){
		if(rear==-1){
			front++;
		}
		if(rear==a.length-1 && front>0){
			rear=-1;
			rear++;
			a[rear]=e;
		}
		else if(rear==a.length-1 && front==0){
			System.out.println("Queue Overflow");
		}
		else{
			rear++;
			a[rear]=e;
		
		}	
	}
	public int dequeue(){
		if(front==-1){
			System.out.println("UnderFlow");
			return -1;
		}
		else if(front==a.length-1 && front>rear){
			front=0;
			return -1;
		}
		else{
			return a[front++];
		}
	}
	public void display(){
		if(rear>=front){
			for(int i=front;i<=rear;i++){
				System.out.println(a[i]+" ");
			}
		}
		else{
			for(int i=front;i<a.length;i++){
				System.out.println(a[i]+" ");
			}
			for(int i=0;i<=rear;i++){
				System.out.print(a[i]+" ");
			}
	}       
}
}
public class MainCircular{
	public static void main(String[] args){
		Circular c1=new Circular();
		c1.enqueue(10);
		c1.enqueue(20);
		c1.enqueue(30);
		c1.enqueue(40);
		c1.enqueue(50);
		c1.display();
		c1.dequeue();
		c1.enqueue(60);
		c1.display();
	}
}