package Atv03;

import javax.swing.JOptionPane;

public class Atv03 {
    public static void main(String[] args) {
        Integer resp1 = prova1();
        Integer resp2 = prova2();
        Integer trabalho = trabalho();

        int media = (resp1 + resp2 + trabalho) / 3;
        JOptionPane.showMessageDialog(null, "Sua média é: " + media, "Média final!", 1);

    };

    public static Integer prova1() {
        while (true) {
            String resp1 = JOptionPane.showInputDialog(null, "Qual a nota da primeira prova ?", null);
            if (Integer.valueOf(resp1) > 100) {
                JOptionPane.showMessageDialog(null, "Nota inválida", "Erro", 0);

            } else {
                return Integer.valueOf(resp1);
            }
        }

    };

    public static Integer prova2() {
        while (true) {
            String resp2 = JOptionPane.showInputDialog(null, "Qual a nota da segunda prova ?", null);
            if (Integer.valueOf(resp2) > 100) {
                JOptionPane.showMessageDialog(null, "Nota inválida", "Erro", 0);
            } else {
                return Integer.valueOf(resp2);

            }
        }
    };

    public static Integer trabalho() {
        while (true) {
            String trab = JOptionPane.showInputDialog(null, "Qual a nota do trabalho ?", null);
            if (Integer.valueOf(trab) > 100) {
                JOptionPane.showMessageDialog(null, "Nota inválida", "Erro", 0);
            } else {
                return Integer.valueOf(trab);

            }
        }
    };
}