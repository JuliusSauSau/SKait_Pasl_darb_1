package lt.viko.eif.m.sauciunas.shop;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.SAXException;

public class ShopParser {
    public List<Product> parseProducts(String filePath) {
        List<Product> products = new ArrayList<>();

        try {
            // Initialize the parser
            File inputFile = new File(filePath);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);

            // Normalize the document
            doc.getDocumentElement().normalize();

            // Get the list of products
            NodeList productsList = doc.getElementsByTagName("product");

            // Loop through each product and create Product objects
            for (int i = 0; i < productsList.getLength(); i++) {
                Node productNode = productsList.item(i);

                if (productNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element productElement = (Element) productNode;

                    String id = productElement.getElementsByTagName("id").item(0).getTextContent();
                    String name = productElement.getElementsByTagName("name").item(0).getTextContent();
                    String price = productElement.getElementsByTagName("price").item(0).getTextContent();
                    String description = productElement.getElementsByTagName("description").item(0).getTextContent();
                    String category = productElement.getElementsByTagName("category").item(0).getTextContent();

                    Product product = new Product(id, name, price, description, category);
                    products.add(product);
                }
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }

        return products;
    }

    public static void main(String[] args) {
        ShopParser parser = new ShopParser();
        List<Product> products = parser.parseProducts("src/main/resources/Shopthing.xml");
        printProducts(products);
    }

    private static void printProducts(List<Product> products) {
        for (Product product : products) {
            System.out.println(product);
        }
    }
}
