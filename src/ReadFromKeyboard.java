import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadFromKeyboard {
    Messages msg = new Messages();
    public int getInt() {
        int count = 0;
        do {
            Scanner scan = new Scanner(System.in);
            try {
                System.out.print("Please insert a number: ");
                return scan.nextInt();
            } catch (InputMismatchException error) {
                System.out.println(msg.INCORRECT_VALUE);
                count++;
            }
            if (count == 5){
                sleep(5);
                count = 0;
            }
        } while (true);
    }

    public String getString() {
        String count = "";
        do {
            Scanner scan = new Scanner(System.in);
            return scan.next();
        } while (true);
    }

    private void sleep(int seconds){
        System.out.print("Sleeping for: " );
        do {
            System.out.println(seconds);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            seconds --;
        }while (seconds > 0);

    }

    public int[] getArray(int size){
        int[] myArr = new int[size];
        System.out.println("Introdu valorile din array.");
        for (int i = 0; i < myArr.length; i++){
            myArr[i] = getInt();
        }
        return myArr;
    }
}
