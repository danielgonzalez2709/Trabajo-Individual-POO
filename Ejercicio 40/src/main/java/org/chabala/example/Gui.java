package org.chabala.example;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static java.lang.Math.sqrt;


public class Gui extends JFrame implements ActionListener{
    //Elementos graficos con los que se interactuan, los que cambian en tiempo de ejecucion de estado

    private JButton buttonSubmit;
    //Cuadros de texto de entrada
    private JTextField txtBoxNumero;
    //Ventana
    private JFrame frame;


    public Gui() {
        frame = new JFrame("Ejercicio 40 " );
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setBounds(0,0,700,1000);
        //Inicializacion ventana
        frame.setLayout(new FlowLayout());
        JLabel labelNumero = new JLabel("Inserte un numero entero positivo: ");
        labelNumero.setBounds(10,10,100, 30);
        frame.add(labelNumero);
        //Inicializacion, posicion, textos de elementos graficos
        txtBoxNumero = new JTextField(20);
        txtBoxNumero.setBounds(120, 10, 100, 30);
        frame.add(txtBoxNumero);


        buttonSubmit = new JButton("Enviar");
        buttonSubmit.setBounds(10,210,100,30);
        frame.add(buttonSubmit);
        //Lllamo la accion cuando se cliquea el boton
        buttonSubmit.addActionListener(this);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==buttonSubmit){
            //Logica
            Double Numero = Double.parseDouble(txtBoxNumero.getText());
            Double RaizCuadrada = sqrt(Numero);
            Double Cuadrado = Numero*Numero;
            Double Cubo = Numero*Numero*Numero;


            //Cuadro de output con la info solicitada
            JOptionPane.showMessageDialog(frame, "La raiz cuadrada de " +Numero+ " es: " +String.valueOf(RaizCuadrada)+
                    "\nEl cuadrado de " +Numero+  " es:" +String.valueOf(Cuadrado)+
                    "\nEl cubo de " +Numero+ " es:" +String.valueOf(Cubo));
        }
    }

    public static void main(String[] args){
        new Gui();
    }

}
