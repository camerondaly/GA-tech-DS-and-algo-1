public class ArrayQueueTests {
    public static void main(String[] args) {
        ArrayQueue<Object> myQueue = new ArrayQueue<>();

        myQueue.enqueue(0);
        printArrayQueue(myQueue);
        myQueue.enqueue(1);
        printArrayQueue(myQueue);

        ArrayQueue <Object> fullQueue = getFullArrayQueue();
        printArrayQueue(fullQueue);

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

    public static ArrayQueue<Object> getFullArrayQueue() {
        ArrayQueue<Object> newQueue = new ArrayQueue<>();
        for (int i = 0; i < 9; i++) {
            newQueue.enqueue(i);
        }
        return newQueue;
    }
}
