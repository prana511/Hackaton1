import java.util.Scanner;

public class WaterTotal3a {

    public static int calculateTotal(int morningUsage, int eveningUsage) {
        int total;
        total = morningUsage + eveningUsage;
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int morningUsage;
        int eveningUsage;
        int total;

            System.out.println("Enter morning usage");
            morningUsage = sc.nextInt();

          System.out.println("Enter evening usage");
           eveningUsage = sc.nextInt();


        total = calculateTotal(morningUsage, eveningUsage);

            System.out.println("Total water consumption is " + total + "liters");

           sc.close();
    }
}
