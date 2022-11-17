import java.util.Scanner;

public class SanPham {
    private int id;
    private String tenSanPham;
    private String moTa;
    private int soLuong;
private double giaBan;
private  String donViTinh;


    public SanPham(int id, String tenSanPham, String moTa, int soLuong, double giaBan, String donViTinh) {
        this.id = id;
        this.tenSanPham = tenSanPham;
        this.moTa = moTa;
        this.soLuong = soLuong;
        this.giaBan = giaBan;
        this.donViTinh = donViTinh;
    }

    public SanPham() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public String getDonViTinh() {
        return donViTinh;
    }

    public void setDonViTinh(String donViTinh) {
        this.donViTinh = donViTinh;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "id=" + id +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", moTa='" + moTa + '\'' +
                ", soLuong=" + soLuong +
                ", giaBan=" + giaBan +
                ", donViTinh=" + donViTinh +
                '}';
    }
    public void nhapThongTin(){
        System.out.println("nhập id");
        this.id = new Scanner(System.in).nextInt();
        System.out.println("nhập tên sản phẩm");
        this.tenSanPham = new Scanner(System.in).nextLine();
        System.out.println("nhập mô tả");
        this.moTa = new Scanner(System.in).nextLine();
        System.out.println("nhập so luong");
        this.soLuong = new Scanner(System.in).nextInt();
        System.out.println("nhập giá bán");
        this.giaBan = new Scanner(System.in).nextDouble();
        System.out.println("nhập đơn vị tính");
        this.donViTinh = new Scanner(System.in).nextLine();

    }

}
