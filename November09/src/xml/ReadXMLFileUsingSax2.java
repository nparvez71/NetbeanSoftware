/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xml;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class ReadXMLFileUsingSax2 {
    
   public static void main(String argv[]) {

    try {

	SAXParserFactory factory = SAXParserFactory.newInstance();
	SAXParser saxParser = factory.newSAXParser();

	DefaultHandler handler = new DefaultHandler() {

	boolean bfname = false;
	boolean bsalary = false;

        @Override
	public void startElement(String uri, String localName,String qName,
                Attributes attributes) throws SAXException {

		System.out.println("Start Element :" + qName);

		if (qName.equalsIgnoreCase("FULLNAME")) {
			bfname = true;
		}
		
		if (qName.equalsIgnoreCase("SALARY")) {
			bsalary = true;
		}

	}

        @Override
	public void endElement(String uri, String localName,
		String qName) throws SAXException {

		System.out.println("End Element :" + qName);

	}

	public void characters(char ch[], int start, int length) throws SAXException {

		if (bfname) {
			System.out.println("Full Name : " + new String(ch, start, length));
			bfname = false;
		}

		if (bsalary) {
			System.out.println("Salary : " + new String(ch, start, length));
			bsalary = false;
		}

	}

     };

       saxParser.parse("D:\\Users\\J2EE-33\\Documents\\NetBeansProjects\\November09\\src\\xml/ppp.xml", handler);

     } catch (Exception e) {
       e.printStackTrace();
     }

   }

}