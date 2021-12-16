import javax.swing.*;
import java.awt.*;

class PR4 extends JFrame {
    // JTextField jta1 = new JTextField(10);
    // JTextField jta2 = new JTextField(10);
    int a, b;
    String milan = "AC Milan";
    String madrid = "Real Madrid";
    String na = "N/A";
    JLabel lbl1 = new JLabel("Result: " + a + " X " + b);
    JLabel lbl2 = new JLabel("Last Scorer: " + na);
    Label win = new Label("Winner: DRAW");
    JButton button1 = new JButton(milan);
    JButton button2 = new JButton(madrid);
    Font fnt = new Font("Times new roman", Font.BOLD, 20);

    PR4() {
        super("PR4");
        setLayout(new FlowLayout());
        setSize(250, 150);
        add(lbl1);
        add(button1);
        add(button2);
        add(lbl2);
        add(win);

        button1.addActionListener(e -> {
            a++;
            lbl1.setText("Result: " + a + " X " + b);
            lbl2.setText("Last Scorer: " + milan);
            if(a>b) win.setText("Winner: AC MILAN");
            else if (b>a) win.setText("Winner: REAL MADRID");
            else win.setText("Winner: DRAW");
        });
        setVisible(true);

        button2.addActionListener(e -> {
            b++;
            lbl1.setText("Result: " + a + " X " + b);
            lbl2.setText("Last Scorer: " + madrid);
            if(a>b) win.setText("Winner: AC MILAN");
            else if (b>a) win.setText("Winner: REAL MADRID");
            else win.setText("Winner: DRAW");
        });
        setVisible(true);

    }

    public static void main(String[] args) {
        new PR4();
    }
}
