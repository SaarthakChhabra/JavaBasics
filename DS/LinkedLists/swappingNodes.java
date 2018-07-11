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
public class swappingNodes {
    
    public LLNode head;
    //LL Declaration
    public class LLNode{
        private int data;
        private LLNode next;
        
        
        public LLNode(int data){
            this.data = data;
            this.next = null;
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
        LLNode newNode = new LLNode(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    
    //swapping function
    public void swapNodes(LLNode head, int x, int y){
        if(x == y)return;//if both elements are same the return
        LLNode temp;
        LLNode currX = head, prevX = null;
        while(currX != null && currX.data != x){
            prevX = currX;
            currX = currX.next;
        }
        
        LLNode currY = head, prevY = null;
        while(currY != null && currY.data != y){
            prevY = currY;
            currY = currY.next;
        }
        
        prevX.next = currY;
        
        prevY.next = currX;
        
//        if(prevY.data == currX.data){
//            temp = currY.next;
//            currY.next = currX;
//            currX.next = temp;
//            
//            prevX.next = currY;
//            
//        }
//        
//        if(prevX.data == currY.data){
//            temp = currX.next;
//            currX.next = currY;
//            currY.next = temp;
//            
//            prevY.next = currX;
//        }
//        
//        //swapping actual nodes
//        temp = currY.next;
//        currY.next = currX.next;
//        currX.next = temp;
//        
//        //swapping previous nodes
//        prevY.next = currX;
//        prevX.next = currY;
        
    }
    
    
    
    
    public void print(){
        LLNode no = head;
        while(no != null){
            System.out.print(no.data+" ");
            no = no.getNext();
        }
    }
    
    public static void main(String[] args) throws java.lang.NullPointerException {
        swappingNodes l = new swappingNodes();
        l.push(1);
        l.push(4);
        
    //    l.insertAtEnd(14);
        l.push(55);
        l.push(44);
        l.push(12);
      //  l.insertAfer(l.head, 7);
        //calling delete node functions
        //l.deleteNode(1);
        //l.deleteNodeWithPos(1);
        l.swapNodes(l.head, 44, 4);
        l.print();
        System.out.println();
        System.out.println("Length of list is:- "+l.listLength(l.head));
        
        
    }
    
}
