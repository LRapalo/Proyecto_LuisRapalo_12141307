package proyecto_luisrapalo_12141307;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;

public class Base_de_datos {
    public String Base_Datos;
    public Connection BDConexion;
    public Statement Query;

    public Base_de_datos (String Base_Datos) {
        this.Base_Datos = Base_Datos;
    }

    public String getBase_Datos() {
        return Base_Datos;
    }

    public void setBase_Datos(String Base_Datos) {
        this.Base_Datos = Base_Datos;
    }

    public void Conectar() {
        try {
            String Driver = "jdbc:ucanaccess://";
            BDConexion = DriverManager.getConnection(Driver + Base_Datos, "", "");
            Query = BDConexion.createStatement();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void Desconectar() {
        try {
            Query.close();
            BDConexion.close();
        } catch (Exception e) {
        }
    }

    public void Commit() {
        try {
            BDConexion.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
