//- modulo:c01/Sonar.java
// (Sonar-c01) TIPO
public class Sonar {
    // --> (Sonar-c01) TIPOS.
    enum Marcacao {
        D, // inDefinida
        A, // Agua
        N  // Navio atingido
    };

    // --> (Sonar-c01) CONSTANTES.
    static final int N1 = 0;
    static final int N2 = 1;
    static final int N3 = 2;
    static final int N4 = 3;
    static final int N5 = 4;

    // --> (Sonar-c01) VARIAVEIS DE ESTADO.
    Ponto[] alvos;
    Marcacao[][] visor;

    // --> (Sonar-c01) CONSTRUTOR como PREDICADO INICIAL.
    public Sonar() {// Definicao da variavel de instancia 'visor' e do seu estado inicial
        visor = new Marcacao[5][5];
        for (var x = 0; x < 5; x++) {
            for (var y = 0; y < 5; y++) {
                visor[x][y] = Marcacao.D;
            }
        }
        // Definicao da variavel de instancia 'alvos' e do seu estado inicial
        alvos = new Ponto[5];
        // ToDo: definir coordenadas aleatorias futuramente--.
        var x = 0;
        for (var n = N1; n <= N5; n++) {
            alvos[n] = new Ponto(x, 0);
            x++;
        }
    }    
    // --> (Sonar-c01) FUNCAO DE ESTADO.
    Marcacao marca(Ponto p) {
        return visor[p.x][p.y];
    }

    // --> (Sonar-c01) PREDICADOS DE ESTADO.
    boolean destruiu(int x, int y) {
        Ponto p = new Ponto(x, y);
        for (var a : alvos) {
            if (a.igual(p)) {
                return true;
            }
        }
        return false;
    }

    // --> (Sonar-c01) ACOES.
    void mostrarAlvos() {
        var info = "Alvos= ";
        for (var n = N1; n <= N5; n++) {
            info += String.format("(%d,%d) ", // posicao do alvo "n"
                alvos[n].x + 1,
                // linha
                alvos[n].y + 1);
            // coluna
        }
        info += "\n";
        System.out.printf(info);
    }

    void acertou(int x, int y) {
        visor[x][y] = Marcacao.N;
    }

    void errou(int x, int y) {
        visor[x][y] = Marcacao.A;
    }
}
