package extra;

import javax.swing.JOptionPane;

public class AskUser {
	public static void main(String[] args) {
		String userName = JOptionPane.showInputDialog("Do you Know how to code?");
		if(userName.equals("yes")){
			JOptionPane.showMessageDialog(null,"You will RULE the world!");
			}
	else {
			JOptionPane.showMessageDialog(null,"Then start mopping floors.");
			
		
		
		}
	}
}