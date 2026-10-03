import java.util.Scanner;

        public class HouseholdDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int familyMembers = 4;
        double waterConsumed = 450.75;
        int houseNumber = 102;
        char waterUsageStatus = 'A'; 
        
        System.out.println("--- Household Details ---");
        System.out.println("House Number: " + houseNumber);
        System.out.println("Number of Family Members: " + familyMembers);
        System.out.println("Water Consumed (Litres): " + waterConsumed);
        System.out.println("Water Usage Status: " + waterUsageStatus);
    }
}
        

    