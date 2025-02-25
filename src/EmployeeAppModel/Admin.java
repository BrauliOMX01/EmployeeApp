package EmployeeAppModel;

/** Admin va a representar los datos necesarios de un administrador el cual tendra  ciertas acciones como Insertar, eliminar, etc. en el programa.
 * Esta extiende de la clase Person para no repetir las mismas variables en ambas clases, solo se agregan las faltantes.
 * @autor Olvera Moran Braulio
 */

public class Admin extends Person{
    private int idEmployee, opc;
    private String roleEmployee;
    private double salaryEmployee;

    /**
     * Es de tipo int ya que el id es un numero y nos debe regresar un Int (Int para la base de datos).
     * @return devuelve el id del empleado para poder visualizarlo en otros metodos.
     */
    public int getIdEmployee() {
        return idEmployee;
    }

    /**
     * El metodo es de tipo void ya que solo obtendra el valor de la variable idEmployee y no nos debe devolver nada.
     * @param idEmployee representa el valor del id del Empleado.
     */
    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    /**
     * Es de tipo String ya que el rol del empleado es una cadena y nos debe regresar un String (Varchar para la base de datos).
     * @return devuelve el rol del empleado para poder visualizarlo en otros metodos.
     */
    public String getRoleEmployee() {
        return roleEmployee;
    }

    /**
     * El metodo es de tipo void ya que solo obtendra el valor de la variable roleEmployee y no nos debe devolver nada.
     * @param roleEmployee representa el valor del rol del Empleado..
     */
    public void setRoleEmployee(String roleEmployee) {
        this.roleEmployee = roleEmployee;
    }

    /**
     * Es de tipo doulbe ya que el salario es un numero pero puede ser decimal tambien, entonces nos debe regresar un double (double para la base de datos).
     * @return devuelve el salario del empleado para poder visualizarlo en otros metodos.
     */
    public double getSalaryEmployee() {
        return salaryEmployee;
    }

    /**
     * El metodo es de tipo void ya que solo obtendra el valor de la variable salaryEmployee y no nos debe devolver nada.
     * @param salaryEmployee representa el valor del salario del Empleado..
     */
    public void setSalaryEmployee(double salaryEmployee) {
        this.salaryEmployee = salaryEmployee;
    }
}
