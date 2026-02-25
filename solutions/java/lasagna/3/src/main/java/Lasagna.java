public class Lasagna {

    // No exercicio, pedia 40min fixos para uma lasanha ficar pronta, defini como uma constante
    private static final int EXPECTED_MINUTES_OVEN = 40;
    
    // Métodos
    // Expectativa no forno
    public int expectedMinutesInOven(){
        return EXPECTED_MINUTES_OVEN; // Retorna somente o tempo estimado
    }

    // Tempo faltante
    public int remainingMinutesInOven(int tempAtual){
        return EXPECTED_MINUTES_OVEN - tempAtual; 
        // Tempo estimado - tempo que a lasanha já está
    }

    // Preparo da lasanha
    public int preparationTimeInMinutes(int layer){
        int tempPreparo = layer * 2; 
        // tempo preparo por camada = camada x 2
        return tempPreparo; 
    }

    // Tempo total
    public int totalTimeInMinutes(int layer, int ovenTime){
        return preparationTimeInMinutes(layer) + ovenTime; 
        // tem como retorno da função, uma função + tempo que a lasanha está no forno 
    }
}
