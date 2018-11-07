package com.example.qlangeveld.mainactivity;

import android.media.Image;
import android.os.PersistableBundle;
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

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        // save the visibility of the hat
        ImageView Hat = findViewById(R.id.hat);
        Integer ImageHatVisibility = Hat.getVisibility();
        outState.putInt("imageHatVisibility", ImageHatVisibility);

        // save the visibility of the arms
        ImageView Arms = findViewById(R.id.arms);
        Integer ImageArmsVisibility = Arms.getVisibility();
        outState.putInt("imageArmsVisibility", ImageArmsVisibility);

        // save the visibility of the ears
        ImageView Ears = findViewById(R.id.ears);
        Integer ImageEarsVisibility = Ears.getVisibility();
        outState.putInt("imageEarsVisibility", ImageEarsVisibility);

        // save the visibility of the eyebrows
        ImageView Eyebrows = findViewById(R.id.eyebrows);
        Integer ImageEyebrowsVisibility = Eyebrows.getVisibility();
        outState.putInt("imageEyebrowsVisibility", ImageEyebrowsVisibility);

        // save the visibility of the eyes
        ImageView Eyes = findViewById(R.id.eyes);
        Integer ImageEyesVisibility = Eyes.getVisibility();
        outState.putInt("imageEyesVisibility", ImageEyesVisibility);

        // save the visibility of the glasses
        ImageView Glasses = findViewById(R.id.glasses);
        Integer ImageGlassesVisibility = Glasses.getVisibility();
        outState.putInt("imageGlassesVisibility", ImageGlassesVisibility);

        // save the visibility of the nose
        ImageView Nose = findViewById(R.id.nose);
        Integer ImageNoseVisibility = Nose.getVisibility();
        outState.putInt("imageNoseVisibility", ImageNoseVisibility);

        // save the visibility of the moustache
        ImageView Moustache = findViewById(R.id.moustache);
        Integer ImageMoustacheVisibility = Moustache.getVisibility();
        outState.putInt("imageMoustacheVisibility", ImageMoustacheVisibility);

        // save the visibility of the shoes
        ImageView Shoes = findViewById(R.id.shoes);
        Integer ImageShoesVisibility = Shoes.getVisibility();
        outState.putInt("imageShoesVisibility", ImageShoesVisibility);

    }

    @Override
    public void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);

        // Restore visibility of the hat
        Integer imageViewValueRestoredHat = inState.getInt("imageHatVisibility");
        ImageView Hat = findViewById(R.id.hat);
        Hat.setVisibility(imageViewValueRestoredHat);

        // Restore visibility of the Arms
        Integer imageViewValueRestoredArms = inState.getInt("imageArmsVisibility");
        ImageView Arms = findViewById(R.id.arms);
        Arms.setVisibility(imageViewValueRestoredArms);

        // Restore visibility of the ears
        Integer imageViewValueRestoredEars = inState.getInt("imageEarsVisibility");
        ImageView Ears = findViewById(R.id.ears);
        Ears.setVisibility(imageViewValueRestoredEars);

        // Restore visibility of the eyebrows
        Integer imageViewValueRestoredEyebrows = inState.getInt("imageEyebrowsVisibility");
        ImageView Eyebrows = findViewById(R.id.eyebrows);
        Eyebrows.setVisibility(imageViewValueRestoredEyebrows);

        // Restore visibility of the eyes
        Integer imageViewValueRestoredEyes = inState.getInt("imageEyesVisibility");
        ImageView Eyes = findViewById(R.id.eyes);
        Eyes.setVisibility(imageViewValueRestoredEyes);

        // Restore visibility of the glasses
        Integer imageViewValueRestoredGlasses = inState.getInt("imageGlassesVisibility");
        ImageView Glasses = findViewById(R.id.glasses);
        Glasses.setVisibility(imageViewValueRestoredGlasses);

        // Restore visibility of the nose
        Integer imageViewValueRestoredNose = inState.getInt("imageNoseVisibility");
        ImageView Nose = findViewById(R.id.nose);
        Nose.setVisibility(imageViewValueRestoredNose˚);

        // Restore visibility of the moustache
        Integer imageViewValueRestoredMoustache = inState.getInt("imageMoustacheVisibility");
        ImageView Moustache = findViewById(R.id.moustache);
        Moustache.setVisibility(imageViewValueRestoredMoustache);

        // Restore visibility of the shoes
        Integer imageViewValueRestoredShoes = inState.getInt("imageShoesVisibility");
        ImageView Shoes = findViewById(R.id.shoes);
        Shoes.setVisibility(imageViewValueRestoredShoes);

    }

    public void checkClicked(View v)
    {
        Log.d("potato", "checkClicked: ");
        CheckBox checkBox = (CheckBox) v;

        switch(v.getId())
        {
            case R.id.hat:
            {
                ImageView imageHat = findViewById(R.id.hat);
                if (checkBox.isChecked()) {
                    imageHat.setVisibility(View.VISIBLE);
                } else {
                    imageHat.setVisibility(View.INVISIBLE);
                }
                break;
            }

            case R.id.arms:
            {
                ImageView imageArms = findViewById(R.id.arms);
                if (checkBox.isChecked())
                {
                    imageArms.setVisibility(View.VISIBLE);
                }
                else
                {
                    imageArms.setVisibility(View.INVISIBLE);
                }
            break;
            }
            case R.id.ears:
            {
                ImageView imageEars = findViewById(R.id.ears);
                if (checkBox.isChecked())
                {
                    imageEars.setVisibility(View.VISIBLE);
                }
                else
                {
                    imageEars.setVisibility(View.INVISIBLE);
                }
            break;
            }
            case R.id.eyebrows:
            {
                ImageView imageEyebrows = findViewById(R.id.eyebrows);
                if (checkBox.isChecked())
                {
                    imageEyebrows.setVisibility(View.VISIBLE);
                }
                else
                {
                    imageEyebrows.setVisibility(View.INVISIBLE);
                }
            break;
            }
            case R.id.eyes:
            {
                ImageView imageEyes = findViewById(R.id.eyes);
                if (checkBox.isChecked())
                {
                    imageEyes.setVisibility(View.VISIBLE);
                }
                else
                {
                    imageEyes.setVisibility(View.INVISIBLE);
                }
            break;
            }
            case R.id.glasses:
            {
                ImageView imageGlasses = findViewById(R.id.glasses);
                if (checkBox.isChecked())
                {
                    imageGlasses.setVisibility(View.VISIBLE);
                }
                else
                {
                    imageGlasses.setVisibility(View.INVISIBLE);
                }
            break;
            }
            case R.id.nose:
            {
                ImageView imageNose = findViewById(R.id.nose);
                if (checkBox.isChecked())
                {
                    imageNose.setVisibility(View.VISIBLE);
                }
                else
                {
                    imageNose.setVisibility(View.INVISIBLE);
                }
            break;
            }
            case R.id.moustache:
            {
                ImageView imageMoustache = findViewById(R.id.moustache);
                if (checkBox.isChecked())
                {
                    imageMoustache.setVisibility(View.VISIBLE);
                }
                else
                {
                    imageMoustache.setVisibility(View.INVISIBLE);
                }
            break;
            }
            case R.id.mouth:
            {
                ImageView imageMouth = findViewById(R.id.mouth);
                if (checkBox.isChecked())
                {
                    imageMouth.setVisibility(View.VISIBLE);
                }
                else
                {
                    imageMouth.setVisibility(View.INVISIBLE);
                }
            break;
            }
            case R.id.shoes:
            {
                ImageView imageShoes = findViewById(R.id.shoes);
                if (checkBox.isChecked())
                {
                    imageShoes.setVisibility(View.VISIBLE);
                }
                else
                {
                    imageShoes.setVisibility(View.INVISIBLE);
                }
            break;
            }

        }


    }

}