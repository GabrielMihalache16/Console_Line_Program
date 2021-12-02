import java.sql.Array;

public class Program_Main {
    public static void main(String[] args) {
        LogicalOperation op = new LogicalOperation();
        MenuOptions mop = new MenuOptions();
        Random rdm = new Random();
        Converter cnv = new Converter();
        Calculator clc = new Calculator();
        Messages msg = new Messages();
        ReadFromKeyboard read = new ReadFromKeyboard();

//            ProgramStart ps = new ProgramStart();
//            Login login = new Login();
//        System.out.println(msg.SYSTEM_CREDENTIALS);
//        System.out.println(msg.PRE_LOGIN);
//            if (login.loginSuccessful()) {
//                ps.runProgram();
//
//            }


        int[] array = op.populateArray(10);
        op.getPositionValue(array, 5);

        System.out.println(read.getList());

    }
}

