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
        JFrame form = new JFrame ("FitTech - Calcule sua mensalidade");
        JPanel painel=new JPanel();
        
        form.setBounds(100,200,600,400);
        form.setDefaultCloseOperation(EXIT_ON_CLOSE);
        form.add(painel);
        //form.setSize(600,400);
        form.setVisible(true);
    }
}
