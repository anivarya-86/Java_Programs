package again;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMap {
    public static void main(String[] args) {
        // Key-Value pairs standard syntax
        Map<String , String> countryMap = new HashMap<>();
        countryMap.put("Bharat" , "New Delhi");
        countryMap.put("Nepal" , "Kathmandu");
        countryMap.put("China" , "Beijing");
        countryMap.put("Pakistan" , "Islamabad");
        countryMap.put("Bangladesh" , "Dhaka");

        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Country Name: ");
        String country = input.next(); // Single word ke liye bilkul sahi hai

        // Check karna ki key map mein maujood hai ya nahi
        if (countryMap.containsKey(country)) {
            // countryMap.get(country) se us country ki capital (value) nikalegi
            System.out.printf("Capital of %s is %s\n", country, countryMap.get(country));
        } else {
            System.out.println("Sorry, we don't know the capital of this country.");
        }
    }
}