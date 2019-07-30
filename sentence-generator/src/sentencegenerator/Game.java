package sentencegenerator;

public class Game {

    public String generator() {
        //    create three arrays

        String[] firstWord = {"Very good", "Reliable", "Outstanding", "Perfect", "The best"};

        String[] secondWord = {"solution", "possiblity", "execution"};

        String[] thirdWord = {"for you!", "for everyone!", "for the whole world!", "even for ETs!"};


//    convert length into an int

        int oneLength = firstWord.length;
        int secondLength = secondWord.length;
        int thirdLength = thirdWord.length;

//  generate random numbers
//Math.random always returns greater than or equal to 0.0 and less than 1.0 and we need to cast the multiplication to int.
        int random1 = (int) (Math.random() * oneLength);
        int random2 = (int) (Math.random() * secondLength);
        int random3 = (int) (Math.random() * thirdLength);

        String sentence = firstWord[random1] + " " + secondWord[random2] + " " + thirdWord[random3];

        return sentence;


    }

}