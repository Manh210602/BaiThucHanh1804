package shapes;
import java.util.Scanner;
public class HinhTron extends shapes.HinhHoc {
    public float BanKinh;
    public HinhTron(){
        ten = "Hình Tròn";
    }
    public void NhapBanKinh(){
        System.out.println( "Bán Kính = ");
        Scanner scanner = new Scanner(System.in);
        BanKinh = scanner.nextFloat();
    }
    public void TinhChuVi(){
        ChuVi = 2 * PI * BanKinh;
    }
    public void TinhDienTich(){
        DienTich = PI * BanKinh * BanKinh;
    }
}
