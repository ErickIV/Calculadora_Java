package calculadora;

public class Calculadora {

    private double valorA;
    private double valorB;

    /**
     * Construtor sem argumento.
     */
    public Calculadora() {
        this(0.0, 0.0);
    }

    /**
     * Construtor com argumento.
     *
     * @param valorA Um valor real.
     * @param valorB Um valor real.
     */
    public Calculadora(double valorA, double valorB) {
        setValorA(valorA);
        setValorB(valorB);
    }

    public double getValorA() {
        return valorA;
    }

    public double getValorB() {
        return valorB;
    }

    public void setValorA(double valorA) {
        this.valorA = valorA;
    }

    public void setValorB(double valorB) {
        this.valorB = valorB;
    }

    /**
     * Realiza a adição.
     *
     * @return A soma de valorA e valorB.
     */
    public double getSoma() {
        return valorA + valorB;
    }

    /**
     * Realiza a subtração.
     *
     * @return A diferença entre valorA e valorB.
     */
    public double getDiferenca() {
        return valorA - valorB;
    }

    /**
     * Realiza a multiplicação.
     *
     * @return O produto de valorA e valorB.
     */
    public double getProduto() {
        return valorA * valorB;
    }

    /**
     * Realiza a divisão.
     *
     * @return O quociente da divisão de valorA por valorB.
     * @throws ArithmeticException Se valorB for zero.
     */
    public double getQuociente() {
        if (valorB == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return valorA / valorB;
    }
}
