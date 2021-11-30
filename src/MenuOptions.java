import java.util.ArrayList;
import java.util.List;

public class MenuOptions {
    Calculator calc = new Calculator();
    Converter cnv = new Converter();
    ReadFromKeyboard read = new ReadFromKeyboard();
    Random rnd = new Random();
    LogicalOperation op = new LogicalOperation();

    public void doSum(){
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("The sum is: "+
                calc.sum(first, second));
    }

    public void doSubtract(){
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("The subtraction is: "+
                calc.scadere(first, second));
    }

    public void changeTemperature(){
        double gradeF = read.getInt();
        System.out.println("Celsius degrees are: " +
                cnv.temperatura(gradeF));
    }

    public void distanceInMeters(){
        float Inch = read.getInt();
        System.out.println("Distanta convertita din inch in metri este: " +
                cnv.distantaMetri(Inch));
    }

    public void distanceConverter(){
        float distance = read.getInt();
        int hr = read.getInt();
        int min = read.getInt();
        int sec = read.getInt();
        System.out.println("The received distance is of "+ distance + "meters." +
                "\nThe time you specified is: "+hr+ " hours" +min+ "minutes"+sec+
                "seconds.");
        }

    public void printRobot(){
        System.out.println(rnd.robot());
    }

    public void printJava(){
        System.out.println(rnd.printJAVA());
    }

    public void multiply(){
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("Multiplying the numbers..\n3\n2\n1\nPoof!\nYour number is: "+
                calc.inmultire(first, second));
    }

    public void division(){
        int first = read.getInt();
        int second = read.getInt();
        System.out.println("Dividing the numbers..\n3\n2\n1\nPoof!\nYour number is: "+
                calc.impartire(first, second));
    }

    public void getAverage(){
        int first = read.getInt();
        int second = read.getInt();
        int third = read.getInt();
        System.out.println("Dividing the numbers..\n3\n2\n1\nPoof!\nYour number is: "+
                calc.average(first, second, third));
    }

    public void sortList(){
        int first = read.getInt();
        int second = read.getInt();
        int third = read.getInt();
        List<Integer> myList = new ArrayList<>();
        myList.add(first);
        myList.add(second);
        myList.add(third);
        System.out.println("Your list is: "+ myList);
        op.sortareLista(myList);
        System.out.println("Your sorted list is: "+ myList);
    }
}
