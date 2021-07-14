import java.util.Scanner;

public class Sach {
    long id;
    String name;
    String author;
    int since;
    public Sach(long id, String name, String author, int since) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.since = since;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getSince() {
        return since;
    }
    public void setSince(int since) {
        this.since = since;
    }


    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã sách: ");
        id = sc.nextLong();
        sc.nextLine();
        System.out.println("Nhập tên sách: ");
        name = sc.nextLine();
        System.out.println("Nhập tên tác giả: ");
        author = sc.nextLine();
        System.out.println("Năm xuất bản: ");
        since = sc.nextInt();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return id + "-" + name + "-" + author + "-" + since;
    }
    
    
}
