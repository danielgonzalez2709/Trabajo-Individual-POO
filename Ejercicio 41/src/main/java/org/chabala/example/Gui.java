package org.chabala.example;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;


public class Gui extends JFrame implements ActionListener{
    //Elementos graficos con los que se interactuan, los que cambian en tiempo de ejecucion de estado

    private JButton buttonSubmit;
    //Cuadros de texto de entrada
    private JTextField txtBoxListado;

    //Ventana
    private JFrame frame;


    public Gui() {
        frame = new JFrame("Ejercicio 41 " );
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setBounds(0,0,700,1000);
        //Inicializacion ventana
        frame.setLayout(new FlowLayout());
        JLabel labelListado = new JLabel("Listado de numeros: ");
        labelListado.setBounds(10,10,100, 30);
        frame.add(labelListado);
        //Inicializacion, posicion, textos de elementos graficos
        txtBoxListado = new JTextField(20);
        txtBoxListado.setBounds(120, 10, 100, 30);
        frame.add(txtBoxListado);


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
            String[] arregloNumeros = txtBoxListado.getText().split(",");
            int size = arregloNumeros.length;
            int [] arregloNumerosInt = new int [size];
            int max = Integer.parseInt(arregloNumeros[0]);
            for(int i=0; i<size; i++){
                arregloNumerosInt[i] = Integer.parseInt(arregloNumeros[i]);
                if (arregloNumerosInt[i] > max){
                    max = arregloNumerosInt[i];
                }
            }

            //Cuadro de output con la info solicitada
            JOptionPane.showMessageDialog(frame, "El numero mayor es : "+String.valueOf(max));

        }
    }

    public static void main(String[] args){
        new Gui();
    }

}
