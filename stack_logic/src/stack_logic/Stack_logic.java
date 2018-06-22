package stack_logic;
public class Stack_logic {
     final int CAPACITY=10;
     int[] a=new int[CAPACITY];
     int top=-1;
     void push(int ele){
        if(top==CAPACITY-1){
            System.out.println("Stack overflow");
        }
        else{
        top++;
        a[top]=ele;
        System.out.println(a[top]+" is pushed in the stack");}
    }
     int pop() {
         if(isEmpty()){
         return -1;}
         else{
            int y= a[top];
         top--;
         return y;
         }
    }
     int peek(){
        if(isEmpty()){
        return -1;}
        else return a[top];
    }
     void traverse(){
        System.out.println("---");
        for(int i=size()-1;i>-1;i--){
        System.out.println("|"+a[i]+"|");
        System.out.println("---");
        }
    }
     int size(){
        return top+1;
    }
     boolean isEmpty(){
        if (top==-1)
            return true;
        else return false;
    }
     int search(int ele){
        for(int i=size()-1;i>-1;i--){
            if(a[i]==ele)
                return i+1;
            
        }
         return -1;
     }
  
    public static void main(String[] args) {
        Stack_logic s=new Stack_logic();
        s.push(10);
        s.push(20);
        s.push(30);
         s.push(40); s.push(50); s.push(60); s.push(70); s.push(80); s.push(90); s.push(100); 
         s.traverse();
        System.out.println(s.peek()+" is the peek value");
        System.out.println(s.pop()+" is poped from the stack");
        System.out.println(s.peek()+" is the peek value");
        s.traverse();
        System.out.println(s.size()+" is current the size of the stack");
        System.out.println(s.CAPACITY+" is the capacity of the stack");
        System.out.println(30+" is found at position  "+s.search(30));
    }
    
}
