/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author alumno
 */
public class Actividad3 extends JFrame implements ActionListener{
    
    private JLabel nombreTexto;
    private JTextField nombre;
    
    private JLabel emailTexto;
    private JTextField email;
    
    private JLabel passTexto;
    private JTextField pass;
    
    private JLabel repitePassTexto;
    private JTextField repitePass;
    
    private JButton botonEnviar;
    private JButton botonCargar;
    
    public Actividad3(){
        
        
        super();
        configurarVentana();
        inicializarComponentes();
    }
    
    private void configurarVentana() {
        this.setTitle("Formulario"); 
        this.setSize(310, 210); 
        this.setLocationRelativeTo(null); 
        this.setLayout(null); 
        this.setResizable(false); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    
    private void inicializarComponentes() {
        
        nombreTexto = new JLabel();
        nombre = new JTextField();
        
        emailTexto = new JLabel();
        email = new JTextField();
        
        passTexto = new JLabel();
        pass = new JTextField();
        
        repitePassTexto= new JLabel();
        repitePass = new JTextField();
        
        botonEnviar = new JButton();
        botonCargar = new JButton();
         
        nombreTexto.setText("Nombre"); 
        nombreTexto.setBounds(50, 50, 100, 25); 
        nombre.setBounds(150, 50, 100, 25);
        
        emailTexto.setText("Email"); 
        emailTexto.setBounds(50, 70, 100, 25); 
        email.setBounds(150, 70, 100, 25);
        
        passTexto.setText("Contraseña"); 
        passTexto.setBounds(50, 90, 100, 25); 
        pass.setBounds(150, 90, 100, 25);
        
        repitePassTexto.setText("Repite Contraseña"); 
        repitePassTexto.setBounds(50, 110, 100, 25); 
        repitePass.setBounds(150, 110, 100, 25);
        
        botonEnviar.setText("Enviar"); 
        botonEnviar.setBounds(20, 150, 100, 30); 
        botonEnviar.addActionListener(this); 
        
        botonCargar.setText("Cargar"); 
        botonCargar.setBounds(170, 150, 100, 30); 
        botonCargar.addActionListener(this);
        
        this.add(nombreTexto);
        this.add(nombre);
        this.add(emailTexto);
        this.add(email);
        this.add(passTexto);
        this.add(pass);
        this.add(repitePassTexto);
        this.add(repitePass);
        
        this.add(botonEnviar);
        this.add(botonCargar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        JButton pulsado = (JButton)e.getSource();
        
        if(pulsado == botonEnviar){
            
            PrintWriter pw = null;
        
            try {
            
                pw = new PrintWriter(new FileWriter("formulario.txt"));
            
                if(pass.getText().equals(repitePass.getText())){
                    pw.println(nombre.getText() +";"+ email.getText() +";"+ pass.getText());
                    JOptionPane.showMessageDialog(this, "Datos enviados al fichero formulario.txt");
                }
                else{
                    JOptionPane.showMessageDialog(this, "La contraseña no coincide, vuelva a escribirla.");
                }
            
            
            } catch (IOException ex) {
                System.out.println("Error de E/S");
            }
            finally{
                pw.close();
            }
            
        }
        
        if(pulsado == botonCargar){
            
            BufferedReader br = null;
            
            try {
                
                br = new BufferedReader(new FileReader("formulario2.txt"));
                
                String linea;
                
                //No se necesita bucle porque solo se guarda una línea
                while((linea = br.readLine()) != null){
                    
                    String[] campos = linea.split("\\;");
                    
                    nombre.setText(campos[0]);
                    email.setText(campos[1]);
                    pass.setText(campos[2]);
                    
                }
                
            } catch (FileNotFoundException ex) {
                System.out.println("Error al acceder al fichero");
            } catch (IOException ex) {
                System.out.println("Error de E/S");
            }
            finally{
                try {
                    br.close();
                } catch (IOException ex) {
                    System.out.println("Error de E/S");
                }
            }
            
        }
          
        
    }
    
    public static void main(String[] args){
        
        Actividad3 v = new Actividad3();  
        v.setVisible(true);
        
    }
    
}
