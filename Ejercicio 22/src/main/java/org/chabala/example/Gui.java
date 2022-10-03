package org.chabala.example;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Gui extends JFrame implements ActionListener{
    //Elementos graficos con los que se interactuan, los que cambian en tiempo de ejecucion de estado

    private JButton buttonSubmit;
    //Cuadros de texto de entrada
    private JTextField txtBoxNombreEmpleado;
    private JTextField txtBoxSalarioBasico;
    private JTextField txtBoxHorasTrabajadas;
    //Ventana
    private JFrame frame;


    public Gui() {
        frame = new JFrame("Ejercicio 22 " );
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setBounds(0,0,700,1000);
        //Inicializacion ventana
        frame.setLayout(new FlowLayout());
        JLabel labelNombreEmpleado = new JLabel("Nombre empleado: ");
        labelNombreEmpleado.setBounds(10,10,100, 30);
        frame.add(labelNombreEmpleado);
        //Inicializacion, posicion, textos de elementos graficos
        txtBoxNombreEmpleado = new JTextField(20);
        txtBoxNombreEmpleado.setBounds(120, 10, 100, 30);
        frame.add(txtBoxNombreEmpleado);

        JLabel labelSalarioBasico = new JLabel("Salario basico por hora: ");
        labelNombreEmpleado.setBounds(10,50,100, 30);
        frame.add(labelSalarioBasico);

        txtBoxSalarioBasico = new JTextField(20);
        txtBoxSalarioBasico.setBounds(120, 50, 100, 30);
        frame.add(txtBoxSalarioBasico);

        JLabel labelHorasTrabajadas = new JLabel("Horas trabajadas al mes: ");
        labelHorasTrabajadas.setBounds(10,90,100, 30);
        frame.add(labelHorasTrabajadas);

        txtBoxHorasTrabajadas = new JTextField(20);
        txtBoxHorasTrabajadas.setBounds(120, 90, 100, 30);
        frame.add(txtBoxHorasTrabajadas);

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
            String nombre = txtBoxNombreEmpleado.getText();
            Double SalarioBasico = Double.parseDouble(txtBoxSalarioBasico.getText());
            Double HorasTrabajadas = Double.parseDouble(txtBoxHorasTrabajadas.getText());
            Double Salario = SalarioBasico*HorasTrabajadas;
            if (Salario>450000)
                JOptionPane.showMessageDialog(frame, "Nombre del emplado: "+nombre+ " Salario del empleado"+String.valueOf(Salario));
            else
                JOptionPane.showMessageDialog(frame, "Nombre del emplado: "+nombre);




        }
    }

    public static void main(String[] args){
        new Gui();
    }

}
