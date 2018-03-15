/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labreceipt;

import java.util.ArrayList;

public class Receipt 
  

{
   
private ArrayList<String> saleList;

private ArrayList<Items> purchasedItems;



   public Receipt(ArrayList<String> s, ArrayList<Items> p)
   {


      this.saleList = s;
      this.purchasedItems = p;
   }

 
 
 //TODO: returns an ArrayList with the items being purchased that are on sale
   
public static ArrayList<Items> findSaleItems()
   {
      return null;
   }

   
  
 //TODO: returns the subtotal of items being purchased (does not include discount)
   
public static double subtotal(ArrayList<Items> items)
   {
      return 0;
   }

   
   
//TODO: returns the amount of discount earned (where each sale Item is 50% off)
   
public static double discount(ArrayList<Items> items)
   {
      return 0;
   }


  
 // TODO: Prints the receipt
   
public static void printReceipt()
   {
   }

}  


