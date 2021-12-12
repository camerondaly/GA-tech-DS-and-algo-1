public class SLLTests {
    public static void main(String[] args) {
        SinglyLinkedList<Object> myList = new SinglyLinkedList<Object>();
        
        myList.addToBack(0);
        printList(myList);
        
        System.out.printf("Removed from front: %d \n", myList.removeFromFront());
        printList(myList);

        myList.addToFront(0);
        printList(myList);

        System.out.printf("Removed from back: %d \n", myList.removeFromBack());
        printList(myList);

        myList = initilializeLongList();
        printList(myList);

        
    }

    public static void printList(SinglyLinkedList<Object> myList) {
        SinglyLinkedListNode<Object> curr = myList.getHead();
        String listAsText = "";
        while (curr != null) {
            listAsText = listAsText.concat((String)curr.getData() + " ");
        }
        System.out.printf("The list is currently: '%s' \n", listAsText);
        System.out.printf("The head is: %d \n", myList.getHead());
        System.out.printf("The tail is: %d \n", myList.getTail());
        System.out.printf("The size is: %d \n\n", myList.size());
    }

    public static SinglyLinkedList<Object> initilializeLongList() {
        SinglyLinkedList<Object> newList = new SinglyLinkedList<Object>();
        for (int i = 0; i < 6; i++) {
            newList.addToFront(i);
        }
        return newList;
    }
}
