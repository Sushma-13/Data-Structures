package linkedlist;
/**
 *
 * @author SUSHMA
 */
public class LinkedList {
    node head;
    class node{
        int data;
        node next;
        node(int ele){
            data=ele;
            next=null;
        }
    }
    void push(int ele){
        node n=new node(ele);
        if(head==null){
            head=n;
        }
        else{
            n.next=head;
            head=n;
        }
    }
    void display(){
        if(head==null){
            System.out.println("Linkedlist empty");
        }
        else{
            node temp=head;
            while(temp!=null){
                System.out.print(temp.data+"-->");
                temp=temp.next;
            }
            System.out.print("end");
            System.out.println("");
        }
    }
    void display(node h){
        if(head==null){
            System.out.println("Linked list empty");
        }
        if(h==null){
                System.out.print("end"); 
                System.out.println("");
            }
        else{
            System.out.print(h.data+"-->");
            display(h.next);
        }
    }
    void append(int ele){
        node n=new node(ele);
        if(head==null){
            head=n;
        }
        else{
            node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
        }
    }
    void insert_at(int loc,int ele){
        node n=new node(ele);
        if(loc>size()){
            System.out.println("Invalid location because the length of linked list is "+size());
        }
        else {
            node temp=head;
            int i=1;
            while(i<loc-1){
                temp=temp.next;
                i++;
            }
            n.next=temp.next;
            temp.next=n;
        }
    }
    void insert_after(int loc,int ele){
        node n=new node(ele);
        if(loc>size()){
            System.out.println("Invalid location because the length of linked list is "+size());
        }
        else {
            node temp=head;
            int i=1;
            while(i<loc){
                temp=temp.next;
                i++;
            }
            n.next=temp.next;
            temp.next=n;
        }
    }
    int size(){
        int l=0;
        if(head==null){
           return 0;
        }
        else{
            node temp=head;
            while(temp!=null){
                l++;
                temp=temp.next;
            }
            return l;
        }
    }
    void delete(int loc){
        if(loc>size()){
            System.out.println("Invalid location as the length of ll is "+size());
        }
        else{
            node temp=head;
            if(loc==1){
                head=temp.next;
            }
            else{
                int i=1;
                while(i<loc-1){
                    temp=temp.next;
                    i++;
                }
                temp.next=temp.next.next;
               
            }
        }
    }
    int search(int ele){
        node temp=head;
        int loc=0,flag=0;
        while(temp!=null){
            loc++;
            if(temp.data==ele){
                flag=1;
                break;
            }
            temp=temp.next;
        }
        if(flag==1)
        {return loc;}
        return -1;
    }
    void swap_numbers(int loc1,int loc2){
        if(loc1>size() ||loc2>size()){
            System.out.println("Invalid location");
        }
        else{
            node temp1=head;
            node temp2=head;
            int i=1;
            while(i<loc1){
                temp1=temp1.next;
                i++;
            }
            i=1;
             while(i<loc2){
                temp2=temp2.next;
                i++;
            }
             int temp=temp1.data;
             temp1.data=temp2.data;
             temp2.data=temp;
             
             
        }
    }
    void reverse_with_num_swap(){
        int i=1,j=size();
        
        while(i<j){
            swap_numbers(i,j);
            i++;
            j--;
        }
    }

    
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        
        ll.append(4);
        ll.append(5);
        
        ll.display(ll.head);
        System.out.println("size = "+ll.size());
        ll.insert_at(2, 10);
       
        ll.delete(4);
        ll.display();
        System.out.println("loc = "+ll.search(30));
        ll.swap_numbers(1,4);
        ll.display();
        ll.reverse_with_num_swap();
        ll.display();
    }
    
}
