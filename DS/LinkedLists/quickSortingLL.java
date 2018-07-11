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
//This is basically insertion of LL at various positions
public class quickSortingLL {
    
    public LLNode head;
    //LL Declaration
    public class LLNode{
        private int data;
        private LLNode next;
        
        
        public LLNode(int data){
            this.data = data;
            next = null;
        }
        
        public void setData(int data){
            this.data = data;
        }
        public int getData(){
            return data;
        }
        public void setNext(LLNode next){
            this.next = next;
        }
        public LLNode getNext(){
            return this.next;
        }
    }
    
    class holder{
        LLNode headstart;
        LLNode headEnd;
    }
    
    //function to find the length of the list
    public int listLength(LLNode head){
        int length = 0;
        LLNode c = head;
        while(c != null){
            length++;
            c = c.next;
        }    
        return length;
    }
   
    public void push(int data) throws java.lang.NullPointerException{
        LLNode newNode = new LLNode(data);//new node
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;//update the new node to point to head
        head = newNode;//update head to point to new node
    }
    
    public void insertAfer(LLNode prev, int data){
        if(prev == null){
            System.out.println("Previous can't be equal to null");
            return;
        }
        
        LLNode newNode = new LLNode(data);
        newNode.next = prev.next;
        prev.next = newNode;
        
    }
    
    public void insertAtEnd(int data){
        //if list is empty insert at head
        if(head == null){
            head = new LLNode(data);
            return;
        }
        LLNode newNode = new LLNode(data);
        newNode.next = null;//make next of new node as null
        
        LLNode last = head;//traverse till the last node
        while(last.next != null){
            last = last.next;
        }
        last.next = newNode;//set next of last node to new node 
        
    }
    //deleting a node from the list with the given key/data
    public void deleteNode(int key){
        //if list is empty then return
        if(head == null)
            return;
        
        LLNode temp = head, prev = null;
        //if head itself is the key then 
        if(temp != null && temp.data == key){
            head = temp.next;//change the head 
            return;
        }
        //search for the key in the list
        while(temp != null && temp.data != key){
            prev = temp;
            temp = temp.next;
        }
        //if key is not present then return
        if(temp == null)return;
        //if found then delete the node and set it to temp.next
        prev.next = temp.next;
        
    }
    
    //deleting a node with a given position in the LL
    public void deleteNodeWithPos(int pos){
        //if list is empty then return
        if(head == null)
            return;
        
        LLNode temp = head;
        
        //check if pos is 0, that means head is to be deleted
        if(pos == 0){
            head = temp.next;
            return;
        }
        
        //find previous node of the node to be deleted
        for (int i = 0; temp != null && i < pos-1; i++) {
            temp = temp.next;
        }
        
        //if pos is larger than the list then return
        if(temp == null || temp.next == null)
            return;
        
        //create the node to be deleted
        LLNode node = temp.next.next;
        temp.next = node;//Delink the deleted node
    }
    
    //function to find the middle of the LL
    public void printMiddle(){
        LLNode slowPtr = head;
        LLNode fastPtr = head;
        LLNode prevNode = head;
        if(head != null){
            while(fastPtr != null && fastPtr.next != null){
                prevNode = slowPtr;
                fastPtr = fastPtr.next.next;
                slowPtr = slowPtr.next;
            }
            //checking for even and odd 
            if(fastPtr == null)
                System.out.println("The middle elements are "+prevNode.data+" and "+slowPtr.data);/*this statement returns two middle elements
            in case of evene number of elements*/
            else
                System.out.println("The middle element is "+slowPtr.data);//This statement gives
        }
        
    }
    
    //function to reverse the linked list
    public void reverse(){
        LLNode next = null;
        LLNode prev = null;
        LLNode current = head;
        
        //traverse the list and swap each element
        while(current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        
    }
    
    public void print(){
        LLNode no = head;
        while(no != null){
            System.out.print(no.data+" ");
            no = no.getNext();
        }
    }
    
    public static void main(String[] args) throws java.lang.NullPointerException {
        quickSortingLL l = new quickSortingLL();
        l.push(1);
        l.push(4);
        //l.push(22);
//        l.insertAtEnd(14);
        l.push(55);
//        l.insertAfer(l.head, 7);
//        calling delete node functions
        //l.deleteNode(1);
        l.deleteNodeWithPos(1);
        l.reverse();
        l.print();
        System.out.println();
        System.out.println("Length of list is:- "+l.listLength(l.head));
        l.printMiddle();
        
    }
}

    