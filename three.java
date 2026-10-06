import java.util.Scanner;
public class three {
    public static void main(String[] args){
        try( Scanner sc = new Scanner(System.in)){
            System.out.print("Enter a name:");
            String name = sc.next();
            System.out.println("You entered: " + name);
            System.out.print("Enter phone number:");
            String phone = sc.next();
            System.out.println("You entered: " + phone);
            System.out.print("Enter email:");
            String email = sc.next();
            System.out.println("You entered: " + email);
        }
    }
    
}
