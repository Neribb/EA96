    public static int hourglassSum(List<List<Integer>> arr) {
        int maxSum = Integer.MIN_VALUE;  // Inicializamos maxSum

        // Iteramos sobre las posiciones posibles de la parte superior izquierda del "reloj de arena"
        for (int i = 0; i < 4; i++) {  // 0, 1, 2, 3 (para un array de 6x6)
            for (int j = 0; j < 4; j++) {  // 0, 1, 2, 3 (para un array de 6x6)
                // Calculamos la suma de un "reloj de arena"
                int suma = arr.get(i).get(j) +
                           arr.get(i).get(j + 1) +
                           arr.get(i).get(j + 2) +
                           arr.get(i + 1).get(j + 1) +
                           arr.get(i + 2).get(j) +
                           arr.get(i + 2).get(j + 1) +
                           arr.get(i + 2).get(j + 2);

                // Actualizamos maxSum si la suma del reloj de arena es mayor
                if (suma > maxSum) {
                    maxSum = suma;
                }
            }
        }

        return maxSum;
    }

}