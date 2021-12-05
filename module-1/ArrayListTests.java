public class ArrayListTests {
    public static void main(String args[]) {
        ArrayList<Object> instance = new ArrayList<>();
        printArrayList(instance);

        instance.addToFront(3);
        printArrayList(instance);

        instance.addToFront(8);
        printArrayList(instance);

        instance.addToFront(5);
        printArrayList(instance);

        instance.addToBack(1);
        printArrayList(instance);

        instance.addToBack(14);
        printArrayList(instance);

        instance.addToBack(1);
        printArrayList(instance);

        instance.addToBack(1);
        printArrayList(instance);

        instance.addToBack(1);
        printArrayList(instance);

        instance.addToBack(9);
        printArrayList(instance);

        /*
        ArrayList<Object> atCapacity = instance;
        System.out.println("Working with backing array at capacity:");
        System.out.println("Testing adding 10th to back: \n");
        atCapacity.addToBack(10);
        printArrayList(atCapacity);
        */
        
        ArrayList<Object> atCapacityTwo = instance;
        System.out.println("Working with backing array at capacity:");
        System.out.println("Testing adding 10th to front:");
        atCapacityTwo.addToFront(10);
        printArrayList(atCapacityTwo);

        System.out.println("Initializing a new, full ArrayList and testing removal:");
        ArrayList<Object> fullArrayList = initializeFullArrayList();
        printArrayList(fullArrayList);

        Object removed = fullArrayList.removeFromFront();
        System.out.println(removed);
        printArrayList(fullArrayList);

        fullArrayList.removeFromFront();
        printArrayList(fullArrayList);

        fullArrayList.removeFromFront();
        printArrayList(fullArrayList);

        fullArrayList.removeFromBack();
        printArrayList(fullArrayList);

        fullArrayList.removeFromBack();
        printArrayList(fullArrayList);
    }

    public static void printArrayList(ArrayList<Object> instance) {
        Object[] backingArray = instance.getBackingArray();
        System.out.printf("The ArrayList's size is: %s \n", instance.size());
        System.out.println("The backing array is currently: ");
        for (int i = 0; i < instance.size(); i++) {
            System.out.print(backingArray[i] + " ");
        }
        System.out.printf("\n" + "The backingArray's capacity is: %s \n\n", instance.getBackingArray().length);
    }

    public static ArrayList<Object> initializeFullArrayList() {
        ArrayList<Object> res = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            res.addToBack(i);
        }
        return res;
    }
}
