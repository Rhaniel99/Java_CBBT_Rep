import javax.swing.*;

public class ExemploUncheck {
    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");

        try {
            int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("Resultado " + resultado);
        } catch (NumberFormatException e) {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Entrada invalida " + e.getMessage());
        } catch (ArithmeticException e){
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Impossivel dividir um número por zero ");
        }
        finally {
            System.out.println("Chegou no finally.");
        }
    }
    public static int dividir(int a, int b){
        return a / b;
    }
}
