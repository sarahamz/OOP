package de.shop.checkout;

import de.shop.storage.Product;

import java.text.DecimalFormat;

public class CashRegister {

    private double cash;
    private int customers;

    static CashRegister example = new CashRegister();

    public CashRegister(double cash){
        this.cash = cash;
    }

    public CashRegister(){
        this.cash = 100.00;
    }

    public double getCash(){
        return cash;
    }

    public int getCustomers() {
        return customers;
    }

    public void sell(Product product, int amount){
        cash += amount * product.getPriceSell();
        product.stock -= amount;
        customers++;
    }

    public double orderNewProduct(Product product, int amount){
        double newProduct = amount * product.getPriceBuy();
        if(newProduct>cash)
            return cash;
        product.stock += amount;
        cash = cash - amount * product.getPriceBuy();

        return cash;
    }

    DecimalFormat d = new DecimalFormat("#0.00");

    @Override
    public String toString() {
        return "Amount of cash: $" + d.format(cash) + ". Today there were " + customers + " costumers at the Cash-Register.";
    }
}
