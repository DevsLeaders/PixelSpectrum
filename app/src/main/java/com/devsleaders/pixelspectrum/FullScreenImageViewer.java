package com.devsleaders.pixelspectrum;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class FullScreenImageViewer extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen_image_viewer);

        if(getIntent().hasExtra("position") && getIntent().hasExtra("images")){

            int images[] = getIntent().getIntArrayExtra("images");
            int position = getIntent().getIntExtra("position", 0);

            imageView = findViewById(R.id.fullscreenImageId);

            imageView.setBackgroundResource(images[position]);
        }
    }
}