package lt.viko.eif.m.sauciunas.shop;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;
import java.io.File;

public class XMLValidator {
    public static boolean validateXMLSchema(String xsdPath, String xmlPath) {
        try {
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            Schema schema = factory.newSchema(new File(xsdPath));
            Validator validator = schema.newValidator();
            validator.validate(new StreamSource(new File(xmlPath)));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        boolean isValid = validateXMLSchema("src/main/resources/ShopFile.xsd", "src/main/resources/Shopthing.xml");
        if (isValid) {
            System.out.println("XML is valid against the XSD");
        } else {
            System.out.println("XML is NOT valid against the XSD");
        }
    }
}
