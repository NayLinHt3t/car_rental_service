import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.print("Choose Mode:");
            String cusType = input.nextLine();
            if(cusType.equals("1")){
                Member member = new Member();
                member.Login();

            }else if(cusType.equals("2")){
                Guest guest = new Guest();
            }else{
                System.out.println("Choose 1 or 2");
            }
        }
    }
