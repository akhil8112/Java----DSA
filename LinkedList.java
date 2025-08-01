public class LinkedList {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
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
        head=newNode;
        
    }
    public void addLast(int data){
        //create new node
        Node  newNode = new Node(data);
        size++;
        
        if(head==null){
            head=tail=newNode;
            return;
        }

        tail.next=newNode;
        tail=newNode;
        
    }
    public void print( ){
        
        
        if(head==null){
            System.out.print("LL is empty");
            return;
        }
        
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
        
    }
    
    public void add(int idx,int data){
        if(idx==0){
            addFirst(data);
            return;
        }

        Node newNode= new Node(data);
        size++;

        Node temp=head;
        int i=0;

        while(i<idx-1){
            temp=temp.next;
            i++;
        }

        newNode.next=temp.next;
        temp.next=newNode;
    }

    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val=head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
        }else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }

        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }

        int val=prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    public int itrSearch(int key){
        Node temp=head;
        int i=0;

        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }

    public int helper(Node head,int key){
        if(head==null){
            return -1;
        }

        if(head.data==key){
            return 0;
        }

        int idx=helper(head.next,key);

        if(idx==-1){
            return -1;
        }

        return idx+1;

    }

    public int reSearch(int key){
        return helper(head,key);
    }

    public void reverse(){
        Node prev=null;
        Node curr = head = tail;
        Node next;

        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        head = prev;
    }

    public void deleteNthfromEnd(int n){
        int sz=0;
        Node temp=head;

        while(temp!=null){
            temp=temp.next;
            sz++;
        }

        if(n==sz){
            head=head.next;
            return;
        }

        int i=1;
        int iToFind=sz-n;
        Node prev=head;

        while(i<iToFind){
            prev=prev.next;
            i++;
        }

        prev.next=prev.next.next;
        return;
    }

    public Node findMid(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;  //+1
            fast=fast.next.next;    //+2
        }

        return slow;
    }

    public boolean checkPalindrome(){
        if(head==null ||head.next==null){
            return true;
        }

        Node mid =findMid(head);

        //reverse second half
        Node curr = mid;
        Node prev=null;
        Node next;

        while(curr != null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node right=prev;
        Node left=head;

        //check if equal

        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;

    }

    public static boolean is_cycle(){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public  static void removeCycle(){
        //detect cycle

        Node slow=head;
        Node fast=head;
        boolean cycle=false;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;

            if(slow==fast){
                cycle = true;
                break;
            }
        }
        if(cycle=false){
            return;
        }
        //find meeting point

        slow=head;
        Node prev=null;
        while(slow!=fast){
            prev=fast;
            slow=slow.next;
            fast=fast.next;
        }

        //remove cycle
        prev.next=null;
    }

    public void ZigZag(){
        //find mid

        Node slow =head;
        Node fast = head.next;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node mid = slow;

        //reverse 2nd half

        Node curr = mid.next;
        mid.next=null;
        Node prev = null;
        Node next;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node left = head;
        Node right = prev;
        Node nextL,nextR;

        //alternate merge zigzag

        while(left != null && right != null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            left=nextL;
            right=nextR;
        }
    }
    public static void main(String args[]){
        LinkedList ll= new LinkedList();
        // ll.addFirst(2);
        // ll.addFirst(1);
        // ll.addLast(2);
        // ll.addLast(1);
        // ll.addLast(5);

        // ll.add(2,9);
        
        // System.out.print(ll.size);

        // ll.removeFirst();

        //ll.removeLast();

        //System.out.println(ll.itrSearch(4));

        // System.out.println(ll.reSearch(4));

        // ll.reverse();
        
        // ll.deleteNthfromEnd(3);
        
        // System.out.println(ll.checkPalindrome());

        // head=new Node(1);
        // head.next=new Node(2);
        // head.next.next=new Node(3);
        // head.next.next.next=head;
        // System.out.println(is_cycle());
        
        // head=new Node(1);
        // Node temp=new Node(2);
        // head.next=temp;
        // head.next.next=new Node(3);
        // head.next.next.next=temp;
        // System.out.println(is_cycle());
        // removeCycle();
        // System.out.println(is_cycle());


        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.ZigZag();
        ll.print();
        

        //    ll.print();    

    }
}
