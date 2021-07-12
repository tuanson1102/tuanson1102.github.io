public enum Category {
    PHONE("Điện thoại"), LAPTOP("Laptop"), APPLE("apple"), ACCESSORIES("Phụ kiện");
     private String value;
     Category(String value) {
         this.value = value;
     }
     public String getValue() {
         return value;
     }
}
