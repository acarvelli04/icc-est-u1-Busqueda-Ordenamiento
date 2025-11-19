package views;

import java.util.Scanner;
import models.Person;

public class View {

    Scanner sc = new Scanner(System.in);

    public int showMenu(){
        System.out.println("\n--- MENÚ ---");
        System.out.println("1. Agregar persona");
        System.out.println("2. Ordenar personas");
        System.out.println("3. Buscar persona");
        System.out.println("4. Mostrar personas");
        System.out.println("5. Salir");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    public Person inputPerson(){
        sc.nextLine();
        System.out.print("Nombre: ");
        String name = sc.nextLine();

        System.out.print("Edad: ");
        int age = sc.nextInt();

        return new Person(name, age);
    }

    public int selectSortingMethod(){
        System.out.println("\nMétodo de ordenamiento:");
        System.out.println("1. Burbuja por nombre");
        System.out.println("2. Inserción por nombre");
        System.out.println("3. Burbuja por edad");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    public int selectSearchCriterion(){
        System.out.println("\nBuscar por:");
        System.out.println("1. Nombre");
        System.out.println("2. Edad");
        System.out.print("Opción: ");
        return sc.nextInt();
    }

    public String inputName(){
        sc.nextLine();
        System.out.print("Nombre a buscar: ");
        return sc.nextLine();
    }

    public int inputAge(){
        System.out.print("Edad a buscar: ");
        return sc.nextInt();
    }

    public void displayPersons(Person[] people, int count){
        System.out.println("\n--- LISTA DE PERSONAS ---");
        if (count == 0){
            System.out.println("No hay personas registradas.");
            return;
        }
        for (int i = 0; i < count; i++){
            System.out.println(people[i]);
        }
    }

    public void displaySearchResult(Person p){
        if(p == null) System.out.println("No encontrado.");
        else System.out.println("Encontrado: " + p);
    }
}

