package LinkedLists;

public class Find_0s1s2s extends Merge_LL {
    static SinglyNode sort_0s1s2s(SinglyNode head){
        SinglyNode dummy0= new SinglyNode(-1);
        SinglyNode dummy1= new SinglyNode(-1);
        SinglyNode dummy2= new SinglyNode(-1);
        SinglyNode t =head;
        SinglyNode d0=dummy0;
        SinglyNode d1=dummy1;
        SinglyNode d2=dummy2;

        while(t !=null){
            if(t.data==0){
                d0.next= t;
                d0=t;
            }
            else if(t.data==1){
                d1.next= t;
                d1=t;
            }
            else {
                d2.next = t;
                d2=t;
            }
            t = t.next;
        }
        d0.next=null;
        d1.next=null;
        d2.next=null;
        d0.next=dummy1.next;
        d1.next=dummy2.next;
        return dummy0.next;
    }

    public static void main(String[] args) {
        int[] a ={0,2,2,0,1,1,2,0,0,1};
        SinglyNode head=null;
        for(int i: a){
            head=insertAthead(i,head);
        }
        printList(head);
        head=reverseList(head);
        printList(head);
        head=sort_0s1s2s(head);
        printList(head);
    }
}
