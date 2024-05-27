package lt.viko.eif.m.sauciunas.shop;

public class Product {
    private String id;
    private String name;
    private String price;
    private String description;
    private String category;

    public Product(String id, String name, String price, String description, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product ID: " + id + "\n" +
                "Name: " + name + "\n" +
                "Price: " + price + "\n" +
                "Description: " + description + "\n" +
                "Category: " + category + "\n" +
                "------------------------------";
    }
}
