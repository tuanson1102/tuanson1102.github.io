import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> listName = new ArrayList<>();
        listName.add(1 + " Nguyễn Tuấn Sơn " + "21 tuổi" + " Hà Nội ");
        listName.add(2 + " Đào Ngọc Tùng " + "21 tuổi" + " Hà Nội ");
        listName.add(3 + " Trịnh Công Mạnh " + "21 tuổi" + " Hà Nội ");
        listName.add(4 + " Trịnh Anh Cương " + "21 tuổi" + " Hà Nội ");
        listName.add(5 + " Lê Vũ Anh " + "21 tuổi" + " Hà Nội ");
        listName.add(6 + " Đinh Thế Vũ " + "21 tuổi" + " Hà Nội ");
        listName.add(7 + " Mai Duy Hưng Thành " + "21 tuổi" + " Hà Nội ");
        listName.add(8 + " Nguyễn Gia Tường " + "21 tuổi" + " Hà Nội ");
        listName.add(9 + " Mai Văn Phán " + "21 tuổi" + " Hà Nội ");
        listName.add(10 + " Chính Vũ " + "21 tuổi" + " Hà Nội ");
        listName.add(11 + " Trần Thị Thu Hoa " + "21 tuổi" + " Hà Nội ");

        for (String s : listName) {
            System.out.println(s);
        }
    }       
}
