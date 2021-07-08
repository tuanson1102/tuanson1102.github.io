import java.util.Scanner;

public class KiemChungVien extends NhanVien {
    int lamThem;
    int luongKtv;
    public KiemChungVien(){
    }

    public KiemChungVien(int id, String hoTen, int sDT, String email, int luongCoBan, int lamThem) {
        super(id, hoTen, sDT, email, luongCoBan);
        this.lamThem = lamThem;
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
        System.out.println("Nhập vào số lỗi: ");
        lamThem = sc.nextInt();

    }
    public void luongKtv(){
         
        luongKtv =  luongCoBan + (lamThem * 50000);

    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + luongKtv;
    }


    
    
}
