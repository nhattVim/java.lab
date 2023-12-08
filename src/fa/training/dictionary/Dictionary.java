package fa.training.dictionary;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.util.Hashtable;
import java.util.StringTokenizer;

/**
 * Dictionary
 */
public class Dictionary {

    private Hashtable dictionary;
    public Dictionary(String nameOfFile){
        dictionary = new Hashtable();
        try{
            FileInputStream fis = new FileInputStream(nameOfFile);
            DataInputStream dis = new DataInputStream(fis);
            while (dis.available() > 0) {
                String s = dis.readLine();
                StringTokenizer st = new StringTokenizer(s,";");
                String word = st.nextToken();
                String type = st.nextToken();
                String meaning = st.nextToken();
                String example = st.nextToken();
                Meaning m = new Meaning(meaning, type, example);
                dictionary.put(word, m);
            }
            dis.close();
        } catch (Exception e){}
    }
}
