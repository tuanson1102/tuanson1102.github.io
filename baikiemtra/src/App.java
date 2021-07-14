import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Player> listPlayers = new ArrayList<>();
        listPlayers.add(new Player(10,"Nguyễn Công Phượng",Position.FW));
        listPlayers.add(new Player(9,"Nguyễn Văn Toàn",Position.FW));
        listPlayers.add(new Player(18,"Hà Đức Chinh",Position.FW));
        listPlayers.add(new Player(6,"Lương Xuân Trường",Position.MF));
        listPlayers.add(new Player(14,"Nguyễn Tuấn Anh",Position.MF));
        listPlayers.add(new Player(15,"Phạm Đức Huy",Position.MF));
        listPlayers.add(new Player(19,"Nguyễn Quang Hải ",Position.MF));
        listPlayers.add(new Player(20,"Phan Văn Đức",Position.MF));
        listPlayers.add(new Player(28,"Nguyễn Hoàng Đức",Position.MF));
        listPlayers.add(new Player(26,"Trần Minh Vương",Position.MF));
        listPlayers.add(new Player(2,"Đỗ Duy Mạnh",Position.DF));
        listPlayers.add(new Player(3,"Quế Ngọc Hải",Position.DF));
        listPlayers.add(new Player(4,"Bùi Tiến Dũng",Position.DF));
        listPlayers.add(new Player(5,"Đoàn Văn Hậu",Position.DF));
        listPlayers.add(new Player(7,"Nguyễn Phong Hồng Duy",Position.DF));
        listPlayers.add(new Player(8,"Nguyễn Trọng Hoàng",Position.DF));
        listPlayers.add(new Player(16,"Nguyễn Thành Chung",Position.DF));
        listPlayers.add(new Player(17,"Vũ Văn Thanh",Position.DF));
        listPlayers.add(new Player(26,"Trần Đình Trọng",Position.DF));
        listPlayers.add(new Player(23,"Nguyễn Văn Toản",Position.GK));
        listPlayers.add(new Player(24,"Bùi Tấn Trường",Position.GK));
        listPlayers.add(new Player(25,"Nguyễn Văn Hoàng",Position.GK));


        for (Player player : listPlayers) {
            System.out.println(player);
        }

        ArrayList<Player> selectedTeam = new ArrayList<Player>();
        Random general = new Random();
        int gkSize = 0;
        int dfSize = 0;
        int mfSize = 0;
        int fwSize = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Lựa chọn của bạn: ");
        int choose = sc.nextInt();
        sc.nextLine();

        switch (choose) {
            case 1:
            while (gkSize < 1 ) {
                int rdGK = general.nextInt(22);
                if (listPlayers.get(rdGK).getPosition().equals(Position.GK)) {
                    selectedTeam.add(listPlayers.get(rdGK));
                    gkSize++;
                }
            }
            while (dfSize < 4 ) {
                int rdDF = general.nextInt(22);
                if (listPlayers.get(rdDF).getPosition().equals(Position.DF)) {
                    selectedTeam.add(listPlayers.get(rdDF));
                    dfSize++;
                }
            }
            while (mfSize < 4 ) {
                int rdMF = general.nextInt(22);
                if (listPlayers.get(rdMF).getPosition().equals(Position.MF)) {
                    selectedTeam.add(listPlayers.get(rdMF));
                    mfSize++;
                }
            }
            while (fwSize < 2 ) {
                int rdFW = general.nextInt(22);
                if (listPlayers.get(rdFW).getPosition().equals(Position.FW)) {
                    selectedTeam.add(listPlayers.get(rdFW));
                    fwSize++;
                }
            }
            System.out.println("đội hình 1-4-4-2: ");
            for (Player player : selectedTeam) {
                System.out.println(player);
            }
                break;
            case 2:
            while (gkSize < 1 ) {
                int rdGK = general.nextInt(22);
                if (listPlayers.get(rdGK).getPosition().equals(Position.GK)) {
                    selectedTeam.add(listPlayers.get(rdGK));
                    gkSize++;
                }
            }
            while (dfSize < 4 ) {
                int rdDF = general.nextInt(22);
                if (listPlayers.get(rdDF).getPosition().equals(Position.DF)) {
                    selectedTeam.add(listPlayers.get(rdDF));
                    dfSize++;
                }
            }
            while (mfSize < 3 ) {
                int rdMF = general.nextInt(22);
                if (listPlayers.get(rdMF).getPosition().equals(Position.MF)) {
                    selectedTeam.add(listPlayers.get(rdMF));
                    mfSize++;
                }
            }
            while (fwSize < 3 ) {
                int rdFW = general.nextInt(22);
                if (listPlayers.get(rdFW).getPosition().equals(Position.FW)) {
                    selectedTeam.add(listPlayers.get(rdFW));
                    fwSize++;
                }
            }
            System.out.println("đội hình 1-4-3-3: ");
            for (Player player : selectedTeam) {
                System.out.println(player);
            }
            break;
            case 3:
            while (gkSize < 1 ) {
                int rdGK = general.nextInt(22);
                if (listPlayers.get(rdGK).getPosition().equals(Position.GK)) {
                    selectedTeam.add(listPlayers.get(rdGK));
                    gkSize++;
                }
            }
            while (dfSize < 3 ) {
                int rdDF = general.nextInt(22);
                if (listPlayers.get(rdDF).getPosition().equals(Position.DF)) {
                    selectedTeam.add(listPlayers.get(rdDF));
                    dfSize++;
                }
            }
            while (mfSize < 5 ) {
                int rdMF = general.nextInt(22);
                if (listPlayers.get(rdMF).getPosition().equals(Position.MF)) {
                    selectedTeam.add(listPlayers.get(rdMF));
                    mfSize++;
                }
            }
            while (fwSize < 2 ) {
                int rdFW = general.nextInt(22);
                if (listPlayers.get(rdFW).getPosition().equals(Position.FW)) {
                    selectedTeam.add(listPlayers.get(rdFW));
                    fwSize++;
                }
            }
            System.out.println("đội hình 1-3-5-2: ");
            for (Player player : selectedTeam) {
                System.out.println(player);
            }
                break;
        
            default:
                break;
        }
    


    }
}
