public abstract class Animal {

    private int age;

    public Animal(int animalAge) {
        System.out.println("I am creating an animal" + animalAge);
        this.age = animalAge;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                '}';
    }
}
