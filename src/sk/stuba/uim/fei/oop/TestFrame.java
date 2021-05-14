package sk.stuba.uim.fei.oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class TestFrame extends Frame implements ItemListener {

    Panel font_panel;
    Choice font_name;
    Choice font_type;
    Choice font_size;
    String[] font;
    String[] types={"Plain", "Bold", "Italic", "Bold&Italic"};
    String[] size = {"10","12", "14", "16", "18", "20"};

    String font_name_selected;
    int font_type_selected;
    int font_size_selected;

    public TestFrame(){
        super("Font Test");
        setLayout(new BorderLayout());
        setSize(500,400);

        font = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        font_panel = new Panel();
        font_name = new Choice();
        font_type = new Choice();
        font_size = new Choice();

        font_name.addItemListener(this);
        font_size.addItemListener(this);
        font_type.addItemListener(this);

        for(int i=0;i<size.length;i++){
            font_size.add(size[i]);
        }

        for(int i=0;i<types.length;i++){
            font_type.add(types[i]);
        }

        for(int i=0;i<size.length;i++){
            font_name.add(font[i]);
        }

        font_name.select(0);
        font_name_selected = font_name.getSelectedItem();

        font_type.select(0);
        font_type_selected = font_type.getSelectedIndex();

        font_size.select(0);
        font_size_selected = Integer.parseInt(font_size.getSelectedItem());

        font_panel.add(font_name);
        font_panel.add(font_type);
        font_panel.add(font_size);

        add(BorderLayout.NORTH, font_panel);
        setVisible(true);

    }



    public void itemStateChanged(ItemEvent e){
        if(e.getSource() == font_name){
            font_name_selected = font_name.getSelectedItem();
        }
        if(e.getSource() == font_type){
            font_type_selected = font_type.getSelectedIndex();
        }
        if(e.getSource() == font_size){
            font_size_selected = Integer.parseInt(font_size.getSelectedItem());
        }
        repaint();
    }

    public void paint(Graphics g){
        int x = 200;
        int y = 200;

        Font font = new Font(font_name_selected, font_type_selected, font_size_selected);
        g.setFont(font);
        g.drawString(font_name_selected + " " + types[font_type_selected] +" " + font_size_selected, x, y);
    }
}
