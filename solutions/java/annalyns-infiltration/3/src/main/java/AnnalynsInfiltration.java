class AnnalynsInfiltration {

    public static boolean canFastAttack(boolean knightIsAwake) {
        // Se cavaleiro que veio por parametro estiver acordado, preciso retornar false
        return !knightIsAwake; // ! inverte o valor do booleano
    }

    // Se algum dos personagens estiver acordado, for true, não pode ser vigiado
    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {

        //retorna verdadeiro se qualquer um dos três valores for true
        return knightIsAwake || archerIsAwake || prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        return !archerIsAwake && prisonerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        return (petDogIsPresent && !archerIsAwake) || (prisonerIsAwake && !knightIsAwake && !archerIsAwake);
    }
}
