import java.util.Arrays;
public class ArrayBilangan09 {
    public static void main(String[] args) throws Exception {
        int [] bil = new int[4];
        bil [0] =9;
        bil [1] =17;
        bil [2] =-3;
        bil [3] =29;
        for (int i = 0; i <=4; i++) {
            System.out.println("bil[" + i + "] = "+bil[i]);
        // System.out.println("bil[" + i + "] = " + bil[i] + ", double = " + (bil[i] * 2));
        }
        for (int nilai : bil) {
            System.out.println(nilai);
        }

        System.out.println(Arrays.toString(bil));

    }
}
