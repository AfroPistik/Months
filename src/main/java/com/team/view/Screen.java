package com.team.view;

import com.team.model.Month;
import javax.swing.*;
import java.util.List;

public class Screen extends JFrame {

    public void showMonths(List<Month> months) {
        setTitle("Μήνες");
        setSize(250, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        DefaultListModel<String> model = new DefaultListModel<>();
        for (Month m : months) {
            model.addElement(m.getName());
        }

        add(new JScrollPane(new JList<>(model)));
        setLocationRelativeTo(null);
        setVisible(true);
    }
}