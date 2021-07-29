import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Repository repository = new Repository();
        repository.getData();
        Constroller constroller = new Constroller();
        
        Menu.mainMenu();

        int choose = sc.nextInt();
        switch (choose) {
            case 1:
                constroller.login();
                break;
            case 2:
                constroller.createNewAccount();
                break;
            default:
                break;
        }



    }
}
