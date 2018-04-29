package com.parvez.Dom;

import java.io.File;
import javax.xml.parsers.*;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;

public class DomCreatXMLDemo {

    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
            //rootElement
            Document doc = (Document) docBuilder.newDocument();
            Element rootElement = doc.createElement("company");
            doc.appendChild(rootElement);
            //staff
            Element staff = doc.createElement("staff");
            rootElement.appendChild(staff);
            //set atribute
            Attr attr = doc.createAttribute("staff");
            attr.setValue("1");
            staff.setAttributeNode(attr);
            //another way
            //staff.setAttribute("id","1")
            //firstname Elements
            Element firstname = doc.createElement("firstname");
            firstname.appendChild(doc.createTextNode("Nur.Mohammad"));
            staff.appendChild(firstname);
            //lastname element
            Element lastname = doc.createElement("lastname");
            lastname.appendChild(doc.createTextNode("parvez"));
            staff.appendChild(lastname);
            //nickname element
            Element nickname = doc.createElement("nickname");
            nickname.appendChild(doc.createTextNode("Mia"));
            staff.appendChild(nickname);
            //salary element
            Element salary = doc.createElement("salary");
            salary.appendChild(doc.createTextNode("15000"));
            staff.appendChild(salary);
            //    height element
          Element height = doc.createElement("height");
            height.appendChild(doc.createTextNode("5.6inch"));
            staff.appendChild(height);
            //write the xml file

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("D:\\Users\\J2EE-33\\Documents\\NetBeansProjects\\November11\\src\\com\\parvez\\Dom\\Dom.xml"));

            transformer.transform(source, result);
            System.out.println("File saved");

        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        } catch (TransformerException tfe) {
            tfe.printStackTrace();
        };
    }
}
