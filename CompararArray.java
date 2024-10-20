import java.util.Arrays;

public class CompararArray {
    public static void main(String[] args) {
        int[] primerArray = {1, 2, 3, 4, 5};
        int[] segundoArray = {1, 2, 3, 4, 5};

        if (Arrays.equals(primerArray, segundoArray)) {
            System.out.println("Los dos arrays son iguales.");
        } else {
            System.out.println("Los dos arrays son diferentes.");
        }
    }
}
