import java.util.List;
import java.util.Scanner;

public class Constroller {
    String username;
    String password;
    User Account = null;

    Repository repository = new Repository();
    List<User> users = repository.getData();

    Scanner sc = new Scanner(System.in);

    public void login(){

        //Thực hiện đăng nhập
        System.out.println("Nhập tên đăng nhập: ");
        username = sc.nextLine();

        System.out.println("Nhập mật khẩu: ");
        password = sc.nextLine();

        Account = checkUsername(username);
        if (Account!=null) { 
            checkPassword(password);
        } else {
            System.out.println("Sai tên đăng nhập ");
            login();
        }

    }

    public User checkUsername(String username) {

        for(User user : users) {
            if (username.equals(user.getUsername())) {
                return user;
            }
        }
        return null;
    }

    public void checkPassword(String password) {
        if (password.equals(Account.getPassword())) {
            System.out.println("Chào mừng " + username);
            secondMenu();
        } else {
            System.out.println("Nhập sai mật khẩu \n");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    login();
                case 2:
                    forgotPassword();
                case 3:
                    System.exit(0);
            }
        }
    }
    
    public void secondMenu() {
        Menu.secondMenu();
        int choose1 = sc.nextInt();
        switch (choose1) {
            case 1:
                System.out.println("Nhập tên đăng nhập mới: ");
                changeUsername(sc.nextLine());
                sc.nextLine();
                break;
            case 2:
                System.out.println("Email hiện tại: " + Account.getEmail());;
                System.out.println("Nhập email mới: ");
                changeEmail(sc.nextLine());
                break;
            case 3:
                System.out.println("Nhập mật khẩu mới: ");
                changePassword(sc.nextLine());
                break;
            case 4:
                Menu.mainMenu();
                int choose2 = sc.nextInt();
                switch (choose2) {
                    case 1:
                        login();
                    case 2:
                        createNewAccount();
                }
                break;
            case 0:
                System.exit(0);
        }
        System.out.println("Thay đổi thành công");
        secondMenu();
    }

    public void changeUsername(String username){
        Account.setUsername(username);
    }

    public void changePassword(String password){
        try {
            Account.setPassword(Validate.validatePassword(password));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Nhập mật khẩu mới");
            changePassword(sc.nextLine());
        }
        
    }

    public void changeEmail(String email){

        for (User user : users) {
            if (email.equals(user.getEmail())) {
                System.out.println("Email đã sử dụng, vui lòng nhập email!");
                changeEmail(sc.nextLine());
            }
        }

        try {
            Account.setEmail(Validate.validateEmail(email));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Nhập lại email:");
            changeEmail(sc.nextLine());
        }
    }


    public void forgotPassword(){
        System.out.println("Nhập email đã đăng ký: ");
        String inputEmail = sc.nextLine();

        if (inputEmail.equals(Account.getEmail())) {
            System.out.println("Nhập mật khẩu mới");
            changePassword(sc.nextLine());
            System.out.println("Quay trở lại màn hình đăng nhập");
            login();
        } else {
            System.out.println("Email không tồn tại");
            System.out.println("Thoát chương trình!");
        }

    }

    public void createNewAccount(){
        User newUser = new User();
        System.out.println("Nhập tên đăng nhập: ");
        newUser.setUsername(sc.nextLine());
        try {
            System.out.println("Nhập email: ");
            newUser.setEmail(Validate.validateEmail(sc.nextLine()));

            System.out.println("Nhập mật khẩu: ");
            newUser.setPassword(Validate.validatePassword(sc.nextLine()));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Vui lòng đăng ký lại");
            createNewAccount();
        }

        System.out.println("Đăng ký thành công");
        users.add(newUser);
        login();
    }
}