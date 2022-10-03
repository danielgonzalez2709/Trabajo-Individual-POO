package org.chabala.example;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Gui extends JFrame implements ActionListener{
    //Elementos graficos con los que se interactuan, los que cambian en tiempo de ejecucion de estado

    private JButton buttonSubmit;
    //Cuadros de texto de entrada
    private JTextField txtBoxCodigoEmpleado;
    private JTextField txtBoxNombres;
    private JTextField txtBoxHorasTrabajadas;
    private JTextField txtBoxValor;
    private JTextField txtBoxPorcentaje;
    //Ventana
    private JFrame frame;


    public Gui() {
        frame = new JFrame("Contabilidad " );
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setBounds(0,0,700,1000);
        //Inicializacion ventana
        frame.setLayout(new FlowLayout());
        JLabel labelCodigoEmpleado = new JLabel("Codigo empleado: ");
        labelCodigoEmpleado.setBounds(10,10,100, 30);
        frame.add(labelCodigoEmpleado);
        //Inicializacion, posicion, textos de elementos graficos
        txtBoxCodigoEmpleado = new JTextField(20);
        txtBoxCodigoEmpleado.setBounds(120, 10, 100, 30);
        frame.add(txtBoxCodigoEmpleado);

        JLabel labelNombres = new JLabel("Nombres empleado: ");
        labelCodigoEmpleado.setBounds(10,50,100, 30);
        frame.add(labelNombres);

        txtBoxNombres = new JTextField(20);
        txtBoxNombres.setBounds(120, 50, 100, 30);
        frame.add(txtBoxNombres);

        JLabel labelHorasTrabajadas = new JLabel("Horas trabajadas empleado: ");
        labelHorasTrabajadas.setBounds(10,90,100, 30);
        frame.add(labelHorasTrabajadas);

        txtBoxHorasTrabajadas = new JTextField(20);
        txtBoxHorasTrabajadas.setBounds(120, 90, 100, 30);
        frame.add(txtBoxHorasTrabajadas);

        JLabel labelValor = new JLabel("Valor horas trabajadas empleado: ");
        labelValor.setBounds(10,130,100, 30);
        frame.add(labelValor);

        txtBoxValor = new JTextField(20);
        txtBoxValor.setBounds(120, 130, 100, 30);
        frame.add(txtBoxValor);

        JLabel labelPorcentaje = new JLabel("Porcentaje retencion empleado: ");
        labelPorcentaje.setBounds(10,170,100, 30);
        frame.add(labelPorcentaje);

        txtBoxPorcentaje = new JTextField(20);
        txtBoxPorcentaje.setBounds(120, 170, 100, 30);
        frame.add(txtBoxPorcentaje);

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
            String codigo = txtBoxCodigoEmpleado.getText();
            String nombres = txtBoxNombres.getText();
            Double horas = Double.parseDouble(txtBoxHorasTrabajadas.getText());
            Double valorHora = Double.parseDouble(txtBoxValor.getText());
            Double porcentaje = Double.parseDouble(txtBoxPorcentaje.getText());
            Double salarioBruto = valorHora*horas;
            Double salarioNeto = salarioBruto*(1-porcentaje);

            //Cuadro de output con la info solicitada
            JOptionPane.showMessageDialog(frame, "Codigo: "+codigo+
                    "\nNombre empleado: "+nombres+
                    "\nSalario bruto: "+String.valueOf(salarioBruto) +
                    "\nSalario neto"+String.valueOf(salarioNeto));
        }
    }

    public static void main(String[] args){
        new Gui();
    }

}
