package epam.tam2019;

import java.util.Scanner;

class User {
    String name;
    int age;

    public User() {

    }

    void printCombineUserInformation(User anotherUser) {
        System.out.println(this.name + " and " + anotherUser.name + " are " + (this.age + anotherUser.age) + " " +
                "years old in total.");
    }
}

public class Main {

    public static User inputUserData() {
        Scanner reader = new Scanner(System.in);

        User user = new User();
        System.out.println("Type your name:");
        user.name = reader.nextLine();
        System.out.println("Type your age:");
        user.age = Integer.valueOf(reader.nextLine());
        return user;
    }

    public static void main(String[] args) {

        User user1 = inputUserData();
        User user2 = inputUserData();

        user1.printCombineUserInformation(user2);


    }
}

