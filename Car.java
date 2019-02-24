public class Car {

    private String licensePlate= "R-UR 18";
    private int mileage= 0;
    private int seats= 5;
    private boolean antenna= true;

    public Car(){

    }

    public Car(int seats){
            this.seats = seats;
    }
    public Car(String licensePlate, int seats){
        this.licensePlate = licensePlate;
        this.seats = seats;
    }

    public String getLicensePlate(){
        return licensePlate;
    }

    public int getSeats(){
        return seats;
    }

    public int getMileage(){
        return mileage;
    }

    public void drive(int x){
        this.mileage = mileage+x;
        System.out.println("The car drove " + x + " kilometers.");
    }

    public void retractAntenna(){
            antenna = false;
            System.out.println("Antenna in.");
    }

    public void raiseAntenna(){
        this.antenna = true;
        System.out.println("Antenna out.");
    }

    public boolean isAntennaOut(){
        return antenna;
    }

    public void beforeWashing(){
        retractAntenna();
    }

    public void wash(){
        beforeWashing();
        System.out.println("Car being washed.");
    }

    @Override
    public boolean equals(Object o){
        if(o == null){
            return false;
        }
        if (o == this){
            return true;
        }
        if(!o.getClass().equals(this.getClass())){
            return false;
        }
        Car compare = (Car) o;
        return this.licensePlate.equals(compare.licensePlate);
    }

    public String toString(){
        return "-License Plate: " + this.licensePlate + "\n- mileage: " + this.mileage + "\n- seats: "
                + this.seats + "\n- antenna: " + this.antenna;
    }

}
