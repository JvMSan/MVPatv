package org.example;

import javax.swing.*;
import java.awt.*;

public class MainPainel extends JFrame {
    private JPanel MainPanel;

    public MainPainel(){
        setContentPane(MainPanel);
        setTitle("Dados Clima");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize.width, screenSize.height);

        setExtendedState(JFrame.MAXIMIZED_BOTH);


        criaMenu();


        setVisible(true);

    }

    public void criaMenu(){
        // Cria a barra de menu
        JMenuBar menuBar = new JMenuBar();

        // Cria menus
        JMenu fileMenu = new JMenu("Configurações");


        // Cria itens de menu
        JMenuItem logs = new JMenuItem("Logs");

        fileMenu.add(logs);

        menuBar.add(fileMenu);


        this.setJMenuBar(menuBar);

    }

    public static void main(String[] args) {
        new MainPainel();

    }
}
