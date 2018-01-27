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
public interface Credenciales {    
    MySQL db = new MySQL();
    String usuario="root";
    String contrasenia="GerEman0034";
    String BD="Restaurante";
    Administrador administrador = new Administrador();
    Sistema sistema=new Sistema();
    LoginAdmin loginAdmin = new LoginAdmin();
    AgregarEmpleado agregarEmpleado = new AgregarEmpleado();
    DespedirEmpleado despedirEmpleado = new DespedirEmpleado();
}
