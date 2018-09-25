package ejercicio2p4;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.Optional;

public class ColorList extends JList{

    DefaultListModel listModel;

    public ColorList(){
        this.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.setLayoutOrientation(JList.VERTICAL);
        this.setPreferredSize(new Dimension(100,150));
        this.setVisible(true);
        listModel = new DefaultListModel();

        listModel.addElement("verde");
        listModel.addElement("rojo");
        this.setModel(listModel);
    }

    public DefaultListModel getList(){
        return listModel;
    }

    public void addColor(String text) {
        if(!text.isEmpty()){
            //check if color exist in list
            Optional<Object> optional = Arrays.stream(listModel.toArray())
                    .filter(x -> text.equals(x))
                    .findFirst();
            if(!optional.isPresent()) {
                listModel.addElement(text);
            }
        }
    }

    public void removeColor() {
        int index = this.getSelectedIndex();
        listModel.remove(index);
    }
}
