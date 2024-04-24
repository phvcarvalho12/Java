//- modulo:c01/SonarTest.java
import org.junit.Test;
import static org.junit.Assert.*;

public class SonarTest {
    // --> (Sonar-c01) Construcao e estado inicial.
    @Test
    public void testSonar () {
        // SABENDO:
        Sonar s = null; // não existe o sonar
        // QUANDO:
        s = new Sonar ();
        // ENTÃO:
        assertTrue (s.visor[0][0] == Sonar.Marcacao.D);
    }
    // --> (Sonar-c01) Alvo atingido.
    @Test
    public void testAcertou () {
        // SABENDO:
        var s = new Sonar ();
        var x = 1;
        var y = 0;
        var p = new Ponto (x,y);
        assert Sonar.Marcacao.D == s.marca (p);
        if (s.destruiu (x, y))
        // QUANDO:
            s.acertou (x, y);
        // ENTÃO:
        assertTrue (Sonar.Marcacao.N == s.marca (p));
    }
    // --> (Sonar-c01) Torpedo perdido.
    @Test
    public void testErrou() {
        // SABENDO:
        var s = new Sonar ();
        var x = 0;
        var y = 1;
        var p = new Ponto (x,y);
        assert Sonar.Marcacao.D == s.marca (p);
        if (!s.destruiu (x, y))
        // QUANDO:
            s.errou (x, y);
        // ENTÃO:
        assertTrue (Sonar.Marcacao.A == s.marca (p));
    }
}

