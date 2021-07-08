import java.util.Scanner;

public class NhanVien {
    int id;
    String hoTen;
    int SDT;
    String email;
    int luongCoBan;
    public NhanVien(){
    }
    public NhanVien(int id, String hoTen, int sDT, String email, int luongCoBan) {
        this.id = id;
        this.hoTen = hoTen;
        this.SDT = sDT;
        this.email = email;
        this.luongCoBan = luongCoBan;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public int getSDT() {
        return SDT;
    }
    public void setSDT(int sDT) {
        SDT = sDT;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public int getLuongCoBan() {
        return luongCoBan;
    }
    public void setLuongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã nhân viên: ");
        id = Integer.valueOf(sc.nextLine());
        System.out.println("Nhập họ tên nhân viên: ");
        hoTen = sc.nextLine();
        System.out.println("Nhập số điện thoại: ");
        SDT = Integer.valueOf(sc.nextLine());
        System.out.println("Nhập email: ");
        email = sc.nextLine();
        System.out.println("Nhập lương cơ bản: ");
        luongCoBan = sc.nextInt();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return id + "-" + hoTen + "-" + SDT + "-" + email + "-" + luongCoBan;
    }
    

}
