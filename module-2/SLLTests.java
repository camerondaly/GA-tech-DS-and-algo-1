public class SLLTests {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> myList = new SinglyLinkedList<Integer>();
        
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

        System.out.printf("Removed from back: %d \n", myList.removeFromBack());
        printList(myList);

        System.out.printf("Removed from back: %d \n", myList.removeFromBack());
        printList(myList);

        System.out.printf("Removed from back: %d \n", myList.removeFromBack());
        printList(myList);

        System.out.printf("Removed from back: %d \n", myList.removeFromBack());
        printList(myList);

        System.out.println("Making another longer list...\n");
        SinglyLinkedList<Integer> secondList = initilializeLongList();

        System.out.printf("Removed from front: %d \n", secondList.removeFromFront());
        printList(secondList);
        System.out.printf("Removed from front: %d \n", secondList.removeFromFront());
        printList(secondList);
        System.out.printf("Removed from front: %d \n", secondList.removeFromFront());
        printList(secondList);
        System.out.printf("Removed from back: %d \n", secondList.removeFromBack());
        printList(secondList);

    }

    public static void printList(SinglyLinkedList<Integer> myList) {
        SinglyLinkedListNode<Integer> curr = myList.getHead();
        String listAsText = "";
        while (curr != null) {
            listAsText = listAsText.concat(String.valueOf(curr.getData()) + " ");
            curr = curr.getNext();
        }
        if (myList.size() == 0) {
            System.out.println("The list is empty.\n");
            return;
        }
        System.out.printf("The list is currently: '%s' \n", listAsText);
        System.out.printf("The head is: %s \n", String.valueOf(myList.getHead().getData()));
        System.out.printf("The tail is: %s \n", String.valueOf(myList.getTail().getData()));
        System.out.printf("The size is: %s \n\n", String.valueOf(myList.size()));
    }

    public static SinglyLinkedList<Integer> initilializeLongList() {
        SinglyLinkedList<Integer> newList = new SinglyLinkedList<Integer>();
        for (int i = 0; i < 4; i++) {
            newList.addToBack(i);
        }
        return newList;
    }
}
