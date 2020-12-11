/*
Addison Hoff
12/11/20
This is a driver to test ArrayDictionary.java
 */

import java.util.Dictionary;
public class ArrayDictionaryTester {
    public static void main(String[] args) {
        ArrayDictionary testDict = new ArrayDictionary();


        System.out.println("Dictionary is empty? Expected: true");
        System.out.println(testDict.isEmpty());

        testDict.put("key", "value");

        System.out.println("Dictionary is empty? Expected: false");
        System.out.println(testDict.isEmpty());

        System.out.println("Dictionary size? Expected: 1");
        System.out.println(testDict.size());

        System.out.println("Array contains value for key? Expected: true");
        System.out.println(testDict.contains("key"));

        System.out.println("Get value using key. Expected: value");
        System.out.println(testDict.get("key"));

        System.out.println("Remove and output value using key. Expected: value");
        System.out.println(testDict.remove("key"));

        testDict.put("1", "a");
        testDict.put("2", "b");
        testDict.put("3", "c");
        testDict.put("4", "d");
        testDict.put("5", "e");

        System.out.println("Return collection of keys. Expected 1, 2, 3, 4, 5");
        System.out.println(testDict.Keys());

        System.out.println("Return collection of values. Expected a, b, c, d, e");
        System.out.println(testDict.Values());






    }
}
