package LiinkedListImplementation;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insertAtHead(10);
        list.insertAtHead(3);
        list.insertAtHead(5);
        list.insertAtHead(7);
        list.insertAtHead(9);

        list.deleteFromHead();
        list.deleteFromHead();
        System.out.println(list);
        System.out.println();
        System.out.println(list.getLength());
    }
}
