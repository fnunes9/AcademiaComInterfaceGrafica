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

public class AcademiaComInterfaceGrafica extends JFrame {

    private final JButton homem;
    private final JButton mulher;
    
    public AcademiaComInterfaceGrafica(){
        homem=new JButton("Homem");
        homem.setBounds(110, 200, 150, 50);
       // homem.setVisible(true);
        add(homem);
        
        mulher=new JButton("Mulher");
        mulher.setBounds(110, 260, 150, 50);
        //mulher.setVisible(true);
        add(mulher);
    }
    
    

    public static void main(String[] args) {
        AcademiaComInterfaceGrafica form = new AcademiaComInterfaceGrafica(); // Título do programa 
        
        //Exibindo a janela
        form.setBounds(100, 200, 400, 600);
        form.setLayout(null);
        form.setVisible(true);
        form.setLocationRelativeTo(null);
        form.setResizable(false);
        form.setDefaultCloseOperation(EXIT_ON_CLOSE);
        form.setTitle("FitTech - Calcule sua mensalidade!");

        /*Configurando campo de texto
        entrada.setBounds(110, 150, 150, 30);
        entrada.setVisible(true);*/
    }

}
