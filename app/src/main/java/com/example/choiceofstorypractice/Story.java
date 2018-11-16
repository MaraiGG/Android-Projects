package com.example.choiceofstorypractice;

import java.util.Random;

public class Story {
    private Page[] pageList;
    private String randomNumString;



  private void randomize() {

        int randomNum = (int)Math.floor(Math.random() * ((3-1)+1) + 1);
        if(randomNum==1) {
            randomNumString="You pick up a wooden stake on the ground nearby and rush towards the vampire but you trip and impale yourself dying a pointless death.";
        } else if(randomNum==2) {
            randomNumString="You see a wooden stake on the ground nearby and pick it up rushing towards the vampire and ramming it into the heart of the monster killing it. The city treats you as a hero for killing one of the vampires that has been killing in the city for months now.";
        }else if(randomNum==3) {
            randomNumString="You grab the wooden stake and attack the vampire as he strikes you , you both die in the fight and the city remembers you as a hero.";
        } else {
            randomNumString="Didnt Work:" + randomNum;
        }

    }


    public Story() {

        randomize();

        pageList = new Page[13];

        pageList[0] = new Page( "Welcome to the city of Arkosh! Three buildings immediately grab your attention as you walk into the city. You choose to go to the:", //Tavern, Church, or Manor
                new Choice("Go to Tavern", 1),
                new Choice("Go to Church", 2),
                new Choice("Go to Manor",3),
                new Choice()
        );

        pageList[1] = new Page( "You enter a smelly Tavern, your senses are overcome with the sight and sound of people drinking and laughing all around you. Out of the corner of your eye you spot a seedy looking man in the corner, additionally you see the barkeep polishing some glasses and consider a cold drink.",//enter Seedy or Barkeep
                new Choice("Go talk with seedy man", 4),
                new Choice("Talk to barkeeper", 5),
                new Choice(), new Choice()
        );

        pageList[2] = new Page( "You walk into a beautiful Cathedral complete with stained glass windows and a very expensive looking altar, You notice a seedy man following behind you as well as a Cleric praying at the altar. Confront seedy man or talk with cleric?", //Seedy or Cleric
                new Choice("Seedy Man", 4),
                new Choice("Cleric", 8),
                new Choice(), new Choice()
        );

        pageList[3] = new Page( "As you walk into the abandoned Manor a man leaps out and attempts to bite you. Can you dodge?", //yes no chance
                new Choice("Yes", 9),
                new Choice("No", 10),
                new Choice(), new Choice()
        );

        pageList[4] = new Page( "As you approach the seedy man he goes to grab you. Can you avoid him?", //yes no chance
                new Choice("Yes", 9),
                new Choice("No", 10),
                new Choice(), new Choice()
        );

        pageList[5] = new Page( "You walk towards the barkeep intending to ask for a drink. When the seedy man you saw earlier begins to walk closer, the barkeep notices this and tells him to not try anything. The seedy man walks away clearly not wanting to have a confrontation in front of so many. It also helped that there were armed guards in the Tavern. After the man leaves the Barkeep asks if you want to rent a room upstairs for the night?", // Rent room or leave
                new Choice("Rent room for the night.", 6),
                new Choice("Leave the Tavern.", 7),
                new Choice(), new Choice()
        );

        pageList[6] = new Page( "You spend the night comfortably at the secure Tavern and leave the city the next day later you hear rumors of a vampire that has been killing in the city. Realizing that could have been you you decide to one day go back and thank that Barkeep.",
                new Choice("Start Over.", 0),
                new Choice(), new Choice(), new Choice()
        );

        pageList[7] = new Page( "You walk out of the Tavern on guard for the Seedy man when you see him suddenly leap out trying to bite you. Do you avoid him?", //yes no chance
                new Choice("Yes", 9),
                new Choice("No", 10),
                new Choice(), new Choice()
        );

        pageList[8] = new Page( "You approach the cleric quietly she turns around and smiles at you when suddenly the Seedy man you noticed earlier dashes towards you the Cleric quickly grabs a bottle of what you assume is holy water and throws it on the man he runs away in pain. The Cleric tells you it was a vampire and it's good you came to see her first or she would not have saved you in time, she talks to you several more minutes about the vampire issues in the city and tells you to be careful.",
                new Choice("Start Over", 0),
                new Choice(), new Choice(), new Choice()
        );

        pageList[9] = new Page( "You skillfully dodge the man who you can now see is a vampire. He trips as you avoid him falling to the ground. The vampire, seeing he likely wont get an easy meal out of you, asks if you would like to become a vampire like him gaining supernatural powers. He does say however that saying no is the same as challenging him.", //The Yes option Challenge or Accept
                new Choice("Challenge", 12),
                new Choice("Accept", 11),
                new Choice(), new Choice()
        );
//The No option
        pageList[10] = new Page( "You fail to avoid the attack and end up getting bit on the neck and drained of all your blood. The world goes cold around you while you pass onto the next life.",
                new Choice("Start Over", 0),
                new Choice(), new Choice(), new Choice()
        );
        //Accept Offer
        pageList[11] = new Page( "The Vampire bites you and you feel new found power coursing through your veins you feel your body changing. You can see in the dark you feel stronger faster and as if you can change your body into different forms at will. After the transformation you follow your new benefactor and he takes you to the abandoned Manor where he teaches you about your new powers.",
                new Choice("Start Over", 0),
                new Choice(), new Choice(), new Choice()
        );


//Challenge
        pageList[12] = new Page(randomNumString,
                new Choice("Start Over", 0),
                new Choice(), new Choice(), new Choice()
        );

    }

    public Page getPage(int pageNumber) {
        return pageList[pageNumber];
    }
}
