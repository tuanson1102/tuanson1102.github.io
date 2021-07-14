import java.util.Scanner;

public class SachGiaoKhoa extends Sach implements IMuon,IKho{

    int trang;
    String tinhTrang;
    int soLuong;
    int soLuongMuon;
    int c;

    public SachGiaoKhoa(long id, String name, String author, int since, int trang, String tinhTrang, int soLuong,
            int soLuongMuon) {
        super(id, name, author, since);
        this.trang = trang;
        this.tinhTrang = tinhTrang;
        this.soLuong = soLuong;
        this.soLuongMuon = soLuongMuon;
    }

    

    public int getTrang() {
        return trang;
    }

    public void setTrang(int trang) {
        this.trang = trang;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getSoLuongMuon() {
        return soLuongMuon;
    }

    public void setSoLuongMuon(int soLuongMuon) {
        this.soLuongMuon = soLuongMuon;
    }

    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số trang: ");
        trang = sc.nextInt();
        System.out.println("Nhập tình trạng: ");
        tinhTrang = sc.nextLine();
        System.out.println("Tổng số lượng: ");
        soLuong = sc.nextInt();
        System.out.println("Số lượng mượn: ");
        soLuongMuon = sc.nextInt();
    }

    @Override
    public int tonKho() {
        // TODO Auto-generated method stub
        c = soLuong - soLuongMuon;
        return c;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString()+ "-" + trang +"-"+ tinhTrang + "-" + soLuong + "-" + soLuongMuon + "-" + tonKho();
    }



    @Override
    public void viTri() {
        // TODO Auto-generated method stub
        
    }
    
    
}
