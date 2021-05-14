package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestFrame extends JFrame{

    public TestFrame(){
        final JFrame f = this;
        setSize(300,300);
        setVisible(true);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                CloseQuestion end = new CloseQuestion(f);
                if(end.yes){
                    dispose();
                    System.exit(0);
                }
            }
        });
    }
}
