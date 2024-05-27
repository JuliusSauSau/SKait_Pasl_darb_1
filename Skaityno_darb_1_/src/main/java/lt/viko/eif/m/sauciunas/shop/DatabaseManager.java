package lt.viko.eif.m.sauciunas.shop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DatabaseManager {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/shopdb";
    private static final String USER = "root";
    private static final String PASS = "19Nado73*";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }

    public static void saveProductsToDatabase(List<Product> products) {
        String insertSQL = "INSERT INTO products (id, name, price, description, category) VALUES (?, ?, ?, ?, ?)"
                + "ON DUPLICATE KEY UPDATE name = VALUES(name), price = VALUES(price), description = VALUES(description), category = VALUES(category)";

        try (Connection connection = connect(); PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {
            for (Product product : products) {
                preparedStatement.setString(1, product.getId());
                preparedStatement.setString(2, product.getName());
                preparedStatement.setString(3, product.getPrice());
                preparedStatement.setString(4, product.getDescription());
                preparedStatement.setString(5, product.getCategory());
                preparedStatement.addBatch();
            }
            preparedStatement.executeBatch();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ShopParser parser = new ShopParser();
        List<Product> products = parser.parseProducts("src/main/resources/Shopthing.xml");
        saveProductsToDatabase(products);
    }
}
