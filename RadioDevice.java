public class RadioDevice {

    public static void main(String[] args) {
        RadioDevice radio = new RadioDevice();
        System.out.println(radio);


    }
        private boolean isOn;
        private int volume;
        private double frequency;

        private String manufacture;
        private int modelNumber;
        private String color;

        private static final int MAX_VOLUME = 10;
        //Constructors

        public RadioDevice(boolean isOn, int volume, double frequency){
            this.volume = volume;
            this.isOn = isOn;
            this.frequency = frequency;
        }

        public RadioDevice(boolean isOn, int volume){
            this(isOn, volume, 100.0);
        }

        public RadioDevice(boolean isOn){
            this(isOn, 0, 100.0);
        }

        public RadioDevice(){
            this(false, 0, 100.0);
        }

        public boolean checkFrequency(double frequency) {
            return frequency > 85 && frequency < 110;
        } // END checkFrequency

        public boolean checkVolume(int volume) {
            return volume >= 0 && volume < 10;
        } //END checkVolume

        public void setFrequency(double frequency){
            if(checkFrequency(frequency)) {
                this.frequency = frequency;
            }
        } //END setFrequency

        public int getVolume(){
            return this.volume;
        } //END getVolume

        public double getFrequency(){
            return this.frequency;
        } //END getVolume

        public void setVolume(int volume) {
            if(checkVolume(volume)) {
                this.volume = volume;
            }
        } //END setVolume

        public void volumeUp(int volume) {
            if(isOn && volume < MAX_VOLUME) {
                volume++;
            }
        } //END volumeUp

        public void volumeDown(int volume) {
            if(isOn && volume > 0) {
                volume --;
            }
        } //END volumeDown

        public void tuneIn(double frequency){
            if(isOn && checkFrequency(frequency)) {
                this.setFrequency(frequency);
                System.out.printf("Radio is now playing on frequency %.1f", frequency);
                isOn = true;
            }
        } //END tuneIn

        public void disable() {
            if(isOn){
                isOn = false;
                System.out.println("Radio disabled.");
            }
        } //END disable

        public void enable() {
            if(!isOn){
                isOn = true;
                System.out.println("Radio enabled.");
            }
        } //END enable


        public String makeString () {
            if(isOn){
                return "Radio enabled." + "Freq=" + frequency + ", Volume=" + volume + ".";
            } else
                return "Radio disabled";
        } //END

    @Override
    public boolean equals(Object obj){
            if(obj == null){
                return false;
            }
            if (obj == this){
                return true;
            }
            if(!obj.getClass().equals(this.getClass())){
                return false;
            }
            RadioDevice compare = (RadioDevice) obj;
            return this.color.equals(compare.color) && this.manufacture.equals(compare.color)
                    && this.modelNumber == compare.modelNumber;
    }

        public RadioDevice copy() {
            RadioDevice r = new RadioDevice();

            r.frequency = this.frequency;
            r.volume = this.volume;
            r.isOn = this.isOn;

            return r;
        }


}

