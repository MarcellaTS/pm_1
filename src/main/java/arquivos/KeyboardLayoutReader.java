/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos;

import Teclado.KeyboardLayoutList;
import java.io.File;
import java.io.IOException;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.xml.sax.SAXException;

/**
 *
 * @author marce
 */
public class KeyboardLayoutReader {
    public KeyboardLayoutList loadFromFile(String string) throws SAXException, IOException, ParserConfigurationException {
	File file = new File("KeyboardLayouts.xml");
	DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
	Document document = (Document) documentBuilder.parse(file);
        
	return null;
    }
}
