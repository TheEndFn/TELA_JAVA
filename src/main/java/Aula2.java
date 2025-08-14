/**
 *
 * @Filipe Nóbrega
 */
import javax.swing.*;
import java.awt.event.*;


public class Aula2 {
    
    public static void main(String[] args) {
        JFrame janela = new JFrame();
        
        janela.setSize(600,400);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLayout(null);
        janela.setLocationRelativeTo(null);
        janela.setVisible(true);
        
        
        JButton btnAbrir = new JButton("Abrir");
        btnAbrir.setBounds(140, 170, 160, 30);
        
        janela.add(btnAbrir);
        
        
        btnAbrir.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                abrirJanela();          
            }
    });
    
    }
    
    public static void abrirJanela() {
        JFrame janela2 = new JFrame();
        JLabel text = new JLabel("Filipe Nóbrega", SwingConstants.CENTER);
        
        janela2.setSize(400, 200);
        janela2.setTitle("Segunda janela.");
        janela2.setVisible(true);
        
        janela2.add(text);
    }
}   
