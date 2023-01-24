package com.zander;

import javax.swing.*;

public class Ventana {
    JFrame ventana;
    JPanel panelA, panelB; // panel: permite acomodar elementos y estos colocarlos dentro de ventana
    JLabel saludo;
    JButton boton;
    public void  crearPanelA(){
        panelA = new JPanel();
        saludo = new JLabel("Bienvenidos");
        panelA.setLayout(new BoxLayout(panelA, BoxLayout.X_AXIS));
        panelA.add(saludo);
    }
    public void  crearPanelB(){
        panelB = new JPanel();
        boton = new JButton();
        boton.setText("Entrar");
        panelB.setLayout(new BoxLayout(panelB, BoxLayout.X_AXIS));
        panelB.add(boton);
    }

    public void  crearVentana(){
        ventana = new JFrame();
        ventana.setTitle("Nueva ventana");
        ventana.setSize(400, 400);
        ventana.setLayout(new BoxLayout(ventana.getContentPane(), BoxLayout.Y_AXIS));
        ventana.add(panelA);
        ventana.add(panelB);
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
