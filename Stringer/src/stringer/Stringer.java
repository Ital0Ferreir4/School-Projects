package stringer;
import javax.swing.JOptionPane;
public class Stringer {
    
    public static void main(String[] args) {
        String firstNumber = JOptionPane.showInputDialog("2");
        String secondNumber = JOptionPane.showInputDialog("3");
        
        //converte string em valores int para utilização
        
        int number1 = Integer.parseInt(firstNumber);
        int number2 = Integer.parseInt(secondNumber);
        
        int sun = number1 + number2; // soma deles
        System.out.println(sun);
    }
    
}
