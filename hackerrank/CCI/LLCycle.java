// To detect if cycle is present in a linkedlist
/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    HashSet<Node> hashset = new HashSet<Node>();
    Node CN = head;
    while(CN != null && !hashset.contains(CN)){
        hashset.add(CN);
        CN = CN.next;
    }
        
    if(CN == null)
        return false;
    return true;
}
