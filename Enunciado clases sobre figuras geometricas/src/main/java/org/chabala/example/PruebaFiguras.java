package org.chabala.example;
import org.chabala.example.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Esta clase prueba diferentes acciones realizadas en diversas figuras
 * geométricas.
 *
 * @version 1.2/2020
 */
public class PruebaFiguras extends JFrame implements ActionListener {
    /**
     * Método main que crea un círculo, un rectángulo, un cuadrado y
     * un triángulo rectángulo. Para cada uno de estas figuras geométricas,
     * se calcula su área y perímetro.
     */

    private JButton calcularCirculo;
    private JTextField txtBoxRadioCirculo;


    private JButton calcularRectangulo;
    private JTextField txtBoxLado1;
    private JTextField txtBoxLado2;


    private JButton calcularCuadrado;

    private JTextField txtBoxLado;


    private JButton calcularTriangulo;

    private JTextField txtBoxBase;

    private JTextField txtBoxAltura;

    private JFrame frame;

    public PruebaFiguras() {
        frame = new JFrame("Enunciado clases sobre figuras geometricas");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setBounds(0, 0, 450, 1000);

        frame.setLayout(new FlowLayout());
        JLabel labelRadioCirculo = new JLabel("Radio circulo: ");
        labelRadioCirculo.setBounds(10, 10, 100, 30);
        frame.add(labelRadioCirculo);

        txtBoxRadioCirculo = new JTextField(20);
        txtBoxRadioCirculo.setBounds(120, 10, 100, 30 );
        frame.add(txtBoxRadioCirculo);

        calcularCirculo = new JButton("Calcular");
        calcularCirculo.setBounds(350, 10, 100, 30);
        frame.add(calcularCirculo);
        calcularCirculo.addActionListener(this);
        frame.setVisible(true);


        JLabel labelLado1 = new JLabel("Lado rectangulo 1: ");
        labelLado1.setBounds(10, 60, 100, 30);
        frame.add(labelLado1);

        txtBoxLado1 = new JTextField(20);
        txtBoxLado1.setBounds(120, 60, 100, 30 );
        frame.add(txtBoxLado1);

        JLabel labelLado2 = new JLabel("Lado rectangulo 2: ");
        labelLado2.setBounds(10, 110, 100, 30);
        frame.add(labelLado2);

        txtBoxLado2 = new JTextField(20);
        txtBoxLado2.setBounds(120, 110, 100, 30 );
        frame.add(txtBoxLado2);

        calcularRectangulo = new JButton("Calcular");
        calcularRectangulo.setBounds(350, 110, 100, 30);
        frame.add(calcularRectangulo);
        calcularRectangulo.addActionListener(this);
        frame.setVisible(true);



        JLabel labelLado = new JLabel("Lado del cuadrado: ");
        labelLado.setBounds(180, 110, 100, 30);
        frame.add(labelLado);

        txtBoxLado = new JTextField(20);
        txtBoxLado.setBounds(390, 110, 100, 30 );
        frame.add(txtBoxLado);

        calcularCuadrado = new JButton("Calcular");
        calcularCuadrado.setBounds(390, 110, 100, 30);
        frame.add(calcularCuadrado);
        calcularCuadrado.addActionListener(this);
        frame.setVisible(true);



        JLabel labelBase = new JLabel("Base del triangulo: ");
        labelBase.setBounds(10, 60, 100, 30);
        frame.add(labelBase);

        txtBoxBase = new JTextField(20);
        txtBoxBase.setBounds(120, 60, 100, 30 );
        frame.add(txtBoxBase);

        JLabel labelAltura = new JLabel("Altura del triangulo: ");
        labelAltura.setBounds(10, 110, 100, 30);
        frame.add(labelAltura);

        txtBoxAltura = new JTextField(20);
        txtBoxAltura.setBounds(120, 110, 100, 30 );
        frame.add(txtBoxAltura);

        calcularTriangulo = new JButton("Calcular");
        calcularTriangulo.setBounds(350, 110, 100, 30);
        frame.add(calcularTriangulo);
        calcularTriangulo.addActionListener(this);
        frame.setVisible(true);






    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==calcularCirculo){
            int radioCirculoInt = Integer.parseInt(txtBoxRadioCirculo.getText());
            Círculo figura1 = new Círculo(radioCirculoInt);
            JOptionPane.showMessageDialog(frame, "Area del circulo: "+figura1.calcularArea()+" perimetro del circulo es: "+
                     figura1.calcularPerímetro());
        }
        if(e.getSource()==calcularRectangulo){
            int lado1Int = Integer.parseInt(txtBoxLado1.getText());
            int lado2Int = Integer.parseInt(txtBoxLado2.getText());
            Rectángulo figura2 = new Rectángulo(lado1Int,lado2Int);
            JOptionPane.showMessageDialog(frame, "Area del rectangulo: "+figura2.calcularArea()+" perimetro del rectangulo es: "+
                    figura2.calcularPerímetro());
        }
        if(e.getSource()==calcularCuadrado) {
            int ladoInt = Integer.parseInt(txtBoxLado.getText());
            Cuadrado figura3 = new Cuadrado(ladoInt);
            JOptionPane.showMessageDialog(frame, "Area del cuadrado: " + figura3.calcularArea() + " perimetro del cuadrado es: " +
                    figura3.calcularPerímetro());
        }
        if(e.getSource()==calcularTriangulo){
            int baseInt = Integer.parseInt(txtBoxBase.getText());
            int alturaInt = Integer.parseInt(txtBoxAltura.getText());
            TriánguloRectángulo figura4 = new TriánguloRectángulo(baseInt,alturaInt);
            JOptionPane.showMessageDialog(frame, "Area del triangulo: "+figura4.calcularArea()+" perimetro del triangulo es: "+
                    figura4.calcularPerímetro()+"la hipotenusa es: "+ figura4.calcularHipotenusa());
        }

    }


    public static void main(String[] args){new PruebaFiguras();}
}
