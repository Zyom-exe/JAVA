package LinkedLists;

class DoublyNode {
    int data;
    DoublyNode next;
    DoublyNode before;

    public DoublyNode(DoublyNode before, int data, DoublyNode next){
        this.before = before;
        this.data = data;
        this.next = next;
    }

    public DoublyNode(int data){
        this.data = data;
        before = null;
        next = null;
    }
}

public class DoublyLL {

    static DoublyNode insertAthead(int data, DoublyNode head){
        DoublyNode temp = new DoublyNode(null, data, head);
        head.before = temp;
        return temp;
    }

    static void print(DoublyNode head){
        DoublyNode temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    static DoublyNode deleteHead(DoublyNode head){
        if(head==null||head.next==null) {
            return null;
        }
        DoublyNode prev=head;
        head=head.next;
        head.before=null;
        prev.next=null;
        return head;
    }
    static DoublyNode reverseDLL(DoublyNode head) {
        DoublyNode temp = head;
        DoublyNode newHead = null;

        while (temp != null) {
            DoublyNode nextNode = temp.next;
            temp.next = temp.before;
            temp.before = nextNode;
            newHead = temp;
            temp = nextNode;
        }
        return newHead;
    }


    public static void main(String[] args) {

        int[] a = {2,5,7,8,9,12};

        DoublyNode head = new DoublyNode(a[0]);

        for(int i=1;i<a.length;i++){
            head = insertAthead(a[i], head);
        }

        print(head);
//        head=deleteHead(head);
//        print(head);
        head=reverseDLL(head);
        print(head);
    }
}