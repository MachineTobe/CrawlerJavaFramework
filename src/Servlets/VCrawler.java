package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import Framework.CrawlerDatatypes;

@WebServlet("/VCrawler")
public class VCrawler extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public VCrawler() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/xml");
		
		DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder docBuilder;
		try {
			docBuilder = builderFactory.newDocumentBuilder();
			Document doc = docBuilder.newDocument(); 
			
			// Generiere den XML-Baum
			Element root = doc.createElement("Company");
			doc.appendChild(root);
			Element child = doc.createElement("Location");
	        root.appendChild(child);
	        Text text1 = doc.createTextNode("Vineet Bansal");
	        child.appendChild(text1);
			
			// Erzeuge Transformer-Objekt 
	        TransformerFactory factory = TransformerFactory.newInstance();
	        Transformer transformer = factory.newTransformer();
	        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			
			// Generiere den String aus dem XML-Baum
	        StringWriter sw = new StringWriter();
	        StreamResult result = new StreamResult(sw);
	        DOMSource source = new DOMSource(doc);
	        transformer.transform(source, result);
	        String xmlString = sw.toString();
			
			// Ausgabe der fertigen XML-Datei
	        PrintWriter writer = response.getWriter();
			writer.println(xmlString);
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
