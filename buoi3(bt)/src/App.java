import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // bài 1
        System.out.println("Nhập chuỗi:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char e = 'e';
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == e) {
                count++;

            }
        }
        System.out.println("Số lần chữ e xuất hiện trong chuỗi là:" + count);
        String s1;
        int index1 = s.indexOf("e");
        System.out.println("vị trí xuất hiện chữ e là: " + index1);






        // bài 2
        char kyTu;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào chuỗi bất kỳ: ");
        String chuoi = scanner.nextLine();

        for (int i = 0; i < chuoi.length(); i++) {
            kyTu = chuoi.charAt(chuoi.length() - i - 1);
            if (chuoi.charAt(i) == kyTu) {
                System.out.println("Chuỗi này là chuỗi Panlyndrome.");
            } else {
                System.out.println("Chuỗi này không là chuỗi Panlyndrome.");
                break;
            }
        }
    }
}
