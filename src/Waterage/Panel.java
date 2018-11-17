/*
 * Created by JFormDesigner on Sat Nov 17 11:03:00 CST 2018
 */

package Waterage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * @author Meredith
 */
public class Panel extends JFrame {
    public Panel() {
        initComponents();
    }

    private void button1ActionPerformed(ActionEvent e) {
        new AddData();

    }

    private void button3ActionPerformed(ActionEvent e) {

        new SelectAndModifyData();
    }

    private void button2ActionPerformed(ActionEvent e) {
        new DeleteData();
    }

    private void returnUpperPanelHandler(ActionEvent e) {
        // TODO add your code here
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        this2 = new JFrame();
        label1 = new JLabel();
        button1 = new JButton();
        button3 = new JButton();
        button2 = new JButton();
        button4 = new JButton();

        //======== this2 ========
        {
            this2.setVisible(true);
            this2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            Container this2ContentPane = this2.getContentPane();
            this2ContentPane.setLayout(new GridBagLayout());
            ((GridBagLayout)this2ContentPane.getLayout()).columnWidths = new int[] {83, 84, 80, 83, 105, 76, 0};
            ((GridBagLayout)this2ContentPane.getLayout()).rowHeights = new int[] {68, 0, 48, 0, 13, 47, 0, 75, 0};
            ((GridBagLayout)this2ContentPane.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
            ((GridBagLayout)this2ContentPane.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

            //---- label1 ----
            label1.setText("     \u8239\u53ea\u6c34\u8fd0\u8d39\u7f34\u7eb3\u60c5\u51b5\u7ba1\u7406\u6a21\u5757");
            label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 10f));
            this2ContentPane.add(label1, new GridBagConstraints(1, 0, 4, 1, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- button1 ----
            button1.setText("\u65b0\u589e\u6c34\u8fd0\u8d39\u7f34\u7eb3\u8bb0\u5f55");
            button1.setFont(button1.getFont().deriveFont(button1.getFont().getSize() + 5f));
            button1.addActionListener(e -> button1ActionPerformed(e));
            this2ContentPane.add(button1, new GridBagConstraints(1, 2, 2, 2, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- button3 ----
            button3.setText("\u67e5\u8be2\u4e0e\u4fee\u6539");
            button3.setFont(button3.getFont().deriveFont(button3.getFont().getSize() + 5f));
            button3.addActionListener(e -> button3ActionPerformed(e));
            this2ContentPane.add(button3, new GridBagConstraints(3, 2, 2, 2, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- button2 ----
            button2.setText("\u5220\u9664");
            button2.setFont(button2.getFont().deriveFont(button2.getFont().getSize() + 5f));
            button2.addActionListener(e -> button2ActionPerformed(e));
            this2ContentPane.add(button2, new GridBagConstraints(1, 5, 2, 2, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));

            //---- button4 ----
            button4.setText("\u8fd4\u56de\u4e0a\u4e00\u5c42");
            button4.setFont(button4.getFont().deriveFont(button4.getFont().getSize() + 5f));
            button4.addActionListener(e -> returnUpperPanelHandler(e));
            this2ContentPane.add(button4, new GridBagConstraints(3, 5, 2, 2, 0.0, 0.0,
                GridBagConstraints.CENTER, GridBagConstraints.BOTH,
                new Insets(0, 0, 5, 5), 0, 0));
            this2.pack();
            this2.setLocationRelativeTo(null);
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JFrame this2;
    private JLabel label1;
    private JButton button1;
    private JButton button3;
    private JButton button2;
    private JButton button4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
