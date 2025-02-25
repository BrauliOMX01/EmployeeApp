package EmployeeAppUtil;

/** ConexionDB es una clase cuya funcion tendra conectarse a la base de datos, aqui se dara el usuario, contrasena, url y base de datos a conectarse
 * @autor Olvera Moran Braulio.
 */
import java.sql.*;
public class ConexionDB {

    private Connection conexion;

    /**
     * Este metodo es de tipo booleano ya que aqui se conectara el programa a la base de datos y si tiene exito pues regresara TRUE y si no, sera FALSE
     * @return devuelve si tuvo exito la conexion con la base de datos o no.
     */
    public boolean conectar() {
        String url = "jdbc:mysql://127.0.0.1:3306/employeesapp";
        try { // Yo atrapo el error
            this.conexion = DriverManager.getConnection(url,"root","1234");
            return true;
        } catch (SQLException sqle) { // Yo me hago responsable
            System.err.println(sqle.getMessage());
            return false;
        }
    }

    /**
     * Este metodo es entero ya que nos va a devolver un valor numerico si es que se ejecuta o no la condicion.
     * @param sql representa el lenguaje para la conexion con la base de datos, el cual nos permitira insertar, modificar, en este caso ejecutar la conexion con la misma.
     * @return devuelve los valores que se hayan insertado, modificado en la base de datos.
     * @throws SQLException nos ayuda a detectar si hay un error en el codigo y nos dice que debemos hacer en caso de que haya alguno.
     */
    public int ejecutar(String sql) throws SQLException {
        Statement sentencia = this.conexion.createStatement();
        return sentencia.executeUpdate(sql); // ExecuteUpdate permite insertar actualizar datos y ademas dice cuanto registros se modificaron
    }

    /**
     *Este metodo es ResultSet ya que nos va a dar todas las filas de la consulta en la base de datos.
     * @param select represente la seleccion de cada campo en el que se vaya a consultar en la base de datos.
     * @return devuelve los valores seleccionados en la base de datos.
     * @throws SQLException nos ayuda a detectar si hay un error en el codigo y nos dice que debemos hacer en caso de que haya alguno.
     */
    public ResultSet consultar(String select) throws SQLException{
        Statement sentencia = this.conexion.createStatement();
        return sentencia.executeQuery(select);
    }

    /**
     *Este metodo es void ya que solo desconectara el programa con la base de datos por seguridad de la misma.
     * @throws SQLException nos ayuda a detectar si hay un error en el codigo y nos dice que debemos hacer en caso de que haya alguno.
     */

    public void desconectar() throws SQLException { // Throws es para decir que alguien mas se haga responsable
        if (this.conexion != null) {
            this.conexion.close();
            // Si es un error muy importante, se usa TRY - CATCH y si es un error no tan
            // importante se usa THROWS
        }
    }
}
