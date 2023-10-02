package MadLibsGame;

import java.util.Random;
import java.util.Scanner;

public class MadLibs {

    // init instance vars
    Scanner scanner = new Scanner(System.in);
    String story, name, adjective1, adjective2,
            noun1, noun2, noun3, adverb, randomNums;
    Random rand = new Random();

    // Call to main
    public static void main(String[] args) {
        MadLibs m = new MadLibs();
        m.play();

    }

    private void printInstructions() {
        System.out.println("Welcome to the MadLibs game. If you type in a word,"
                + "we will give you a story!");
    }

    private void play() {
        printInstructions();
        enterName();
        enterNoun1();
        enterNoun2();
        enterNoun3();
        enterAdjective1();
        enterAdjective2();
        enterAdverb();
        createStory();
        System.out.println(story());
    }

    // get input from user
    private void enterName() {
        System.out.println("Please enter a name:");
        setName(scanner.nextLine());
    }

    private void enterNoun1() {
        System.out.println("Give us a noun:");
        setNoun1(scanner.nextLine());
    }

    private void enterNoun2() {
        System.out.println("Give us another noun:");
        setNoun2(scanner.nextLine());
    }

    private void enterNoun3() {
        System.out.println("Give us a giraffe... nope that doesn't sound right, maybe a last noun:");
        setNoun3(scanner.nextLine());
    }

    private void enterAdjective1() {
        System.out.println("An adjective now will be good:");
        setAdjective1(scanner.nextLine());
    }

    private void enterAdjective2() {
        System.out.println("Another adjective if you please:");
        setAdjective2(scanner.nextLine());
    }

    private void enterAdverb() {
        System.out.println("An adverb is spicy, no? do you have one?");
        setAdverb(scanner.nextLine());
    }

    // init getters
    private String name() {
        return this.name;
    }

    private String story() {
        return this.story;
    }

    private String adjective1() {
        return this.adjective1;
    }

    private String adjective2() {
        return this.adjective2;
    }

    private String noun1() {
        return this.noun1;
    }

    private String noun2() {
        return this.noun2;
    }

    private String noun3() {
        return this.noun3;
    }

    private String adverb() {
        return this.adverb;
    }

    private String randomNums() {
        int i = 0;
        int n[] = new int[3];
        do {
            n[i] = Math.abs(rand.nextInt(2000)) % 100;
            i++;
        } while (i < 3);
        this.randomNums = "not " + n[0] + " not " + n[1] + ", but " + n[2];
        return this.randomNums;
    }

    // init setters
    private void setName(String name) {
        this.name = name;
    }

    private void setStory(String story) {
        this.story = story;
    }

    private void setAdjective1(String adjective1) {
        this.adjective1 = adjective1;
    }

    private void setAdjective2(String adjective2) {
        this.adjective2 = adjective2;
    }

    private void setNoun1(String noun1) {
        this.noun1 = noun1;
    }

    private void setNoun2(String noun2) {
        this.noun2 = noun2;
    }

    private void setNoun3(String noun3) {
        this.noun3 = noun3;
    }

    private void setAdverb(String adverb) {
        this.adverb = adverb;
    }

    private void createStory() {
        String story;
        if (Math.abs(rand.nextInt()) % 2 == 0) {
            story = "Jesse and her best friend " + name() + " went to Disney World today!"
                    + " They saw a " + noun1() + " in a show at the Magic Kingdom and "
                    + "ate a " + adjective1() + " feast for dinner. The next day Jesse and " + name()
                    + " ran " + adverb() + " to meet Mickey Mouse in his " + noun2() + " and then that night"
                    + " they gazed at " + randomNums() + " " + adjective2() + " fireworks shooting from the "
                    + noun3() + ".";
        } else {
            story = "Amanda and her frenemy " + name() + " went to the zoo last summer."
                    + " They saw a huge " + noun1() + " and a tiny little " + noun2() + ". That night they decided"
                    + " to climb " + adverb() + " into the " + noun3() + " to get a closer look. "
                    + "The zoo was " + adjective1() + " at night, but they didn't care...."
                    + " until " + randomNums() + " " + adjective2() + " apes yelled in their faces, making"
                    + " Amanda and " + name() + " sprint all the way back home.";
        }
        setStory(story);
    }

}
