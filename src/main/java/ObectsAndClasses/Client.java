/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ObectsAndClasses;

/**
 *
 * @author kyrab
 */
public class Client {

    private String clientName;
    private String accountNumber;
    private double balance;
    private boolean valid=false;

    public Client(String inName, String inNumber, double inAmount) {
        clientName = inName;
        accountNumber = inNumber;
        balance = inAmount;

    }

    public void setName(String name) {
        clientName = name;

    }

    public String getName() {
        return clientName;
    }

    public void setNumber(String number) {
        accountNumber = number;
    }

    public String getNumber() {
        return accountNumber;
    }

    public void setBalance(double amount) {
        balance = amount;
    }

    public double getBalance() {
        return balance;
    }

    public String changeName() {
        String currentName = getName();
        int lastSpace = currentName.lastIndexOf(" ")+1;
        String surname = currentName.substring(lastSpace);
        String nameArranged = surname + currentName.charAt(0) ;
        return nameArranged;

    }
    
   public void displayDeets(){
       System.out.println("Name:"+ changeName());
       System.out.println("Account Number"+ getNumber());
       System.out.println("Account Balance"+ getBalance());
   }
//   
//   public boolean validNumber(){
//       int accountNbr = Integer.parseInt(getNumber());
//       if(accountNbr> 0 ){
//           return true;
//       }else{
//           return false;
//       }
//   }
           
        
}
