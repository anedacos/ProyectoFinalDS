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
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class ThreadClock extends JPanel implements Runnable
{
 private static final long serialVersionUID = 1L;
 
 JLabel labelhour;
 int hora, minuto, segundo;
 
 public ThreadClock()
 {
  labelhour = new JLabel("");
  add( labelhour );//Se añade el label al panel
 }

 public void run()//Inicio del hilo
 {
  while( true )
  {
   Calendar calendar = Calendar.getInstance();
   Date hora = calendar.getTime();//Obtebemos los datos, hora, fecha 
         DateFormat dateformat = DateFormat.getTimeInstance();//Obtenemos la hora
         String horaActual = dateformat.format(hora);//formateamos para que nos retorne la hora
   
   labelhour.setText( horaActual );//Añadimos la hora al label
   
   try
         {
    Thread.sleep(1000);//Dormimos el hilo momentaneamente para que no se bloquee el programa
         }
         catch ( InterruptedException er )
         {
          er.printStackTrace();
         }
    }
 }
}