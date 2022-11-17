import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<SanPham> sanPhamList = new ArrayList<>();
    
    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        boolean isExit = false;
        do {
            int luaChon = luaChon();
            switch (luaChon) {
                case 1:
 QuanLySanPham.inputDanhSach();
 QuanLySanPham.xemSanPham();
                    break;
                case 2:
QuanLySanPham.timSanPhamtheoTen();
                    break;
                case 3:
QuanLySanPham.timSanPhamTheoId();
showSortMenu();
                    break;
                case 4:
QuanLySanPham.timSanPham();
                    break;
                case 5:
showSortMenu2();
                    break;
                case 6:
//                    System.exit(0);
                    isExit = true;
            }
        } while (!isExit);
    }
    private static void showSortMenu() {
        System.out.println("Tìm sản phẩm theo id: ");
        System.out.println("1.Xóa sản phẩm");
        System.out.println("2. Cập nhật số lượng sản phẩm");
        System.out.println("3. Thoát ra ngoài menu chính");
        System.out.print("Chọn: ");
        int choose = 0;
        do {
            choose = new Scanner(System.in).nextInt();
            if (choose >= 1 && choose <= 3) {
                break;
            }
            System.out.print("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
        } while (true);
        switch (choose) {
            case 1:
                QuanLySanPham.xoaSanPham();
                break;
            case 2:
               QuanLySanPham.kiemTraSoLuongSanPham();
                break;
            case 3:
                return;
        }
    }
    private static void showSortMenu2() {
        System.out.println("Tìm sản phẩm theo mức giá: ");
        System.out.println("1. Dưới 50.000");
        System.out.println("2.  Tu 50.000 den 100.000");
        System.out.println("3. tu 100 tro len");
        System.out.println("4. Thoát ra ngoài menu chính");
        System.out.print("Chọn: ");
        int choose = 0;
        do {
            choose = new Scanner(System.in).nextInt();
            if (choose >= 1 && choose <= 4) {
                break;
            }
            System.out.print("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
        } while (true);
        switch (choose) {
            case 1:
                QuanLySanPham.timSanPhamTheoMucGia1();
                break;
            case 2:
                QuanLySanPham.timSanPhamTheoMucGia2();
                break;
            case 3:
                QuanLySanPham.timSanPhamTheoMucGia3();
break;
            case 4:
                return;
        }
    }

    private static int luaChon() {
        showMenu();
        System.out.print("Xin mời chọn chức năng: ");
        int choice = 0;
        do {
            choice = new Scanner(System.in).nextInt();
            if (choice >= 1 && choice <= 6) {
                break;
            }
            System.out.print("Lựa chọn không hợp lệ, vui lòng chọn lại: ");
        } while (true);
        return choice;
    }

    private static void showMenu() {
        System.out.println("\n\n\n----------QUẢN LÍ SẢN PHẨM CỦA MỘT CỬA HÀNG------------");
        System.out.println("1. Xem danh sách sản phẩm.");
        System.out.println("2. Tìm san phẩm theo tên.");
        System.out.println("3. Tìm sản phẩm theo id");
        System.out.println("4. Tìm các sản phẩn có số lượng dưới 5.");
        System.out.println("5. Tìm sản phẩm theo mức giá");
        System.out.println("6. Thoát chương trình.");
    }
}
