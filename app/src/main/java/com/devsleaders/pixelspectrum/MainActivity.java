package com.devsleaders.pixelspectrum;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private int[] images = {R.drawable.wallpaper1, R.drawable.wallpaper2, R.drawable.wallpaper3, R.drawable.wallpaper4, R.drawable.wallpaper5, R.drawable.wallpaper6, R.drawable.wallpaper7, R.drawable.wallpaper8};

    private RecyclerView recyclerView;
    private RecyclerView.LayoutManager layoutManager;
    private ImageAddapter imageAddapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        layoutManager = new GridLayoutManager(this, 2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);

        imageAddapter = new ImageAddapter(this, images);
        recyclerView.setAdapter(imageAddapter);
    }
}