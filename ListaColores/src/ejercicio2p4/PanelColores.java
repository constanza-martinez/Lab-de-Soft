package ejercicio2p4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelColores extends JPanel {

    JButton agregar, borrar;
    JTextField inputColor;
    ColorList listaColores;

    public PanelColores(){

        this.setBounds(0,0,500,400);
        setBackground(Color.LIGHT_GRAY);

        //List to select color
        listaColores = new ColorList();
        this.add(listaColores);

        //textField
        inputColor = new JTextField();
        inputColor.setPreferredSize(new Dimension(150,30));
        this.add(inputColor);

        //Buttons
        agregar = new JButton("Agregar");
        borrar = new JButton("Borrar");
        this.add(agregar);
        this.add(borrar);

        //listeners buttons

        agregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listaColores.addColor(inputColor.getText());
            }
        });

        borrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listaColores.removeColor();
            }
        });

    }
}
