public class DynamicStringList implements StringList {

    // Instance fields
    private String[] stringList;
    private int size;

    //constructor
    public DynamicStringList() {
        stringList = new String[20];
        size = 0;
    }

    @Override
    public String get(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public void set(int index, String value) {
        // Validate the given index
        if ((index > size || index < 0)) {
            throw new IndexOutOfBoundsException();
        } else if (value.equals(null)) {
            throw new IllegalArgumentException("Please input a valid string.");
        };

        // All checks are valid, set the index to the given value;
        stringList[index] = value;
    }

    @Override
    public void add(String value) {
        // Check if we have enough space for a new element
        if(size == stringList.length) {
            // Create a new array double the size of the original
            String[] tempArr = new String[stringList.length * 2];
            
            // Iterate through all elements currently in the string array
            for (int i = 0; i < stringList.length; i++) {
                // Set indexes of temp array
                tempArr[i] = stringList[i];
            }

            // Set new adress for class list
            stringList = tempArr;
        } else {
            // we add a element if there is a space
            stringList[size] = value;
            size++;
        }
        
    }

    @Override
    public String remove(int index) {
        // Validate given index
        if ((index > size || index < 0)) {
            throw new IndexOutOfBoundsException();
        }

        stringList[index] = null;

        for(int i = index; i < size - 1; i++) {
            String temp = stringList[i + 1];
            stringList[i + 1] = stringList[index];
            stringList[index] = temp;
        }

        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int capacity() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'capacity'");
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
