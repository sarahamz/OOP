package de.shop.storage;

import java.text.DecimalFormat;

public class Product {

    public final String NAME;
    private final int PRODUCT_NUMBER;
    private double priceBuy;
    private double priceSell;
    public int stock;

    public Product(String NAME, int PRODUCT_NUMBER, double priceBuy, double priceSell, int stock) {
        this.NAME = NAME;
        this.PRODUCT_NUMBER = PRODUCT_NUMBER;
        this.priceBuy = priceBuy;
        this.priceSell = priceSell;
        this.stock = stock;
    }
    public Product(String NAME, int PRODUCT_NUMBER, double priceBuy, double priceSell) {
        this.NAME = NAME;
        this.PRODUCT_NUMBER = PRODUCT_NUMBER;
        this.priceBuy = priceBuy;
        this.priceSell = priceSell;
    }

    public int getPRODUCT_NUMBER() {
        return PRODUCT_NUMBER;
    }

    public double getPriceBuy() {
        return priceBuy;
    }

    public double getPriceSell(){
        return priceSell;
    }

    public void priceChange(double change){
        this.priceSell += change;
    }

    @Override
    public boolean equals (Object obj){
        if (obj == null) {
            return false;
        }
        if (obj == this){
            return true;
        }
        if(!obj.getClass().equals(this.getClass())){
            return false;
        }
        Product compare = (Product) obj;
        return this.PRODUCT_NUMBER ==compare.PRODUCT_NUMBER;
    }

    DecimalFormat d = new DecimalFormat("#0.00");

    @Override
    public String toString(){
        return NAME + " costs $" + d.format(priceSell) + ". There are " + stock +
                " left in stock.";
    }
}
