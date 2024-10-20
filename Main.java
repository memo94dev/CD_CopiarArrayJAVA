import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] copiedArray;

        // Técnica 1: Usando un operador de asignación
        copiedArray = originalArray;

        System.out.println("Técnica 1 - Operador de asignación:");
        System.out.println("Original: " + Arrays.toString(originalArray));
        System.out.println("Copia: " + Arrays.toString(copiedArray));
        System.out.println();

        // Técnica 2: Iterando a través de cada elemento del array uno por uno
        copiedArray = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }

        System.out.println("Técnica 2 - Iteración uno por uno:");
        System.out.println("Original: " + Arrays.toString(originalArray));
        System.out.println("Copia: " + Arrays.toString(copiedArray));
        System.out.println();

        // Técnica 3: Utilizando el método clone
        copiedArray = originalArray.clone();

        System.out.println("Técnica 3 - Método clone:");
        System.out.println("Original: " + Arrays.toString(originalArray));
        System.out.println("Copia: " + Arrays.toString(copiedArray));
        System.out.println();

        // Técnica 4: Utilizando el método arraycopy
        copiedArray = new int[originalArray.length];
        System.arraycopy(originalArray, 0, copiedArray, 0, originalArray.length);

        System.out.println("Técnica 4 - Método arraycopy:");
        System.out.println("Original: " + Arrays.toString(originalArray));
        System.out.println("Copia: " + Arrays.toString(copiedArray));
    }
}