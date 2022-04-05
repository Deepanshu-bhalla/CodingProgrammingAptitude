class AddOne
{
    public static Node addOne(Node head) 
    { 
        return reverse(add(reverse(head)));
    }
    
    static Node add(Node head){
        Node res = head;
        Node temp = null;
        Node prev = null;

        int carry = 1;
        int sum = 0;

        while (head != null){
            sum = carry + head.data;
            carry = (sum>=10) ? 1 : 0;
            sum = sum%10;
            head.data = sum;
            temp = head;
            head = head.next;
        }
        if(carry>0){
            temp.next = new Node(carry);
        }
        return res;
    }
    
    static Node reverse(Node head){
        Node prev = null;
        Node next = null;
        Node curr = head;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;;
        }
        
        head = prev;
        return head;
    }
}
