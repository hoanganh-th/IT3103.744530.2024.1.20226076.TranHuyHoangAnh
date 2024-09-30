import javax.swing.JOptionPane;
public class HelloNameDialog
{
	public static void main(String[] args)
	{
		String result;
		result = JOptionPane.showInputDialog("Please enter your name:");
		JOptionPane.showMessageDialog(null, "I'm Hoang Anh - 20226076. Hi " + result + "!");
		System.exit(0);
	}
}