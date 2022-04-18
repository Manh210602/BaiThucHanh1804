package shapes;
import java.util.Scanner;
public class HinhTru extends shapes.HinhTron {
    public float ChieuCao;
    public HinhTru(){
        ten = "Hình Trụ";
    }
    public void NhapChieuCao(){
        NhapBanKinh();
        System.out.println("Chiều Cao = ");
        Scanner scanner = new Scanner(System.in);
        ChieuCao = scanner.nextFloat();
    }
    public void TinhTheTich(){
        TinhDienTich();
        TheTich = DienTich * ChieuCao;
    }
}