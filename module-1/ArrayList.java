import java.util.NoSuchElementException;

/**
 * Your implementation of an ArrayList.
 */
public class ArrayList<T> {

    /*
     * The initial capacity of the ArrayList.
     *
     * DO NOT MODIFY THIS VARIABLE!
     */
    public static final int INITIAL_CAPACITY = 9;

    /*
     * Do not add new instance variables or modify existing ones.
     */
    private T[] backingArray;
    private int size;

    /**
     * This is the constructor that constructs a new ArrayList.
     * 
     * Recall that Java does not allow for regular generic array creation,
     * so instead we cast an Object[] to a T[] to get the generic typing.
     */
    public ArrayList() {
        //DO NOT MODIFY THIS METHOD!
        backingArray = (T[]) new Object[INITIAL_CAPACITY];
    }

    /**
     * Adds the data to the front of the list.
     *
     * This add may require elements to be shifted.
     *
     * Method should run in O(n) time.
     *
     * @param data the data to add to the front of the list
     * @throws java.lang.IllegalArgumentException if data is null
     */
    public void addToFront(T data) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if (data == null) {
            throw new IllegalArgumentException("Error: cannot add null data.");
        }
        if (checkIfFull() == true) {
            resize(size);
        }
        T[] addedToArray = (T[]) new Object[backingArray.length];
        addedToArray[0] = data;
        for (int i = 0; i < size; i ++) {
            addedToArray[i + 1] = backingArray[i];
        }
        backingArray = addedToArray;
        size++;
    }

    /**
     * Adds the data to the back of the list.
     *
     * Method should run in amortized O(1) time.
     *
     * @param data the data to add to the back of the list
     * @throws java.lang.IllegalArgumentException if data is null
     */
    public void addToBack(T data) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if (data == null) {
            throw new IllegalArgumentException("Error: cannot add null data.");
        }
        if (checkIfFull() == true) {
            resize(size);
        }
        backingArray[size] = data;
        size++;
    }

    /**
     * Removes and returns the first data of the list.
     *
     * Do not shrink the backing array.
     *
     * This remove may require elements to be shifted.
     *
     * Method should run in O(n) time.
     *
     * @return the data formerly located at the front of the list
     * @throws java.util.NoSuchElementException if the list is empty
     */
    public T removeFromFront() {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if (size == 0) {
            throw new NoSuchElementException("The ListArray is empty.");
        }
        T res = backingArray[0];
        T[] newRemovedArray = (T[]) new Object[backingArray.length];
        for (int i = 1; i < size; i++) {
            newRemovedArray[i-1] = backingArray[i];
        }
        size--;
        backingArray = newRemovedArray;
        return res;
    }

    /**
     * Removes and returns the last data of the list.
     *
     * Do not shrink the backing array.
     *
     * Method should run in O(1) time.
     *
     * @return the data formerly located at the back of the list
     * @throws java.util.NoSuchElementException if the list is empty
     */
    public T removeFromBack() {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        if (size == 0) {
            throw new NoSuchElementException("The ListArray is empty.");
        }
        T res = backingArray[size-1];
        backingArray[size-1] = null;
        size--;
        return res;
    }

    /**
     * Returns the backing array of the list.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the backing array of the list
     */
    public T[] getBackingArray() {
        // DO NOT MODIFY THIS METHOD!
        return backingArray;
    }

    /**
     * Returns the size of the list.
     *
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the size of the list
     */
    public int size() {
        // DO NOT MODIFY THIS METHOD!
        return size;
    }

    /** 
     * I ADDED ALL OF THE METHODS BELOW THIS -- WILL IT MAKE ME FAIL THE ASSIGNMENT AUTO-GRADER??
     * 
     * Resizes the backingArray by assigning it to a new array of size (2 * prevcap).
     * 
     */
    private void resize(int prevlen) {
        T[] newBackingArray = (T[]) new Object[prevlen * 2];
        for (int i = 0; i < prevlen; i++) {
            newBackingArray[i] = backingArray[i];
        }
        this.backingArray = newBackingArray;
    }

    /** 
     * Ensures size != capacity of backing array
     */
    private boolean checkIfFull() {
        if (this.size == backingArray.length) {
            return true;
        } else {
            return false;
        }
    }
}
