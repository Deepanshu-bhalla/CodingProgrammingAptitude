public class basics {
  
    static Node addFront(Node head, int data){
        Node temp = new Node(data);
        if(head==null){
            head = temp;
        }
        temp.next = head;
        head = temp;
        return head;
    }

    static Node addLast(Node head,int data){
        Node temp = new Node(data);
        if(head==null){
            head = temp;
        }

        Node curr = head;
        while (curr.next!=null){
            curr = curr.next;
        }
        
        curr.next = temp;
        temp.next = null;
        return head;
    }

    static int len(Node head){
        int c = 0;
        while (head!=null){
            c++;
            head = head.next;
        }

        return c;
    }

    static Node addAtPos(Node head, int data, int pos){
        Node temp = new Node(data);
        if(pos==1){
            head = addFront(head,data);
            return head;
        }
        Node curr = head;
        int c = 1;
        while (c!=pos-1){
            curr = curr.next;
            c++;
        }
        temp.next = curr.next;
        curr.next = temp;
        return head;

    }
  
    static void deleteLast(Node head){
        Node secLast = null;
        Node last = head;
        while (last.next!=null){
            secLast = last;
            last = last.next;
        }

        secLast.next = null;
    }
  
    static void printLL(Node head){
        if(head==null) return;
        System.out.print(head.data+" ");
        printLL(head.next);
    }
  
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        printLL(head);
        deleteNode(head);
      
        System.out.println();
        printLL(head);
        head = addFront(head,6);
      
        System.out.println();
        printLL(head);

        head = addLast(head,7);
        System.out.println();
        printLL(head);

        head = addAtPos(head,8,1 );
        System.out.println();
        printLL(head);
    }
}
