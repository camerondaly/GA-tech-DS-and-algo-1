public class ArrayQueueTests {
    public static void main(String[] args) {
        ArrayQueue<Object> myQueue = new ArrayQueue<>();

        myQueue.enqueue(0);
    }
    public static void printBackingArray(ArrayQueue<Object> myQueue) {
        Object[] backingArray = myQueue.getBackingArray();
        String stringArray = "";
        for (int i = 0; i < backingArray.length; i++) {
            stringArray = stringArray.concat(backingArray[i].toString());
            stringArray = stringArray.concat(" ");
        }
        System.out.println("The backingArray is: " + stringArray);
        System.out.println("The backingArray's capacity is: " + ((Integer)backingArray.length).toString());
    }

    public static void printArrayQueue(ArrayQueue<Object> myQueue) {
        printBackingArray(myQueue);
        System.out.println("The ArrayQueue's size is: " + ((Integer)myQueue.size()).toString());
    }

    public static void getFullArrayQueue() {
        for (int i = 0; i < 9; i++) {
            
        }
    }
}
