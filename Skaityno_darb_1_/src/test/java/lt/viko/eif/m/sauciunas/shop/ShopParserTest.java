package lt.viko.eif.m.sauciunas.shop;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ShopParserTest {

    @Test
    void parseProducts() {
        ShopParser parser = new ShopParser();
        List<Product> products = parser.parseProducts("src/main/resources/Shopthing.xml");

        assertNotNull(products);
        assertEquals(16, products.size());

        Product firstProduct = products.get(0);
        assertEquals("1", firstProduct.getId());
        assertEquals("Bookshelf", firstProduct.getName());
        assertEquals("$100", firstProduct.getPrice());
        assertEquals("A sturdy wooden bookshelf with three shelves.", firstProduct.getDescription());
        assertEquals("Furniture", firstProduct.getCategory());
    }
}
