import java.util.Scanner;

public class MinAndMax {
    static Scanner sc = null;
    public static void main(String[] args) {
        sc= new Scanner(System.in);
    }
    static Node createTree(){
        Node root = null;
        System.out.println();
        int data = sc.nextInt();
        if(data ==-1)return null;
        root = new Node(data);
        System.out.println("Enter the left for : " + data);
        root.left=createTree();
        System.out.println("Enter the right for : " + data);
        root.right=createTree();
        return root;
    }
    static int Max(Node root){
        if(root == null) return Integer.MIN_VALUE; //sbse choti value return krdi
        return Math.max(root.data,(Math.max(Max(root.left),Max(root.right))));
    }
    static int Min(Node root){
        if(root == null) return Integer.MAX_VALUE;
        return Math.min(root.data,(Math.min(Min(root.left),Min(root.right))));
    }
}
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
    }
}