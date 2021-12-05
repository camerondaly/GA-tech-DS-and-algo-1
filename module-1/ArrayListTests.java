public class ArrayListTests {
    public static void main(String args[]) {
        ArrayList<Object> instance = new ArrayList<>();
        instance.addToFront(3);
        printArrayList(instance);
    }

    public static void printArrayList(ArrayList<Object> instance) {
        Object[] backingArray = instance.getBackingArray();
        System.out.printf("The ArrayList's size is: %s", instance.size());
        System.out.println("The backing array is currently: ");
        for (int i = 0; i < instance.size(); i++) {
            System.out.print(backingArray[i]);
        }

    }
}
