// import java.util.*;
// public class Linkedlist{
//     public static int length(Node head  ){
//         int count = 0;
//        while(head!=null){
//          count++;
//          head = head.next;
//        }
//        return count;
//     }
//     public static class Node{
//         int data;
//         Node next;
//         Node(int data){
//             this.data= data;
//         }
//     }
//     public static void main(String[] args) {
//         Node a = new Node(10);
//         Node b = new Node(20);
//         Node c = new Node(30);
//         Node d = new Node(40);
//         Node e = new Node(50);
//         a.next=b;
//         b.next=c;
//         c.next=d;
//         d.next=e;
//         System.out.println(length(a));
//     }
// }
// pip install numpy 
import java.util.*;
public class Linkedlist{
    public static class Node{
        int data ; 
        Node next;
        Node(int data){
        this.data = data;
        }
    }
    public static class linkedlist{
         Node head = null;
         Node tail = null;
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
           head = temp ;
            }else{
             tail.next = temp;
            }
            tail = temp ;
        }
        void display(){
            Node temp = head ;
           while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
           }
        }
    }
    public static void main(String[] args) {
        linkedlist ll =new linkedlist();
        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.display();
    }
}
// DNS (DOMAIN NAME SERVER)


