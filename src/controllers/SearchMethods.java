package controllers;

public class SearchMethods {

    public Person binarySearchByName(Person[] people, String objetivo) {
        int izq = 0;
        int der= people.length -1;
        while(izq<=der){
            int medio = (izq + der) / 2;
            int comparaciones = people[medio].getName().compareTo(objetivo);
            if(comparaciones == 0){
                return people[medio];
                
            } else if(comparaciones < 0){
                izq = medio +1;
            } else {
                der = medio -1;
            }
        }
        return null;
    }

    public Person binarySearchByAge(Person[] people, int objetivo) {
        int izq = 0;
        int der = people.length -1;
        while(izq<=der){
            int medio = (izq + der) / 2;
            if(people[medio].getAge() == objetivo){
                return people[medio];
                
            } else if(people[medio].getAge() < objetivo){
                izq = medio +1;
            } else {
                der = medio -1;
            }
        }
        return null;
    }

    public boolean isSortedByName(Person[] people) {
        
        for(int i = 0; i < people.length - 1; i++) {
            if(people[i].getName().compareTo(people[i + 1].getName()) > 0) {
                return false;
            }
        }
        return true;
    }

    public boolean isSortedByAge(Person[] people) {
        for(int i = 0; i < people.length - 1; i++) {
            if(people[i].getAge() > people[i + 1].getAge()) {
                return false;
            }
        }
        return true;
    }

}
