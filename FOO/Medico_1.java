//- modulo:c02/Medico_1.java
class Medico_1 {
    // --> (IMC) Definicao da interface especifica.
    double imc (double massa_kg, double altura_m) {
        return massa_kg / (altura_m * altura_m);
    }
    //- (IMC) Definicao da interface especifica
    String grauGordura (double massa_kg, double altura_m) {
        var r = imc (massa_kg, altura_m);
        if (r >= 30) return "OBESO";
        if (r <= 18.5) return "MAGRO";
        return "NORMAL";
    }
}
