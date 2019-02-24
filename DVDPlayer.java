package de.shop.storage;

public class DVDPlayer extends Product{

    private String currentDVD;
    private boolean blueRay;

    public DVDPlayer(String NAME, int PRODUCT_NUMBER, double priceBuy, double priceSell, int stock,
    String currentDVD, boolean blueRay){
        super(NAME, PRODUCT_NUMBER, priceBuy, priceSell, stock);
        this.currentDVD = currentDVD;
        this.blueRay = blueRay;
    }

    public DVDPlayer(String NAME, int PRODUCT_NUMBER, double priceBuy, double priceSell,
    boolean blueRay){
        super(NAME, PRODUCT_NUMBER, priceBuy, priceSell);
        this.currentDVD = "";
        this.blueRay = blueRay;
    }

    public void changeDVD(String changedDVD){
        this.currentDVD = changedDVD;
    }

    public boolean getBlueRay(){
        return blueRay;
    }

    public String getCurrentDVD() {
        return currentDVD;
    }

    @Override
    public boolean equals(Object object){
        if(object == null) {
            return false;
        }
        if(object == this) {
            return true;
        }
        if(!object.getClass().equals(this.getClass())){
            return false;
        }
        DVDPlayer compare = (DVDPlayer) object;
        return (this.currentDVD == compare.currentDVD && this.blueRay == compare.blueRay);
    }
}
