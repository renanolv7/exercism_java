public class JedliksToyCar {

    private int dist = 0;
    private int percentage = 100;
    
    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
       return "Driven " + dist + " meters";
    }

    public String batteryDisplay() {
        if (percentage == 0) {
            return "Battery empty";
        }
        return "Battery at " + percentage + "%";
    }

    public void drive() {
        if (percentage > 0) {
            dist += 20;
            percentage--;
        }
    }
}
