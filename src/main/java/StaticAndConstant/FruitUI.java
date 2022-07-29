/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StaticAndConstant;

/**
 *
 * @author Kyrab
 */
public class FruitUI {

    public static void main(String[] args) {
        Fruit apple = new Fruit("apple", 16, 10.0);
        apple.sell(5);
         Fruit pear = new Fruit("pear", 5, 20.0);
         pear.sell(1);
         System.out.println(Fruit.getTotalCost());
       
    }

}
