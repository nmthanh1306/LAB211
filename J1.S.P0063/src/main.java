
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Minh Thanh
 */
public class main {


    public static Person[] inputPersonInfo(int size) {
        Person[] persons = new Person[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Input Information of Person");
            System.out.print("Please input name: ");
            String name = Validation.checkInputString();
            System.out.print("Please input address: ");
            String address = Validation.checkInputString();
            System.out.print("Please input salary: ");
            double salary = Validation.checkInputSalary();
            persons[i] = new Person(name, address, salary);
        }
        return persons;
    }

    public static void sortBySalary(Person[] person) {
        Person temp = null;
        for (int i = 0; i < person.length; i++) {
            for (int j = 0; j < person.length-1-i; j++) {
                if (person[j].getSalary() > person[j+1].getSalary()) {
                    temp = person[j];
                    person[j] = person[j+1];
                    person[j+1] = temp;
                }
            }
        }
    }
    
    public static void displayPersonInfo(Person[] persons) {
        for (int i = 0; i < persons.length; i++) {
            System.out.println("Information of Person you have entered:");
            System.out.println("Name: " + persons[i].getName() );
            System.out.println("Address: " + persons[i].getAddress());
            System.out.println("Salary: " + persons[i].getSalary());
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int size = 3;
        Person[] person = new Person[size];
        person = inputPersonInfo(size);
        sortBySalary(person);
        displayPersonInfo(person);
    }

}
