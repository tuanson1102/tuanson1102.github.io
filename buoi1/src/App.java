public class App {
    public static void main(String[] args) throws Exception {
        App app = new App();  
        app.introduceMy();

        App.introduceMy();

        Person person = new Person(); 
        person.getAge();

        String str = "Hà Nội";
        System.out.println(str);
    
        Calculator calcu = new Calculator();
        System.out.println(calcu.add());

        
    }

    public static void introduceMy(){
        System.out.println("Nguyễn Tuấn Sơn");
    }

}
