package queue_logic;
public class Queue_logic {
    final int CAPACITY=10;
    int[] a=new int[CAPACITY];
    int front=0,rear=0;
    
    void enqueue(int ele){
        if(rear==CAPACITY){
            System.out.println("Queue overflow");}
        else {
            a[rear]=ele;
            rear++;}
    }
    int dequeue(){
        if(front==rear)
            return -1;
        else{
            int y=a[front];
            a[front]=0;
            front++;
            return y;
        }
            
    
    }
    int peek(){
        return a[front];
        }
    int tail(){ 
        return a[rear-1];
    }
    int size(){
        return rear-front;
    }
    public static void main(String[] args) {
        Queue_logic q =new Queue_logic();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        System.out.println(q.size());
        q.dequeue();
        System.out.println(q.size());
        System.out.println(q.peek());
        System.out.println(q.tail());
   
    }
    
}
