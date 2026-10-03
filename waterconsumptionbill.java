import java.util.Scanner;
class waterconsumptionbill{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        totalconsumption consumption = new totalconsumption();
        
        System.out.print("Enter water usage  (litres): ");
        int waterUsage = sc.nextInt();
        if (waterUsage < =500) {
            System.out.println("The water consumption bill is: Rs. 100");
        }
        else{
            System.out.println("The water consumption bill is: Rs. 200");
            
        }

    }
}