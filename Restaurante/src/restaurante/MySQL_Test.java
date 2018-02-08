/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

/**
 * 
 *
 * @author Admin
 */
public class MySQL_Test{
    public static void main(String[] args) throws Exception {
        MySQL db = new MySQL();
        Credenciales c = new Credenciales();
        db.MySQLConnection(c.usuario, c.contrasenia, c.BD);        
        Sistema s = new Sistema();
        System.out.println(db.obtenerCargo("empleado", "anedacos"));
        s.setVisible(true);
    }
}
