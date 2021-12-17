public class ArrayQueueTests {
    public static void main(String[] args) {

    }
    public static void printBackingArray(ArrayQueue<Object> myQueue) {
        Object[] backingArray = myQueue.getBackingArray();
        String stringArray = "";
        for (int i = 0; i < backingArray.length; i++) {
            stringArray = stringArray.concat(backingArray[i].toString());
        }
        
    }
}
