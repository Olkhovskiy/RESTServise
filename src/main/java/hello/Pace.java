package hello;

public class Pace {


    private double minitePace;
    private double secundePace;

    public Pace(double distance, int hours, int minute) {
      this.minitePace = Math.floor((hours*60+minute)/distance);
      this.secundePace = ((hours*60+minute)%distance)*6;
     // this.secundePace =distance;
      //this.minitePace = distance;
    }

    public double getMinitePace() {
        return minitePace;
    }

    public double getSecundePace() {
        return secundePace;
    }
}