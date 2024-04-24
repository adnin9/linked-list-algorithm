public class LinkedListDemo {
    public static void main(String[] args) throws Exception {
        MyLinkList linkedList = new MyLinkList();
        linkedList.insertFirst(1);
        linkedList.insertFirst(2);
        linkedList.insertFirst(3);
        linkedList.insertFirst(2);
        linkedList.insertFirst(4);
        linkedList.insertFirst(1);

        System.out.println("Original Linked List:");
        displayList();

        System.out.println("\nNumber of duplicates: " + countDuplicate());

        removeDuplicates(linkedList);

        System.out.println("\nLinked List after removing duplicates:");
        displayList();
    }
}
