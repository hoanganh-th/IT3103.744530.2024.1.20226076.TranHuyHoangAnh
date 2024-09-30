import javax.swing.JOptionPane;
public class ChoosingOption 
{
    public static void main(String[] args) 
    {
        int option = JOptionPane.showConfirmDialog(null, 
        			"Hoang Anh - 20226076. Do you want to change to the first class ticket?");
        JOptionPane.showMessageDialog(null, "Hoang Anh - 6076. You've chosen: " + 
        			(option == 0 ? "Yes" : "No"));
        System.exit(0);
    }
}