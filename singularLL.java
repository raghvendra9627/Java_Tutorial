class LL{

    public Node head=null;
    class Node{
        String data;
        Node next;

        Node(String data)
        {
            this.data=data;
            this.next=null;
        }
    }

    //add --> first,last
    public void addfirst(String data){
        Node newnode = new Node(data);
        if(head==null){
            head = newnode;
            return;
        }
        newnode.next=head;
        head  = newnode;
    }

    public void addlast(String data){
        Node newnode = new Node(data);
        if(head==null){
            head = newnode;
            return;
        }
        Node currentnode = head;
        while(currentnode.next!=null){
            currentnode=currentnode.next;
        }
        currentnode.next=newnode;
    }
    
    //printing linked list

    public void printlist(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currentnode = head;
        while(currentnode!=null){
            System.out.print(currentnode.data +"-->");
            currentnode=currentnode.next;
        }
        System.out.println("NULL");
    }

    //deleting : first,last

    public void deletefirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head.next==null){
            head = null;
            return;
        }
        Node currentnode = head;
        head = currentnode.next;
    }

    public void deletelast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        if(head.next==null){
            head = null;
            return;
        }
        Node currentnode = head;
        while(currentnode.next!=null){
            currentnode=currentnode.next;
        }
        Node temporarynode = head;
        while(temporarynode.next!=currentnode){
            temporarynode=temporarynode.next;
        }
        temporarynode.next=null;
    }

    public static void main(String[] args) 
    {
        LL list= new LL();
        list.addfirst("this");
        list.addfirst("hello");
        list.printlist();

        list.addlast("is");
        list.addlast("java");
        list.printlist();
        list.deletefirst();
        list.printlist();
        list.deletelast();
        list.printlist();
        
    }

}
