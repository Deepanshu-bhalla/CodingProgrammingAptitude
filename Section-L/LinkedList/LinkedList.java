package LinkedListSectionL;

import java.util.Scanner;

public class LinkedList {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    static class LinkedListNode{
        int data;
        Node next;
        Node prev;
        LinkedListNode(int data){
            this.data = data;
        }
    }

    //insertion

    static Node addLast(Node head,int data){
        Node temp = new Node(data);
        if(head==null){
            head = temp;
            return head;
        }

        Node curr = head;
        while (curr.next!=null){
            curr = curr.next;
        }
        curr.next = temp;
        temp.next = null;
        return head;
    }

    static void displayLL(Node head){
        while (head!=null){
            System.out.print(head.data+"->");
            head = head.next;
        }
        System.out.println("null");

    }


    
    static Node deleteLastNode(Node head){
        Node secLast = null;
        Node last = head;

        while (last.next!=null){
            secLast = last;
            last = last.next;
        }

        secLast.next = null;
        return head;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node head = null;
        for (int i = 0; i < n ; i++) {
            int d  = sc.nextInt();
            head = addLast(head,d);
        }

        displayLL(head);

        System.out.println();
        head = moveLastToFront(head);

        displayLL(head);
    }
}
