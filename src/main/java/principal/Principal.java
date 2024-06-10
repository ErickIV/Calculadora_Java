package principal;

import javax.swing.JOptionPane;
import calculadora.Calculadora;

public class Principal {
    public static void main(String[] args) {
        String opcao = "";
        Calculadora calculadora = new Calculadora();
        while (!opcao.equals("9")) {
            opcao = JOptionPane.showInputDialog("1 - Leitura \n2 - Adição \n3 - Subtração \n4 - Multiplicação \n5 - Divisão \n9 - Sair");
            try {
                switch (Integer.parseInt(opcao)) {
                    case 1:
                        calculadora.setValorA(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor A")));
                        calculadora.setValorB(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor B")));
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Soma: " + calculadora.getSoma());
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Diferença: " + calculadora.getDiferenca());
                        break;
                    case 4:
                        JOptionPane.showMessageDialog(null, "Produto: " + calculadora.getProduto());
                        break;
                    case 5:
                        exibirQuociente(calculadora);
                        break;
                    case 9: 
                        JOptionPane.showMessageDialog(null, "Saindo do sistema.");
                        break;                
                    default:
                        JOptionPane.showMessageDialog(null, "Alternativa inválida!");
                        break;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida! Por favor, digite um número.");
            }
        }
    }

    private static void exibirQuociente(Calculadora calculadora) {
        try {
            JOptionPane.showMessageDialog(null, "Quociente: " + calculadora.getQuociente());
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Erro: Divisão por zero não é permitida.");
        }
    }
}