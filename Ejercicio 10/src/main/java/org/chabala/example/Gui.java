package org.chabala.example;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Gui extends JFrame implements ActionListener{
    //Elementos graficos con los que se interactuan, los que cambian en tiempo de ejecucion de estado

    private JButton buttonSubmit;
    //Cuadros de texto de entrada
    private JTextField txtBoxNumInscripcion;
    private JTextField txtBoxNombres;
    private JTextField txtBoxPatrimonio;
    private JTextField txtBoxEstrato;

    //Ventana
    private JFrame frame;


    public Gui() {
        frame = new JFrame("Ejercicio 10  " );
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setBounds(0,0,700,1000);
        //Inicializacion ventana
        frame.setLayout(new FlowLayout());
        JLabel labelNumInscripcion = new JLabel("Numero Inscripcion: ");
        labelNumInscripcion.setBounds(10,10,100, 30);
        frame.add(labelNumInscripcion);
        //Inicializacion, posicion, textos de elementos graficos
        txtBoxNumInscripcion = new JTextField(20);
        txtBoxNumInscripcion.setBounds(120, 10, 100, 30);
        frame.add(txtBoxNumInscripcion);

        JLabel labelNombres = new JLabel("Nombres estudiante: ");
        labelNumInscripcion.setBounds(10,50,100, 30);
        frame.add(labelNombres);

        txtBoxNombres = new JTextField(20);
        txtBoxNombres.setBounds(120, 50, 100, 30);
        frame.add(txtBoxNombres);

        JLabel labelPatrimonio = new JLabel("Patrimonio: ");
        labelPatrimonio.setBounds(10,90,100, 30);
        frame.add(labelPatrimonio);

        txtBoxPatrimonio = new JTextField(20);
        txtBoxPatrimonio.setBounds(120, 90, 100, 30);
        frame.add(txtBoxPatrimonio);

        JLabel labelEstrato = new JLabel("Estrato Social: ");
        labelEstrato.setBounds(10,130,100, 30);
        frame.add(labelEstrato);

        txtBoxEstrato = new JTextField(20);
        txtBoxEstrato.setBounds(120, 130, 100, 30);
        frame.add(txtBoxEstrato);


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
            Double NumInscripcion = Double.parseDouble(txtBoxNumInscripcion.getText());
            String Nombres = txtBoxNombres.getText();
            Double Patrimonio = Double.parseDouble(txtBoxPatrimonio.getText());
            Double Estrato = Double.parseDouble(txtBoxEstrato.getText());

            Double PagoMatricula = Double.valueOf(50000);
            if (Patrimonio>2000000 & Estrato>3)
                PagoMatricula = PagoMatricula + 0.03*Patrimonio;
            JOptionPane.showMessageDialog(frame, "El estudiante con numero de inscripcion: "+String.valueOf(NumInscripcion)+"\ny nombre: "+Nombres+"\ndebe pagar: $"+String.valueOf(PagoMatricula));



        }
    }

    public static void main(String[] args){
        new Gui();
    }

}
