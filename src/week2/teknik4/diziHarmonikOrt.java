package week2.teknik4;

public class diziHarmonikOrt {
    public static void main(String[] args) {
        int[] dizi = {1, 2, 3, 4, 5};

        double harmonikSeri = 0.0;
        for (int i = 0; i < dizi.length; i++) {
            harmonikSeri += 1.0 / dizi[i];
        }

        double harmonikOrtalama = dizi.length / harmonikSeri;

        System.out.println("Dizinin harmonik ortalaması: " + harmonikOrtalama);
    }
}


