public class RadioStation {
    String programName;
    double frequency;

    public RadioStation(String programName, double frequency){
        this.programName = programName;
        this.frequency = frequency;
    } //END Constructor

    public String getRadioStationInformation(){
        return programName + " can be received in the frequency range between " + (frequency - 3) + " and " + (frequency + 3);
    }
}
