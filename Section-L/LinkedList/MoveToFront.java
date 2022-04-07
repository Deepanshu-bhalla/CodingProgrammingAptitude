static Node moveLastToFront(Node head){
        Node secLast = null;
        Node last = head;

        while (last.next!=null){
            secLast = last;
            last = last.next;
        }

        secLast.next = null;
        last.next = head;

        head = last;
        return head;


    }
