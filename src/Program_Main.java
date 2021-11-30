public class Program_Main {
    public static void main(String[] args) {
        LogicalOperation op = new LogicalOperation();
        Random rdm = new Random();
        Converter cnv = new Converter();
        Calculator clc = new Calculator();
        Messages msg = new Messages();

            ProgramStart ps = new ProgramStart();
            Login login = new Login();
        System.out.println(msg.SYSTEM_CREDENTIALS);
        System.out.println(msg.PRE_LOGIN);
            if (login.loginSuccessful()) {
                ps.runProgram();

            }
    }
}

