package controllers;

import models.Person;

public class SearchMethods {

    public boolean isSortedByName(Person[] people, int count){
        for(int i = 0; i < count - 1; i++){
            if(people[i].getName().compareTo(people[i+1].getName()) > 0){
                return false;
            }
        }
        return true;
    }

    public boolean isSortedByAge(Person[] people, int count){
        for(int i = 0; i < count - 1; i++){
            if(people[i].getAge() > people[i+1].getAge()){
                return false;
            }
        }
        return true;
    }

    public Person binarySearchByName(Person[] people, int count, String objetivo){
        int left = 0;
        int right = count - 1;

        while(left <= right){
            int mid = (left + right) / 2;
            int cmp = people[mid].getName().compareTo(objetivo);

            if(cmp == 0) return people[mid];
            if(cmp < 0) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }

    public Person binarySearchByAge(Person[] people, int count, int objetivo){
        int left = 0;
        int right = count - 1;

        while(left <= right){
            int mid = (left + right) / 2;

            if(people[mid].getAge() == objetivo) return people[mid];
            if(people[mid].getAge() < objetivo) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }
}

