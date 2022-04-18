package Main;
import shapes.HinhChuNhat;
import shapes.HinhTron;
import shapes.HinhTru;
import shapes.HinhVuong;

public class App54 {
    public static void main(String[] args) {
        HinhTron hinhTron = new HinhTron();
        hinhTron.xuatTen();
        hinhTron.NhapBanKinh();
        hinhTron.TinhChuVi();
        hinhTron.TinhDienTich();
        hinhTron.inChuVi();
        hinhTron.inDienTich();

        HinhTru HinhTru = new HinhTru();
        HinhTru.xuatTen();
        HinhTru.NhapChieuCao();
        HinhTru.TinhTheTich();
        HinhTru.inTheTich();

        HinhChuNhat hinhChuNhat = new HinhChuNhat();
        hinhChuNhat.xuatTen();
        hinhChuNhat.NhapChieuDai();
        hinhChuNhat.NhapChieuRong();
        hinhChuNhat.TinhChuVi();
        hinhChuNhat.TinhDienTich();
        hinhChuNhat.inChuVi();
        hinhChuNhat.inDienTich();

        HinhVuong hinhVuong = new HinhVuong();
        hinhVuong.xuatTen();
        hinhVuong.NhapCanh();
        hinhVuong.TinhChuVi();
        hinhVuong.TinhDienTich();
        hinhVuong.inChuVi();
        hinhVuong.inDienTich();
    }
}
