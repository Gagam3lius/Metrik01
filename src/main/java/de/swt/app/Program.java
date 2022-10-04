package de.swt.app;

import de.swt.events.MainWindowHandler;
import de.swt.ui.MainWindow;

/**
 * Metrik Version 1.0
 * @Author: Dennis Voigt, Mandy Rothe
 *
 *
 */
public class Program {

    private static MainWindow mainWindow;
    private static MainWindowHandler mainWindowHandler;


    public static void main(String[] args){
        mainWindowHandler = new MainWindowHandler();
        mainWindow = new MainWindow();
        mainWindow.setHandler(mainWindowHandler);
        mainWindow.showFrame();

    }

}
