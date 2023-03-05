public class EjercicioCinco {
    //5.Retornar el número de la fila de la matriz cuya suma de todos sus elementos sea mayor.
    public static void main(String[] args) {
        int[][] m = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int filamayor= filaMayorSuma(m,0,0,0,0,0)+1;
        System.out.println("la fila con la suma mayor es :"+filamayor);
    }


    public static int filaMayorSuma(int[][] m, int i, int j, int mayorsuma, int filamayor, int sumaFila) {
        if (j==m[i].length-1){
            sumaFila += m[i][j];
            if(mayorsuma < sumaFila){
                mayorsuma = sumaFila;
                filamayor = i;
                sumaFila = 0;
                if (i == m.length - 1 ){
                    return filamayor;
                }
            }
            j=0;
            i++;
        } else {
            sumaFila += m[i][j];
            j++;
        }
        return filaMayorSuma(m, i , j, mayorsuma, filamayor,sumaFila);

    }
}

