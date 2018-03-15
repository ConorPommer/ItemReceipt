/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labreceipt;

import java.util.ArrayList;

public class Receipt {

    private ArrayList<String> saleList;

    private ArrayList<Items> purchasedItems;

    public Receipt(ArrayList<String> s, ArrayList<Items> p) {

        this.saleList = s;
        this.purchasedItems = p;
    }

    //TODO: returns an ArrayList with the items being purchased that are on sale
    public ArrayList<Items> findSaleItems() {
        ArrayList<Items> saleItems = new ArrayList<Items>();
        for (int i = 0; i < saleList.size(); i++) {
            for (int j = 0; j < purchasedItems.size(); j++) {
                if (purchasedItems.get(j).getName().equals(saleList.get(i))) {
                    saleItems.add(purchasedItems.get(j));

                }
            }
        }

        return saleItems;
    }

    //TODO: returns the subtotal of items being purchased (does not include discount)
    public double subtotal(ArrayList<Items> items) {

        double subtotal = 0;
        for (int i = 0; i < purchasedItems.size(); i++) {
            subtotal += purchasedItems.get(i).getPrice();

        }
        return subtotal;
    }

//TODO: returns the amount of discount earned (where each sale Item is 50% off)
    public double discount(ArrayList<Items> items) {
        ArrayList<Items> findSaleItems();
        
        for (int i = 0; i < ; i++) {
             = .get(i).getPrice() * .5;
        }
        return ;
    }

    // TODO: Prints the receipt
    public static void printReceipt() {
    }

}
