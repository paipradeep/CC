//Recursively reverse a doubly linked list
/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node Reverse(Node head) {
    if(head == null)
        return head;
    Node next = head.next;
    Node temp=head.prev;
    head.prev = head.next;
    head.next =  temp;
    if(next==null)
        return head;
    return Reverse(next);
}
