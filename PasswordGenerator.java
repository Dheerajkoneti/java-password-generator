import java.util.Random;
import java.util.Scanner;
public class passwordGenerator {
    public static void main(String args[]){
        Scanner  scanner = new Scanner(System.in);
        System.out.print("Enter Password Length: ");
        int Length = scanner.nextInt();
        String Characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"+"abcdefghijklmnopqrstuvwxyz"+"0123456789"+"!@#$%&*";
        Random random = new Random();
        String Password = " ";
        for(int i = 0;i<=Length;i++){
            int index=random.nextInt(Characters.length());
            Password = Password + Characters.charAt(index);
            System.out.println("Generated Password: "+Password);

        }
        scanner.close();


    }
    
}
