/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package health.software;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author urrea
 */

public class HealthSoftware extends JFrame{

    /**
     * @param args the command line arguments
     */
    
    Administrador administrador;
    Afiliados afiliados;
    Banco banco;
    Inicio inicio;
    InicioSesionAdmin isAdmin;
    InicioSesionAfiliado isAfiliado;
    InicioSesionBanco isBanco;
    
    public HealthSoftware(){
        super("HealthSoftware");
        this.setSize(1200,650);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(200,200,200));
        this.setResizable(false);
        //setLayout(null);
        setIconImage(new ImageIcon(getClass().getResource("/img/logo.png")).getImage());
        
        administrador = new Administrador(this);
        afiliados = new Afiliados(this);
        banco = new Banco(this);
        inicio = new Inicio(this);
        isAdmin = new InicioSesionAdmin(this);
        isAfiliado = new InicioSesionAfiliado(this);
        isBanco = new InicioSesionBanco(this);
        
        add(administrador);
        add(afiliados);
        add(banco);
        
        add(isAdmin);
        add(isAfiliado);
        add(isBanco);
        add(inicio);
        
        //inicio.setVisible(true);
        
       
        /*JPanel panel = new JPanel();
        panel.setBackground(Color.red);
        this.add(panel);
        panel.setVisible(true);*/
        
        this.setVisible(true);
    }
    public static void main(String[] args) {
        HealthSoftware ventana  = new  HealthSoftware();
    }
    
}
