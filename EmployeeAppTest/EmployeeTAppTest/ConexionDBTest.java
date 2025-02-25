package EmployeeTAppTest;

/**
 * ConexionDBTest va a realizar las pruebas correspondientes a las acciones Conectar y ejecutar del programa a la base de datos opara que funcionen correctamente.
 * @autor Olvera Moran Braulio
 */
import EmployeeAppUtil.ConexionDB;
import org.junit.jupiter.api.Test;
import java.sql.SQLException;
import static org.junit.jupiter.api.Assertions.*;


class ConexionDBTest {
    /**
     * Es de tipo void el metodo testConectar ya que solo nos dira si existe conexion o no a la base de datos y esto sera con un if el cual tendra una variable Booleana.
     */
    @Test
    public void testConectar() {
        ConexionDB conexionDB = new ConexionDB();
        boolean exito = conexionDB.conectar();
        assertTrue(exito);
        if (exito == true) {
            try {
                conexionDB.desconectar();
            } catch (SQLException e) {
                System.out.println("No pude desconectarme:" + e.getMessage());
            }
        }
    }

    /**
     * Este metodo es de tipo void ya que solo ejecutara la funcion insertar valores a la base de datos, se usa tambien un assertTrue para verificar si se seralizo correctamente el metodo.
     * @throws SQLException se agrego ya que pudo haber una excepcion de error, tales como que no pudo conectarse, valor erroneo, entre otros.
     */
    @Test
    public void testEjecutar() throws SQLException {
        ConexionDB conexionDB = new ConexionDB();
        //POOL DE CONEXIONES nos ayuda a reutilizar las conexiones
        boolean exito = conexionDB.conectar();
        if (exito == true) {
            String sql = "INSERT INTO employee (idEmployee, nameEmployee, lastEmployee, dateBirthEmployee, addressEmployee, numberEmployee, salaryEmployee, roleEmployee) VALUES ('4', 'Maria' , 'Alvarado Montiel' , '12 - 05 - 1993' , 'Calle 4 CTM, edifico 8, Mz. H, Real de Tultepec' , '5545987321' , '7000', 'Licenciada')";
            int cuantos = conexionDB.ejecutar(sql);
            assertTrue(cuantos > 0);
            conexionDB.desconectar();
        }
    }
}