package com.example.droidcafetoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CheckBox syrup = (CheckBox) findViewById(R.id.chocolate_syrup_chckBox);
        final CheckBox sprinkles = (CheckBox) findViewById(R.id.sprinkles_chckBox);
        final CheckBox nuts = (CheckBox) findViewById(R.id.crushed_nuts_chckBox);
        final CheckBox cherries = (CheckBox) findViewById(R.id.cherries_chckBox);
        final CheckBox orio = (CheckBox) findViewById(R.id.orio_cookie_crumbles_chckBox);

        Button button = (Button) findViewById(R.id.show_toast_button);
        button.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                String result = "Toppings: ";
                if (syrup.isChecked())
                {
                    result += "Chocolate syrup, ";
                }
                if (sprinkles.isChecked())
                {
                    result += "Sprinkles,";
                }
                if (nuts.isChecked())
                {
                    result += "Crushed nuts,";
                }
                if (cherries.isChecked())
                {
                    result += "Cherries,";
                }
                if (orio.isChecked())
                {
                    result += "Orio cookie crumble";
                }
                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
