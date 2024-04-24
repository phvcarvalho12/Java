//- modulo:c02/Medico_2.java
class Medico_2 {
    // --> (IMC-2) Definicao da interface especifica.

    Double imc (double massa_kg, double altura_m) {
        var massa_ok = (20 <= massa_kg) && (massa_kg <= 130);
        var altura_ok = (1.2 <= altura_m) && (altura_m <= 2);
        if (massa_ok && altura_ok) {
            return massa_kg / (altura_m * altura_m);
        }
        return null;
    }


    //- (IMC-2) Definicao da interface especifica
    String grauGordura (double massa_kg, double altura_m) {
        var r = imc (massa_kg, altura_m);
        if (r == null) {
            return null;
        }

        if (r >= 30) {
            return "OBESO";
        }
        if (25 < r && r < 30) {
            return "GORDO";
        }
        if (r <= 18.5) {
            return "MAGRO";
        }
        return "NORMAL";
    }

}

