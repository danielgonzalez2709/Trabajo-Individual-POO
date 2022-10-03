package org.chabala.example;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Gui extends JFrame implements ActionListener{
    //Elementos graficos con los que se interactuan, los que cambian en tiempo de ejecucion de estado

    private JButton buttonSubmit;
    //Cuadros de texto de entrada
    private JTextField txtBoxValordeA;
    private JTextField txtBoxValordeB;
    private JTextField txtBoxValordeC;
    //Ventana
    private JFrame frame;


    public Gui() {
        frame = new JFrame("Ejercicio 23 " );
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setBounds(0,0,700,1000);
        //Inicializacion ventana
        frame.setLayout(new FlowLayout());
        JLabel labelValordeA = new JLabel("Valor de A: ");
        labelValordeA.setBounds(10,10,100, 30);
        frame.add(labelValordeA);
        //Inicializacion, posicion, textos de elementos graficos
        txtBoxValordeA = new JTextField(20);
        txtBoxValordeA.setBounds(120, 10, 100, 30);
        frame.add(txtBoxValordeA);

        JLabel labelValordeB = new JLabel("Valor de B: ");
        labelValordeA.setBounds(10,50,100, 30);
        frame.add(labelValordeB);

        txtBoxValordeB = new JTextField(20);
        txtBoxValordeB.setBounds(120, 50, 100, 30);
        frame.add(txtBoxValordeB);

        JLabel labelValordeC = new JLabel("Valor de C: ");
        labelValordeC.setBounds(10,90,100, 30);
        frame.add(labelValordeC);

        txtBoxValordeC = new JTextField(20);
        txtBoxValordeC.setBounds(120, 90, 100, 30);
        frame.add(txtBoxValordeC);


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
            Double ValordeA = Double.parseDouble(txtBoxValordeA.getText());
            Double ValordeB = Double.parseDouble(txtBoxValordeB.getText());
            Double ValordeC = Double.parseDouble(txtBoxValordeC.getText());
            Double Resultado1 =((-1*ValordeB) - Math.sqrt(Math.pow(ValordeB, 2) - (4 * ValordeA * ValordeC))) / (2 * ValordeA);
            Double Resultado2 =((-1*ValordeB) + Math.sqrt(Math.pow(ValordeB, 2) - (4 * ValordeA * ValordeC))) / (2 * ValordeA);
            //Cuadro de output con la info solicitada
            JOptionPane.showMessageDialog(frame, "Los resultados de la ecuacion son : "+String.valueOf(Resultado1)+" Resultado 2: "+String.valueOf(Resultado2));
        }
    }

    public static void main(String[] args){
        new Gui();
    }

}
