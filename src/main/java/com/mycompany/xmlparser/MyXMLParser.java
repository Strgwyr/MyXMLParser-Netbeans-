/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.xmlparser;

//import xml related packages
import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

/**
 *
 * @author ejozogg
 */
public class MyXMLParser {
    
private String fileName;
  
    public void parseXML(String fileName){

       try {
           this.fileName = fileName;
           File inputFile = new File ("C:\\Users\\ejozogg\\Documents\\NetBeansProjects\\XMLParser\\src\\main\\java\\com\\mycompany\\xmlparser\\" + fileName);
           DocumentBuilderFactory cdFactory = DocumentBuilderFactory.newInstance();
           DocumentBuilder cdBuilder = cdFactory.newDocumentBuilder();
           Document doc = cdBuilder.parse(inputFile);
           doc.getDocumentElement().normalize();
           System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
           NodeList nList = doc.getElementsByTagName("CD");
           System.out.println("----------------------------");
           
           for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);
            System.out.println( nNode.getNodeName());
            
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
               Element eElement = (Element) nNode;
               System.out.println("Title : " 
                  + eElement
                  .getElementsByTagName("TITLE")
                  .item(0)
                  .getTextContent());
               System.out.println("Artist : " 
                  + eElement
                  .getElementsByTagName("ARTIST")
                  .item(0)
                  .getTextContent());
               System.out.println("Country : " 
                  + eElement
                  .getElementsByTagName("COUNTRY")
                  .item(0)
                  .getTextContent());
               System.out.println("Company : " 
                  + eElement
                  .getElementsByTagName("COMPANY")
                  .item(0)
                  .getTextContent());
               System.out.println("Price : " 
                  + eElement
                  .getElementsByTagName("PRICE")
                  .item(0)
                  .getTextContent());
               System.out.println("Year : " 
                  + eElement
                  .getElementsByTagName("YEAR")
                  .item(0)
                  .getTextContent());
            }
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
    
}
