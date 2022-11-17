import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuanLySanPham {
    public static void inputDanhSach() {
        System.out.print("Xin mời nhập số lượng sản phẩm muốn thêm ");
        int soSanPham = new Scanner(System.in).nextInt();
        for (int i = 0; i < soSanPham; i++) {
            SanPham sanPham = new SanPham();
            sanPham.nhapThongTin();
            luuDanhSach(sanPham);
        }
    }
    public static void luuDanhSach(SanPham sanPham) {
        Main.sanPhamList.add(sanPham);
    }

    public static void xemSanPham() {
        for (SanPham sanPham : Main.sanPhamList) {
            System.out.println(sanPham.toString());

        }
    }

    //    public void inSanPham() {
//        for (SanPham sanPham : Main.sanPhamList) {
//            System.out.println(sanPham);
//
//        }
//    }
    public static void timSanPhamtheoTen() {
        String ten = new Scanner(System.in).nextLine();
        for (SanPham sanPham : Main.sanPhamList) {
            if (sanPham.getTenSanPham().indexOf(ten) >= 0) {
                System.out.println(sanPham);

            } else {
                System.out.println("San phẩm này ko tồn tại trong  hệ thống vui lòng nhập lại");
            }

        }
    }

    public static void timSanPhamTheoId() {
        int id = new Scanner(System.in).nextInt();

        for (SanPham sanPham : Main.sanPhamList) {
            if (sanPham.getId() == id) {
                System.out.println(sanPham);

            } else {
                System.out.println("mã id này ko tồn tại trong hệ thống ");
            }

        }
    }


    public static boolean xoaSanPham() {

        return Main.sanPhamList.remove(Main.sanPhamList);

    }

    public static void kiemTraSoLuongSanPham() {
        System.out.println(Main.sanPhamList.size());

        }

    public static void timSanPham() {
        for (SanPham sanPham : Main.sanPhamList) {
            if(sanPham.getSoLuong()>5) {
                System.out.println(sanPham);
            }else{
                System.out.println("ko có sản phẩm nào có số lượng dưới 5");
            }
        }
    }
    public static void timSanPhamTheoMucGia1(){
        for(SanPham sanPham : Main.sanPhamList){
            if(sanPham.getGiaBan()<50) {
                System.out.println(sanPham);

            }else{
                System.out.println("ko có sản phẩm nào có mức giá dưới 50");
            }
        }

    }

    public static void timSanPhamTheoMucGia2(){
        for(SanPham sanPham : Main.sanPhamList){
            if(sanPham.getGiaBan()>50 && sanPham.getGiaBan()<100) {
                System.out.println(sanPham);

            }else{
                System.out.println("ko có san phẩm nào có mức giá từ 50 đến 100");
            }
        }

    }
    public static void timSanPhamTheoMucGia3(){
        for(SanPham sanPham : Main.sanPhamList){
            if(sanPham.getGiaBan()>100) {
                System.out.println(sanPham);

            }else{
                System.out.println("ko có san pham nao có muc gia tren 100");
            }
        }

    }



}
