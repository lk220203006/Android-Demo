package com.example.digitalforest.gallerydemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Gallery gallery;
    int[] resIDs = {
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.a
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gallery = findViewById(R.id.gallery);
        MyAdapter adapter = new MyAdapter();
        gallery.setAdapter(adapter);
    }

    class MyAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return resIDs.length;
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View row = convertView;
            Wrapper wrapper;
            if (row == null){
                row = LayoutInflater.from(MainActivity.this).inflate(R.layout.galleryitem,parent,false);
                wrapper = new Wrapper(row);
                row.setTag(wrapper);
            }
            else {
                wrapper = (Wrapper)row.getTag();
            }
            ImageView imageView = wrapper.getImageView();
            imageView.setImageResource(resIDs[position]);
            return row;
        }
    }

    class Wrapper{
        ImageView imageView;
        View row;

        public Wrapper(View row ) {
            this.row = row;
        }

        public ImageView getImageView() {
            if (imageView == null){
                imageView = row.findViewById(R.id.imageView);
            }
            return imageView;
        }
    }
}
