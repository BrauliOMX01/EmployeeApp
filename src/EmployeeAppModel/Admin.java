package EmployeeAppModel;

/** Admin will represent the necessary data of an administrator who will have certain actions such as Insert, Delete, etc. in the program.
 * This extends the Person class so as not to repeat the same variables in both classes, only the missing ones are added.
 * @autor Olvera Moran Braulio
 */

public class Admin extends Person{
    private int idEmployee;
    private String roleEmployee;
    private double salaryEmployee;

    /**
     * It is of type int since the id is a number and it must return an Int (Int for the database).
     * @return returns the employee ID so that it can be displayed in other methods.
     */
    public int getIdEmployee() {
        return idEmployee;
    }

    /**
     * The method is of void type since it will only obtain the value of the idEmployee variable and should not return anything.
     * @param idEmployee represents the value of the Employee id.
     */
    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    /**
     * It is of type String since the employee role is a string and must return a String (Varchar for the database).
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
