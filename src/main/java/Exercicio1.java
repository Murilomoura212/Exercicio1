import javax.swing.JOptionPane;

public class Exercicio1 {

    public static void main(String[] args) {
      int n1,n2,n3;
      double soma;
        
            n1 = Integer.parseInt(JOptionPane.showInputDialog("coloque seu primeiro numero:"));
        
            n2 = Integer.parseInt(JOptionPane.showInputDialog("coloque seu segundo numero:"));
        
            n3 = Integer.parseInt(JOptionPane.showInputDialog("coloque seu terceiro numero:"));
    
            soma = (n1 + n2 + n2) /3;  
        
        JOptionPane.showMessageDialog(null,"a sua media é:" +soma);
    }
}
