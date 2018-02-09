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
import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author edu
 */
public class MySQL {

    private static Connection Conexion;

    public void MySQLConnection(String user, String pass, String db_name) throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + db_name, user, pass);
            JOptionPane.showMessageDialog(null, "Se ha iniciado la conexion con el servidor de forma exitosa");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No se ha iniciado la conexion con el servidor de forma exitosa 1");
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se ha iniciado la conexion con el servidor de forma exitosa 2");
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void closeConnection() {
        try {
            Conexion.close();
            JOptionPane.showMessageDialog(null, "Se ha finalizado la conexion con el servidor");
        } catch (SQLException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void createDB(String name) throws Exception {
        try {
            String Query = "CREATE DATABASE " + name;
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            closeConnection();
            MySQLConnection("root", "GerEman0034", "prueba");
            JOptionPane.showMessageDialog(null, "Se ha creado la base de datos " + name + " de forma exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void createTable(String name) {
        try {
            String Query = "CREATE TABLE " + name + ""
                    + "(ID VARCHAR(25),Nombre VARCHAR(50), Apellido VARCHAR(50),"
                    + " Edad VARCHAR(3), Sexo VARCHAR(1))";

            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Se ha creado la tabla " + name + " de forma exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(MySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertData(String table_name, String ID, String name, String lastname, String age, String gender) {
        try {
            String Query = "INSERT INTO " + table_name + " VALUES('" + ID + "'" + ","
                    + "'" + name + "'" + "," + "'" + lastname
                    + "'" + "," + "'" + age + "'" + "," + "'"
                    + gender + "'" + ")";
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos");
        }
    }

    public void getValues(String table_name) {
        try {
            String Query = "SELECT * FROM " + table_name;
            Statement st = Conexion.createStatement();
            java.sql.ResultSet resultSet;
            resultSet = st.executeQuery(Query);

            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getString("ID") + " "
                        + "Nombre: " + resultSet.getString("Nombre") + " "
                        + resultSet.getString("Apellido") + " "
                        + "Edad: " + resultSet.getString("Edad") + " "
                        + "Sexo: " + resultSet.getString("Sexo"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la adquisicion de datos");
        }
    }

    public void deleteRecord(String table_name, String ID) {
        try {
            String Query = "DELETE FROM " + table_name + " WHERE cedula = " + ID;
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Empleado borrado exitosamente");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error borrando el registro especificado");
        }
    }

    public String obtenerCargo(String table_name, String usuario) throws SQLException {
        String Query = "SELECT * FROM " + table_name + " where usuario = " + "'" + usuario + "'";
        Statement st = Conexion.createStatement();
        java.sql.ResultSet resultSet;
        resultSet = st.executeQuery(Query);
        String variable = "nulo";
        while (resultSet.next()) {
            variable = resultSet.getString("cargo");
        }
        return variable;
    }

    public String obtenerContrasenia(String table_name, String usuario) throws SQLException {
        String Query = "SELECT * FROM " + table_name + " where usuario = " + "'" + usuario + "'";
        Statement st = Conexion.createStatement();
        java.sql.ResultSet resultSet;
        resultSet = st.executeQuery(Query);
        String variable = "nulo";
        while (resultSet.next()) {
            variable = resultSet.getString("contrasenia");
        }
        return variable;
    }

    public void insertarEmpleado(String table_name, String cedula, String nombre, String apellido, String sexo, String edad, String telefono, String cargo, String usuario, String contrasenia) {
        try {
            String Query = "INSERT INTO " + table_name + " VALUES('" + cedula + "'" + ","
                    + "'" + nombre + "'" + ","
                    + "'" + apellido + "'" + ","
                    + "'" + edad + "'" + ","
                    + "'" + sexo + "'" + ","
                    + "'" + telefono + "'" + ","
                    + "'" + cargo + "'" + ","
                    + "'" + usuario + "'" + ","
                    + "'" + contrasenia + "'" + ")";
            System.out.println(Query);
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos");
        }
    }

    public void obtenerTablaEmpleado(DefaultTableModel modeloTabla) {
        try {
            String Query = "SELECT * FROM empleado";
            Statement st = Conexion.createStatement();
            java.sql.ResultSet resultSet;
            resultSet = st.executeQuery(Query);
            Object datos[] = new Object[9];

            while (resultSet.next()) {
                for (int i = 0; i < 9; i++) {
                    datos[i] = resultSet.getObject(i + 1);
                }
                modeloTabla.addRow(datos);
            }
            resultSet.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la adquisicion de datos");
        }
    }

    public void obtenerPlatosPorCategoria(JList<String> jList, String categoria) {
        try {
            String Query = "SELECT nombre FROM menu where categoria=" + "'" + categoria + "'";
            Statement st = Conexion.createStatement();
            java.sql.ResultSet resultSet;
            resultSet = st.executeQuery(Query);
            Object[][] objeto = ResultSetToArray(resultSet);
            String labels[] = new String[objeto.length];
            for (int i = 0; i < objeto.length; i++) {
                labels[i] = (String) objeto[i][0];
            }
            jList.setListData(labels);
            resultSet.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la adquisicion de datos");
        }
    }

    public int contarCuentas() {
        try {
            String Query = "select count(*) from cuentas";
            Statement st = Conexion.createStatement();
            java.sql.ResultSet resultSet;
            resultSet = st.executeQuery(Query);
            while (resultSet.next()) {
                System.out.println(Integer.parseInt(resultSet.getString("count(*)")));
                return Integer.parseInt(resultSet.getString("count(*)"));
            }

            resultSet.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la adquisicion de datos");
        }
        return 0;
    }

    public void insertarCuentaKey() throws SQLException {
        String Query = "insert into cuentas(orden) values (" + (contarCuentas() + 1) + ")";
        Statement st = Conexion.createStatement();
        st.executeUpdate(Query);
    }
    public void borrarCuentaKey() throws SQLException {
        String Query = "delete from cuentas where orden="+contarCuentas();
        Statement st = Conexion.createStatement();
        st.executeUpdate(Query);
    }
    public void asignarNombreCliente(String nombre) throws SQLException{
        String Query = "UPDATE cuentas SET cliente = '"+ nombre +"' WHERE orden="+contarCuentas();
        Statement st = Conexion.createStatement();
        st.executeUpdate(Query);
    }
    

    private Object[][] ResultSetToArray(ResultSet rs) {
        Object obj[][] = null;
        try {
            rs.last();
            ResultSetMetaData rsmd = rs.getMetaData();
            int numCols = rsmd.getColumnCount();
            int numFils = rs.getRow();
            obj = new Object[numFils][numCols];
            int j = 0;
            rs.beforeFirst();
            while (rs.next()) {
                for (int i = 0; i < numCols; i++) {
                    obj[j][i] = rs.getObject(i + 1);
                }
                j++;
            }
        } catch (Exception e) {
        }
        return obj;
    }
}
