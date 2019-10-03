public class Dog extends Animal implements Audible {

    // the class private attributes / properties / fields
    private String type;
    public String name;

    // this is a constructor that creates a dog instance using a name and age
    public Dog(String myBeatifulDogsName, int beautifuldogAge) {
        // this calls the Animal constructor (parent) with the age parameter recieved above
        super(beautifuldogAge);
        System.out.println("I am creating a dog with a name " + myBeatifulDogsName);
        // stores the value recieved in the dogName paramter in the current name Dog instance attribute
        this.name = myBeatifulDogsName;

    }
    // another constructor that creates a dog instance using type, age and name
    public Dog(String dogType, int dogAge, String dogName) {
        // this is a constructor chaining calling the constructor defined above using the values we recieved in this
        // Dog constructor parameter
        this(dogName, dogAge); // constructor chaining
        System.out.println("I am " + dogName + " at age " + dogAge + " and I am a " + dogType);
        this.type = dogType;

        System.out.println("I am an initialized dog called " + this.name + " at age " + dogAge + " and I am a " +
                this.type);
    }


    // here we implement a method that was defined in the interface called Audible
    @Override
    public void makeSound() {
        System.out.println(this.name + " bark");


    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void beallitomaFASZT(String name) {
        this.name = name;


    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                "} " + super.toString();
    }
}
