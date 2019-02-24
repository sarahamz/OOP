package residental;

public class Account {

    private String name;
    private int pin;
    private double balance;

    public Account(String name, int pin){
        this.name = name;
        this.pin = pin % 10000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCurrentBalance(){
        return balance;
    }

    public boolean checkPin(int pin){
        return this.pin == pin;
        }

    public double depositMoney(double money){
        return this.balance += money;
    }

    public boolean withdrawMoney(double money, int pin){
        if (checkPin(pin) && balance >= money){
            balance -= money;
            return true;
        }
        return false;
    }

}
