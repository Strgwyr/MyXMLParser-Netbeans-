/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

/**
 *
 * @author Ethan
 */
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
public class testxml {
    
private String fileName;
  
    public void parseXML(String fileName){

       try {
           this.fileName = fileName;
           File inputFile = new File ("C:\\Users\\Ethan\\Documents\\NetBeansProjects\\Test1\\src\\test1\\" + fileName);
           DocumentBuilderFactory cdFactory = DocumentBuilderFactory.newInstance();
           DocumentBuilder cdBuilder = cdFactory.newDocumentBuilder();
           Document doc = cdBuilder.parse(inputFile);
           doc.getDocumentElement().normalize();
           NodeList cdList = doc.getElementsByTagName("CD");
           NodeList bmList = doc.getElementsByTagName("food");
           NodeList pcList = doc.getElementsByTagName("PLANT");
           System.out.println("----------------------------"); 
           
           switch(fileName){
    case "cd_catalog.xml":
        System.out.printf("%-30s %-30s %-30s %-30s %-10s %-10s\n", "Title", "Artist", "Country", "Company", "Price", "Year");
        for (int temp = 0; temp < cdList.getLength(); temp++) {
            Node nNode = cdList.item(temp);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                System.out.printf("%-30s %-30s %-30s %-30s %-10s %-10s\n",
                    eElement.getElementsByTagName("TITLE").item(0).getTextContent(),
                    eElement.getElementsByTagName("ARTIST").item(0).getTextContent(),
                    eElement.getElementsByTagName("COUNTRY").item(0).getTextContent(),
                    eElement.getElementsByTagName("COMPANY").item(0).getTextContent(),
                    eElement.getElementsByTagName("PRICE").item(0).getTextContent(),
                    eElement.getElementsByTagName("YEAR").item(0).getTextContent()
                );
            }
        }
        break;
                   
                   case "food_menu.xml":
        System.out.printf("%-30s %-30s %-90s %-90s\n", "Name", "Price", "Description", "Categories");
        for (int temp = 0; temp < bmList.getLength(); temp++) {
            Node nNode = bmList.item(temp);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                System.out.printf("%-30s %-30s %-90s %-90s\n",
                    eElement.getElementsByTagName("name").item(0).getTextContent(),
                    eElement.getElementsByTagName("price").item(0).getTextContent(),
                    eElement.getElementsByTagName("description").item(0).getTextContent(),
                    eElement.getElementsByTagName("calories").item(0).getTextContent()
                );
            }
        }
        break;
                       
                   case "plant_catalog.xml":
        System.out.printf("%-30s %-30s %-30s %-30s %-30s %-30s\n", "Common", "Botanical", "Zone", "Light", "Price", "Availability");
        for (int temp = 0; temp < pcList.getLength(); temp++) {
            Node nNode = pcList.item(temp);
            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                System.out.printf("%-30s %-30s %-30s %-30s %-30s %-30s\n",
                    eElement.getElementsByTagName("COMMON").item(0).getTextContent(),
                    eElement.getElementsByTagName("BOTANICAL").item(0).getTextContent(),
                    eElement.getElementsByTagName("ZONE").item(0).getTextContent(),
                    eElement.getElementsByTagName("LIGHT").item(0).getTextContent(),
                    eElement.getElementsByTagName("PRICE").item(0).getTextContent(),
                    eElement.getElementsByTagName("AVAILABILITY").item(0).getTextContent()
                );
            }
        }
        break;
                       
                       
                   
           }
           
           
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
    
}