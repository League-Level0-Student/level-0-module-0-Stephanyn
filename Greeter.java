package extra;

import javax.swing.JOptionPane;

public class Greeter {
	public static void main(String[] args) {
		String pezwin = JOptionPane.showInputDialog("What is your name");
		JOptionPane.showMessageDialog(null,"really!?" +pezwin+ "that's a nice name");
		
	}

}
