import java.util.Scanner;

public class Member extends Customer{
    public void Login(){
        Scanner input = new Scanner(System.in);
        System.out.print("Username:");
        String username = input.nextLine();
        System.out.print("Password:");
        String password = input.nextLine();
        if(username.equals("nae") && password.equals("1234")){
            RentCar();
        }else{
            System.out.println("try Again");
            Login();
        }
    }
    private void RentCar(){
        System.out.println("rented car");
    }
}
