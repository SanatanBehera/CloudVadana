package CloudVadana;
import java.util.Random;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};

        shuffleTheArray(a);

        for (int num : a) {
            System.out.print(num + " ");
        }
    }

    public static void shuffleTheArray(int[] ar) {
        Random rn = new Random();

        for (int i = ar.length - 1; i > 0; i--) {
        	int ran= rn.nextInt(ar.length);
			int temp= ar[ran];
            ar[ran] = ar[i];
            ar[i] = temp;
        }
    }
}
