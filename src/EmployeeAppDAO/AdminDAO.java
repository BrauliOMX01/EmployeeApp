package EmployeeAppDAO;

/** AdminDAO va a realizar las acciones que tiene un admin pero este sera utilizado en otras clases ya que solo sera el esqueleto.
 * @autor Olvera Moran Braulio.
 */

import EmployeeAppModel.Admin;
import EmployeeAppUtil.ConexionDB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdminDAO {
    private ConexionDB conexionDB = new ConexionDB();

    /**
     * Este metodo insertara datos en la base de datos pero solo sera el esqueleto ya que sera utilizado en otras clases.
     * @param employee representa el metodo para obtener los valores correspondientes del empleado.
     * @return devuelve si hubo algun problema.
     * @throws SQLException sirve para decirnos si hay algun error al ejecutar el codigo.
     */
    public int insertar (Admin employee) throws SQLException {
        conexionDB.conectar();
        Admin Employee = new Admin();

        String sql = "INSERT INTO employee (idEmployee, nameEmployee, lastEmployee, dateBirthEmployee, addressEmployee, numberEmployee, salaryEmployee, roleEmployee) values ('" + employee.getIdEmployee() + "' , '" + employee.getNameEmployee() + "' , '" + employee.getLastEmployee() + "' , '" + employee.getDateBirthEmployee() + "' , '" + employee.getAdressEmployee() + "' , '" + employee.getPhoneEmployee() + "' , '" + employee.getSalaryEmployee() + "' , '" + employee.getRoleEmployee()+"')";
        int cuantos = conexionDB.ejecutar(sql);
        conexionDB.desconectar();
        return cuantos;

    }

    /**
     * Este metodo actualizara datos en la base de datos pero solo sera el esqueleto ya que sera utilizado en otras clases.
     * @param employee representa el metodo para obtener los valores correspondientes del empleado.
     * @return devuelve si hubo algun problema.
     * @throws SQLException sirve para decirnos si hay algun error al ejecutar el codigo.
     */
    public boolean actualizar (Admin employee) throws SQLException{
        conexionDB.conectar();
        Admin Employee = new Admin();
        String sql = "UPDATE employee SET nameEmployee = '" + employee.getNameEmployee() + "', lastEmployee = '" + employee.getLastEmployee() + "' WHERE idEmployee=" + employee.getIdEmployee();
        int cuantos = conexionDB.ejecutar(sql);
        conexionDB.desconectar();
        if(cuantos > 0) {
            return true;
        }else {
            return false;
        }
    }

    /**
     *
     * Este metodo eliminara datos en la base de datos pero solo sera el esqueleto ya que sera utilizado en otras clases.
     * @param employee representa el metodo para obtener los valores correspondientes del empleado.
     * @return devuelve si hubo algun problema.
     * @throws SQLException sirve para decirnos si hay algun error al ejecutar el codigo.
     */
    public boolean eliminar (Admin employee) throws SQLException{
        conexionDB.conectar();
        Admin Employee = new Admin();
        String sql = "DELETE FROM employee WHERE idEmployee =" + employee.getIdEmployee();
        int cuantos = conexionDB.ejecutar(sql);
        conexionDB.desconectar();
        if(cuantos > 0) {
            return true;
        }else {
            return false;
        }
    }

    /**
     *Este metodo consultara los datos de la base de datos mediante listas e inmprimira los datos que tenga la misma.
     * @return devuelve cada valor de la lista, imprimiendo cada campo de la base de datos.
     * @throws SQLException sirve para decirnos si hay algun error al ejecutar el codigo.
     */
    public List<Admin> consultar () throws SQLException {
        conexionDB.conectar();
        Admin Employee = new Admin();
        String select = "SELECT * FROM employee";
        ResultSet rs = conexionDB.consultar(select);
        List<Admin> employees = new ArrayList<Admin>();
        while (rs.next()) {
            Admin employee = new Admin();
            employee.setIdEmployee(rs.getInt("idEmployee"));
            employee.setNameEmployee(rs.getString("nameEmployee"));
            employee.setLastEmployee(rs.getString("lastEmployee"));
            employee.setDateBirthEmployee(rs.getString("dateBirthEmployee"));
            employee.setAdressEmployee(rs.getString("addressEmployee"));
            employee.setPhoneEmployee(rs.getString("numberEmployee"));
            employee.setSalaryEmployee(rs.getDouble("salaryEmployee"));
            employee.setRoleEmployee(rs.getString("roleEmployee"));
            employees.add(employee);
        }
        conexionDB.desconectar();
        return employees;
    }

}
