package zadanie3;

public class Report {
    private double distance;
    private double burnedFuel;

    public Report(double distance, double burnedFuel) {
        this.distance = distance;
        this.burnedFuel = burnedFuel;
        System.out.println("f3");
    }

    public void displayReport() {
        System.out.println("dystans: " + distance);
        System.out.println("spalone paliwo: " + burnedFuel);
        System.out.println("--------------------");
    }

    public double getDistance() {
        return distance;
    }

    public double getBurnedFuel() {
        return burnedFuel;
    }
}
