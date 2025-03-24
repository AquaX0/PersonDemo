// Person class (public so it can be used in another file)
public class Person {
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
        this.age = (age > 0) ? age : -1; // If age is ≤ 0, set to -1 (Unknown)
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
        String ageString = (age == -1) ? "Unknown" : String.valueOf(age);
        return "Person{name = '" + name + "', age = " + ageString + ", gender = '" + gender + "'}";
    }

    // Method to provide a greeting
    public String greet() {
        // to print the age to unknown if the age is negative or zero
        String ageString = (age == -1) ? "Unknown" : age + " years old";
        return "Hello, my name is " + name + "! I am " + ageString + ". My hobby is " + hobby + ".";
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
        // to print the age to unknown if the age is negative or zero
        String ageString = (age == -1) ? "Unknown" : age + " years old";
        return "This is my friend. " + pronoun + " name is " + name + ". " + call +
                " is " + ageString + ". " + pronoun + " hobby is " + hobby + ".";
    }
}
