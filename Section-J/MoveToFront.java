class LinkedList{
  
  static class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
    }
  }
  
  static Node moveToFront(Node head){
    Node secLast = null;
    Node last = head;
    while(last.next!=null){
      secLast = last;
      last = last.next;
    }
    secLast.next = null;
    last.next = head;
    head = last;
    return head;
  }
  
  static void displayLL(Node head){
    while(head!=null){
      System.out.println(head.data + "->");
      head = head.next;
    }
    System.out.println("null");
  }
  
  
  public static void main(String[] args){
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    displayLL(head);
    System.out.println();
    head = moveToFront(head);
    displayLL(head);
  }
}
