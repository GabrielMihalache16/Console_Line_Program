import java.util.ArrayList;
import java.util.List;

public class LogicalOperation {public List<Integer> getPopulatedList(int max) {
    List<Integer> myList = new ArrayList<>();
    for (int i = 1; i <= max; i++) {
        myList.add(i);
    }
    return myList;
}
    //Cerinta 1
    //Scrieti o metoda Java, care sa primeasca parametru o Lista,
    //si sa afiseze, pe rand, toate valorile din lista, fiecare pe rand nou.
    public void getPopulatedList1(int max) {
        List<Integer> myList = new ArrayList<>();
        for (int i = 1; i <= max; i++) {
            myList.add(i);
            System.out.println(i + "");
        }
    }

    // Cerinta 2
    // Scrieti o metoda Java, care sa primeasca doi parametrii:
    // un parametru sa fie o lista de numere, si celalalt un numar (real sau intreg).
    // Metoda sa adauge numarul primit ca si parametru la final de lista.
    public List<Integer> addNumberToEnd(List<Integer> myList, int number){
        myList.add(number);
        return myList;
    }

    // Cerinta 3
    // Scrieti o metoda Java, care sa primeasca doi parametrii:
    // un parametru de tip Lista, iar celalalt un numar intreg.
    // Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista,
    // fiecare pe rand nou, pornind de la numarul intreg primit ca si parametru.
    public void printListFromNumber (List<Integer> myList, int number){
        for (int i = number; i <= myList.size(); i++){
            System.out.println(myList.get(i-1));
        }
    }

    //Cerinta 4
    //Scrieti o metoda Java, care sa primeasca parametru o Lista,
    //si sa afiseze, pe rand, toate valorile din lista, dar invers(de la capat la inceput).
    public void invertList(List <Integer> myList){
        for (int i = 0, j = myList.size() - 1; i < j; i++) {
            myList.add(i, myList.remove(j));
        }
        System.out.println(myList);
    }

    //Cerinta 5
    public List<String> addString(List <String> x, String z, int y){
        for (int i = 0; i < x.size(); i++){
            i = y;
            x.add(i, z);
            break;
        }
        return x;
    }

    //Cerinta 6
    public List<Integer> firstPosition(List<Integer> x, int y){
        x.add(0, y);
        return x;
    }

    //Cerinta 7
    public void cerinta7(List<Integer> myList) {
        for (int i = 0; i < myList.size(); i++) {
            int val = myList.get(i);
            System.out.println("Pe pozitia " + i + ", valoarea este " + val);
        }
    }

    //Cerinta 8
    public int cerinta8(List<Integer> myList){
        int max = 0;
        for (int i=0 ; i< myList.size(); i++){
            if(myList.get(i) > max){
                max = myList.get(i);
            }
        } return max;
    }

    //Tema LISTS - OPTIONALA
    //Cerinta 1
    public List<Integer> optionala1(List<Integer> myList, int x, int y){
        int temp;
        int temp2;
        for (int i = 0; i < myList.size(); i++) {
            for (int j = 0; j < myList.size(); j++){
                if(i == x && j == y){
                    temp = myList.get(i);
                    temp2 = myList.get(j);
                    myList.add(j, temp);
                    myList.add(i, temp2);
                    myList.remove(x+2);
                    myList.remove(y+1);
                }
            }
        }
        return myList;
    }

    //Cerinta 2 optionala
    public List<Integer> opt2(List<Integer> x){
        int temp;
        for (int i = 0; i < x.size(); i++){
            temp = x.get(i);
            if (temp % 2 != 0){
                x.remove(i);
            }
        }
        return x;
    }

    public List<Integer> sortareLista(List<Integer> x){
        int temp;
        int temp2;
        int var;
        int var2;

        for (int i = 0; i < x.size(); i++){
            for (int j = i+1; j < x.size(); j++){
                temp = x.get(i);
                temp2 = x.get(j);
                if (temp > temp2){
                    var = temp;
                    var2 = temp2;
                    x.add(i, temp2);
                    x.add(j, var);
                    x.remove(i+1);
                    x.remove(j+1);
                }
            }
        }
        return x;
    }

//    public List<Integer> sortareLista(int x, int y, int z){
//        List<Integer> myList = new ArrayList<>();
//        myList.add(x);
//        myList.add(y);
//        myList.add(z);
//        int temp;
//        int temp2;
//        int var;
//        int var2;
//
//
//        for (int i = 0; i < myList.size(); i++){
//            for (int j = i+1; j < myList.size(); j++){
//                temp = myList.get(i);
//                temp2 = myList.get(j);
//                if (temp > temp2){
//                    var = temp;
//                    var2 = temp2;
//                    myList.add(i, temp2);
//                    myList.add(j, var);
//                    myList.remove(i+1);
//                    myList.remove(j+1);
//                }
//            }
//        }
//        return myList;
//    }
}
