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

public class AcademiaComInterfaceGrafica extends JFrame implements ActionListener {

    private final JButton homem;
    private final JButton mulher;
    private final JTextField idade;

    public AcademiaComInterfaceGrafica() {
        homem = new JButton("Homem");
        homem.setBounds(110, 320, 150, 50);
        add(homem);
        //homem.addActionListener(this);

        mulher = new JButton("Mulher");
        mulher.setBounds(110, 260, 150, 50);
        add(mulher);

        add();

        idade = new JTextField("Digite sua idade, depois clique no sexo");
        idade.setBounds(55, 200, 250, 30);
        add(idade);
    }

    private void add() {
        homem.addActionListener(this);
        mulher.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == homem) {
            String entradaIdade = idade.getText(); // entrada da idade por meio de string
            int idadeHomem = Integer.parseInt(entradaIdade); //Convertendo String para int 
            JOptionPane.showMessageDialog(this, "Valor da mensalidade R$ " + Cliente.CalculaMensalidade(idadeHomem, idadeHomem)); // Exibindo o valor da mensalidade
        } else if (e.getSource() == mulher) {
            String entradaIdade = idade.getText(); // entrada da idade por meio de string
            int idadeMulher = Integer.parseInt(entradaIdade); //Convertendo String para int 
            JOptionPane.showMessageDialog(this, "Valor da mensalidade R$ " + Cliente.CalculaMensalidade(idadeMulher, idadeMulher)); // Exibindo o valor da mensalidade
        }
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
    }

}
