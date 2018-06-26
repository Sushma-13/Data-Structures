package disjoint.set.using.hashmap;
import java.util.*;
public class DisjointSetUsingHashmap {
    static HashMap<Integer,Integer> map=new HashMap<>();
    static void union(int a,int b){
        int x=0;
                      x=map.get(a);
                      map.put(a,x);
                      map.put(b,x);
    }
    public static void main(String[] args) {
        int a[]={2,1,5,9,7,6,8,67,90};
        //(2,5,9)  (1,7) (6,67,8,90)  
        for(int i=0;i<a.length;i++){
            if(!map.containsKey(a[i])){
                map.put(a[i], a[i]);
            }
        }
        union(2,5);
        union(5,9);
        union(1,7);
        union(6,67);
        union(8,90);
        union(67,8);
        union(8,90);
        
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {  
        Integer key = entry.getKey();
        Integer value = entry.getValue();
        System.out.println(key+" "+value);
        }
        find(2,67);
        find(8,67);
        
    }
    static void find(int a,int b){
        if(map.get(a)==map.get(b))
        System.out.println(a+" and "+b +" are friends");
        else
         System.out.println(a+" and "+b +" are not friends");   
    }
    
}
