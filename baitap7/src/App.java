import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng nhân viên lập trình: ");
        int number = sc.nextInt();

        ArrayList<LapTrinhVien> listLapTrinh = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            LapTrinhVien lapTrinhVien = new LapTrinhVien();
            lapTrinhVien.input();
            listLapTrinh.add(lapTrinhVien);
        }

        System.out.println("Danh sách nhân viên: ");
        for (LapTrinhVien lapTrinhVien : listLapTrinh) {
            System.out.println(lapTrinhVien);
        }


        //Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng nhân viên kiểm chứng: ");
        int number2 = sc.nextInt();

        ArrayList<KiemChungVien> listKiemChung = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            KiemChungVien kiemChungVien = new KiemChungVien();
            kiemChungVien.input();
            listKiemChung.add(kiemChungVien);
        }

        System.out.println("Danh sách nhân viên: ");
        for (KiemChungVien kiemChungVien : listKiemChung) {
            System.out.println(kiemChungVien);
        }
    }
}
