public class ArrayQueueTests {
    public static void main(String[] args) {
        ArrayQueue<Object> myQueue = new ArrayQueue<>();
    
        myQueue.enqueue(0);
        printBackingArray(myQueue);
        myQueue.enqueue(1);
        printBackingArray(myQueue);
        myQueue.dequeue();
        printBackingArray(myQueue);
        myQueue.enqueue(123);
        printBackingArray(myQueue);

        System.out.println("Initializing new, full array with 9 elements...");
        ArrayQueue <Object> fullQueue = getFullArrayQueue();
        printBackingArray(fullQueue);

        fullQueue.dequeue();
        fullQueue.dequeue();
        fullQueue.dequeue();
        printBackingArray(fullQueue);
        fullQueue.enqueue(123);
        printBackingArray(fullQueue);
        fullQueue.enqueue(123);
        fullQueue.enqueue(123);
        printBackingArray(fullQueue);
        fullQueue.enqueue(11);
        printBackingArray(fullQueue);
        fullQueue.enqueue(22);
        printBackingArray(fullQueue);
        fullQueue.dequeue();
        fullQueue.dequeue();
        fullQueue.dequeue();
        fullQueue.dequeue();
        fullQueue.dequeue();
        fullQueue.dequeue();
        fullQueue.dequeue();
        fullQueue.dequeue();
        fullQueue.dequeue();
        printBackingArray(fullQueue);
        fullQueue.dequeue();
        fullQueue.dequeue();
        printBackingArray(fullQueue);
        fullQueue.enqueue(111);
        printBackingArray(fullQueue);
        fullQueue.dequeue();
        printBackingArray(fullQueue);
    }
    public static void printBackingArray(ArrayQueue<Object> myQueue) {
        Object[] backingArray = myQueue.getBackingArray();
        System.out.println("The ArrayQueue's size is: " + ((Integer)myQueue.size()).toString());
        String stringArray = "";
        for (int i = 0; i < backingArray.length; i++) {
            if (backingArray[i] != null) {
                stringArray = stringArray.concat(backingArray[i].toString());
                stringArray = stringArray.concat(" ");  
            } else {
                stringArray = stringArray.concat("_ ");
            }
        }
        System.out.println("The backingArray is: " + stringArray);
        System.out.println("The backingArray's capacity is: " + ((Integer)backingArray.length).toString() + "\n");
    }

    public static ArrayQueue<Object> getFullArrayQueue() {
        ArrayQueue<Object> newQueue = new ArrayQueue<>();
        for (int i = 0; i < 9; i++) {
            newQueue.enqueue(i);
        }
        return newQueue;
    }
}