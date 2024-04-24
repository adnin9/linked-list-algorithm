public class MyLinkList {
    private Node first;

    public MyLinkList(){
        first = null;
    }

    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(int data){
        Node newLink = new Node(data);
        newLink.next = first;
        first = newLink;
    }

    public Node deleteFirst(){
        Node temp = first;
        first = first.next;
        return temp;
    }

    public Node find(int key) {
        Node current = first; 

        while(current.data != key){
            if(current.next == null){
                return null;
            }
            
            else{
                current = current.next;
            }
        }

        return current;
    }

    public Node delete(int key) {
        Node current = first;
        Node previous = first; 

        while(current.data != key){
            if(current.next == null)
                return null; 
            else{
                previous = current;
                current = current.next;
            }
        }
        
        if(current == first){
            first = first.next;
        }
        else{
            previous.next = current.next;
        }

        return current;
    }

    public void displayList(){
        System.out.println("List (first-->last): ");
        Node current = first; 
        while(current != null){
            current.displayNode();
            current = current.next;
        }
    }


    static int countDuplicate(MyLinkList list) {
        if (list.first == null) {
            return 0;
        }

        int count = 0;

        // traversing linked list
        Node current = list.first;
        while (current != null) {
            // comparing current element with all others
            Node temp = current.next;
            while (temp != null) {
                if (current.data == temp.data) {
                    count++;
                    break;  // not counting the same duplicate twice
                }
                temp = temp.next;
            }

            current = current.next; // move to next element to check for its duplicates
        }

        return count;
    }

    static MyLinkList removeDuplicates(MyLinkList list) {
        Node current = list.first;
        while (current != null) {
            Node temp = current;
            while (temp.next != null) {
                if (current.data == temp.next.data) {
                    temp.next = temp.next.next; // removing the duplicate element
                } 
                else {
                    temp = temp.next; // move to the next element
                }
            }

            current = current.next;
        }

        return list;
    }
}


