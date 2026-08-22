package com.giang.mpl;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView songTitle;
    private Button playButton;
    private Button pauseButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        createUserInterface();
    }

    private void createUserInterface() {
        LinearLayout layout = new LinearLayout(this);

        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(32, 32, 32, 32);

        songTitle = new TextView(this);
        songTitle.setText("No song selected");
        songTitle.setTextSize(20);

        playButton = new Button(this);
        playButton.setText("Play");

        pauseButton = new Button(this);
        pauseButton.setText("Pause");

        layout.addView(songTitle);
        layout.addView(playButton);
        layout.addView(pauseButton);

        setContentView(layout);
    }
}
