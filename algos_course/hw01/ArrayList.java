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
     * <p>
     * Recall that Java does not allow for regular generic array creation,
     * so instead we cast an Object[] to a T[] to get the generic typing.
     */
    public ArrayList() {
        //DO NOT MODIFY THIS METHOD!
        backingArray = (T[]) new Object[INITIAL_CAPACITY];
    }

    /**
     * Adds the data to the front of the list.
     * <p>
     * This add may require elements to be shifted.
     * <p>
     * Method should run in O(n) time.
     *
     * @param data the data to add to the front of the list
     * @throws java.lang.IllegalArgumentException if data is null
     */
    public void addToFront(T data) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
            if (data == null) {
                throw new IllegalArgumentException("Null Data");
            } else {
                if (this.size == 0) {
                    backingArray[0] = data;
                } else if (this.size == backingArray.length) {
                    T[] tempArr = backingArray;
                    backingArray = (T[]) new Object[2 * tempArr.length];
                    for (int i = tempArr.length; i > 0; i--) {
                        backingArray[i] = tempArr[i - 1];
                    }
                    backingArray[0] = data;
                } else {
                    for (int i = this.size; i > 0; i--) {
                        backingArray[i] = backingArray[i - 1];
                    }
                    backingArray[0] = data;
                }
                this.size++;
            }
    }


    /**
     * Adds the data to the back of the list.
     * <p>
     * Method should run in amortized O(1) time.
     *
     * @param data the data to add to the back of the list
     * @throws java.lang.IllegalArgumentException if data is null
     */
    public void addToBack(T data) {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
            if (data == null) {
                throw new IllegalArgumentException("Null Data");
            } else {
                if (this.size == 0) {
                    backingArray[0] = data;
                } else if (this.size == backingArray.length) {
                    T[] tempArr = backingArray;
                    backingArray = (T[]) new Object[2 * tempArr.length];
                    for (int i = 0; i < tempArr.length; i++) {
                        backingArray[i] = tempArr[i];
                    }
                    backingArray[tempArr.length] = data;
                } else {
                    backingArray[this.size] = data;
                }
                this.size++;
            }
    }

    /**
     * Removes and returns the first data of the list.
     * <p>
     * Do not shrink the backing array.
     * <p>
     * This remove may require elements to be shifted.
     * <p>
     * Method should run in O(n) time.
     *
     * @return the data formerly located at the front of the list
     * @throws java.util.NoSuchElementException if the list is empty
     */
    public T removeFromFront() {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        T remData = backingArray[0];

            if (this.size == 0) {
                throw new NoSuchElementException("No elements in ArrayList");
            } else {
                for (int i = 0; i < this.size - 1; i++) {
                    backingArray[i] = backingArray[i + 1];
                }
                backingArray[this.size - 1] = null;
            }
        size--;
        return remData;
    }


    /**
     * Removes and returns the last data of the list.
     * <p>
     * Do not shrink the backing array.
     * <p>
     * Method should run in O(1) time.
     *
     * @return the data formerly located at the back of the list
     * @throws java.util.NoSuchElementException if the list is empty
     */
    public T removeFromBack() {
        // WRITE YOUR CODE HERE (DO NOT MODIFY METHOD HEADER)!
        T remData = backingArray[this.size - 1];

            if (backingArray[0] == null) {
                throw new NoSuchElementException("No elements in ArrayList");
            } else {
                backingArray[this.size - 1] = null;
            }

        size--;
        return remData;
    }

    /**
     * Returns the backing array of the list.
     * <p>
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
     * <p>
     * For grading purposes only. You shouldn't need to use this method since
     * you have direct access to the variable.
     *
     * @return the size of the list
     */
    public int size() {
        // DO NOT MODIFY THIS METHOD!
        return size;
    }
}