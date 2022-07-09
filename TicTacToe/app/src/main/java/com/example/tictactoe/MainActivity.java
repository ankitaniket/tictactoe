package com.example.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

        // define the global variable

        // Add button Move to Activity

        Button next_Activity_button;

        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            next_Activity_button = findViewById(R.id.bt1);


            // Add_button add clicklistener
            next_Activity_button.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity.this, Game_offline.class);

                // start the activity connect to the specified class
                startActivity(intent);
            });
        }
    }



