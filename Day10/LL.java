import java.util.*;
class LL{
    class node{
        int data;
        node next;
        
        public node(int data){
            this.data=data;
            this.next = null;
        }
    }
    node head;
    node tail;
    public void addnode(int data){
        node newNode = new node(data);
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next= newNode;
        tail= newNode;
    }
    public void display(){
        node current = head;
         while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
    public static void main (String args[]){
         LL list = new LL();
        list.addnode(2);
        list.display();

    }
}