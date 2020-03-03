package com.devsleaders.pixelspectrum;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ImageAddapter extends RecyclerView.Adapter<ImageAddapter.MyImageViewHolder>{

    private int[] images;
    Context context;

    ImageAddapter(Context context, int[] images){
        this.context = context;
        this.images = images;
    }

    @NonNull
    @Override
    public MyImageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_row, parent, false);

        MyImageViewHolder imageViewHolder = new MyImageViewHolder(view);

        return imageViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyImageViewHolder holder, final int position) {
        holder.imageView.setImageResource(images[position]);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, FullScreenImageViewer.class);
                intent.putExtra("position", position);
                intent.putExtra("images", images);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class MyImageViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;

        public MyImageViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageId);
        }
    }


}