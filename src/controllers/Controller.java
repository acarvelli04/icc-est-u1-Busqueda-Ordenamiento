package controllers;

import models.Person;
import views.View;

public class Controller {
    private View view;
    private SortingMethods sortingMethods;
    private SearchMethods searchMethods;

    private Person[] people = new Person[100];
    private int count = 0;

    public Controller(View view, SortingMethods sortingMethods, SearchMethods searchMethods){
        this.view = view;
        this.sortingMethods = sortingMethods;
        this.searchMethods = searchMethods;
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
        if(opt == 1) sorter.sortByName(people, count);
        else sorter.sortByAge(people, count);

        System.out.println("Ordenado correctamente.");
    }

    private void searchPerson(){
        int opt = view.selectSearchCriterion();
        Person result = null;

        if(opt == 1){
            if(!searcher.isSortedByName(people, count)){
                sorter.sortByName(people, count);
            }
            result = searcher.binarySearchByName(people, count, view.inputName());
        } else {
            if(!searcher.isSortedByAge(people, count)){
                sorter.sortByAge(people, count);
            }
            result = searcher.binarySearchByAge(people, count, view.inputAge());
        }

        view.displaySearchResult(result);
    }

    
    

}
