/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObectsAndClasses;

import javax.swing.JOptionPane;

/**
 *
 * @author Kyrab
 */
public class UseLine {

    public static void main(String[] args) {
        
        String sizeStr = JOptionPane.showInputDialog("enter size");
        int intSize = Integer.parseInt(sizeStr);
        char patternStr =JOptionPane.showInputDialog("enter patternt thingy").charAt(0);
       
        Line stripe = new Line();
        stripe.size=intSize;
        stripe.pattern=patternStr; 
        stripe.draw();
        
        sizeStr = JOptionPane.showInputDialog("enter size");
        intSize = Integer.parseInt(sizeStr);
        patternStr =JOptionPane.showInputDialog("enter patternt thingy").charAt(0);
        stripe.size=intSize;
        stripe.pattern=patternStr; 
        
        stripe.drawVert();
        stripe.drawVert();
        stripe.drawVert();
        stripe.drawVert();
        
        sizeStr = JOptionPane.showInputDialog("enter size");
        intSize = Integer.parseInt(sizeStr);
        patternStr =JOptionPane.showInputDialog("enter patternt thingy").charAt(0);
        stripe.size=intSize;
        stripe.pattern=patternStr; 
        
        stripe.draw();
        
        
        
//        stripe.draw();
//        stripe.size = 5;
//        stripe.draw();
//        stripe.pattern = '&';
//        stripe.draw();

        //adding lines
//        stripe.size = 80;
//        stripe.pattern = '=';
//        stripe.draw();
//        
        //loop to draw pattern
//        stripe.pattern = '*';
//        for (int i = 5; i > 0; i--) {
//            stripe.size = i;
//            stripe.draw();
//        }
        //C shape
        
        
        
        

    }

}
