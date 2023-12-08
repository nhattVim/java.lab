package fa.training.assignment1.file;

/**
 * DSSV
 */
public class DSSV extends SinhVien{

    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien("Le Nhat Truong", 2004, 10);
        sv1.ghiTep("sv.txt");
        SinhVien sv2 = new SinhVien();
        sv2.docTep("sv.txt");
        sv2.hienThi();
    }
}
