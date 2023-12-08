package fa.training.stringdemo;

/**
 * StringImmutableExample
 */
public class StringImmutableExample {

    public void demonstrateStringImmutableExample() {
        System.out.println("------demonstrate String is Immutable------");
        String s1 = "Java";
        String s2 = s1;
        System.out.println(s1 == s2);
        s1 = "Python";
        System.out.println(s1 == s2);
        System.out.println(s2);
    }   
}
