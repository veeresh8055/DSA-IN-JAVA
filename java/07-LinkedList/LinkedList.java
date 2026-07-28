package LinkedList;

  class LinkedList {
   
    Node head;
   // Creating a Node Object
    private class Node {
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
        }
    }


    // add element to the first 
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head=newNode;
    }

    // add element to the last of the list 
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node CurrNode = head;
        while(CurrNode.next != null){
            CurrNode = CurrNode.next;
        }
        CurrNode.next = newNode;
    }

    //print all list 
    public void printList(){
        if(head ==null){
            System.out.println("List Is Empty");
            return;

        }
        Node currNode=head;
        while(currNode != null){
            System.out.print( currNode.data+" -> ");
          currNode = currNode.next;
        }
        System.out.println("null");
    }

    // main method 
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst("am");
        list.addFirst("Hi");
        list.printList();
        list.addLast("Veeresh");
        list.printList();
    }


}