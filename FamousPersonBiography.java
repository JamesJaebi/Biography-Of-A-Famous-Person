import java.util.Scanner;

public class FamousPersonBiography {
    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);

        // Details
        System.out.print("Enter the name of the famous person: ");
        String name = scanner.nextLine();  

        System.out.print("Enter the date of birth of " + name + " (e.g.,Month-Day-Year): ");
        String birthDate = scanner.nextLine(); 

        System.out.print("Enter the birthplace of " + name + ": ");
        String birthplace = scanner.nextLine(); 

        System.out.print("Enter the profession of " + name + ": ");
        String profession = scanner.nextLine(); 

        System.out.print("Enter some achievements of " + name + ": ");
        String achievements = scanner.nextLine();  

        System.out.print("What is " + name + " known for or what significant thing did they create? ");
        String knownFor = scanner.nextLine(); 

        
        System.out.print("Enter the date of death of " + name + " (e.g.,Month-Day-Year): ");
        String deathDate = scanner.nextLine(); 

        System.out.print("Where did " + name + " receive their education? ");
        String education = scanner.nextLine(); 

        System.out.print("Who were the key influences on " + name + "'s work or ideas? ");
        String influences = scanner.nextLine(); 

        System.out.print("What is the lasting legacy of " + name + "? ");
        String legacy = scanner.nextLine(); 
        
        
        System.out.println("\n--- Biography of " + name + " ---");
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + birthDate);
        System.out.println("Birthplace: " + birthplace);
        System.out.println("Profession: " + profession);
        System.out.println("Achievements: " + achievements);
        System.out.println("Known for: " + knownFor);
        System.out.println("Date of Death: " + deathDate);
        System.out.println("Education: " + education);
        System.out.println("Key Influences: " + influences);
        System.out.println("Legacy: " + legacy);


        scanner.close();
    }
}
