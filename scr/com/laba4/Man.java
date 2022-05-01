package com.laba4;

public class Man {
    private String id;
    private String name;
    private String gender;
    private Division division = new Division();
    private String salary;
    private String birthDate;

    /**
     * Function for setting all parameters at one time and generation of division id (generated id is the code of letter in division name)
     * @param newId setting Id
     * @param newName setting Name
     * @param newGender setting Gender
     * @param newBirthDate setting Birthday Date
     * @param divName setting division name
     * @param newSalary setting salary
     */
    public void setAll(String newId, String newName, String newGender, String newBirthDate, String divName, String newSalary){
        id = newId.substring(1);
        name = newName;
        gender = newGender;
        division.setName(divName);
        division.setId((int)divName.charAt(0));
        salary = newSalary.substring(0,newSalary.length()-1);
        birthDate = newBirthDate;
    }

    /**
     * Setter for id
     * @param newId setting Id
     */

    public void setId(String newId){
        id = newId.substring(1);
    }

    /**
     * Getter for id
     * @return person's id
     */

    public String getId(){
        return id;
    }

    /**
     * Setter for name
     * @param newName setting name
     */

    public void setName(String newName){
        name = newName;
    }
    /**
     * Getter for name
     * @return person's name
     */
    public String getName(){
        return name;
    }
    /**
     * Setter for gender
     * @param newGender setting gender
     */
    public void setGender(String newGender){
        gender = newGender;
    }
    /**
     * Getter for gender
     * @return person's gender
     */
    public String getGender(){
        return gender;
    }

    /**
     * Setter for division name and generation of id
     * generated id is the code of letter in division name
     * @param divName name of setting division
     */
    public void setDivision(String divName){
        division.setName(divName);
        division.setId((int) divName.charAt(0));
    }
    /**
     * Getter for division id
     * @return person's division id
     */
    public int getDivisionID(){
        return division.getId();
    }
    /**
     * Getter for division name
     * @return person's division name
     */
    public  String getDivisionName(){
        return division.getName();
    }

    /**
     * Setter for salary
     * @param newSalary setting salary
     */
    public void setSalary(String newSalary){
        salary = newSalary.substring(0,newSalary.length()-1);
    }
    /**
     * Getter for salary
     * @return person's salary
     */
    public String getSalary(){
        return salary;
    }

    /**
     * Setter for birthday date
     * @param newBirthDate setting birthday date
     */

    public void setBirthDate(String newBirthDate){
        birthDate = newBirthDate;
    }

    /**
     * Getter for birthday date
     * @return person's birthday date
     */

    public String getBirthDate(){
        return birthDate;
    }

}
