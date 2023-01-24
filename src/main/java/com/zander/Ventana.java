package com.zander;

import javax.swing.*;

public class Ventana {
    JFrame ventana;
    JPanel panelA, panelB;
    JLabel saludo;
    // panel: nos permite acomodar elementos y estos colocarlos dentro de ventana
    public void  crearPanelA(){
        panelA = new JPanel();// inicialozar
        saludo = new JLabel("Bienvenidos");
        //saludo.setText("Bienvenidos");

        panelA.setLayout(new BoxLayout(panelA, BoxLayout.X_AXIS)); //acomodar sobre eje x
        panelA.add(saludo);

    }
    public void  crearPanelB(){
        panelB = new JPanel();
    }

    public void  crearVentana(){
        ventana = new JFrame();
        ventana.setTitle("Nueva ventana");
        ventana.setSize(400, 400);
        ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS));
        ventana.add(panelA);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(ventana.EXIT_ON_CLOSE);
    }
    public Ventana(){
        crearPanelA();
        crearPanelB();
        crearVentana();
    }
}
