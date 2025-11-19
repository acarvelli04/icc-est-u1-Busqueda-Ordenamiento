package controllers;

public class SortingMethods {
    public void sortByNameWithBurble(Person[] people) {
        for (int i = 0; i < people.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < people.length - 1 - i; j++) {
                if (people[j].getName().compareTo(people[j + 1].getName()) > 0) {
                    Person temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                    swapped = true;

                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public void sortByNameWithSelection(Person[] people) {
        for (int i = 0 ; i < people.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < people.length; j++) {
                if (people[j].getName().compareTo(people[minIndex].getName()) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Person temp = people[i];
                people[i] = people[minIndex];
                people[minIndex] = temp;
            }
        }
    }

    public void sortByNameWithInsertion(Person[] people) {
        for (int i = 1; i < people.length; i++) {
            Person llave = people[i];
            int j = i - 1;
            while (j >= 0 && people[j].getName().compareTo(llave.getName()) > 0) {
                people[j + 1] = people[j];
                j--;
            }
            people[j + 1] = llave;
        }
    }

    public void sortByAgeWithBurble(Person[] people) {
        for (int i = 0; i < people.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < people.length - 1 - i; j++) {
                if (people[j].getAge() > people[j + 1].getAge()) {
                    Person temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                    swapped = true;

                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    
}
