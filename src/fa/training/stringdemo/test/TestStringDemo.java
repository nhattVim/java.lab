package fa.training.stringdemo.test;

import fa.training.stringdemo.StringCountNumberOfWord;
import fa.training.stringdemo.StringImmutableExample;
import fa.training.stringdemo.StringMethodExample;

/**
 * TestStringDemo
 */
public class TestStringDemo {

    public static void main(String[] args) {
        StringImmutableExample stringImmutableExample = new StringImmutableExample();
        StringMethodExample stringMethod = new StringMethodExample();
        StringCountNumberOfWord countWord = new StringCountNumberOfWord();

        stringImmutableExample.demonstrateStringImmutableExample();
        stringMethod.demostrateStringMethod();
        countWord.demonstrateCountWords();
    }
}
