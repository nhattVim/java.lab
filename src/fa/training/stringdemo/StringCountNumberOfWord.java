package fa.training.stringdemo;

/**
 * StringCountNumberOfWord
 */
public class StringCountNumberOfWord {

    private void countNumberOfWords(String s){
        String trimmedLine = s.trim();
        int cout = trimmedLine.isEmpty() ? 0 : trimmedLine.split("\\s+").length;

        System.out.println(cout);
    }

    public void demonstrateCountWords() {
        System.out.println("------count num of words------");
        
        countNumberOfWords("My name is nhattruongNeoVim");
        countNumberOfWords("I hate Java Programming");
        countNumberOfWords("This is not properly formatted date");
    }

}
