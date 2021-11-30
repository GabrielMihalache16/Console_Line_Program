public class ProgramStart extends MenuOptions{
    ReadFromKeyboard read = new ReadFromKeyboard();
    Converter conv = new Converter();
    public void printMenu(){
        System.out.println("Hello!\n" +
                "Please select an option:\n" +
                "1. Sum\n" +
                "2. Subtraction\n" +
                "3. Temperature convertion\n" +
                "4. Distance convertion\n" +
                "5. Print a robot face\n" +
                "6. Print Java?\n" +
                "7. Multiplication\n" +
                "8. Division\n"+
                "9. Average\n"+
                "10. Sort a list\n"+
                "0. Exit\n"

        );
    }

    public boolean runMenuOption(){
        printMenu();
        int option = read.getInt();
        switch (option){
            case 0:
                System.out.println("Bye bye.");
                return false;
            case 1:
                doSum();
                return true;
            case 2:
                doSubtract();
                return true;
            case 3:
                changeTemperature();
                return true;
            case 4:
                distanceInMeters();
                return true;
            case 5:
                printRobot();
                return true;
            case 6:
                printJava();
                return true;
            case 7:
                multiply();
                return true;
            case 8:
                division();
                return true;
            case 9:
                getAverage();
                return true;
            case 10:
                sortList();
                return true;
            default:
                System.out.println(Messages.INCORRECT_OPTION);
                return true;
        }
    }

    public void runProgram(){
        boolean repeatProgram;
        do {
            repeatProgram = runMenuOption();
        }while (repeatProgram);
    }
    }
