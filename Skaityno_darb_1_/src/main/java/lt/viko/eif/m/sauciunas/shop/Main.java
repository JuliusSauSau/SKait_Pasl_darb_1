package lt.viko.eif.m.sauciunas.shop;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ShopParser parser = new ShopParser();
        List<Product> products = parser.parseProducts("src/main/resources/Shopthing.xml");

        boolean isValid = XMLValidator.validateXMLSchema("src/main/resources/ShopFile.xsd", "src/main/resources/Shopthing.xml");
        if (isValid) {
            System.out.println("XML is valid against the XSD");
            DatabaseManager.saveProductsToDatabase(products);
            System.out.println("Products saved to database successfully.");
        } else {
            System.out.println("XML is NOT valid against the XSD");
        }
    }
}
