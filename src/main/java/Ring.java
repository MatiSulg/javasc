public class Ring implements Kuju{

    public static float umbermoot(float raadius){
        return (float)(2 * Math.PI * raadius);
    }

    public static float pindala(float raadius){
        return (float)(Math.PI * Math.pow(raadius, raadius));
    }

    public float umbermoot(float kuljepikkus1, float kuljepikkus2, float kuljepikkus3) {
        return 0;
    }

    public float pindala(float raadius, float kuljepikkus1, float kuljepikkus2, float kuljepikkus3) {
        return 0;
    }

    public int getVarv(){
        return varv;
    }

    static void parameetrid(float raadius, float kuljepikkus, int värv){}
}
