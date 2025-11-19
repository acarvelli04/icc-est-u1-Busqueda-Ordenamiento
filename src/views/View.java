package views;
import java.util.Scanner;
import models.Person;

public class View {
    private Scanner scanner = new Scanner(System.in);

    public int showMenu(){
        System.out.println("\n--- MENÚ ---");
        System.out.println("1. Agregar persona");
        System.out.println("2. Ordenar personas");
        System.out.println("3. Buscar persona");
        System.out.println("4. Mostrar personas");
        System.out.println("5. Salir");
        System.out.print("Opción: ");
        return scanner.nextInt();
    }

    public Person inputPerson(){
        scanner.nextLine();
        System.out.print("Ingrese el nombre: ");
        String name = scanner.nextLine();
        System.out.print("Ingrese la edad: ");
        int age = scanner.nextInt();
        return new Person(name, age);
    }

    public int selectSortingMethod(){
        System.out.println("\nMétodo de ordenamiento:");
        System.out.println("1. Por nombre (Burbuja)");
        System.out.println("2. Por edad (Inserción)");
        System.out.print("Opción: ");
        return scanner.nextInt();
    }

    public int selectSearchCriterion(){
        System.out.println("\nBuscar por:");
        System.out.println("1. Nombre");
        System.out.println("2. Edad");
        System.out.print("Opción: ");
        return scanner.nextInt();
    }

    public void displaySearchResult(Person[] persons){
        if (persons == null) {
            System.out.println("Persona no encontrada.");
        } else {
            System.out.println("Persona encontrada: " + persons);
        }
    }

    public void displayPersons(Person[] persons){
        if(persons.length == 0){
            System.out.println("No hay personas.");
            return;
        }
        System.out.println("\n--- LISTA ---");
        for(int i = 0; i < count; i++){
            System.out.println(people[i]);
        }
    }

    public int inputAge(){
        System.out.print("Edad a buscar: ");
        return scanner.nextInt();
    }

    public String inputName(){
        scanner.nextLine();
        System.out.print("Nombre a buscar: ");
        return scanner.nextLine();
    }


}
