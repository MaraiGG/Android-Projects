package com.example.choiceofstorypractice;

public class Page {
    private String storyText; //Stores the text to display for the story.
   //Create Choice objects for buttons
    private Choice choice1;
    private Choice choice2;
    private Choice choice3;
    private Choice choice4;

    public Page(String text, Choice option1, Choice option2, Choice option3, Choice option4) {
        storyText = text;
        choice1 = option1;
        choice2 = option2;
        choice3 = option3;
        choice4 = option4;
    }

    public String getStoryText() {
        return storyText;
    }

    public void setStoryText(String storyText) {
        this.storyText = storyText;
    }

    public Choice getChoice1() {
        return choice1;
    }

    public void setChoice1(Choice choice1) {
        this.choice1 = choice1;
    }

    public Choice getChoice2() {
        return choice2;
    }

    public void setChoice2(Choice choice2) {
        this.choice2 = choice2;
    }

    public Choice getChoice3() {
        return choice3;
    }

    public void setChoice3(Choice choice3) {
        this.choice3 = choice3;
    }

    public Choice getChoice4() {
        return choice4;
    }

    public void setChoice4(Choice choice4) {
        this.choice4 = choice4;
    }
}
