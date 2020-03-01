package com.example.missionandroid_111;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText enterName;
    private Button showName;
    private TextView nameIs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterName = findViewById(R.id.editText);
        showName = findViewById(R.id.button);
        nameIs = findViewById(R.id.textView);

        showName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getName = enterName.getText().toString();

                nameIs.setText("Hello "+ getName);
            }
        });

    }
}
