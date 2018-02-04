/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurante;

import javax.swing.table.DefaultTableModel;

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
    Mesero mesero = new Mesero();
    Mesas mesas = new Mesas();
    NuevaCuenta nuevaCuenta = new NuevaCuenta();
    ManipularCuentas manipularCuentas = new ManipularCuentas();
    int[] mesasCopadas = new int[20];
    AgregarCuenta agregarCuenta = new AgregarCuenta();
    //Sopas sopas = new Sopas();
}
