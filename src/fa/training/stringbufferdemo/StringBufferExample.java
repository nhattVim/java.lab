package fa.training.stringbufferdemo;

/**
 * StringBufferExample
 */
public class StringBufferExample {

    public void demonstrateStringBuffer() {
        System.out.println("------demonstrateStringBuffer------");
        StringBuffer buffer = new StringBuffer();
        
        buffer.append("Hello, world!");
        System.out.println(buffer);

        buffer.delete(5, 11);
        System.out.println(buffer);

        buffer.deleteCharAt(5);
        System.out.println(buffer);

        buffer.insert(0, "World ");
        System.out.println(buffer);
        
        System.out.println("Index of Hello: " + buffer.indexOf("Hello"));
        System.out.println();

        StringBuffer newBuffer = new StringBuffer("This is a Hello world string. Hello!");
        System.out.println("Index of Hello: " + newBuffer.indexOf("Hello"));
        System.out.println("Last index of Hello: " + newBuffer.lastIndexOf("Hello"));

        newBuffer.replace(0, 4, "That here");
        System.out.println(newBuffer);

        newBuffer.setCharAt(newBuffer.length() - 1, '?');
        System.out.println(newBuffer);

        newBuffer.reverse();
        System.out.println(newBuffer);

        comparePerformance();
    }

    public static void comparePerformance() {
        long startTime;
        String str = "";
        StringBuffer buffer = new StringBuffer();

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str += "extra";
        }
        System.out.println("Time using string: " + (System.currentTimeMillis() - startTime) + " ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            buffer.append("extra");
        }
        System.out.println("Time using StringBuffer: " + (System.currentTimeMillis() - startTime) + " ms");
    }
}
