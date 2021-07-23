public class AnimalsManage {
    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.setName("Micky");
        dog.setFurColor("White");
        dog.setFeetNumber(4);
        dog.show();

        Animal cat = new Animal("Tom", "Blue", 4);
        cat.show();
        cat.setFurColor("Yellow");
        System.out.println("Tom new fur- color: " + cat.getFurColor());
    }
}
