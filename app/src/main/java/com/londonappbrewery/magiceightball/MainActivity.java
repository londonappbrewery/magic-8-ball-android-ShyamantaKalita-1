package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int[] image_array = {
                R.drawable.no,
                R.drawable.no_idea,
                R.drawable.not_perfect,
                R.drawable.yes
        };
        Button button_holder;
        button_holder = (Button) findViewById(R.id.ask_button);

        final ImageView the_image = (ImageView) findViewById(R.id.img_with_data);

        button_holder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random a_number = new Random();
                int the_number = a_number.nextInt(4);
                the_image.setImageResource(image_array[the_number]);
                //System.out.println(the_number+"\n");
            }
        });

    }
}
