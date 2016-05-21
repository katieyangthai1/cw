import javax.swing.JOptionPane;

public class ChargeIt
{
    public static void main(String[] args)
    {
        String input;
        int accountNumber;

        Validator val = new Validator();

        input = JOptionPane.showInputDialog("Enter your charge account number: ");
        accountNumber = Integer.parseInt(input);

        if (val.isValid(accountNumber))
            JOptionPane.showMessageDialog(null, "That's a valid account number.");
        else
            JOptionPane.showMessageDialog(null, "That's an INVALID account number.");

        System.exit(0);
    }
}
