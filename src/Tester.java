
public class Tester {
    public static void main(String[] args) {
        DynamicStringList testArr = new DynamicStringList();
        testArr.add("Hey John");
        testArr.add("Hey There");
        testArr.add("Hey pookie");
        // testArr.set(0, "I'm a new pookie!");
        testArr.remove(0);

        System.out.println(testArr);
    }    
}
