package com.example.tictactoe;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

        // define the global variable

        // Add button Move to Activity and for ai button

        Button offline_button;
        Button ai_button;

        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            offline_button = findViewById(R.id.bt1);
            ai_button = findViewById(R.id.bt2);




            // Add_button add clicklistener
            offline_button.setOnClickListener(v -> {
                Intent intent = new Intent(MainActivity.this, Game_offline.class);

                // start the activity connect to the specified class
                startActivity(intent);
            });

            ai_button.setOnClickListener(view -> Toast.makeText(getApplicationContext(), "There is no activity",
                    Toast.LENGTH_LONG).show());
        }

}



