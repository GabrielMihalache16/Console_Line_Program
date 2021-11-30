public class Calculator {
    public int sum(int a, int b){
        return a + b;
    }
    public float divide(float a, int b){
        return a / b;
    }
    public int calc1(int a, int b, int c){
        return a + b * c;
    }
    public float calc2(float a, int b, int c){
        return (a+b)%c;
    }
    public float calc3(float a, int b, int c, int d){
        return a+ (-b) * c / d;
    }
    public float calc4(float a, int b, int c, int d, int e, int f){
        return a+ b / c * d - e % f;
    }

    //Cerinta 2
    public int suma(int a, int b){
        int result = a + b;
        return result;
    }
    public int scadere (int a, int b){
        int result = a - b;
        return result;
    }
    public int inmultire (int a, int b){
        int result = a * b;
        return result;
    }
    public double impartire (int a, int b){
        double result = a / b;
        return result;
    }

    //Cerinta 4
    public float average(float a, int b, int c){
        return (a + b + c) / 3;
    }

    //Cerinta 6
    public int restul(int a, int b) {
        return a % b;
    }
}
