package com.example.fitnesstracker;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText cal;
    private Button es;

    public static final String MyPref = "MyPrefs";
    public static final String CALORIE = "CaloriesKey";
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedPreferences = getSharedPreferences(MyPref, Context.MODE_PRIVATE);
        cal = findViewById(R.id.Calories);
        es = findViewById(R.id.EditSave);
        String intake = sharedPreferences.getString(CALORIE, "");
        cal.setText(intake);

        cal.setEnabled(false);
        es.setText("Edit");

        es.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cal.isEnabled()) {
                    cal.setEnabled(false);
                    es.setText("Edit");
                    // using shared preferences to save the calorie intake
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString(CALORIE, cal.getText().toString());
                    editor.commit();
                } else {
                    cal.setEnabled(true);
                    es.setText("Save");

                }
            }
        });
    }
}
