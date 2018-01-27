/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

/**
 *
 * @author Admin
 */
public class MySQL_Test implements Credenciales{
    public static void main(String[] args) throws Exception {
        db.MySQLConnection(usuario, contraseña, BD);        
        Sistema s = new Sistema();
        System.out.println(db.obtenerCargo("empleado", "anedacos"));
        s.setVisible(true);/*
        Window w = new Window();
        w.setVisible(true);*/
        
        /*String table_name="Nombre_tabla";
        String ID="ID";
        String name ="name";
        String lastname="LastName";
        String age="edad";
        String gender ="genero";
        
        
        System.out.println("INSERT INTO " + table_name + " VALUES('"+ID+"'"+","+"'"+name+"'"+","+"'"+lastname+"'"+","+"'"+age+"'"+","+"'"+gender+"'"+")");
        MySQL db = new MySQL();
        db.MySQLConnection("root","admin", "prueba");
        db.createTable("TablaDePrueba");
        db.insertData("TablaDePrueba", "1", "2","3","4","5");*/
        /*MySQL db = new MySQL();
        db.MySQLConnection("root","admin", "prueba");
        //db.createTable("TablaDePrueba");
        db.insertData("TablaDePrueba", "0931461016", "Anthony","3","4","5");*/
    }
}
