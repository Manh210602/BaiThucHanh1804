package shapes;
import java.util.Scanner;
public class HinhChuNhat extends HinhHoc {
    public float Dai;
    public float Rong;
    public HinhChuNhat() {
        ten = "Hình Chữ Nhật";
    }
    public void  NhapChieuDai() {
        System.out.println("Chiều Dài = ");
        Scanner scanner = new Scanner(System.in);
        Dai = scanner.nextFloat();
    }
    public void NhapChieuRong(){
        System.out.println("Chiều Rộng =");
        Scanner scanner = new Scanner(System.in);
        Rong = scanner.nextFloat();
    }
    public void TinhChuVi(){
        ChuVi = 2 * (Dai + Rong);
    }
    public void TinhDienTich(){
        DienTich = Dai * Rong;
    }
}