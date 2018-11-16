package com.example.choiceofstorypractice;

public class Choice {
    private String btnText; //Text to be displayed on button.
    private int selectedChoice; //Store the number associated with the choice made by clicking the button

    //Constructor for Choice Buttons
    public Choice() {
        btnText = "Invisible";
        selectedChoice = 0;
    }
    public Choice(String btnDisplay, int chosenChoice) {
        btnText = btnDisplay;
        selectedChoice = chosenChoice;
    }

    //Accessor Methods
    public String getBtnText() {
        return btnText;
    }

    public int getSelectedChoice() {
        return selectedChoice;
    }

    //Mutator Methods
    public void setBtnText(String btnDislpay) {
        btnText = btnDislpay;
    }

    public void setSelectedChoice(int chosenChoice) {
        selectedChoice = chosenChoice;
    }

}
