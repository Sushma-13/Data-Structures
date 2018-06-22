package circular_queue;
/* author SUSHMA */

public class Circular_queue {
    final int CAPACITY=5;
    int a[]=new int[CAPACITY];
    int front=-1,rear=-1;
    void enqueue(int ele){
        if((front==0 && rear==CAPACITY-1) || rear==front-1)
            System.out.println("Queue Overflow");
        else {
            if(rear==-1){
            rear=0;front=0;
            }
            
            else if(rear==CAPACITY-1){
            rear=0;
            }
            else
                rear++;
            a[rear]=ele;
        }
        
    }
   
    void dequeue(){
        int y=0;
        if(front==-1 && rear==-1)
            System.out.println("Queue underflow");
        else {
            y=a[front];
            if(front==rear)
            {front=-1;rear=-1;}
            else if(front==CAPACITY-1)
                front=0;
            else
                front++;
        }
        System.out.println("The element "+y+" is removed from the queque");
    }
    void display(){
        if(front==-1 && rear==-1)
            System.out.println("Queue is empty");
        else if(front>rear){  
        for(int i=front;i<CAPACITY;i++)
            System.out.print(a[i]+" ");
        for(int i=0;i<=rear;i++)
            System.out.print(a[i]+" ");
        }
        else{
            for(int i=front;i<=rear;i++)
            System.out.print(a[i]+" ");
        }
       
        System.out.println("");
    }
    
    public static void main(String[] args) {
        Circular_queue q =new Circular_queue();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        q.display();
        q.enqueue(6);
        q.display();
        q.dequeue();
        q.display();
        q.enqueue(6);
        q.display();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.display();
     
        
    }
    
}
