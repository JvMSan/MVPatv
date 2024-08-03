package org.example;

import org.example.logging.Logger;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLog extends JFrame {
    private JComboBox<String> comboBox1;
    private JPanel TelaLogs;
    private JButton salvarButton;

    public String getDefaultConfig() {
        return defaultConfig;
    }

    public void setDefaultConfig(String defaultConfig) {
        this.defaultConfig = defaultConfig;
    }

    private String defaultConfig = "JSON";


    public TelaLog(){
        setContentPane(TelaLogs);
        setTitle("Configuração do Sistema");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setAlwaysOnTop(true);


        setBounds(150, 100, 500, 300);


        salvarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedFormat = (String) comboBox1.getSelectedItem();
                ConfigManager.getInstance().setLogFormat(selectedFormat);
                JOptionPane.showMessageDialog(TelaLogs, "Formato selecionado: " + selectedFormat);

            }
        });

        setVisible(true);

    }

}
