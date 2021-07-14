package zadanie3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        DataRepository dataRepository = new DataRepository();


        do {
            System.out.println("co chcesz zrobić?");
            System.out.println("dodac wpis? wcisnij 1");
            System.out.println("wywietlic srednie spalanie? wcisnij 2");
            System.out.println("przerwac dzialanie programu? wcisnij 3");
            System.out.println("display 4");
            choice = scanner.nextInt();

            Scanner sc = new Scanner(System.in);

            switch (choice) {
                case 1:
                    double distance;
                    double burnedFuel;

                    System.out.println("podaj przejechany dystans");
                    distance = scanner.nextDouble();
                    System.out.println("podaj ilosc spalonego paliwa");
                    burnedFuel = sc.nextDouble();
                    System.out.println("f1");
                    Report report = new Report(distance, burnedFuel);
                    System.out.println("f2");
                    dataRepository.addNewReport(report);
                    break;
                case 2:
                    System.out.println("średnie spalanie wynosi" + dataRepository.averageFuelConsumption());
                case 4:
                    dataRepository.displyAllReports();
                    break;
            }
        } while (choice != 3);
    }
}
