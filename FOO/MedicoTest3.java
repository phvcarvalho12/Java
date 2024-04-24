//- modulo:c02/MedicoTest.java
import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
public class MedicoTest {
    // --> (IMC-BDD) Modelo da tabela de entrada.
    class DadosIMC {
        int m;
        double a;
        Double e;
        DadosIMC (int p1, double p2, Double p3 ) {
            m = p1;
            a = p2;
            e = p3;
        }
    }
    // --> (IMC-BDD) 'Avaliacao do grau de obesidade de um paciente'.
    @Test
    public void testAvaliacaoPaciente() { // H1.C3
        // SABENDO:
        var m = new Medico_1();
        var dado_lst = new ArrayList<DadosIMC>();
        dado_lst.add( new DadosIMC (55, 1.75, 17.96));
        dado_lst.add( new DadosIMC (70, 1.75, 22.86));
        dado_lst.add( new DadosIMC (110, 1.75, 35.91));
        for (var dado : dado_lst ) {
            var massa_kg = dado.m;
            var altura_m = dado.a;
            // QUANDO:
            var r = m.imc( massa_kg, altura_m );
            // ENTÃO:
            assertTrue (Math.abs (dado.e - r) < 0.01);
        }
    }
}

