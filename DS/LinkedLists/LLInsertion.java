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
public class LLInsertion {

    Node head;
    class Node{
     
         int data;
         Node next;
         Node(int d){data =d; next = null;}
    }
    
    public void atTheStart(int new_data)
    {
        Node new_node = new Node(new_data);
        
        new_node.next = head;
        
        head = new_node;
    }
    
    public void atTheMiddle(Node pos_node, int new_data)
    {
        if(pos_node==null)
        {
            System.out.println("Node cant be null");
            return;
        }
        
        Node n = new Node(new_data);//n = New node
        n.next = pos_node.next;
        pos_node.next = n;
    }
    
    public void atTheEnd(int d)//d = new data
    {
        Node n = new Node(d);
        if(head == null)
        {
            head = n;
            return;
        }
        
        n.next = null;
        
        Node last = head;
        while(last.next != null)//traversing the list
            last = last.next;
        
        last.next = n;
        return;
        
    }
    
    public void printList()
    {
        Node tnode = head;
        while(tnode != null)
        {
            System.out.println(tnode.data+"");
            tnode = tnode.next;
        }
    }
    //function that deletes the start node
    public void deleteAtBeg()
    {
        //Node temp = head;
        
        head = head.next;
        
    }
    
    public void deleteAtEnd()
    {
        Node last = head;
        while(last!= null)
            last = last.next;
        
        
    }
    
    public void deleteNodeWithPosition(int pos)
    {
        if(head == null)
            return;
        
        Node temp = head;
        //check whether to delete head or not
        if (pos == 0) 
        {
            head = temp.next;
            return;
        }
        //finding the previous node
        for (int i = 0;temp != null && i < pos-1; i++) 
            temp = temp.next;
        
        //if pos is greater than no of elements
        if(temp == null || temp.next == null)
            return;
        
        Node n = temp.next.next;
        //unlinking the node
        temp.next = n;
          
        
    }
    
    public void deleteNodeWithKey(int key)
    {
        Node temp = head, prev = null;
        
        //if head has the key itself then
        if(temp != null && temp.data == key)
        {
            head = temp.next;
            return;
        }
        
        //search for the key and keep previous node
        //in record
        while(temp != null && temp.data != key)
        {
            prev = temp;
            temp = temp.next;
        }
        
        //if key is not in LL
        if(temp == null) return;
        
        //unlinking the node from LL    
        prev.next = temp.next;
    }
    
    public static void main(String[] args) 
    {
        LLInsertion l = new LLInsertion();
        
        l.atTheStart(5);
        l.atTheStart(2);
        l.atTheEnd(6);
        l.atTheMiddle(l.head.next, 1);
        //l.deleteAtBeg();
        //l.deleteNodeWithKey(2);
        l.deleteNodeWithPosition(2);
        
        l.printList();
        
    }
     
    
}
