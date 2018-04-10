package extra;

import javax.swing.JOptionPane;

public class IntroToInputOutput {
	public static void main(String[] args) {
    JOptionPane.showMessageDialog(null,"TACOS");
   String Pezwin = JOptionPane.showInputDialog("Do you like tacos?");
   JOptionPane.showMessageDialog(null,"YAY!"+Pezwin+ "me too!");
   System.out.println(Pezwin);
	}

}
