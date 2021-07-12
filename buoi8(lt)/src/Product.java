public class Product {
    private int id;
    private String name;
    private String describe;
    private long Price;
    private int amount;
    private int amountSale;
    private String brand;
    private Category category;

    public Product(int id, String name, String describe, long Price, int amount,
            int amountSale, String brand, Category category) {
        this.id = id;
        this.name = name;
        this.describe = describe;
        this.Price = Price;
        this.amount = amount;
        this.amountSale = amountSale;
        this.brand = brand;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }


    public long getPrice() {
        return Price;
    }

    public void setPrice(long Price) {
        this.Price = Price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmountSale() {
        return amountSale;
    }

    public void setAmountSale(int amountSale) {
        this.amountSale = amountSale;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + describe + " - " + Price + " - " + amount + " - "
                + amountSale + " - " + brand + " - " + category.getValue();
    }
}
