package LiinkedListImplementation;

public class LinkedList {
    private Node head;
    int length=0;
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.setNodeNext(this.head);
        this.head = newNode;
        length++;
    }

    public int getLength(){
        return length;
    }
    public void deleteFromHead(){
        this.head=this.head.getNodeNext();
        length--;
    }
    public Node findElement(int data){
        Node current =this.head;
        while(current!=null){
            if(current.getNode()==data){
                return current;
            }
       current =current.getNodeNext();
        }
    return null;
    }
    @Override
    public String toString() {
        return "LinkedList{" + "head=" + head + '}';
    }
}