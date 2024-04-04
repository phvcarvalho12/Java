 

public class Seno {
    public double calcularSeno (double a) {
        
        // Converter o ângulo de graus para radianos, pois Math.sin() aceita radianos
        double anguloRadianos = Math.toRadians(a);

        // Calcular o seno do ângulo
        double seno = Math.sin(anguloRadianos);
    return seno; 
    }
}
