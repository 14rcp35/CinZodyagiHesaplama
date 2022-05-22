import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int birthOfYear,situation;
        System.out.print("Enter your birth year : ");
        Scanner scanner = new Scanner(System.in);
        birthOfYear = scanner.nextInt();
        situation= birthOfYear % 12;
        switch (situation){
            case 0:
                System.out.println("Your chinese zodiac sign is monkey");
                break;
            case 1:
                System.out.println("Your chinese zodiac sign is cockerel");
                break;
            case 2:
                System.out.println("Your chinese zodiac sign is dog");
                break;
            case 3:
                System.out.println("Your chinese zodiac sign is pig");
                break;
            case 4:
                System.out.println("Your chinese zodiac sign is rat");
                break;
            case 5:
                System.out.println("Your chinese zodiac sign is ox");
                break;
            case 6:
                System.out.println("Your chinese zodiac sign is tiger");
                break;
            case 7:
                System.out.println("Your chinese zodiac sign is rabbit");
                break;
            case 8:
                System.out.println("Your chinese zodiac sign is dragon");
                break;
            case 9:
                System.out.println("Your chinese zodiac sign is snake");
                break;
            case 10:
                System.out.println("Your chinese zodiac sign is horse");
                break;
            case 11:
                System.out.println("Your chinese zodiac sign is goat");
                break;
        }

    }
}
