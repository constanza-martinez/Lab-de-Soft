package ejercicio2p4;

import javax.swing.*;
import java.awt.*;

public class ListaColores extends JFrame {

    public ListaColores(){
        setTitle("Lista de colores");
        setLocationRelativeTo(null);
        setVisible(true);
        setPreferredSize(new Dimension(500,200));

        setBackground(Color.WHITE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(new PanelColores());

        pack();
    }
}
