package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CloseQuestion extends JDialog implements ActionListener {

    public boolean yes = false;

    public CloseQuestion(JFrame f){
        super(f, "Close", true);
        add(BorderLayout.NORTH, new Label("Really close?"));
        JPanel p = new JPanel();

        JButton b= new JButton("Yes");
        p.add(b);
        b.addActionListener(this);

        JButton c= new JButton("No");
        p.add(c);
        c.addActionListener(this);

        add(BorderLayout.SOUTH, p);
        pack();

        setLocation(f.getLocation().x+100, f.getLocation().y+100);
        setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Yes")){
            yes=true;
        }
        dispose();
    }
}
