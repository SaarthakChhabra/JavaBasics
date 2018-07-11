/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DS.LinkedLists;

/**
 *
 * @author Saarthak
 */

//This is implementation of doubly linked list and some of its operations
public class doublyLL {
    static Node head = null;
    class Node{
        int data;
        Node next;
        Node prev;
        
        public Node(int d){
            this.data = d;
            next = null;
            prev = null;
        }
    }
    
    //fiunction to insert a node at the starting of LL
    public void push(int d){
            Node n = new Node(d);//new node
            //make next of new node as head and prev as null
            n.next = head;
            n.prev = null;
            
            //change prev of head to new node
            if(head != null)head.prev = n;
            
            //make head to point to the new node
            head = n;
            
    }
    
    //function to insert node after a given node
    public void insertAfter(Node prevNode, int data){
        if(prevNode == null){
            System.out.println("Previous node can't be null");
            return;
        }
        
        Node n = new Node(data);//new node
        
        //change new node's next ot previous node's next
        n.next = prevNode.next;
        
        //change prev node's next to new node
        prevNode.next = n;
        
        //change new node's previous to prevNode
        n.prev = prevNode;
        
        
    }
    
    //function to insert node at the end
    public void insertAtEnd(int data){
        Node n = new Node(data);// New node
        Node lastNode = head;// Last node
        
        n.next = null;
        //if LL is empty then make the new node as the head node
        if(head == null){
            n.prev = null;
            head = n;
            return;
        }
        
        //now find the last node
        while(lastNode.next != null){
            lastNode = lastNode.next;
        }
        
        //last node will point to new node
        lastNode.next = n;
        
        //new node's previous pointer will point to last node
        n.prev = lastNode;
    }
    
    //function to insert a node before a given node
    public void insertBeforeNode(Node nextNode, int data){
        if(nextNode == null)
            return;
        
        Node n = new Node(data);//new node
        
        //new node' next will point to next node
        n.next = nextNode;
        
        nextNode.prev.next = n;
        
        n.prev = nextNode.prev;
        
        nextNode.prev = n;
        
        if(head != null)
            n.prev.next = n;
//        nextNode.prev = n;
//        
//        n.prev = prevNode;
//        
//        prevNode.next = n;

        
        
    }
    
    //Fucntion to delete a node based on its position
    public void deleteNode(Node head_ref, Node del){
        //base case
        if(head == null || del == null)
            return;
        
        //if head node is to be deleted
        if(head == del)
            head = del.next;
        
        //change next only if the node to be deleted is NOT the last node
        if(del.next != null)
            del.next.prev = del.prev;
        
        if(del.prev != null)
            del.prev.next = del.next;
        
        //free the memory occupied by del
        return;
    }
    
    //function to reverse the linked list
    public void reverse(){
        Node temp = null;
        Node current = head;
        
        //Traversing through LL and swapping each element
        while(current != null){
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        
        //before changing the head check for cases like empty LL and LL with one node
        if(temp != null){
            head = temp.prev;
        }
            
    }
    
    public void print(){
        Node temp = head;
        int length = 0;
        while(temp != null){
            length++;
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
        System.out.println("Length of LL is "+length);
        
    }
    
    public static void main(String[] args) {
        doublyLL l = new doublyLL();
        //l.head.next = new Node(221);
        l.push(2);
        l.push(3);
        l.push(12);
        l.push(122);
        l.push(141);
        l.insertAfter(l.head, 21);
        l.insertAtEnd(15);
        l.insertBeforeNode(l.head.next, 7);
        //l.deleteNode(head, head.next.next);
        l.reverse();
        l.print();
    }
    
}
