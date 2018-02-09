/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

/**
 *
 * @author Antho
 */
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class Reloj extends JFrame
{
 private static final long serialVersionUID = 1L;
 
 JLabel reloj, hora;
 
 Reloj()
 {
  setTitle("Reloj");
  setLayout( new FlowLayout() );
  
  reloj = new JLabel("Reloj:");
  ThreadClock clock = new ThreadClock();//Creación de objeto tipo ThreadClock
  
  add( reloj );
  add( clock );//Se agrega el panel de la clase ThreadClock
  
  Thread hilo = new Thread( clock );//Se crea un hilo
  hilo.start();//Se inicia el hilo
  
  pack();
  setVisible( true );
  setDefaultCloseOperation( EXIT_ON_CLOSE );
 }
 
 public static void main( String args[] )
 {
  new Reloj();
 }
}
