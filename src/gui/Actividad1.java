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
public class Actividad1 extends JFrame implements ActionListener{

    
    private JLabel textoPeso;
    private JTextField peso;
    private JLabel textoAltura;
    private JTextField altura;
    private JButton boton;
    
    
    public Actividad1(){
        
        super();
        configurarVentana();
        inicializarComponentes();
        
    }
    
    private void configurarVentana() {
        this.setTitle("Esta Es Una Ventana"); 
        this.setSize(310, 210); 
        this.setLocationRelativeTo(null); 
        this.setLayout(null); 
        this.setResizable(false); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }

    
    private void inicializarComponentes() {
        
        textoPeso = new JLabel();
        peso = new JTextField();
        textoAltura = new JLabel();
        altura = new JTextField();
        boton = new JButton();
         
        textoPeso.setText("Inserte peso"); 
        textoPeso.setBounds(50, 50, 100, 25); 
        peso.setBounds(150, 50, 100, 25);
        textoAltura.setText("Inserte altura"); 
        textoAltura.setBounds(50, 70, 100, 25); 
        altura.setBounds(150, 70, 100, 25);
        
        boton.setText("Calcular IMC"); 
        boton.setBounds(50, 100, 200, 30); 
        boton.addActionListener(this); 
        
        this.add(textoPeso);
        this.add(peso);
        this.add(textoAltura);
        this.add(altura);
        this.add(boton);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        double peso = Double.parseDouble(this.peso.getText());
        double altura = Double.parseDouble(this.altura.getText());
        
        double imc = peso / (altura*altura);
        
        JOptionPane.showMessageDialog(this, "Su IMC es: " + imc + ".");
        
    }
    
    public static void main(String[] args){
        
        Actividad1 v = new Actividad1();  
        v.setVisible(true);
        
    }
    
}
