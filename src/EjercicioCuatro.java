public class EjercicioCuatro {
        //4. Recorra el arreglo desde la primera posición hasta la última posición
        // y retorne el número de veces que se repite el elemento.  Parámetros: vector[]
        // (arreglo en el cual se encuentran los elementos),
        // inicio (es el inicio del vector), fin (es el fin del vector), elem (es el número a buscar dentro del arreglo)
        public static void main(String[] args) {
            int [] vector = {1,4,4,5,4,5};
            int repeticiones= numeroRepeticiones(vector,0, vector.length-1, 4);
            System.out.println(repeticiones);

        }
        public static int numeroRepeticiones (int vector[], int inicio, int fin, int elem){
                if (inicio >= fin) {
                    return 0;
                }
                int contador = 0;
                if (vector[inicio] == elem) {
                    contador += 1;
                }
                return contador + numeroRepeticiones(vector, inicio+1, fin, elem);

        }
    }

