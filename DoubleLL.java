public class DoubleLL {
    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        //create new node
        Node  newNode = new Node(data);
        size++;
        
        if(head==null){
            head=tail=newNode;
            return;
        }
        
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        
    }
    
    public void print( ){
        
        
        if(head==null){
            System.out.print("LL is empty");
            return;
        }
        
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
        
    }

    public int removeFirst(){
        if(head==null){
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }
         if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }

    public void reverse(){
        Node prev=null;
        Node curr = head;
        Node next;

        while(curr != null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }

        head = prev;
    }

    public static void main(String args[]){
        DoubleLL dll = new DoubleLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);

        // dll.removeFirst();
        dll.reverse();
        dll.print();
    }
}
