import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class APP {
    private JPanel panelMain;
    private JButton Start;

    public static void main(String[] args) {
        JFrame frame = new JFrame("APP");
        frame.setContentPane(new APP().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public APP() {
        Start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                char[] test = {'a', '/', 'b', 'z'};
                char[] lowerChars = new char[test.length];

                for (int i = 0; i < test.length; i++) {
                    if (Character.isLowerCase(test[i])) {
                        lowerChars[i] = test[i];
                    }
                }
                //System.out.println(lowerChars);
                JOptionPane.showMessageDialog(null, Arrays.toString(lowerChars));
            }
        });
    }
}
