public class Radio {

    private boolean on;
    private int volume;
    private double frequency;


    public Radio(boolean on, int volume, double frequency) {
        this.on = on;
        setVolume(volume);
        setFrequency(frequency);
    }


    void incVolume() {
        if (volume < 10) {
            volume++;
        } else if (volume == 10){
            System.out.println("Max. volume!");
        }
    }
    void decVolume() {
        if (volume > 0) {
            volume--;
        } else if (volume == 0){
            System.out.println("Min. volume!");
        }
    }

    void turnOn() {
        if(!on) {
            on = true;
        } else {
            System.out.println("Bereits an!");
        }
    }
    void turnOff() {
        if(on) {
            on = false;
        } else {
            System.out.println("Bereits aus!");
        }
    }

    void setFrequency(double frequency) {
        if (frequency >= 85.0 && frequency <= 110.0) {
            this.frequency = frequency;
        } else {
            System.out.println("Frequency must be between 85.0 and 110.0");
            this.frequency = 99.0;
        }
    }

    void setVolume(int volume) {
        if (volume >= 0 && volume <= 10) {
            this.volume = volume;
        } else {
            System.out.println("Volume must be between 0 and 10");
        }
    }

    public String toString() {
        return "Radio " + (on ? "an" : "aus") + ": Freq=" + frequency + ", Laut=" + volume;
    }

}
