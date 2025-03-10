package EmployeeTAppTest;

/** AdminDAOTest va a hacer los test respectivos sobre las acciones que tendra el administrador, acciones como insertar, consultar, actualizar y eliminar empleados operen correctamente.
 * @autor Olvera Moran Braulio.
 */

import EmployeeAppDAO.AdminDAO;
import EmployeeAppModel.Admin;
import org.junit.jupiter.api.Test;
import java.sql.SQLException;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;


class AdminDAOTest {
    /**
     * Este metodo es void ya que solo realizara la accion insertar valores a la base de datos pero no regresara nada.
     * @throws SQLException se usa el throws SQLException ya que hay posibilidad de qye haya algun error al ejecutar esta accion.
     */

    @Test
    public void testInsert() throws SQLException {

        AdminDAO adminDAO = new AdminDAO();
        Admin employee = new Admin();
        employee.setIdEmployee(6);
        employee.setNameEmployee("Roberto");
        employee.setLastEmployee("Gomez Bolanos");
        employee.setDateBirthEmployee("12 - 02 - 2000 ");
        employee.setAdressEmployee("Hda. Pensamientos Lt. 4-A, Mz.12, Real de Tultepec");
        employee.setPhoneEmployee("5637534589");
        employee.setSalaryEmployee(56795);
        employee.setRoleEmployee("Contador");
        int cuantos = adminDAO.insert(employee);
        assertTrue (cuantos > 0);
        testConsult();
    }

    /**
     * El metodo es void ya que solo Consultara la base de datos, para esto se usaron Listas para imprimir los valores.
     * @throws SQLException se coloco ya que hay posibilidades de error, error de conexion, que falta un error, entre otros.
     */

    @Test
    public void testConsult () throws SQLException{
        AdminDAO adminDAO = new AdminDAO();
        List<Admin> employees = adminDAO.consult();
        assertTrue(employees.size()>0);
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("                                          TABLE EMPLOYEES                             ");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------------");
        for(Admin employee : employees) {
            System.out.println(employee.getIdEmployee() + " | " + employee.getNameEmployee() + " | " + employee.getLastEmployee() + " | " + employee.getDateBirthEmployee() + " | " + employee.getAdressEmployee() + " | " + employee.getPhoneEmployee() + " | " + employee.getSalaryEmployee() + " | " + employee.getRoleEmployee());

        }
    }

    /**
     * El metodo es void ya que solo actualizara valores de la base de datos y no devolvera nada, se uso el Boolean ya que este nos dira si fue TRUE O FALSE la accion.
     * @throws SQLException se coloco ya que hay posibilidades de error, error de conexion, que la peticion no se pueda relizar, que no exista el valor a editar, entre otros.
     */

    @Test
    public void testUpdate() throws SQLException{
    AdminDAO adminDAO = new AdminDAO();
    Admin employee = new Admin();
    employee.setIdEmployee(4);
    employee.setNameEmployee("Andrew");
    employee.setLastEmployee("Martinez Olvera");
        //employee.setDateBirthtEmployee("");
        //employee.setAdressEmployee("");
        //employee.setPhoneEmployee("");
        //employee.setSalaryEmployee();
        //employee.setRoleEmployee("");
    boolean cuantos = adminDAO.update(employee);
    assertTrue (cuantos =  true);
        System.out.println("Se actualizo el employee con el id: " + employee.getIdEmployee());
    testConsult();

    }

    /**
     * El metodo es void ya que solo eliminar valores de la base de datos y no devolvera nada, se uso el Boolean ya que este nos dira si fue TRUE O FALSE la accion.
     * @throws SQLException se coloco ya que hay posibilidades de error, error de conexion, que la peticion no se pueda relizar, que no exista el valor a eliminar, entre otros.
     */

    @Test
    public void testDelete() throws SQLException{
        AdminDAO adminDAO = new AdminDAO();
        Admin employee = new Admin();
        employee.setIdEmployee(6);
        boolean cuantos = adminDAO.delete(employee);
        assertTrue (cuantos =  true);
        testConsult();
    }
}