/**
 * Clase para generar todos los números primos de 1 hasta
 * un número máximo especificado por el usuario. Como
 * algoritmo se utiliza la criba de Eratóstenes.
 */
package numerosprimos;

public class CribaEratostenes {

    /**
     * Generar números primos de 1 a max
     *
     * @param max es el valor máximo
     * @return Vector de números primos
     */
    public static int[] generarPrimos(int max) {
        if (max >= 2) {
            int dimensionesArray = max + 1, contadorPrimos = 0;
            boolean[] esPrimo = new boolean[dimensionesArray];
            esPrimo = inicializarArray(dimensionesArray, esPrimo);
            contadorPrimos = cuentaPrimos(contadorPrimos, dimensionesArray, esPrimo);
            int[] primos = new int[contadorPrimos];
            primos = guardarPrimosArray(primos, dimensionesArray, esPrimo);
            return primos;
        } else {
            return new int[0];
        }
    }

    public static boolean[] inicializarArray(int dimensionesArray, boolean[] esPrimo) {
        for (int i = 2; i < dimensionesArray; i++) {
            esPrimo[i] = true;
        }
        for (int i = 2; i < Math.sqrt(dimensionesArray) + 1; i++) { // Eliminar múltiplos
            if (esPrimo[i]) {
                for (int j = 2 * i; j < dimensionesArray; j += i) {
                    esPrimo[j] = false;
                }
            }
        }
        return esPrimo;
    }

    public static int cuentaPrimos(int contadorPrimos, int dimensionesArray, boolean[] esPrimo) {
        for (int i = 0; i < dimensionesArray; i++) {
            if (esPrimo[i]) {
                contadorPrimos++;
            }
        }
        return contadorPrimos;
    }

    public static int[] guardarPrimosArray(int[] primos, int dimensionesArray, boolean[] esPrimo) {
        for (int i = 0, j = 0; i < dimensionesArray; i++) {
            if (esPrimo[i]) {
                primos[j++] = i;
            }
        }
        return primos;
    }

}