package controllers;

import models.Person;

public class SortingMethods {

    public void sortByNameWithBubble(Person[] people, int count){
        for(int i = 0; i < count - 1; i++){
            for(int j = 0; j < count - 1 - i; j++){
                if(people[j].getName().compareTo(people[j+1].getName()) > 0){
                    Person temp = people[j];
                    people[j] = people[j+1];
                    people[j+1] = temp;
                }
            }
        }
    }

    public void sortByNameWithInsertion(Person[] people, int count){
        for(int i = 1; i < count; i++){
            Person key = people[i];
            int j = i - 1;

            while(j >= 0 && people[j].getName().compareTo(key.getName()) > 0){
                people[j+1] = people[j];
                j--;
            }
            people[j+1] = key;
        }
    }

    public void sortByAgeWithBubble(Person[] people, int count){
        for(int i = 0; i < count - 1; i++){
            for(int j = 0; j < count - 1 - i; j++){
                if(people[j].getAge() > people[j+1].getAge()){
                    Person temp = people[j];
                    people[j] = people[j+1];
                    people[j+1] = temp;
                }
            }
        }
    }
}


