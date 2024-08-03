package org.example;


import org.example.logging.JsonFileLogger;
import org.example.logging.Logger;
import org.example.logging.XmlFileLogger;
import org.example.model.EstacaoClimatica;
import org.example.presenter.ClimaPresenter;
import org.example.view.EstatisticaClimaView;
import org.example.view.MaximasMinimasView;

import javax.swing.*;
import java.awt.*;

public class MainPainel extends JFrame {
    private JPanel MainPanel;
    private String logFormat;




    public MainPainel(){
        setContentPane(MainPanel);
        setTitle("Dados Clima");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(screenSize.width, screenSize.height);
        setAlwaysOnTop(false);
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
        Logger jsonLogger = new JsonFileLogger("log.json");
        Logger xmlLogger = new XmlFileLogger("log.xml");

        EstacaoClimatica model =  new EstacaoClimatica();

        EstatisticaClimaView estatisticaView = new EstatisticaClimaView();
        MaximasMinimasView maxiMinView = new MaximasMinimasView();

        ClimaPresenter presenter = new ClimaPresenter(model, estatisticaView, maxiMinView);

        new MainPainel();
        new TelaLog();
        new Telaincluirdados(presenter);
        new DadosMedios();
        new AttTempo();

    }
}
