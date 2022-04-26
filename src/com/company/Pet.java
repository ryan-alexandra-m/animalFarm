package com.company;
import java.time.LocalDate;
import java.util.Date;
import java.time.ZoneId;

public class Pet {
    String breed;
    LocalDate dateOfBirth;
    String name;
    boolean needsRestraint;
    TypeOfAnimal animalType;

    public enum TypeOfAnimal{
        DOG,
        CAT,
        CHICKEN,
        GECKO
    }

    public Pet(String breed, String name,  LocalDate dateOfBirth) {
        this.breed = breed;
        this.dateOfBirth = dateOfBirth;
        this.name = name;
    }

    public Pet(TypeOfAnimal animalType) {
        this.animalType = animalType;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isNeedsRestraint() {
        return needsRestraint;
    }

    public void setNeedsRestraint(boolean needsRestraint) {
        this.needsRestraint = needsRestraint;
    }

    public TypeOfAnimal getAnimalType() {
        return animalType;
    }

    public void setAnimalType(TypeOfAnimal animalType) {
        this.animalType = animalType;
    }
    public int getAge(){
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int month = localDate.getMonthValue();
        int day= localDate.getDayOfMonth();
        int year= localDate.getYear();

        int bYear= dateOfBirth.getYear();
        int bMonth= dateOfBirth.getMonthValue();
        int bDay= dateOfBirth.getDayOfMonth();

        int yearDif= year- bYear;
        if((month-bMonth)>0){
            return yearDif ;}
        else if(((month-bMonth)<0)){
            return (yearDif-1);}
        else{
            if(day>=bDay){
                return yearDif;
            }
            else{
                return (yearDif-1);
            }
        }
    }
    public boolean NeedsRestraint() {
        if(getAge() >= 13){
            needsRestraint=false;
            return needsRestraint;
        }else{
            return needsRestraint;
        }
    }

}
