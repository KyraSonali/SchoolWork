/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StaticAndConstant;

/**
 *
 * @author Kyrab
 */
public class Fruit {

    private String description;
    private int qty;
    private double costPrice;
    private double sellingPrice;
    
    public static final int MARKUP = 75;
    private static int totalQty=0;
    private static double totalCost=0;
    private static double totalSales=0;

    public Fruit(String d, int q, double c) {
        description = d;
        qty = q;
        costPrice = c;
        sellingPrice = costPrice+costPrice*MARKUP/10;
        
        //for static
        totalQty+=q;
        totalCost+=c*q;
        
    }
    
    public String toString(){
        return "Descript:" + description +" Quantity:" + qty+ "Cost price:" + costPrice;
    }

    public String getDescription(){
        return description;
    }
    
    public int getQty(){
        return qty;
    }
    
    public double getSellingPrice(){
        return costPrice;
    }
    
    public static int getTotalQty(){
        return totalQty;
    }
    
    public static double getTotalCost(){
        return totalCost;
    }
    
    public static double getTotalSales(){
        return totalSales;
    }
    
    public void sell(int q){
        qty = qty-q;
        
        
        totalQty = totalQty-q;
        totalSales = totalSales+q*sellingPrice;
        
        
        
        
    }
}
