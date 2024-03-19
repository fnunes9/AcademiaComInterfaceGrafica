/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.academiacominterfacegrafica;

/**
 *
 * @author fernanda.nunes
 */
import java.awt.Component;
import javax.swing.*;
import java.awt.event.*;

public class AcademiaComInterfaceGrafica extends JFrame {

    

    public static void main(String[] args) {
        JFrame form = new JFrame("FitTech - Calcule sua mensalidade!"); // Título do programa  
        JButton homem = new JButton("Homem"); // Botão Homem
        JButton mulher = new JButton("Mulher"); // Botão Mulher
        JTextField entrada = new JTextField();

        // Scanner entrada = new Scanner(System.in); // Dados a partir do teclado, temporário pois farei com IG
        // Configurando o botão Mensalidade Homem
        homem.setBounds(110, 200, 150, 50);
        homem.setVisible(true);
        homem.addActionListener((ActionEvent e) -> {
            //int idadeHomem = entrada.nextInt();
            Component idadeHomem = homem.add(entrada);
           // int idadeHomem = Integer.parseInt(entrada.getText());
            //int mensalidade = Cliente.CalculaMensalidade(idadeHomem, idadeHomem);
            //System.out.println(Cliente.CalculaMensalidade(idadeHomem, idadeHomem));
            //JOptionPane.showMessageDialog(null, mensalidade);
        });

        // Configurando o botão Mensalidade Mulher
        mulher.setBounds(110, 260, 150, 50);
        mulher.setVisible(true);
        mulher.addActionListener((ActionEvent e) -> {
            //int idadeMulher = entrada.nextInt();
            //JOptionPane.showMessageDialog(null, idadeMulher);
        });

        //Exibindo a janela
        form.setBounds(100, 200, 400, 600);
        form.setLayout(null);
        form.setVisible(true);
        form.setDefaultCloseOperation(EXIT_ON_CLOSE);
        form.add(homem);
        form.add(mulher);

        //Configurando campo de texto
        entrada.setBounds(110, 150, 150, 30);
        entrada.setVisible(true);
    }

}
