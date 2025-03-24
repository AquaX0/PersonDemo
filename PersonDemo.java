// Main class containing the main() method
public class PersonDemo {
    public static void main(String[] args) {
        // Creating objects of Person class
        Person person1 = new Person("Alice", 25, "Female", "Swimming");
        Person person2 = new Person("Bob", -5, "hat", ""); // Age correction & gender defaulted
        Person person3 = new Person(); //default values
        Person person4 = new Person("Ash", 26, "Male", "Writing"); //for male

        // Displaying information of each person
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

// Person class (non-public, can exist in the same file)
class Person {
    // Instance variables (attributes)
    private String name;
    private int age;
    private String gender;
    private String hobby;

    // Default constructor for the person object
    public Person() {
        this("Unknown", 0, "Unspecified", "Unknown");
    }

    // Parameterized constructor
    public Person(String name, int age, String gender, String hobby) {
        setName(name);
        setAge(age);  // To ensure the age is not negative or zero
        setGender(gender);  // To ensure the gender is valid
        setHobby(hobby);
    }

    // Getter for 'name'
    public String getName() {
        return name;
    }

    // Setter for 'name', if it's empty it will set the name variable to Unknown
    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            this.name = "Unknown";
        } else {
            this.name = name;
        }
    }

    // Getter for 'age'
    public int getAge() {
        return age;
    }

    // Setter for 'age'
    public void setAge(int age) {
        this.age = Math.max(age, 1); // Ensure age is non-negative or zero
    }

    // Getter for 'gender'
    public String getGender() {
        return gender;
    }

    // Setter for 'gender'
    public void setGender(String gender) {
        // if the gender is not Male, Female, or Other, it will set the gender to unspecified
        if (gender.equalsIgnoreCase("Male") || gender.equalsIgnoreCase("Female") || gender.equalsIgnoreCase("Other")) {
            this.gender = gender;
        } else {
            this.gender = "Unspecified";
        }
    }

    // Getter for 'hobby'
    public String getHobby() {
        return hobby;
    }

    // Setter for 'hobby'
    public void setHobby(String hobby) {
        // Ensure hobby is not null, not empty (""), and not just spaces
        if (hobby == null || hobby.trim().isEmpty()) {
            this.hobby = "Unknown";
        } else {
            this.hobby = hobby;
        }
    }

    // Method to display person information
    public void displayInfo() {
        System.out.println(this); // Calls toString()
    }

    // Override toString() for better output
    @Override
    public String toString() {
        return "Person{name= '" + name + "', age= " + age + ", gender= '" + gender + "'}";
    }

    // Method to provide a greeting
    public String greet() {
        return "Hello, my name is " + name + "! " + "I am " + age + " years old. My hobby is " + hobby + ".";
    }

    // Method to provide the introduction
    public String introduce() {
        // Initialize the string variable for pronoun and call
        String pronoun;
        String call;
        // To set the pronoun and call based on the gender
        if (gender.equalsIgnoreCase("Male")) {
            this.gender = "Male";
            pronoun = "him";
            call = "he";
        } else if (gender.equalsIgnoreCase("Female")) {
            this.gender = "Female";
            pronoun = "her";
            call = "she";
        } else {
            this.gender = "Unspecified";
            pronoun = "their";
            call = "they";
        }
        return "This is my friend. " + pronoun + " name is " + name + ". " + call + " is " + age + " years old. " + pronoun + " hobby is " + hobby + ".";
    }
}
