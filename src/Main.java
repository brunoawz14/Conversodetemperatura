import javax.swing.JOptionPane;

public class Main {
    public static void main(String []args) {
        //coversor de temperatura ao som de coldplay
        JOptionPane.showMessageDialog(null, "Esse é um Sistema para fazer a conversão de temperaturas.");

        String input1 = JOptionPane.showInputDialog("Escolha a temperatura que você quer converter (C°, F°e K°): ");
        char temperatura1 = input1.charAt(0);

        String input2 = JOptionPane.showInputDialog("Escolha a temperatura que vc quer convertida (C°, F°e K°): ");
        char temperatura2 = input2.charAt(0);

        String input3 = JOptionPane.showInputDialog("Digite o valor da temperatura 1: ");
        double valor1 = Double.parseDouble(input3);


        double resultado = 0;

        if (temperatura1 == 'C' && temperatura2 == 'F') {
            resultado = valor1 * 1.8 + 32;

        } else if (temperatura1 == 'F' && temperatura2 == 'C') {
            resultado = valor1 - 32 * 1.8;

        } else if (temperatura1 == 'K' && temperatura2 == 'C') {
            resultado = -valor1 + 273.15;

        } else if (temperatura1 == 'C' && temperatura2 == 'K') {
            resultado = valor1 + 273.15;

        } else if (temperatura1 == 'F' && temperatura2 == 'K') {
            resultado = (valor1 - 32) * 5 / 9 + 273.15;

        } else if  (temperatura1 == 'K' && temperatura2 == 'F') {
            resultado =  (valor1 - 273.15) * 9 / 5 + 32;


        }else {
            JOptionPane.showMessageDialog(null, "Erro ao converter para temperatura.");
        }


        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);


    }
}