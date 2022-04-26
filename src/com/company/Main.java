package com.company;
import java.time.LocalDate;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

     LocalDate birth = LocalDate.of(2004, 5, 2);
     Pet dog= new Pet("Shiba Inu", "William", birth);
         System.out.println(dog.getDateOfBirth());
         System.out.println(dog.getName() +" is a " + dog.getBreed());
        System.out.println(dog.getAge()+ " years old");
        System.out.println(dog.NeedsRestraint());

     Pet cat= new Pet(Pet.TypeOfAnimal.CAT);
        System.out.println(cat.getAnimalType());
        cat.setBreed("Siamese");
        System.out.println(cat.getBreed());
    }
}
