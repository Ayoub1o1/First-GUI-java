import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ourGUI implements ActionListener {
    private int count = 0;
    private JFrame frame;
    private JLabel label;
    private JPanel panel;
    private JButton button;

    public ourGUI() {
        frame = new JFrame();
        button = new JButton("Click Me!");
        button.addActionListener(this);
        label = new JLabel("Number of clicks : 0");
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button); // Add the button to the panel
        panel.add(label); // Add the label to the panel
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new ourGUI();
    }

    @Override
    public void actionPerformed(ActionEvent e){
        count++;
        label.setText("Number of clicks : " + count);
    }
}