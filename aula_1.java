// Author: Filipe Npobrega
// data: 12/08/2025
// Primeira aula de JAVA

package com.mycompany.mavenproject1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.SwingConstants;

public class Aula_1 {

    public static void main(String[] args) {
        JFrame janela_0 = new JFrame();
        JLabel texto = new JLabel("Olá Mundo", SwingConstants.CENTER);
        JFrame janela_1 = new JFrame();
        
        //Características relacionadas a tela
        janela_0.setSize(400,400);
        janela_0.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela_0.setVisible(true);
        janela_0.setLocationRelativeTo(null);
        janela_0.setTitle("Quebrando a maldição0");
        
        janela_1.setSize(400,400);
        janela_1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela_1.setVisible(true);
        janela_1.setLocationRelativeTo(null);
        janela_1.setTitle("Quebrando a maldição1");

        
        //Características relacioinadas aos textos
        janela_0.add(texto);
        janela_1.add(texto);
        
        
        
    }
}
