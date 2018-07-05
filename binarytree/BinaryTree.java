package binarytree;
/**
 * @author SUSHMA
 */
import java.util.*;
public class BinaryTree {
    static node root;
    static class node{
        int data;
        node left,right;
        node(int ele){
            data=ele;
            left=null;right=null;
        }
    }
    static void insert(node temp,int key){
        Queue<node> q=new LinkedList<>();
        if(root==null){
            root=new node(key);
            }
        else{
            q.add(temp);
            while(!q.isEmpty()){
               node temp1=q.peek();
                q.remove();
                if(temp1.left==null){
                    temp1.left=new node(key);
                    break;}
                else q.add(temp1.left);
                if(temp1.right==null){
                    temp1.right=new node(key);
                    break;}
                else q.add(temp1.right);
                
            }
        }
        
    }
    static void inorder(node root){
       if(root!=null){
           inorder(root.left);
           System.out.print(root.data+" ");
           inorder(root.right);
       }
   }
    static void delete(node temp,int key){
        if(root==null)
            System.out.println("Tree is empty");
        else{
           Queue<node> q =new LinkedList<>();
           q.add(temp);
           while(!q.isEmpty()){
               temp=q.peek();
               q.remove();
                if(temp.data==key){
                   temp.data=rightestnode();
                   break;
                }
               if(temp.left!=null)
                    q.add(temp.left);
               if(temp.right!=null)
                    q.add(temp.right);
           }
           node rnd=root;
           while(rnd.right.data!=rightestnode())
               rnd=rnd.right;
           rnd.right=null;
        }  
    }
    static int rightestnode(){
        node temp=root;
        while(temp.right!=null){
            temp=temp.right;
        }
        return temp.data;
    }
    public static void main(String[] args) {
        insert(root,10);insert(root,20);insert(root,30);insert(root,40);insert(root,50);insert(root,60);insert(root,70);
        inorder(root);
        System.out.println();
        delete(root,50);
        inorder(root);   
    }
}
