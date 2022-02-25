/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObectsAndClasses;

/**
 *
 * @author Kyrab
 */
public class Line {

    int size ;
    char pattern;
    
    public Line(int s,char p){
        size=s;
        pattern=p;
    }

    public void draw() {

        for (int i = 1; i <= size; i++) {
            System.out.print(pattern);
           
        }
          System.out.println();
    }
    
    public void drawVert(){
        
        for(int j =1;j<=size;j++){
            System.out.print(pattern);
            System.out.println();
        }
    }
    
    
    

}

