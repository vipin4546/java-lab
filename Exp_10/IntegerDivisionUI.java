import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IntegerDivisionUI extends JFrame implements ActionListener {

    JTextField num1Field, num2Field, resultField;
    JButton divideBtn;

    public IntegerDivisionUI() {

        setTitle("Integer Division");
        setSize(300, 200);
        setLayout(new GridLayout(4, 2));

        add(new JLabel("Num1:"));
        num1Field = new JTextField();
        add(num1Field);

        add(new JLabel("Num2:"));
        num2Field = new JTextField();
        add(num2Field);

        add(new JLabel("Result:"));
        resultField = new JTextField();
        resultField.setEditable(false);
        add(resultField);

        divideBtn = new JButton("Divide");
        divideBtn.addActionListener(this);
        add(divideBtn);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int num1 = Integer.parseInt(num1Field.getText());
            int num2 = Integer.parseInt(num2Field.getText());

            int result = num1 / num2;   // may throw ArithmeticException
            resultField.setText(String.valueOf(result));

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Please enter valid integers!",
                    "Number Format Error",
                    JOptionPane.ERROR_MESSAGE);

        } catch (ArithmeticException ex) {
            JOptionPane.showMessageDialog(this,
                    "Division by zero is not allowed!",
                    "Arithmetic Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new IntegerDivisionUI();
    }
}
