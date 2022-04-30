package com.laba4;

public class Man {
    private String id;
    private String name;
    private String gender;
    private Devision devision = new Devision();
    private String salary;
    private String birthDate;

    public void setAll(String newId, String newName, String newGender, String newBirthDate, String divName, String newSalary){
        id = newId.substring(1);
        name = newName;
        gender = newGender;
        devision.setName(divName);
        devision.setId((int)divName.charAt(1));
        salary = newSalary.substring(0,newSalary.length()-1);
        birthDate = newBirthDate;
    }

    public void setId(String newId){
        id = newId.substring(1);
    }
    public String getId(){
        return id;
    }

    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }

    public void setGender(String newGender){
        gender = newGender;
    }
    public String getGender(){
        return gender;
    }

    public void setDevision(String divName){
        devision.setName(divName);
        devision.setId((int) divName.charAt(1));
    }
    public int getDevisionID(){
        return devision.getId();
    }
    public  String getDevisionName(){
        return devision.getName();
    }


    public void setSalary(String newSalary){
        salary = newSalary.substring(0,newSalary.length()-1);
    }
    public String getSalary(){
        return salary;
    }


    public void setBirthDate(String newBirthDate){
        birthDate = newBirthDate;
    }
    public String getBirthDate(){
        return birthDate;
    }

}
