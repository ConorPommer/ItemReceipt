/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labreceipt;


import java.util.ArrayList;

import java.util.Scanner;

import java.util.Random;

public class ItemReceiptDriver 

{  
   private static Scanner in = new Scanner(System.in);
   
private static Random randGen = new Random();


   
public static void main(String[] args)

   
{
      Receipt customerReceipt = new Receipt(setSaleItems(), purchaseItems());
      
customerReceipt.printReceipt();
   }
   
   

//Identify the items on sale
   
public static ArrayList<String> setSaleItems()
   
{
      ArrayList<String> saleItems = new ArrayList<String>();
      
      saleItems.add("toothpaste");
      saleItems.add("sugar");
      saleItems.add("advil");
      saleItems.add("cereal");
      return saleItems;
   }

   
  
 //Allow the user to purchase items
   
public static ArrayList<Items> purchaseItems()
   
{
      ArrayList<Items> toBuy = new ArrayList<Items>();
      
     
 String response;
      System.out.println("What would you like to purchase?"
              + " (type \"done\" to end) ");   
      

do {
         response = in.nextLine();
         
if(!response.equals("done") )
            
toBuy.add(new Items(response, randGen.nextInt(100)));
      }
 while(!response.equals("done"));
      
      return toBuy;
   
}

}     
        

