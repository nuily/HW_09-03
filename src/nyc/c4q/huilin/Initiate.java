package nyc.c4q.huilin;

/**
 * Created by huilin on 9/3/16.
 */
public class Initiate extends Extra {

    static Extra console = new Extra();

    public enum TheEnd {
        BAD, GOOD, NEUTRAL;
    }

    public static int receiveInt() {
        boolean isNumber;
        int choice = 0;


        do {
            isNumber = scanner.hasNextInt();
            if (!isNumber) {
                System.out.println("Enter a number! ");
                String garbage = scanner.next();
                isNumber = false;

            } else {
                choice = scanner.nextInt();
                if (choice == 0 || choice > 5) {
                    System.out.println("Enter a number from 1 - 4");
                    isNumber = false;
                } else {
                    isNumber = true;
                }
            }

        } while (!isNumber);
        return choice;
    }

    public static void round1() {

        console.log("You've been working and studying hard at your bootcamp. You decide to head to a Meetup with your 2 friends. \n" +
                "The organizers decide to start with an icebreaker game. Everyone will have to get nice and comfy since you'll be hugging each other! \n" +
                "The organizers will play music for everyone to mill around until they shout out a number. People will need to get into groups based on the number. \n" +
                "In a grassy field, 34 people including yourself and your 2 friends are walking at their own pace in different directions. " +
                "The music volume lowers and you hear them shout 3. \n" +
                "Who do you huddle with? Enter a number.\n \n" +
                "Choice 1: With my friends of course! \n" +
                "Choice 2: The people on my right are closer. \n" +
                "Choice 3: I'm being pulled to the left! \n" +
                "Choice 4: The horror of having to hug people ugh! \n");


    }

    public static TheEnd round2(int choice) {
        switch (choice) {
            case 1:
                console.log("\nWell that was easy! You hear a person wail dramatically. You and your friends share a chuckle and float around each other while " +
                        "the music picks up. \n" +
                        "This time they shout 2! What do you do? Enter a number. Will you sacrifice yourself and leave your friends to themselves? Yes or No?");
                //                        "Choice 1: I sacrifice myself! They can have each other! \n" +
                //                        "Choice 2: I'm sticking myself to my ride home. \n" +
                //                        "Choice 3: Gotta go with the person who likes to share food\n");
                break;
            case 2:
                console.log("\nUh oh, You're stuck in between a lovey dovey couple. It shouldn't be awkward. They look friendly and \n" +
                        "especially happy to have third-wheel. The couple both say, \"We'll hug each other again soon\". A bit strange \n" +
                        "that they said it at the same time but you'll let that slide. \nThe music starts up and you separate from their bubble and march around\n" +
                        "with the strangers in your space. You hear 5 called out! \n" +
                        "Do your rush to your friend that's about 7 feet away? Yes or No?");
                //                    "Choice 1: I see my friend! \n" +
                //                    "Choice 2: What the- I'm suddenly surrounded! \n" +
                //                    "Choice 3: I'm hungry");
                break;
            case 3:
                console.log("Arms are all around you and they're giggling. Aw it's a family!  They decide to hold your hand and twirl in a circle. \n" +
                        "You see the groups dispersing and awaiting for the next number to be called but the kids are shouting your name. (How did they know your name?" +
                        "Will you walk away from them? Yes or No?");
                break;
            case 4:
                console.log("SOMEHOW you ended in a group where no one knows each other. Nice job! You guys quickly give each other space and\n" +
                        "and glance around to see everyone else is still in their groups. You accidentally stepped on your neighbor's white converses\n" +
                        "which now have a beautiful green and brown footprint. Will you apologize? Yes / No");
                break;

        }

        boolean correct = true;
        TheEnd ending = TheEnd.NEUTRAL;

        do {
            boolean isYN = scanner.hasNext();
            if (isYN) {
                String x = scanner.next();
                if (x.equalsIgnoreCase("yes") || x.equalsIgnoreCase("y")) {
                    ending = TheEnd.GOOD;
                    correct = true;
                } else if (x.equalsIgnoreCase("no") || x.equalsIgnoreCase("n")) {
                    ending = TheEnd.BAD;
                    correct = true;
                } else {
                    System.out.println("Please enter yes, y, no, or n.");
                    correct = false;

                }
            }
        } while (!correct);
        return ending;
    }

    public static void endRound(TheEnd type) {

        switch(type) {
            case BAD: console.log("You feel a drop on your left cheek. You wipe it with your finger and stare blankly at the" +
                    "color. Unsure of where it came from, you look around but what you see shocks you. How could your day end like this...");
                break;
            case GOOD: console.log("The organizer comes up to you and hands you a Samsung Galaxy Note S7. Good thing you came out of your java bubble!");
                break;

        }
    }
}
