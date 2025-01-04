/*To write a java program that works as a simple calculator.Arrange Buttons for digits and the + - * % operations properly.Add a text field to
display the result.Handle any possible exceptions like divide by zero.*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Calculator implements ActionListener {
    JFrame f;
    JTextField tf;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdot, badd, bsub, bmul, bdiv, beq, bdel, bclr;
    static double a = 0, b = 0, result = 0;
    static int op = 0;

    Calculator() {
        f = new JFrame("Calculator");
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(20, 30, 300, 350);
        f.setResizable(false);

        Font font = new Font("Arial", Font.BOLD, 20);
        tf = new JTextField();
        tf.setFont(font);
        tf.setBackground(Color.orange);
        tf.setForeground(Color.red);
        tf.setBounds(40, 40, 200, 50);
        tf.setEditable(false);
        f.add(tf);

        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");
        bdot = new JButton(".");
        badd = new JButton("+");
        bsub = new JButton("-");
        bmul = new JButton("*");
        bdiv = new JButton("/");
        beq = new JButton("=");
        bdel = new JButton("Delete");
        bclr = new JButton("Clear");

        int x = 40, y = 100, w = 50, h = 40;
        b7.setBounds(x, y, w, h); 
        b8.setBounds(x + 50, y, w, h); 
        b9.setBounds(x + 100, y, w, h); 
        bdiv.setBounds(x + 150, y, w, h);
        y += 40;
        b4.setBounds(x, y, w, h); 
        b5.setBounds(x + 50, y, w, h); 
        b6.setBounds(x + 100, y, w, h); 
        bmul.setBounds(x + 150, y, w, h);
        y += 40;
        b1.setBounds(x, y, w, h); 
        b2.setBounds(x + 50, y, w, h); 
        b3.setBounds(x + 100, y, w, h); 
        bsub.setBounds(x + 150, y, w, h);
        y += 40;
        bdot.setBounds(x, y, w, h); 
        b0.setBounds(x + 50, y, w, h); 
        beq.setBounds(x + 100, y, w, h); 
        badd.setBounds(x + 150, y, w, h);
        bdel.setBounds(40, y + 40, 100, h); 
        bclr.setBounds(140, y + 40, 100, h);

        JButton[] buttons = {b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdot, badd, bsub, bmul, bdiv, beq, bdel, bclr};
        for (JButton button : buttons) {
            f.add(button);
            button.addActionListener(this);
        }

        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == bclr) {
            tf.setText("");
        } else if (e.getSource() == bdel) {
            String s = tf.getText();
            if (s.length() > 0) {
                tf.setText(s.substring(0, s.length() - 1));
            }
        } else if (e.getSource() == badd || e.getSource() == bsub || e.getSource() == bmul || e.getSource() == bdiv) {
            a = Double.parseDouble(tf.getText());
            op = e.getSource() == badd ? 1 : e.getSource() == bsub ? 2 : e.getSource() == bmul ? 3 : 4;
            tf.setText("");
        } else if (e.getSource() == beq) {
            b = Double.parseDouble(tf.getText());
            switch (op) {
                case 1 -> result = a + b;
                case 2 -> result = a - b;
                case 3 -> result = a * b;
                case 4 -> result = b != 0 ? a / b : Double.NaN;
            }
            tf.setText(result == Double.NaN ? "Error" : String.valueOf(result));
        } else {
            JButton button = (JButton) e.getSource();
            tf.setText(tf.getText() + button.getText());
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
