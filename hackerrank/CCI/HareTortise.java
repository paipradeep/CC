/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/
// Using Floyd's cycle detection ( Hare-Tortise algorithm)
boolean hasCycle(Node head) {
    Node fast = head,slow = head;
    while(fast != null && fast.next!= null){
        slow = slow.next;
        fast = fast.next.next;
        if(slow == fast)
            return true;
    }
    return false;
}
