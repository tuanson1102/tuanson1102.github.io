import java.util.Scanner;

public class LapTrinhVien extends NhanVien {
    //int luongLtv;
    int lamThem;
    int a = 200000;
    public LapTrinhVien(int id, String hoTen, int sDT, String email, int luongCoBan, int lamThem) {
        super(id, hoTen, sDT, email, luongCoBan);
        this.lamThem = lamThem;
    }
    public LapTrinhVien() {
    }
    public int getLamThem() {
        return lamThem;
    }
    public void setLamThem(int lamThem) {
        this.lamThem = lamThem;
    }
    @Override
    public void input() {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.println("Nhập vào số giờ làm thêm: ");
        lamThem = sc.nextInt();

    }
    public int luongLtv(){
         
        int luongLtv = luongCoBan + (lamThem * 200000);
        return luongLtv;

    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + luongLtv();
    }
    

    
}
