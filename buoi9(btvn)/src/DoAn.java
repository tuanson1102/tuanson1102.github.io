import java.util.Scanner;

public class DoAn extends Sach implements IKho{
    int trang;
    String tinhTrang;
    int namBaoVe;

    public DoAn(long id, String name, String author, int since, int trang, String tinhTrang, int namBaoVe) {
        super(id, name, author, since);
        this.trang = trang;
        this.tinhTrang = tinhTrang;
        this.namBaoVe = namBaoVe;
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

    public int getNamBaoVe() {
        return namBaoVe;
    }

    public void setNamBaoVe(int namBaoVe) {
        this.namBaoVe = namBaoVe;
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
        System.out.println("Nhập năm bảo vệ: ");
        namBaoVe = sc.nextInt();
    }



    @Override
    public void viTri() {
        // TODO Auto-generated method stub
        System.out.println("Vị trí: ");
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "-" + trang + "-" + tinhTrang + "-" + namBaoVe ;
    }
    
    
}
