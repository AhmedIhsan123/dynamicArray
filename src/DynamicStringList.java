public class DynamicStringList implements StringList {

    // Instance fields
    private String[] stringList;
    private int size;

    // constructor
    public DynamicStringList() {
        stringList = new String[20];
        size = 0;
    }

    @Override
    public String get(int index) {
        // first we need to validate the given index
        if ((index >= size || index < 0)) {
            // if the index is out of bounds we throw an exception
            throw new IndexOutOfBoundsException();
        }

        // if all checks are valid we return the value at the given index
        return stringList[index];
    }

    @Override
    public void set(int index, String value) {
        // Validate the given index
        if ((index > size || index < 0)) {
            throw new IndexOutOfBoundsException();
        } else if (value.equals(null)) {
            throw new IllegalArgumentException("Please input a valid string.");
        }
        ;

        // All checks are valid, set the index to the given value;
        stringList[index] = value;
    }

    @Override
    public void add(String value) {
        // Check if we have enough space for a new element
        if (size == stringList.length) {
            // Create a new array double the size of the original
            String[] tempArr = new String[stringList.length * 2];

            // Iterate through all elements currently in the string array
            for (int i = 0; i < size; i++) {
                // Set indexes of temp array
                tempArr[i] = stringList[i];
            }

            // Set new adress for class list
            stringList = tempArr;


        }

        // we add a element if there is a space
        stringList[size] = value;
        size++;
    }

    @Override
    public String remove(int index) {
        // first we should validate the index
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        // save the value that should be removed
        String removedValue = stringList[index];

        // shift all elements/fill in the gaps
        for (int i = index; i < size - 1; i++) {
            stringList[i] = stringList[i + 1];
        }

        // clear the last element and also decrease the size
        stringList[size - 1] = null;
        size--;

        // return the removed value
        return removedValue;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int capacity() {
        return stringList.length;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < stringList.length; i++) {
            if (stringList[i] != null) {
                str.append(stringList[i] + ", ");
            }
        }

        return str.toString();
    }

}
