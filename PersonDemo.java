// Main class containing the main() method
public class PersonDemo {
    public static void main(String[] args) {
        // Creating objects of Person class
        Person person1 = new Person("Alice", 25, "Female", "Swimming");
        Person person2 = new Person("Bob", -5, "hat", ""); // Age correction & gender defaulted
        Person person3 = new Person(); //default values
        Person person4 = new Person("Ash", 26, "Male", "Writing"); //for male

        // Prints the person which info is gonna be shown
        System.out.println("Person 1:");
        // Displaying information of the person
        person1.displayInfo();
        // Printing the greet method with the info from this object
        System.out.println(person1.greet());

        System.out.println("\nPerson 2:");
        person2.displayInfo();
        System.out.println(person2.introduce());

        System.out.println("\nPerson 3:");
        person3.displayInfo();
        System.out.println(person3.greet());

        System.out.println("\nPerson 4:");
        person4.displayInfo();
        System.out.println(person4.introduce());
    }
}
