import java.util.Scanner;

// ABSTRACTION
abstract class Jeepney {

    // ENCAPSULATION
    private String jeepneyType;
    private String route;
    private String passengerType;

    public Jeepney(String jeepneyType, String route,
                   String passengerType) {

        this.jeepneyType = jeepneyType;
        this.route = route;
        this.passengerType = passengerType;
    }

    public String getJeepneyType() {
        return jeepneyType;
    }

    public String getRoute() {
        return route;
    }

    public String getPassengerType() {
        return passengerType;
    }

    // POLYMORPHISM
    public abstract double calculateFare();

    public void displayInfo() {
        System.out.println("\n========= FARE DETAILS =========");
        System.out.println("Jeepney Type: " + jeepneyType);
        System.out.println("Route: " + route);
        System.out.println("Passenger Type: " + passengerType);
        System.out.printf("Fare: PHP %.2f%n", calculateFare());
    }
}


// INHERITANCE to BAUAN
class Bauan extends Jeepney {

    public Bauan(String route, String type) {
        super("Bauan", route, type);
    }

    @Override
    public double calculateFare() {

        if (getRoute().equalsIgnoreCase("Sta. Rita to Batangas")) {
            return getPassengerType().equalsIgnoreCase("Regular")
                    ? 15.00 : 12.00;
        }

        else if (getRoute().equalsIgnoreCase("Batangas to Bauan")) {
            return getPassengerType().equalsIgnoreCase("Regular")
                    ? 21.00 : 18.00;
        }

        else if (getRoute().equalsIgnoreCase("Batangas to Sports Complex")) {
            return getPassengerType().equalsIgnoreCase("Regular")
                    ? 15.00 : 12.00;
        }

        return 0;
    }
}


// INHERITANCE to ALANGILAN

class Alangilan extends Jeepney {

    public Alangilan(String route, String type) {
        super("Alangilan", route, type);
    }

    @Override
    public double calculateFare() {

        if (getRoute().equalsIgnoreCase("Batangas to Alangilan")) {
            return getPassengerType().equalsIgnoreCase("Regular")
                    ? 15.00 : 12.00;
        }

        else if (getRoute().equalsIgnoreCase("Batangas to SM Hyper")) {
            return getPassengerType().equalsIgnoreCase("Regular")
                    ? 15.00 : 12.00;
        }

        return 0;
    }
}


// INHERITANCE to BALAGTAS
class Balagtas extends Jeepney {

    public Balagtas(String route, String type) {
        super("Balagtas", route, type);
    }

    @Override
    public double calculateFare() {

        if (getRoute().equalsIgnoreCase("Batangas to Balagtas")) {
            return getPassengerType().equalsIgnoreCase("Regular")
                    ? 17.00 : 14.00;
        }

        else if (getRoute().equalsIgnoreCase("Batangas to Grand Terminal")) {
            return getPassengerType().equalsIgnoreCase("Regular")
                    ? 17.00 : 14.00;
        }

        else if (getRoute().equalsIgnoreCase("Batangas to Alangilan")) {
            return getPassengerType().equalsIgnoreCase("Regular")
                    ? 15.00 : 12.00;
        }

        else if (getRoute().equalsIgnoreCase("Batangas to SM Hyper")) {
            return getPassengerType().equalsIgnoreCase("Regular")
                    ? 15.00 : 12.00;
        }

        return 0;
    }
}

// INHERITANCE to CAPITOLIO
class Capitolio extends Jeepney {

    public Capitolio(String route, String type) {
        super("Capitolio", route, type);
    }

    @Override
    public double calculateFare() {

        if (getRoute().equalsIgnoreCase("Capitolio to SM Batangas")) {
            return getPassengerType().equalsIgnoreCase("Regular")
                    ? 15.00 : 12.00;
        }

        return 0;
    }
}

// MAIN CLASS

public class JeepneyFare {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {

            String jeepney = "";
            String route = "";
            String passengerType = "";
            int routeChoice = 0;

            // JEEPNEY SELECTION WITH VALIDATION

            while (true) {

                System.out.println("\n========================================");
                System.out.println("TRANSPORTATION FARE AROUND BATANGAS CITY");
                System.out.println("========================================");

                System.out.println("\nAVAILABLE JEEPNEYS:");
                System.out.println("=====================");
                System.out.println("Bauan");
                System.out.println("Alangilan");
                System.out.println("Balagtas");
                System.out.println("Capitolio");
                System.out.print("\nEnter Jeepney Type: ");

                jeepney = input.nextLine().trim();

                if (jeepney.equalsIgnoreCase("Bauan")) {
                    jeepney = "Bauan";
                    break;
                }

                else if (jeepney.equalsIgnoreCase("Alangilan")) {
                    jeepney = "Alangilan";
                    break;
                }

                else if (jeepney.equalsIgnoreCase("Balagtas")) {
                    jeepney = "Balagtas";
                    break;
                }

                else if (jeepney.equalsIgnoreCase("Capitolio")) {
                    jeepney = "Capitolio";
                    break;
                }

                else {
                    System.out.println("\nInvalid Jeepney Type!");
                    System.out.println("Please choose from the available jeepneys.");
                }
            }

            // ROUTE SELECTION WITH VALIDATION

            boolean validRoute = false;

            while (!validRoute) {

                // BAUAN ROUTES
                if (jeepney.equalsIgnoreCase("Bauan")) {

                    System.out.println("\n===================== BAUAN JEEPNEY ROUTES =======================");
                    System.out.println("1. Sta. Rita to Batangas -        15.00 (Regular) / 12.00 (Student)");
                    System.out.println("2. Batangas to Bauan -            21.00 (Regular) / 18.00 (Student)");
                    System.out.println("3. Batangas to Sports Complex -   15.00 (Regular) / 12.00 (Student)");
                    System.out.println("==================================================================");
                }

                // ALANGILAN ROUTES
                else if (jeepney.equalsIgnoreCase("Alangilan")) {

                    System.out.println("\n===================== ALANGILAN JEEPNEY ROUTES =======================");
                    System.out.println("1. Batangas to SM Hyper -         15.00 (Regular) / 12.00 (Student)");
                    System.out.println("2. Batangas to Alangilan -        15.00 (Regular) / 12.00 (Student)");
                    System.out.println("======================================================================");
                }

                // BALAGTAS ROUTES
                else if (jeepney.equalsIgnoreCase("Balagtas")) {

                    System.out.println("\n===================== BALAGTAS JEEPNEY ROUTES ========================");
                    System.out.println("1. Batangas to SM Hyper -         15.00 (Regular) / 12.00 (Student)");
                    System.out.println("2. Batangas to Grand Terminal -   17.00 (Regular) / 14.00 (Student)");
                    System.out.println("3. Batangas to Balagtas -         17.00 (Regular) / 14.00 (Student)");
                    System.out.println("4. Batangas to Alangilan -        15.00 (Regular) / 12.00 (Student)");
                    System.out.println("======================================================================");
                }

                // CAPITOLIO ROUTES
                else if (jeepney.equalsIgnoreCase("Capitolio")) {

                    System.out.println("\n===================== CAPITOLIO JEEPNEY ROUTES =======================");
                    System.out.println("1. Capitolio to SM Batangas -     15.00 (Regular) / 12.00 (Student)");
                    System.out.println("======================================================================");
                }

                System.out.print("\nSelect Route Number: ");

                try {
                    routeChoice = Integer.parseInt(input.nextLine().trim());
                }

                catch (NumberFormatException e) {
                    System.out.println("\nInvalid input! Please enter a number.");
                    continue;
                }

                // CHECK BAUAN ROUTE
                if (jeepney.equalsIgnoreCase("Bauan")) {

                    switch (routeChoice) {

                        case 1:
                            route = "Sta. Rita to Batangas";
                            validRoute = true;
                            break;

                        case 2:
                            route = "Batangas to Bauan";
                            validRoute = true;
                            break;

                        case 3:
                            route = "Batangas to Sports Complex";
                            validRoute = true;
                            break;

                        default:
                            System.out.println("\nInvalid route number! Please try again.");
                    }
                }

                // CHECK ALANGILAN ROUTE
                else if (jeepney.equalsIgnoreCase("Alangilan")) {

                    switch (routeChoice) {

                        case 1:
                            route = "Batangas to SM Hyper";
                            validRoute = true;
                            break;

                        case 2:
                            route = "Batangas to Alangilan";
                            validRoute = true;
                            break;

                        default:
                            System.out.println("\nInvalid route number! Please try again.");
                    }
                }

                // CHECK BALAGTAS ROUTE
                else if (jeepney.equalsIgnoreCase("Balagtas")) {

                    switch (routeChoice) {

                        case 1:
                            route = "Batangas to SM Hyper";
                            validRoute = true;
                            break;

                        case 2:
                            route = "Batangas to Grand Terminal";
                            validRoute = true;
                            break;

                        case 3:
                            route = "Batangas to Balagtas";
                            validRoute = true;
                            break;

                        case 4:
                            route = "Batangas to Alangilan";
                            validRoute = true;
                            break;

                        default:
                            System.out.println("\nInvalid route number! Please try again.");
                    }
                }

                // CHECK CAPITOLIO ROUTE
                else if (jeepney.equalsIgnoreCase("Capitolio")) {

                    switch (routeChoice) {

                        case 1:
                            route = "Capitolio to SM Batangas";
                            validRoute = true;
                            break;

                        default:
                            System.out.println("\nInvalid route number! Please try again.");
                    }
                }
            }

            // PASSENGER TYPE WITH VALIDATION

            while (true) {

                System.out.println("\n     ===== PASSENGER TYPE =====");
                System.out.println("Regular");
                System.out.println("Student/PWD");

                System.out.print("\nEnter Passenger Type: ");

                passengerType = input.nextLine().trim();

                if (passengerType.equalsIgnoreCase("Regular")) {
                    passengerType = "Regular";
                    break;
                }

                else if (passengerType.equalsIgnoreCase("Student")) {
                    passengerType = "Student";
                    break;
                }

                else {
                    System.out.println("\nInvalid Passenger Type!");
                    System.out.println("Please enter Regular or Student/PWD.");
                }
            }

            // CREATE JEEPNEY OBJECT

            Jeepney selectedJeepney;

            if (jeepney.equalsIgnoreCase("Bauan")) {
                selectedJeepney = new Bauan(route, passengerType);
            }

            else if (jeepney.equalsIgnoreCase("Alangilan")) {
                selectedJeepney = new Alangilan(route, passengerType);
            }

            else if (jeepney.equalsIgnoreCase("Balagtas")) {
                selectedJeepney = new Balagtas(route, passengerType);
            }

            else {
                selectedJeepney = new Capitolio(route, passengerType);
            }

            // FARE PAYMENT WITH VALIDATION

            double fare = selectedJeepney.calculateFare();
            double amountPaid = 0;

            while (true) {

                System.out.println("\n================================");
                System.out.println("          FARE PAYMENT");
                System.out.println("================================");

                System.out.printf("Required Fare: PHP %.2f%n", fare);

                System.out.print("Enter Amount Paid: PHP ");

                try {

                    amountPaid = Double.parseDouble(input.nextLine().trim());

                    if (Double.isNaN(amountPaid) ||
                        Double.isInfinite(amountPaid) ||
                        amountPaid < 0) {

                        System.out.println("\nInvalid payment amount! Please try again.");
                    }

                    else if (amountPaid < fare) {

                        System.out.println("\nInsufficient Payment!");
                        System.out.printf("Please pay at least PHP %.2f%n", fare);
                    }

                    else {
                        break;
                    }

                }

                catch (NumberFormatException e) {
                    System.out.println("\nInvalid amount! Please enter a valid number.");
                }
            }

            // CALCULATE CHANGE

            double change = amountPaid - fare;

            // DISPLAY EXPENSE SUMMARY

            System.out.println("\n================================");
            System.out.println("       EXPENSE SUMMARY");
            System.out.println("================================");

            selectedJeepney.displayInfo();

            System.out.println("--------------------------------");
            System.out.printf("Required Fare : PHP %.2f%n", fare);
            System.out.printf("Amount Paid   : PHP %.2f%n", amountPaid);
            System.out.printf("Change        : PHP %.2f%n", change);
            System.out.println("--------------------------------");

            System.out.println("Payment Status: PAID");
            System.out.println("Transaction Status: SUCCESSFUL");

            System.out.println("================================");

        }

        catch (Exception e) {

            System.out.println("\nUnexpected Error: " + e.getMessage());

        }

        finally {

            input.close();

            System.out.println("\n ");
        }
    }
}
