package lt.viko.eif.m.sauciunas.shop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XMLValidatorTest {

    @Test
    void validateXMLSchema() {
        boolean isValid = XMLValidator.validateXMLSchema("src/main/resources/ShopFile.xsd", "src/main/resources/Shopthing.xml");
        assertTrue(isValid);
    }
}