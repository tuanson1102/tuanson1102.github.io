import java.util.Scanner;

public class TaiLieuDienTu extends Sach implements IDownload {
    byte dungLuongTai;
    int luotTai;
    float giaThanh;
    float sum;
    float a;
    
    public TaiLieuDienTu(long id, String name, String author, int since, byte dungLuongTai, int luotTai,
            float giaThanh) {
        super(id, name, author, since);
        this.dungLuongTai = dungLuongTai;
        this.luotTai = luotTai;
        this.giaThanh = giaThanh;
    }
    
    public byte getDungLuongTai() {
        return dungLuongTai;
    }

    public void setDungLuongTai(byte dungLuongTai) {
        this.dungLuongTai = dungLuongTai;
    }

    public int getLuotTai() {
        return luotTai;
    }

    public void setLuotTai(int luotTai) {
        this.luotTai = luotTai;
    }

    public float getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(float giaThanh) {
        this.giaThanh = giaThanh;
    }
    @Override
    public void input() {
        // TODO Auto-generated method stub
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.println("Dung lượng tải: ");
        dungLuongTai = sc.nextByte();
        System.out.println("Lượt tải: ");
        luotTai = sc.nextInt();
        System.out.println("Gía thành: ");
        giaThanh = sc.nextFloat();
    }
    @Override
    public float tongTien() {
        // TODO Auto-generated method stub
        a = luotTai * giaThanh;
        return a;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "-" + dungLuongTai + "-" + luotTai + "-" + giaThanh + "-" + tongTien();
    }
    
}
