package bst;
/**
 * @author SUSHMA
 */
public class BST {
    static node root;
    static class node{
          int data;
          node left,right;
          node(int data){
              this.data=data;
          }
      }
     static void insert(int key) {
       root = insertRec(root, key);
    }
    static node insertRec(node root, int key) {
        /* If the tree is empty, return a new node */
        if (root == null) {
            root = new node(key);
            return root;
        }
        /* Otherwise, recur down the tree */
        if (key <= root.data)
            root.left = insertRec(root.left, key);
        else if (key > root.data)
            root.right = insertRec(root.right, key);
 
        /* return the (unchanged) node pointer */
        return root;
    }
    static void inorder(node root){
          if(root!=null){
              inorder(root.left);
          System.out.print(root.data+" ");
              inorder(root.right);
          }
          }
    static void preorder(node root){
        if(root!=null){
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    static void postorder(node root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+" ");
        }
    }
    static node search(node root, int key){
    if (root==null || root.data==key)
        return root;
     if (root.data > key)
        return search(root.left, key);
 
    return search(root.right, key);
}
    static void deleteKey(int key){
        root = deleteRec(root, key);
    }
    static node deleteRec(node root, int key){
        if (root == null)  return root;
        if (key < root.data)
            root.left = deleteRec(root.left, key);
        else if (key > root.data)
            root.right = deleteRec(root.right, key);
        else
        {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;
            else{
            root.data = minValueinrightsubtree(root.right); 
            root.right = deleteRec(root.right, root.data);}
        }
 
        return root;
    }
    static int minValueinrightsubtree(node root){
        int minv = root.data;
        while (root.left != null)
        {
            minv = root.left.data;
            root = root.left;
        }
        return minv;
    }
    static int findmaxinleftsubtree(node root){
        int maxv = root.data;
        while (root.right != null)
        {
            maxv = root.right.data;
            root = root.right;
        }
        return maxv;
        
    }
    public static void main(String args[]){
      insert(20);insert(10);insert(30);insert(4);insert(3);insert(21);insert(12);insert(11);insert(13);insert(14);
      inorder(root);
      System.out.println("");
      deleteKey(20);
      inorder(root);
    }
}