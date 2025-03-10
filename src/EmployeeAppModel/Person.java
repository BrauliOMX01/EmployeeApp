package EmployeeAppModel;

/** Person will represent the values of a normal person since they will be needed in several classes of this program.
 * @autor Olvera Moran Braulio.
 */

public class Person {

    private String nameEmployee;
    private String lastEmployee;
    private String dateBirthEmployee;
    private String addressEmployee;
    private String phoneEmployee;

    /**
     * This method is of type String because the name is a String and return String  (Varchar in Data Base).
     * @return return the name of the Employee to be able to view it in other methods.
     */
    public String getNameEmployee() {
        return nameEmployee;
    }

    /**
     * The method is of void type since it will only obtain the value of the nameEmployee variable and should not return anything.
     * @param nameEmployee represents the value of the Employee's name.
     */
    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    /**\
     * It is of type String since the last names are a string and must return a String (Varchar for the database).
     * @return returns the employee's last names so they can be displayed in other methods.
     */
    public String getLastEmployee() {
        return lastEmployee;
    }

    /**
     * The method is of void type since it will only obtain the value of the lastEmployee variable and should not return anything.
     * @param lastEmployee represents the value of the Employee's last name.
     */
    public void setLastEmployee(String lastEmployee) {
        this.lastEmployee = lastEmployee;
    }

    /**
     * It is of type String because it is easier to obtain than with a DATE type, that is why it was assigned String (Varchar for the database).
     * @return returns the employee's date of birth so that it can be displayed in other methods.
     */
    public String getDateBirthEmployee() {
        return dateBirthEmployee;
    }

    /**
     * The method is of void type since it will only obtain the value of the DateBirthEmployee variable and should not return anything.
     * @param dateBirthEmployee represents the value of the Employee's date of birth.
     */
    public void setDateBirthEmployee(String dateBirthEmployee) {
        this.dateBirthEmployee = dateBirthEmployee;
    }

    /**
     * It is of type String since the address is a string and must return a String (Varchar for the database).
     * @return returns the employee's address so that it can be displayed in other methods.
     */
    public String getAdressEmployee() {
        return addressEmployee;
    }

    /**
     * The method is of void type since it will only obtain the value of the addressEmployee variable and should not return anything.
     * @param adressEmployee represents the value of the Employee's address.
     */
    public void setAdressEmployee(String adressEmployee) {
        this.addressEmployee = adressEmployee;
    }

    /**
     * It is of type String since the number is very large and is not supported by an int, that is why it was assigned a String (Varchar for the database).
     * @return Returns the employee number so that it can be displayed in other methods.
     */
    public String getPhoneEmployee() {
        return phoneEmployee;
    }

    /**
     * The method is of void type since it will only obtain the value of the phoneEmployee variable and should not return anything.
     * @param phoneEmployee represents the value of the Employee number.
     */
    public void setPhoneEmployee(String phoneEmployee){
        this.phoneEmployee = phoneEmployee;
    }

}
