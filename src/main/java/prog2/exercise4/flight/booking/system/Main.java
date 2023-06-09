import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String flightCompany="Flights-of-Fancy";
        Random random = new Random();
        int number = random.nextInt(90000)+10000;
        int i,j,k;
        i = (int) (Math.random() * 26 + 65);
        j = (int) (Math.random() * 26 + 65);
        k = (int) (Math.random() * 26 + 65);
        String flightID =(char)i+""+(char)j+""+number+""+(char)k;
        System.out.println("Please enter your full name here");
        Scanner getpassengerFullName = new Scanner(System.in);
        String passengerFullName = getpassengerFullName.nextLine();
        String tripSource ="NANJING";
        String sourceAirport ="NANJING LUKOU INTERNATIONAL AIRPORT";
        String tripDestination ="OULU";
        String destinationAirport ="OULU AIRPORT";
        System.out.println("Please enter your departureyear here");
        Scanner getdepartureyear = new Scanner(System.in);
        Integer departureyear = getdepartureyear.nextInt();
        if(departureyear<1000||departureyear>2100){
            System.out.println("Error!");
            System.exit(0);
        }
        System.out.println("Please enter your departuremonth here");
        Scanner getdeparturemonth = new Scanner(System.in);
        Integer departuremonth = getdeparturemonth.nextInt();
        if(departuremonth<1||departuremonth>12){
            System.out.println("Error!");
            System.exit(0);
        }
        System.out.println("Please enter your departureday here");
        Scanner getdepartureday = new Scanner(System.in);
        Integer departureday = getdepartureday.nextInt();
        if(departureday<1||departureday>31){
            System.out.println("Error!");
            System.exit(0);
        }
        String departureDate=departureyear+"-"+departuremonth+"-"+departureday;
        System.out.println("Please enter your returnyear here");
        Scanner getreturnyear = new Scanner(System.in);
        Integer returnyear = getreturnyear.nextInt();
        if(returnyear<departureyear){
            System.out.println("Error!");
            System.exit(0);
        }
        System.out.println("Please enter your returnmonth here");
        Scanner getreturnmonth = new Scanner(System.in);
        Integer returnmonth = getreturnmonth.nextInt();
        if(returnyear.equals(departureyear)&&returnmonth<departuremonth){
            System.out.println("Error!");
            System.exit(0);
        }
        if(returnmonth<1||returnmonth>12){
            System.out.println("Error!");
            System.exit(0);
        }
        System.out.println("Please enter your returnday here");
        Scanner getreturnday = new Scanner(System.in);
        Integer returnday = getreturnday.nextInt();
        if(departureyear.equals(returnyear)&&returnmonth.equals(departuremonth)){
            if(returnday<departureday) {
                System.out.println("Error!");
                System.exit(0);
            }
        }
        if(returnday<1||returnday>31){
            System.out.println("Error!");
            System.exit(0);
        }
        String returnDate=returnyear+"-"+returnmonth+"-"+returnday;
        //System.out.println(returnDate);
        System.out.println("Please enter the number of children accompanying you");
        Scanner getchildPassengers = new Scanner(System.in);
        Integer childPassengers = getreturnday.nextInt();
        if(childPassengers!=0){
            System.out.println("Error!");
            System.exit(0);
        }
        System.out.println("Please enter the number of adult passengers");
        Scanner getadultPassengers = new Scanner(System.in);
        Integer adultPassengers = getreturnday.nextInt();
        int totalPassengers = childPassengers + adultPassengers;
        int departingTicketPrice = 150;
        int returnTicketPrice = 100;
        int totalTicketPrice = departingTicketPrice + returnTicketPrice;
        int getticketnumber = random.nextInt(90000)+10000;
        int a = (int) (Math.random() * 26 + 65);
        String ticketNumber =(char)a+""+getticketnumber;
        System.out.println("Dear " + passengerFullName + ".Thank you for booking your flight with "+flightCompany +".");
        System.out.println("Following are the details of your booking and the trip:");
        System.out.println("Ticket Number: "+ticketNumber);
        System.out.println("From " + tripSource+ " to " + tripDestination);
        System.out.println("Date of departure: "+ departureDate);
        System.out.println("Date of return: " + returnDate);
        System.out.println("Total passengers: "+ totalPassengers);
        System.out.println("Total ticket price in Euros: " + totalTicketPrice);
    }
}
