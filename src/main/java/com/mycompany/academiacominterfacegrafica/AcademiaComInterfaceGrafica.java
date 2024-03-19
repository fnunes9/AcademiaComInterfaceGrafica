/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.academiacominterfacegrafica;

/**
 *
 * @author fernanda.nunes
 */
import javax.swing.*;
import java.awt.event.*;
public class AcademiaComInterfaceGrafica extends JFrame {
    public static void main(String[] args) {
        JFrame form=new JFrame("FitTech - Calcule sua mensalidade!" );
        JButton homem=new JButton("Homem");
        JButton mulher = new JButton("Mulher");
        JSpinner entrada = new JSpinner(new SpinnerNumberModel(0,Integer.MIN_VALUE, Integer.MAX_VALUE,100));
        
        
        // Configurando o botão Mensalidade Homem
        homem.setBounds(110,200,150,50);
        homem.setVisible(true);
        homem.addActionListener((ActionEvent e) -> {
            int input = (int) entrada.getValue();
            JOptionPane.showMessageDialog(null, "Idade inserida: "+input);
        });
        
        // Configurando o botão Mensalidade Mulher
        mulher.setBounds(110,260,150,50);
        mulher.setVisible(true);
        
        //Exibindo a janela
        form.setBounds(100,200,400,600);
        form.setLayout(null);
        form.setVisible(true);
        form.setDefaultCloseOperation(EXIT_ON_CLOSE);
        form.add(homem);
        form.add(mulher);
    }
    
}
