package shapes;
import java.util.Scanner;
public class HinhVuong extends shapes.HinhChuNhat {
    public float Canh;
    public HinhVuong(){
        ten = "Hình Vuông = ";
    }
    public void NhapCanh(){
        System.out.println("Cạnh = ");
        Scanner scanner = new Scanner(System.in);
        Canh = scanner.nextFloat();
    }
    public void TinhChuVi(){
        ChuVi = 4 * Canh;
    }
    public void TinhDienTich(){
        DienTich = Canh * Canh;
    }
}
