public class Converter {
    //temperatura din F in C
    public static double temperatura(double F){
        return 5F/9 * (F -32);
    }

    //Inch in metri
    public static float distantaMetri(float I){
        return I / 39.3700787F;
    }

    //Distanta in metri + timp => viteza in m/s, km/h si mile/h
    public static void distantaConv(float distanta, int hr, int min, int sec) {
        float timpSecunde;
        float mps, kph, mph;

        timpSecunde = (hr*3600) + (min*60) + sec;
        mps = distanta / timpSecunde;
        kph = ( distanta/1000F ) / ( timpSecunde/3600F );
        mph = kph / 1.609F;

        System.out.println(mps);
        System.out.println(kph);
        System.out.println(mph);
    }
}
