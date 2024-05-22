

public class Calculadora {
    private double valorA;
    private double valorB;

    public Calculadora() {
        this(0.0, 0.0);
    }

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

    public double getAdicao() {
        return valorA + valorB;
    }

    public double getSubtracao() {
        return valorA - valorB;
    }

    public double getMultiplicacao() {
        return valorA * valorB;
    }

    public double getDivisao() {
        if (valorB != 0) {
            return valorA / valorB;
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }
}
