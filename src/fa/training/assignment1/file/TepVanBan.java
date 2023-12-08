package fa.training.assignment1.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * TepVanBan
 */
public class TepVanBan {

    public static void taoTep(){
        try {
            FileOutputStream f = new FileOutputStream("songuyen.txt");
            PrintWriter pw = new PrintWriter(f);
            for (int i = 1; i <= 100; i++) {
                int k = (int)(Math.random()*1000);
                pw.print(k+ " ");
                if (i % 10 == 0) {
                    pw.println();
                }
            }
            pw.close();
        } catch (Exception e) {}
    }

    public static void docTep(){
        try {
            FileInputStream fin = new FileInputStream("songuyen.txt");
            FileOutputStream fout = new FileOutputStream("sochan.txt");
            PrintWriter pw = new PrintWriter(fout);
            Scanner sc = new Scanner(fin);
            int d = 1;
            for (int i = 1; i <= 100; i++) {
                int k = sc.nextInt();
                if (k % 2 == 0) {
                    pw.print(k+ " ");
                    d++;
                }
                if (d % 10 == 0){
                    pw.println();
                    d = 1;
                }
            }
            pw.close(); fin.close(); sc.close();
        } catch (Exception e) {}
    }

    public static void main(String[] args) {
        taoTep();
        docTep();
    }
}
