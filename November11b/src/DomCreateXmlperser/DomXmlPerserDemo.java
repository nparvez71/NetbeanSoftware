package DomCreateXmlperser;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class DomXmlPerserDemo {

    public static void main(String[] args) {
        try {

            File inputfile = new File("D:\\Users\\J2EE-33\\Documents\\NetBeansProjects\\November11\\src\\DomCreateXmlperser\\ExForXml.xml");
            DocumentBuilderFactory dbfacFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbfacFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputfile);
            doc.getDocumentElement().normalize();
            System.out.println("ROOt element:" + doc.getDocumentElement().getNodeName());
            NodeList nlist = doc.getElementsByTagName("student");
            System.out.println("-----------------");
            for (int temp = 0; temp < nlist.getLength(); temp++) {
                Node nNode = nlist.item(temp);
                System.out.println("\nCurrent Element:" + nNode.getNodeName());
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    System.out.println("Student roll no "
                            + eElement.getAttribute("rollno"));
                    System.out.println("First Name:"
                            + eElement.getElementsByTagName("firstname").item(0).getTextContent());
                    System.out.println("last Name:"
                            + eElement.getElementsByTagName("lastName").item(0).getTextContent());
                    System.out.println("Marks:"
                            + eElement.getElementsByTagName("Marks").item(0).getTextContent());

                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
