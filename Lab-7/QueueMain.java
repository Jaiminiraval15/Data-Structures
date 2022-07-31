class Test{
	int[] a=new int[10];
	int rear=-1,front=-1,temp;
	public void enqueue(int e){
		if(rear>=9){
			System.out.println("Overflow");
		}
		else{
			if(rear==-1){
				front++;
			}
			rear++;
			a[rear]=e;
		}
	}
	public int dequeue(){
		if(rear==-1 || front>rear){
			System.out.println("UnderFlow");
			return 0;
		}
		else{
			front=temp;
			front++;
			return a[temp];
		}
	}
	public void display(){
		for(int i=front;i<=rear;i++){
			System.out.print(a[i]+" ");
		}
	}
}
class QueueMain{
	public static void main(String[] args){
		Test t1=new Test();
		t1.enqueue(5);
		t1.enqueue(15);
		t1.enqueue(25);
		t1.enqueue(35);
		t1.display();
		t1.dequeue();
		t1.display();
	}
}