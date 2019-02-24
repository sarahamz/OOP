import java.util.Scanner;

public class Main1 {
    static public void selectRadiostation(){
        RadioStation antenneBayern = new RadioStation("Antenne Bayern", 103.0);
        RadioStation deutschlandfunk = new RadioStation("Deutschlandfunk", 95.5);
        RadioStation egoFM = new RadioStation("egoFM", 107.5);
        RadioStation gong = new RadioStation("gongFM", 89.7);
        RadioStation klassik = new RadioStation("Klassik Radio", 91.1);
        RadioStation charivari = new RadioStation("Charivari Regensburg", 98.2);

        Scanner keyboard = new Scanner(System.in);
        while(true) {
            System.out.println("Please insert a number between 1 and 6.");
            int userInput = keyboard.nextInt();

            switch (userInput) {
                case 1:
                    System.out.println(antenneBayern.getRadioStationInformation());
                    break;
                case 2:
                    System.out.println(deutschlandfunk.getRadioStationInformation());
                    break;
                case 3:
                    System.out.println(egoFM.getRadioStationInformation());
                    break;
                case 4:
                    System.out.println(gong.getRadioStationInformation());
                    break;
                case 5:
                    System.out.println(klassik.getRadioStationInformation());
                    break;
                case 6:
                    System.out.println(charivari.getRadioStationInformation());
                    break;
                default:
                    System.out.println("This is not a number between 1 and 6.");
            }
            System.out.println("Do you want to continue? 1 for yes. 2 for no.");
            int abort = keyboard.nextInt();
            if (abort == 2) {
                break;
            } else if (abort == 1) {
                continue;
            } else {
                System.out.println("Invalid input.");
            }
        }
    } //END selectRadiostation
    public static void main(String[] args){
        selectRadiostation();

    } //END main
}
