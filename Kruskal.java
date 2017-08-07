import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Node{
  int E1,E2,w;
  Node(){

  }
  Node(int a,int b,int c){
    E1=a;
    E2=b;
    w=c;
  }
}
public class Kruskal {
  static Node[] node;
  static int n,e;
  static subset[] subsets;

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner obj=new Scanner(System.in);
        n=obj.nextInt();
        e=obj.nextInt();
        node=new Node[e];
        HashSet<Integer> vertex=new HashSet<>();
        for (int i=0;i<e ;i++ ) {
          int n1=obj.nextInt();
          int n2=obj.nextInt();
          int w=obj.nextInt();
          n1--;
          n2--;
          node[i]=new Node(n1,n2,w);

        }
        int minWeight=0;
        new Kruskal().getKruskal();

        // for(Node i: node){
        //     if((vertex.contains(i.E1)) && (vertex.contains(i.E2))){
        //
        //     }else{
        //       minWeight+=i.w;
        //       vertex.add(i.E1);
        //       vertex.add(i.E2);
        //     }
        // }
        //
        // // for (Node i : node) {
        // //   System.out.print(i.w);
        // // }
        //System.out.println(minWeight);

    }

    public static int find(subset[] subsets,int v){

      if(subsets[v].parent!=v)
        return find(subsets,subsets[v].parent);

      return subsets[v].parent;
    }

    public static void Union(subset[] subsets,int s,int d){

        int x=find(subsets,s);
        int y=find(subsets,d);

        if(subsets[x].rank<subsets[y].rank)
          subsets[x].parent=y;
        else if(subsets[x].rank>subsets[y].rank)
          subsets[y].parent=x;
        else {
          subsets[x].rank++;
          subsets[y].parent=x;
        }
    }
    public static void getKruskal(){
      int i=0,er=0;
      node=sort(node);
      Node[] knode=new Node[n];
      for(int j=0;j<n;j++){
        knode[j]=new Node();
      }
      subsets=new subset[n];
      for(int j=0;j<n;j++){
        subsets[j]=new subset();
        subsets[j].parent=j;
        subsets[j].rank=0;
      }

      while (er<n-1) {
        Node test=new Node();
        test=node[i];
        i++;

        int x=find(subsets,test.E1);
        int y=find(subsets,test.E2);

        if(x!=y){
          knode[er]=test;
          er++;
          Union(subsets,x,y);
        }
      }
      int min=0;
      for (Node k :knode ) {
          min += k.w;
      }

      System.out.print(min);
    }

  static  class subset
    {
        int parent, rank;
    }

    public static Node[] sort(Node[] n){
      for(int i=0;i<n.length-1;i++){
        for(int j=0;j<n.length-1-i;j++){
          if(n[j].w>n[j+1].w){
            Node l=n[j];
            n[j]=n[j+1];
            n[j+1]=l;
          }
        }
      }
      return n;
    }











}
