package fa.training.assignment1.file;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.FileReader;

/**
 * SinhVien
 */
public class SinhVien {

    private String hoTen;
    private int namSinh;
    private double dtb;

    public SinhVien() {}

    public SinhVien(String hoTen, int namSinh, double dtb) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.dtb = dtb;
    }

    public void hienThi(){
        System.out.println("Ho va ten: " + hoTen);
        System.out.println("Nam sinh: " + namSinh);
        System.out.println("Diem trung binh: " + dtb);
    }

    public String toString(){
        return hoTen + "-" + namSinh + "-" + dtb;
    }

    public void ghiTep(String tenTep) {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter(tenTep));
            pw.println(this);
            pw.close();
        } catch (Exception e) {}
    }

    public void docTep(String tenTep) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(tenTep));
            String s = br.readLine();
            if (s != null) {
                String[] tokens = s.split("-");
                hoTen = tokens[0];
                namSinh = Integer.parseInt(tokens[1]); 
                dtb = Double.parseDouble(tokens[2]);
            }
            br.close();
        } catch (Exception e) {}
    }
}
