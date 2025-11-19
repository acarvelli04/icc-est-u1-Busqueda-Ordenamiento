package controllers;

import models.Person;
import views.View;

public class Controller {

    private View view;
    private SortingMethods sorter;
    private SearchMethods searcher;

    private Person[] people = new Person[100];
    private int count = 0;

    public Controller(View view, SortingMethods sorter, SearchMethods searcher){
        this.view = view;
        this.sorter = sorter;
        this.searcher = searcher;
    }

    public void start(){
        int option;

        do{
            option = view.showMenu();

            switch(option){
                case 1:
                    addPerson();
                    break;

                case 2:
                    sortPersons();
                    break;

                case 3:
                    searchPerson();
                    break;

                case 4:
                    view.displayPersons(people, count);
                    break;
            }

        } while(option != 5);
    }

    private void addPerson(){
        people[count] = view.inputPerson();
        count++;
    }

    private void sortPersons(){
        int opt = view.selectSortingMethod();

        if (opt == 1)
            sorter.sortByNameWithBubble(people, count);

        else if (opt == 2)
            sorter.sortByNameWithInsertion(people, count);

        else if (opt == 3)
            sorter.sortByAgeWithBubble(people, count);

        System.out.println("\nOrdenado correctamente.");
    }

    private void searchPerson(){
        int opt = view.selectSearchCriterion();
        Person result = null;

        if (opt == 1){
            if (!searcher.isSortedByName(people, count)){
                sorter.sortByNameWithBubble(people, count);
            }
            String name = view.inputName();
            result = searcher.binarySearchByName(people, count, name);

        } else {
            if (!searcher.isSortedByAge(people, count)){
                sorter.sortByAgeWithBubble(people, count);
            }
            int age = view.inputAge();
            result = searcher.binarySearchByAge(people, count, age);
        }

        view.displaySearchResult(result);
    }
}

