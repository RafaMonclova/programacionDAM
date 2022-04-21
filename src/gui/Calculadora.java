/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author alumno
 */
public class Calculadora extends JFrame implements ActionListener{
    
    
    private JLabel valor1Texto;
    private JTextField valor1;
    
    private JLabel valor2Texto;
    private JTextField valor2;
    
    private JButton suma;
    private JButton resta;
    private JButton multiplicacion;
    private JButton division;
    
    public Calculadora(){
        
        super();
        configurarVentana();
        inicializarComponentes();
        
    }
    
    private void configurarVentana() {
        this.setTitle("Calculadora"); 
        this.setSize(310, 210); 
        this.setLocationRelativeTo(null); 
        this.setLayout(null); 
        this.setResizable(false); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    
    private void inicializarComponentes() {
        
        valor1Texto = new JLabel();
        valor1 = new JTextField();
        
        valor2Texto = new JLabel();
        valor2 = new JTextField();
        
        suma = new JButton();
        resta = new JButton();
        multiplicacion = new JButton();
        division = new JButton();
        
        valor1Texto.setText("Valor 1"); 
        valor1Texto.setBounds(50, 50, 100, 25); 
        valor1.setBounds(150, 50, 100, 25);
        
        valor2Texto.setText("Valor 2"); 
        valor2Texto.setBounds(50, 70, 100, 25); 
        valor2.setBounds(150, 70, 100, 25);
        
        suma.setText("Suma"); 
        suma.setBounds(50, 100, 100, 25); 
        suma.addActionListener(this); 
        
        resta.setText("Resta"); 
        resta.setBounds(150, 100, 100, 25); 
        resta.addActionListener(this); 
        
        multiplicacion.setText("Multiplicación"); 
        multiplicacion.setBounds(50, 130, 100, 25); 
        multiplicacion.addActionListener(this); 
        
        division.setText("División"); 
        division.setBounds(150, 130, 100, 25); 
        division.addActionListener(this); 
           
        this.add(valor1Texto);
        this.add(valor1);
        this.add(valor2Texto);
        this.add(valor2);
        this.add(suma);
        this.add(resta);
        this.add(multiplicacion);
        this.add(division);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        JButton pulsado = (JButton)e.getSource();
        
        if(pulsado == suma){
            
            double suma = Double.parseDouble(valor1.getText()) + Double.parseDouble(valor2.getText());
            JOptionPane.showMessageDialog(this, "Resultado: "+suma);

        }
        
        if(pulsado == resta){
            
            double resta = Double.parseDouble(valor1.getText()) - Double.parseDouble(valor2.getText());
            JOptionPane.showMessageDialog(this, "Resultado: "+resta);

        }
        
        if(pulsado == multiplicacion){
            
            double multiplicacion = Double.parseDouble(valor1.getText()) * Double.parseDouble(valor2.getText());
            JOptionPane.showMessageDialog(this, "Resultado: "+multiplicacion);

        }
        
        if(pulsado == division){
            
            double division = Double.parseDouble(valor1.getText()) / Double.parseDouble(valor2.getText());
            JOptionPane.showMessageDialog(this, "Resultado: "+division);

        }
        
    }
    
    public static void main(String[] args){
        
        Calculadora c = new Calculadora();  
        c.setVisible(true);
        
    }
    
}
