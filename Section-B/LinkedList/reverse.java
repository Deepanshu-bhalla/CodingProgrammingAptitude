class reverse{
  static class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
    }
  }
  
  //iterative Method
  static Node reverseIterative(Node head){
    Node curr = head;
    Node next = null;
    Node prev = null;
    while(curr!=null){
      next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    head = prev;
    return head;
  }
  
  //Recursive Method
  static Node reverseRecursive(Node head){
    if(head==null || head.next = null)
      return head;
    
    Node res = reverseRecursive(head.next);
    head.next.next = head;
    head.next = null;
    
    return rest;
  }
  
  
  
  static void displayLL(Node head){
    while(head!=null){
      System.out.println(head.data+" ");
      head = head.next;
    }
  }
  
  
  public static void main(String[] args){
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    
    display(head);
    head = reverseIterative(head);
   
    System.out.println();
    display(head);
  }
}
