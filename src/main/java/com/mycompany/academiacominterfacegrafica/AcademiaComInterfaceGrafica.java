/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.academiacominterfacegrafica;

/**
 *
 * @author Fernanda
 */
import javax.swing.*;
public class AcademiaComInterfaceGrafica extends JFrame {
    public static void main(String[] args) {
        JFrame janela = new JFrame ("Teste");
        JPanel painel=new JPanel();
        
        janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
        janela.add(painel);
        janela.setSize(600,400);
        janela.setVisible(true);
    }
}
