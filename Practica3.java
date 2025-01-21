//Primera
 public static int simpleArraySum(List<Integer> ar) {
    // Write your code here
int sum=0;
for(int i=0; i<ar.size(); i++){
    sum+=ar.get(i);
}
return sum;
    }
//Segunda
}
public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
List<Integer> result = new ArrayList<>();
int resultadoAlice = 0;
int resultadoBob = 0;

for(int i = 0; i < 3; i++){

    if(a.get(i) < b.get(i)){
        resultadoBob+= 1;
    }
    if(a.get(i) > b.get(i)){
        resultadoAlice+= 1;
    }
}

//Tercera practica
public static int birthdayCakeCandles(List<Integer> candles) {
        int maximaAltura = 0;
        int numeroVelitas = 0;

        for(int i = 0; i < candles.size() ; i++){
            if(maximaAltura < candles.get(i)){
                maximaAltura = candles.get(i);
            }
        }
        for(int i = 0; i < candles.size(); i++){
            if(maximaAltura == candles.get(i)){
                numeroVelitas += 1;
            }
        }
            return numeroVelitas;
        }


    }