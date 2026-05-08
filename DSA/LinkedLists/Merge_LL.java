package LinkedLists;

public class Merge_LL extends Singly_LL {
    static SinglyNode mergeLL(SinglyNode head1, SinglyNode head2) {
        SinglyNode dummy = new SinglyNode(-1);
        SinglyNode temp = dummy;
        SinglyNode t1 = head1;
        SinglyNode t2 = head2;
        while (t1 != null && t2 != null) {
            if (t1.data < t2.data) {
                temp.next = t1;
                temp = t1;
                t1 = t1.next;
            } else {
                temp.next = t2;
                temp = t2;
                t2 = t2.next;
            }
        }
        if (t1 != null) {
            temp.next = t1;
        } else if (t2 != null)
            temp.next = t2;

        return dummy.next;
    }
    public static SinglyNode reverseList(SinglyNode head) {
        if(head==null || head.next==null){
            return head;
        }
        SinglyNode newhead= reverseList(head.next);
        SinglyNode front = head.next;
        front.next=head;
        head.next=null;

        return newhead;
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        int[] b={2,6,8,9,10};
        SinglyNode head1=null;
        for(int i: a){
            head1=insertAthead(i,head1);
        }
        head1=reverseList(head1);
        SinglyNode head2=null;
        for(int i: b){
            head2=insertAthead(i,head2);
        }
        head2=reverseList(head2);
        SinglyNode newhead=mergeLL(head1,head2);
        printList(newhead);
    }
}

