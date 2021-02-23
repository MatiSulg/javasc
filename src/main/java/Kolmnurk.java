public class Kolmnurk  implements Kuju{

    public float umbermoot(float raadius) {
        return 0;
    }

    public float pindala(float raadius) {
        return 0;
    }

    public static float umbermoot(float kuljepikkus1, float kuljepikkus2, float kuljepikkus3){
        return kuljepikkus1 + kuljepikkus2 + kuljepikkus3;
    }

    public float pindala(float raadius, float kuljepikkus1 , float kuljepikkus2 , float kuljepikkus3){
        return (umbermoot(kuljepikkus1 ,kuljepikkus2 ,kuljepikkus3) * raadius) / 2;
    }

    public int getVarv(){
        return varv;
    }

    static void parameetrid(float raadius, float kuljepikkus1 , float kuljepikkus2 , float kuljepikkus3, int värv){}

}
