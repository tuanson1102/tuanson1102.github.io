public class Animal {
    private String name;
    private String furColor;
    private int feetNumber;
    public Animal(String name, String furColor, int feetNumber) {
        this.name = name;
        this.furColor = furColor;
        this.feetNumber = feetNumber;
    }
    public Animal() {}

    public void setName(String name) {
        this.name = name;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public void setFeetNumber(int feetNumber) {
        this.feetNumber = feetNumber;
    }

    public String getName() {
        return name;
    }

    public String getFurColor() {
        return furColor;
    }

    public int getFeetNumber() {
        return feetNumber;
    }
    public void show() {
        System.out.print("Name: "+ name);
        System.out.print("; fur Color: " + furColor);
        System.out.println("; feet Number: " + feetNumber);
    }
    
}
