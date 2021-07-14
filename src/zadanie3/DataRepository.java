package zadanie3;

public class DataRepository {
    private Report[] reportTab;
    private int counter = 0;
    private int displayCounter = 0;
    private int averageCounter;

    public DataRepository() {
        reportTab = new Report[5];
    }

    public void addNewReport(Report report) {

        reportTab[counter] = report;
        counter++;
        if (displayCounter < 5) {
            displayCounter++;
        }
        if (averageCounter < 5) {
            averageCounter++;
        }
        System.out.println("f4");
        if (counter == 5) {
            counter = 0;
        }
    }

    public double averageFuelConsumption() {
        double sumBurnedFuel = 0;
        double sumDistance = 0;
        double averageFuelConsumption = 0;
        for (int i = 0; i < displayCounter; i++) {
            sumBurnedFuel += reportTab[i].getBurnedFuel();
            sumDistance += reportTab[i].getDistance();

        }
        averageFuelConsumption = (sumBurnedFuel / sumDistance) * 100;
        return averageFuelConsumption;
    }

    public void displyAllReports() {
        for (int i = 0; i < displayCounter; i++) {
            reportTab[i].displayReport();
        }
    }
}
