/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication19;

import java.awt.Color;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class Acertijo {
static int contador = 0;
static int contador2 = 0;



    public static void main(String[] args) {
        
        JFrame ventanita = new JFrame ("Acertijo");
        
        ventanita.setDefaultCloseOperation(3);
        ventanita.setBounds(180, 50, 600, 600);
        
        
        
        JTabbedPane tabpanel = new JTabbedPane();
        JPanel p1 = new JPanel();
        JLabel label = new JLabel("Código:");
        JPasswordField passwordField = new JPasswordField(10);
        JButton button = new JButton("Ingresar");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                char[] password = passwordField.getPassword();
                String passwordString = new String(password);
                if (passwordString.equals("388576")) {
                    JOptionPane.showMessageDialog(null, "¡Lo lograste, descubriste el código secreto!");
                } else {
                    JOptionPane.showMessageDialog(null, "Sigue intentando");
                }
            }
        });
        p1.add(label);
        p1.add(passwordField);
        p1.add(button);
        ///////////////////
        tabpanel.addTab("Código", p1);
        ////////////////
        
        JPanel p2 = new JPanel();
        tabpanel.addTab("Primer reto", p2);
        p2.setBackground(new Color(135, 206, 250));
        JLabel cod1 = new JLabel("38");
        cod1.setForeground(new Color(135, 206, 250));
        cod1.setBounds(200, 150, 80, 80);
        cod1.setFont(new Font("Arial", Font.PLAIN, 20));
        p2.add(cod1);
        JLabel cod2 = new JLabel("53*");
        cod2.setBounds(200, 200, 80, 80); 
        cod2.setFont(new Font("Arial", Font.PLAIN, 20));
        cod2.setForeground(new Color(135, 206, 250));
        p2.add(cod2);
        JButton b1 = new JButton("scoop didi woop");
        b1.setBounds(100, 100, 150, 30); 
        p2.add(b1);
        p2.setLayout(null);
        //////////////
        
        JPanel p3 = new JPanel();
        tabpanel.addTab("Segundo reto", p3);
        String[] opciones = {"123*", "7283*", "214*", "85", "21*", "398*", "57*"};
        JComboBox<String> comboBox = new JComboBox<>(opciones);
        p3.add(comboBox);
        /////////////////
        
        JPanel inicio = new JPanel();
        inicio.setBackground(Color.gray);
        JButton boton = new JButton("Boton secreto");
        boton.setBounds(100, 100, 150, 30); 
        inicio.add(boton);
        JButton boton1 = new JButton("Algo hace este");
        boton1.setBounds(100, 150, 150, 30);
        inicio.add(boton1);
        JButton boton2 = new JButton("Algo hace este otro");
        boton2.setBounds(100, 200, 150, 30);
        JLabel cod3 = new JLabel("76");
        cod3.setForeground(Color.gray);
        cod3.setBounds(400, 150, 80, 80);
        cod3.setFont(new Font("Arial", Font.PLAIN, 20));
        inicio.add(cod3);
        JLabel cod4 = new JLabel("86*");
        cod4.setBounds(400, 200, 80, 80); 
        cod4.setFont(new Font("Arial", Font.PLAIN, 30));
        cod4.setForeground( Color.gray);
        inicio.add(cod4);
        inicio.add(boton2);       
        
        tabpanel.addTab("Tercer reto", inicio);
        inicio.setLayout(null);
        /////////////////////
        
        JPanel p5 = new JPanel();
        //tabpanel.addTab("?", p5);
        
        JPanel p6 = new JPanel();
        //tabpanel.addTab("?", p6);
        
        JPanel p7 = new JPanel();
        //tabpanel.addTab("?", p7);
        
        JPanel p8 = new JPanel();
        //tabpanel.addTab("?", p8);
        
        JPanel p9 = new JPanel();
        //tabpanel.addTab("?", p9);
        
        
        ventanita.add(tabpanel);
        /////////////
        
        boton.addActionListener((ActionEvent e) -> {
            //System.out.println("Clic en el boton.");  
            Acertijo.contador ++;
            //System.out.println("numero de clics "+ contador );  
            if (contador == 4){
                Acertijo.contador = 0;
            }
        });
        boton1.addActionListener((ActionEvent e) -> {
            Acertijo.contador2 ++;
            if (contador2 == 2){
                Acertijo.contador2 = 0;
            }
            System.out.println("numero de clics "+ contador2 );  
        });
        boton2.addActionListener((ActionEvent e) -> {
            if (contador == 3 && contador2 == 1 ){
                inicio.setBackground(new Color(127, 255, 212));                
            }    
        });
        /////////////////
        
        b1.addActionListener((ActionEvent e) -> {
        p2.setBackground(new Color(200, 162, 200));    
        });
        /////////////////
        
        ventanita.setVisible(true);
    }
    
}
