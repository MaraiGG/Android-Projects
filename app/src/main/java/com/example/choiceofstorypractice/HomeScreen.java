package com.example.choiceofstorypractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HomeScreen extends AppCompatActivity {
    private Story thisStory = new Story();
    private TextView textView;
    private Button btnChoice1;
    private Button btnChoice2;
    private Button btnChoice3;
    private Button btnChoice4;
    private Page currentPage = thisStory.getPage(0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        textView = (TextView) findViewById(R.id.mainText);
        btnChoice1 = (Button) findViewById(R.id.choice1Btn);
        btnChoice2 = (Button) findViewById(R.id.choice2Btn);
        btnChoice3 = (Button) findViewById(R.id.choice3Btn);

        loadPage(0);

    }

    ;

    private void loadPage(int choice) {

        if (choice == 0) {
          thisStory = new Story();
          currentPage = thisStory.getPage(0);
            Toast.makeText(HomeScreen.this, "Story Has Been Reset", Toast.LENGTH_LONG).show();
        } else {
            currentPage = thisStory.getPage(choice);
        }




        //Makes all the display including buttons
        String pageText = currentPage.getStoryText();
        textView.setText(pageText);
        btnChoice1.setText(currentPage.getChoice1().getBtnText());
        btnChoice2.setText(currentPage.getChoice2().getBtnText());
        btnChoice3.setText(currentPage.getChoice3().getBtnText());

        hideButtons();

        btnChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextPage = currentPage.getChoice1().getSelectedChoice();
                loadPage(nextPage);
            }
        });

        btnChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextPage = currentPage.getChoice2().getSelectedChoice();
                loadPage(nextPage);
            }
        });

        btnChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int nextPage = currentPage.getChoice3().getSelectedChoice();
                loadPage(nextPage);
            }
        });


    }


    private void hideButtons() {

        if (currentPage.getChoice1().getBtnText().equalsIgnoreCase("Invisible")) {
            btnChoice1.setVisibility(View.GONE);
        } else {
            btnChoice1.setVisibility(View.VISIBLE);
        }

        if (currentPage.getChoice2().getBtnText().equalsIgnoreCase("Invisible")) {
           btnChoice2.setVisibility(View.GONE);
        } else {
           btnChoice2.setVisibility(View.VISIBLE);
        }

        if (currentPage.getChoice3().getBtnText().equalsIgnoreCase("Invisible")) {
            btnChoice3.setVisibility(View.GONE);
        } else {
            btnChoice3.setVisibility(View.VISIBLE);
        }

    }

}