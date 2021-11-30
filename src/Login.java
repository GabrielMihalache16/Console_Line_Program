import java.util.Scanner;
public class Login {
    Messages msg = new Messages();
    public boolean isLoggedIn(){
        Scanner scan = new Scanner(System.in);
        String username = "Gabi";
        String password = "parola11";

        String givenUsername = scan.next();
        String givenPassword = scan.next();

        if (username.equals(givenUsername) && password.equals(givenPassword)){
            System.out.println(msg.PASS_LOGIN);
            return true;
        }else {
            System.out.println(msg.FAIL_LOGIN);
            return false;
        }
    }

    public boolean loginSuccessful(){
        boolean repeat;
        int count = 0;
        do {
            repeat = isLoggedIn();
            count++;
        }while (!repeat && count <=3);
        return repeat;
    }
}
