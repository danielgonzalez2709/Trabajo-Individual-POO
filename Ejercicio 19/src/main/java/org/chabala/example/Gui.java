package org.chabala.example;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import static java.lang.Math.sqrt;


public class Gui extends JFrame implements ActionListener{
    //Elementos graficos con los que se interactuan, los que cambian en tiempo de ejecucion de estado

    private JButton buttonSubmit;
    //Cuadros de texto de entrada
    private JTextField txtBoxLadoTriangulo;
    //Ventana
    private JFrame frame;


    public Gui() {
        frame = new JFrame("Triangulo Equilatero" );
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setBounds(0,0,700,1000);
        //Inicializacion ventana
        frame.setLayout(new FlowLayout());
        JLabel labelLadoTriangulo = new JLabel("Lado del Triangulo: ");
        labelLadoTriangulo.setBounds(10,10,100, 30);
        frame.add(labelLadoTriangulo);
        //Inicializacion, posicion, textos de elementos graficos
        txtBoxLadoTriangulo = new JTextField(20);
        txtBoxLadoTriangulo.setBounds(120, 10, 100, 30);
        frame.add(txtBoxLadoTriangulo);



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

            Double lado = Double.parseDouble(txtBoxLadoTriangulo.getText());
            Double perimetro = 3* lado;
            Double altura = sqrt(3)* lado/ 2;
            Double area = lado* altura/2;

            //Cuadro de output con la info solicitada
            JOptionPane.showMessageDialog(frame, "Perimetro: "+String.valueOf(perimetro) +
                    "\nAltura: "+String.valueOf(altura) +
                    "\nArea: "+String.valueOf(area));

        }
    }

    public static void main(String[] args){
        new Gui();
    }

}
