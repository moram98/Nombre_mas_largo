import javax.swing.*;

public class Nombres {
    public static void main(String[] args) {
        String nombre1;
        String nombre2;
        String nombre3;

        nombre1 = JOptionPane.showInputDialog("Digite el primer nombre con apellido: ");
        nombre2 = JOptionPane.showInputDialog("Digite el segundo nombre con apellido: ");
        nombre3 = JOptionPane.showInputDialog("Digite el tercer nombre con apellido: ");

        String nomUno = (nombre1.split(" ")[0].length() >
                nombre2.split(" ")[0].length()) ? nombre1 : nombre2;
        String nomDos = (nomUno.length() > nombre3.split(" ")[0].length()) ? nomUno: nombre3;

        System.out.println( nomDos + " es el nombre mas grande");
    }
}