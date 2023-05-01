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
public class Test1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testxml ethan =  new testxml();
        ethan.parseXML("cd_catalog.xml");
        ethan.parseXML("food_menu.xml");
        ethan.parseXML("plant_catalog.xml");
       
    }
    }
    

