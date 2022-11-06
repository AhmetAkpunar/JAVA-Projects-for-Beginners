import java.util.Scanner;

public class AirPlaneTicket {
    static Scanner scan = new Scanner(System.in);

    static int age;
    static double totalFee;
    static int choice;

    /*
    Write a airplane ticket programme
    Ask client City and Age
    THEN
    If Client wants to fly from city A to
    -- city B (is far from 500 miles)
    -- city C (is far from 700 miles)
    -- city D (is far from 900 miles)
    -- fee is 0.10$ per mile
    if client is
    -- under 12 50% discount
    -- between 12 and 24 10% discount
    -- above 65 30 % discount
    Furthermore if client buy return ticket make 20% discount too.

 */

    public static void main(String[] args) {

        mainScreen();
    }
    static void mainScreen(){
        System.out.println("1- One way\n2- Return");
        System.out.print("Make a choice please: ");
        choice = scan.nextInt();

        if (choice == 1) {

            String city1 = scan.nextLine();
            feeCalculatorOneWay(city1);

        } else if (choice ==2) {

            String city2 = scan.nextLine();
            feeCalculatorReturn(city2);
        }
    }
    static void feeCalculatorOneWay(String city){

        System.out.println("Where would you like to fly?" +
                "\nB - C - D write the letter");

        city = scan.nextLine();

        if (city.equalsIgnoreCase("b")) {

            totalFee +=(500*0.1);
            ageDiscount(age);

        } else if (city.equalsIgnoreCase("c")) {

            totalFee +=(700*0.1);
            ageDiscount(age);

        }else if (city.equalsIgnoreCase("d")) {

            totalFee += (900*0.1);
            ageDiscount(age);
        }
        System.out.println("Total fee:  " + totalFee +"$");
    }
    static void feeCalculatorReturn(String city){
        System.out.println("Where would you like to fly?" +
                "\nB - C - D write the letter");

        city = scan.nextLine();


        if (city.equalsIgnoreCase("b")) {

            totalFee += (2*500*0.1);
            ageDiscount(age);

        } else if (city.equalsIgnoreCase("c")) {

            totalFee += (2*700*0.1);
            ageDiscount(age);

        }else if (city.equalsIgnoreCase("d")) {

            totalFee += (2*900*0.1);
            ageDiscount(age);
        }

        System.out.println("Total fee:  " +(totalFee *0.8) +"$");
    }
    static double ageDiscount(int age){
        System.out.print("Write your age:   ");
        age = scan.nextInt();

        if (age < 12) {

            totalFee *= 0.5;
        } else if ( age <= 24 ) {

            totalFee *= 0.9;
        } else if (age > 65) {

            totalFee *= 0.7;
        }
        return totalFee;
    }
}
