/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.IOException;

/**
 *
 * @author Kyrab
 */
public class BookManager {

    /**
     * @param args the command line arguments
     */
      private static String filepath = "data\\books.txt";
      
      public static String output;
            
        public static String getBooks(){
          output = "";
          try {
              File f = new File(filepath);
              Scanner fileSc = new Scanner(f).useDelimiter("#");
              while(fileSc.hasNextLine()){
                  String line = fileSc.nextLine();
                  Scanner lineSc = new Scanner(line).useDelimiter("#");
                  String name = lineSc.next();
                  String author = lineSc.next();
                  output += "Book:"+ name + "Author:"+ author + "/ln";
                  lineSc.close();
                  
              }
              fileSc.close();  
          } catch (FileNotFoundException ex) {
              System.out.println("File not found");
          }
          return output; 

        }
        
        public static String getAuthor(){
        output = "";
          try {
              File f = new File(filepath);
              Scanner fileSc = new Scanner(f).useDelimiter("#");
              while(fileSc.hasNextLine()){
                  String line = fileSc.nextLine();
                  Scanner lineSc = new Scanner(line).useDelimiter("#");
                  String name = lineSc.next();
                  String author = lineSc.next();
                  output += "Book:"+ name + "Author:"+ author + "/ln";
                  lineSc.close();
                  
              }
               
          } catch (FileNotFoundException ex) {
              System.out.println("File not found");
          }
          return output; 

        }
      
        public static void addBooks(String name,String author){
            try{
                FileWriter fw = new FileWriter(filepath,true);
                PrintWriter pw = new PrintWriter (fw);
                
                pw.println(name + "#"+ author);
                
                pw.close();
            } catch (IOException ex){
                System.out.println("File not found");
            }
        }
}
