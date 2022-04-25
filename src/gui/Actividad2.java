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
public class Actividad2 extends JFrame implements ActionListener{

    private JLabel texto;
    private JTextField caja;
    private JButton boton;
    
    int num = (int)(Math.random()*100)+1;
    
    public Actividad2(){
        
        super();
        configurarVentana();
        inicializarComponentes();
    }
    
    private void configurarVentana() {
        this.setTitle("Adivina el número ("+num+")"); 
        this.setSize(310, 210); 
        this.setLocationRelativeTo(null); 
        this.setLayout(null); 
        this.setResizable(false); 
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }

    
    private void inicializarComponentes() {
        
        texto = new JLabel();
        caja = new JTextField(); 
        boton = new JButton();
         
        texto.setText("Inserte un número"); 
        texto.setBounds(50, 50, 100, 25); 
        caja.setBounds(150, 50, 100, 25);
        
        
        boton.setText("Comprobar"); 
        boton.setBounds(50, 100, 200, 30); 
        boton.addActionListener(this); 
        
        this.add(texto);
        this.add(caja);
        this.add(boton);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        //System.out.println(num);
        
        if(num == Integer.parseInt(caja.getText())){      
            JOptionPane.showMessageDialog(this, "Acertaste!");  
            num = (int)(Math.random()*100)+1;//vuelve a generar el numero
            this.setTitle("Adivina el número ("+num+")");//pone el nuevo número en el borde
        }
        else{
            if(num < Integer.parseInt(caja.getText())){
                JOptionPane.showMessageDialog(this, "El número es menor");
            }
            else{
                JOptionPane.showMessageDialog(this, "El número es mayor");
            }
            
        }
        
    }
    
    public static void main(String[] args){
        
        Actividad2 v = new Actividad2();  
        v.setVisible(true);
        
    }
    
    
    
}
