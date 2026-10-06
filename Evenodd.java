import java.util.Scanner;
public class Evenodd {
    public static void main(String[] args){
        try( Scanner sc = new Scanner(System.in)){
            System.out.print("enter a number:");
            int n = sc.nextInt();
            if(n%2==0){
                System.out.println("The number is even");
            }
            else{
                System.out.println("The number is odd");
            }
        }
    }
    
}
