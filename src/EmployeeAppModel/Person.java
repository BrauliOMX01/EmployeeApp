package EmployeeAppModel;

/** Person va a representar los valores de una persona normal ya que seran necesarios en varias clases de este programa.
 * @autor Olvera Moran Braulio.
 */

public class Person {

    private String nameEmployee;
    private String lastEmployee;
    private String dateBirthEmployee;
    private String addressEmployee;
    private String phoneEmployee;

    /**
     * Es de tipo String ya que el nombre es una cadena y nos debe regresar un String (Varchar para la base de datos).
     * @return devuelve el nombre del empleado para poder visualizarlo en otros metodos.
     */
    public String getNameEmployee() {
        return nameEmployee;
    }

    /**
     * El metodo es de tipo void ya que solo obtendra el valor de la variable nameEmployee y no nos debe devolver nada.
     * @param nameEmployee representa el valor del nombre del Empleado..
     */
    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    /**\
     * Es de tipo String ya que los apellidos son una cadena y nos debe regresar un String (Varchar para la base de datos).
     * @return devuelve los apellidos del empleado para poder visualizarlos en otros metodos.
     */
    public String getLastEmployee() {
        return lastEmployee;
    }

    /**
     * El metodo es de tipo void ya que solo obtendra el valor de la variable lastEmployee y no nos debe devolver nada.
     * @param lastEmployee representa el valor de los apellidos del Empleado..
     */
    public void setLastEmployee(String lastEmployee) {
        this.lastEmployee = lastEmployee;
    }

    /**
     * Es de tipo String porque es mas facil obtenerla asi que con un tipo DATE, por eso se le asigno String (Varchar para la base de datos).
     * @return devuelve la fecha de nacimiento del empleado para poderla visualizarla en otros metodos.
     */
    public String getDateBirthEmployee() {
        return dateBirthEmployee;
    }

    /**
     * El metodo es de tipo void ya que solo obtendra el valor de la variable DateBirthEmployee y no nos debe devolver nada.
     * @param dateBirthEmployee representa el valor de la fecha de nacimiento del Empleado..
     */
    public void setDateBirthEmployee(String dateBirthEmployee) {
        this.dateBirthEmployee = dateBirthEmployee;
    }

    /**
     * Es de tipo String ya que la direccion es una cadena y nos debe regresar un String (Varchar para la base de datos).
     * @return devuelve la direccion del empleado para poder visualizarlo en otros metodos.
     */
    public String getAdressEmployee() {
        return addressEmployee;
    }

    /**
     * El metodo es de tipo void ya que solo obtendra el valor de la variable adressEmployee y no nos debe devolver nada.
     * @param adressEmployee representa el valor de la direccion del Empleado..
     */
    public void setAdressEmployee(String adressEmployee) {
        this.addressEmployee = adressEmployee;
    }

    /**
     * Es de tipo String ya que el numero es muy grande y no lo soporta un int, por eso se le asigno String (Varchar para la base de datos).
     * @return devuelve el numero del empleado para poder visualizarlo en otros metodos.
     */
    public String getPhoneEmployee() {
        return phoneEmployee;
    }

    /**
     * El metodo es de tipo void ya que solo obtendra el valor de la variable phoneEmployee y no nos debe devolver nada.
     * @param phoneEmployee representa el valor del numero del Empleado.
     */
    public void setPhoneEmployee(String phoneEmployee){
        this.phoneEmployee = phoneEmployee;
    }

}
