package com.example.qlangeveld.mainactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkClicked(View v)
    {
        Log.d("potato", "checkClicked: ");
        CheckBox checkBox = (CheckBox) v;

        switch(v.getId())
        {
            case R.id.hat:
            {
                ImageView image = findViewById(R.id.hat);
                if (checkBox.isChecked()) {
                    image.setVisibility(View.VISIBLE);
                } else {
                    image.setVisibility(View.INVISIBLE);
                }
                break;
            }

            case R.id.arms:
            {
                ImageView image = findViewById(R.id.arms);
                if (checkBox.isChecked())
                {
                    image.setVisibility(View.VISIBLE);
                }
                else
                {
                    image.setVisibility(View.INVISIBLE);
                }
            break;
            }
            case R.id.ears:
            {
                ImageView image = findViewById(R.id.ears);
                if (checkBox.isChecked())
                {
                    image.setVisibility(View.VISIBLE);
                }
                else
                {
                    image.setVisibility(View.INVISIBLE);
                }
            break;
            }
            case R.id.eyebrows:
            {
                ImageView image = findViewById(R.id.eyebrows);
                if (checkBox.isChecked())
                {
                    image.setVisibility(View.VISIBLE);
                }
                else
                {
                    image.setVisibility(View.INVISIBLE);
                }
            break;
            }
            case R.id.eyes:
            {
                ImageView image = findViewById(R.id.eyes);
                if (checkBox.isChecked())
                {
                    image.setVisibility(View.VISIBLE);
                }
                else
                {
                    image.setVisibility(View.INVISIBLE);
                }
            break;
            }
            case R.id.glasses:
            {
                ImageView image = findViewById(R.id.glasses);
                if (checkBox.isChecked())
                {
                    image.setVisibility(View.VISIBLE);
                }
                else
                {
                    image.setVisibility(View.INVISIBLE);
                }
            break;
            }
            case R.id.nose:
            {
                ImageView image = findViewById(R.id.nose);
                if (checkBox.isChecked())
                {
                    image.setVisibility(View.VISIBLE);
                }
                else
                {
                    image.setVisibility(View.INVISIBLE);
                }
            break;
            }
            case R.id.moustache:
            {
                ImageView image = findViewById(R.id.moustache);
                if (checkBox.isChecked())
                {
                    image.setVisibility(View.VISIBLE);
                }
                else
                {
                    image.setVisibility(View.INVISIBLE);
                }
            break;
            }
            case R.id.mouth:
            {
                ImageView image = findViewById(R.id.mouth);
                if (checkBox.isChecked())
                {
                    image.setVisibility(View.VISIBLE);
                }
                else
                {
                    image.setVisibility(View.INVISIBLE);
                }
            break;
            }
            case R.id.shoes:
            {
                ImageView image = findViewById(R.id.shoes);
                if (checkBox.isChecked())
                {
                    image.setVisibility(View.VISIBLE);
                }
                else
                {
                    image.setVisibility(View.INVISIBLE);
                }
            break;
            }

        }


    }
}