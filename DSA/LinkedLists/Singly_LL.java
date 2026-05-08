package LinkedLists;
import java.util.*;
class SinglyNode {
    int data;
    SinglyNode next;
    public SinglyNode(int data, SinglyNode next){
        this.data=data;
        this.next=next;
    }
    SinglyNode(int data){
        this.data=data;
        this.next=null;
    }
}
public class Singly_LL {
    public static SinglyNode insertAthead(int newdata, SinglyNode head){
        SinglyNode newNode= new SinglyNode(newdata,head);
        return newNode;
    }
    static int printList(SinglyNode head) {
        SinglyNode temp = head;
        int c=0;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
            c++;
        }
        System.out.println();
        return c;
    }
    static boolean search(SinglyNode head, int val){
        SinglyNode temp= head;
        while(temp!=null) {
            if (temp.data == val)
                return true;
            temp=temp.next;
        }
        return false;
    }
    static int loopLength(SinglyNode head){
        SinglyNode slow=head;
        SinglyNode fast=head;
        int c=1;
        while(fast!=null && fast.next!=null){
            slow =slow.next;
            fast =fast.next.next;
            if(slow==fast){
                fast=fast.next;
                while(slow!=fast) {
                    c++;
                    fast = fast.next;
                }
                return c;
            }
        }
        return 0;
    }

//    public static void main(String[] args) {
//        int[] a={2,3,4,5,6,9};
//        System.out.println(Arrays.toString(a));
//        SinglyNode head= null;
//        for (int j : a) {
//            head = insertAthead(j, head);
//        }
//        int c=printList(head);
//        System.out.println(c);
//        System.out.println(search(head,5));
//
//    }
    public static void main(String[] args) {
        // Creating a sample linked list with a loop
        SinglyNode head = new SinglyNode(1);
        SinglyNode second = new SinglyNode(2);
        SinglyNode third = new SinglyNode(3);
        SinglyNode fourth = new SinglyNode(4);
        SinglyNode fifth = new SinglyNode(5);

        // Linking the nodes
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;

        // Creating a loop from fifth to second
        fifth.next = second;

        int loopLength = loopLength(head);

        if (loopLength > 0) {
            System.out.println("Length of the loop: " + loopLength);
        } else {
            System.out.println("No loop found in the linked list.");
        }
    }
}
