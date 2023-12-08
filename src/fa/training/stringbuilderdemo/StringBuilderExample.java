package fa.training.stringbuilderdemo;

/**
 * StringBuilderExample
 */
public class StringBuilderExample {

    public void demonstrateStringBuilder(){
        System.out.println("------demonstrateStringBuilder------");
        StringBuilder sb1 = new StringBuilder("nhattruongNeoVim");
        sb1.delete(4, 8);
        System.out.println("Delete method demo: " + sb1);
        StringBuilder sb2 = new StringBuilder("Hello Java word");
        sb2.insert(6, "abc ");
        System.out.println("Insert Operation Demo: " + sb2);
        StringBuilder sb3 = new StringBuilder("fsoft.fpt.com");
        sb3.replace(1, 4, "Amit");
        System.out.println("replace Operation Demo: " + sb3);
        StringBuilder sb4 = new StringBuilder("ADCBDE");
        System.out.println("Reverse of ABCDE: " + sb4.reverse());
        StringBuilder sb5 = new StringBuilder("ADCBDEF");
        sb5.setCharAt(3, 'x');
        System.out.println("Replacing char at index 3: " + sb5);
    }
}
