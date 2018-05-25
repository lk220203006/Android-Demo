package com.example.digitalforest.listviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class Main4Activity extends AppCompatActivity {
    List<Book> bookList = new ArrayList<Book>();
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        fill();
        listView = findViewById(R.id.listview2);
        listView.setAdapter(new MyAdapter());
    }

    void fill(){
        bookList.add(new Book("C语言程序设计","谭浩强",23));
        bookList.add(new Book("Java程序设计","谭浩强",23));
    }


    class MyAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return bookList.size();
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
                LayoutInflater inflater = getLayoutInflater();
                row = LayoutInflater.from(Main4Activity.this).inflate(R.layout.listitem3,parent,false);
//                row = inflater.inflate(R.layout.listitem3,parent,false);
                wrapper = new Wrapper(row);
                row.setTag(wrapper);
            }
            else{
                wrapper = (Wrapper)row.getTag();
            }

            TextView tvBookName = wrapper.getTvBookName();
            TextView tvAuthor = wrapper.getTvAuthor();
            TextView tvprice = wrapper.getTvPrice();
            Book book = bookList.get(position);
            tvBookName.setText(book.getBookName());
            tvAuthor.setText(book.getAuthor());
            tvprice.setText(String.valueOf(book.getPrice()));
            return row;
        }
    }

    class Wrapper{
        TextView tvBookName;
        TextView tvAuthor;
        TextView tvPrice;

        View row;

        public Wrapper(View row) {
            this.row = row;
        }

        public TextView getTvBookName() {
            if (tvBookName == null){
                tvBookName = row.findViewById(R.id.tvBookName);
            }
            return tvBookName;
        }

        public TextView getTvAuthor() {
            if (tvAuthor == null){
                tvAuthor = row.findViewById(R.id.tvAuthor);
            }
            return tvAuthor;
        }

        public TextView getTvPrice() {
            if (tvPrice == null){
                tvPrice = row.findViewById(R.id.tvPrice);
            }
            return tvPrice;
        }
    }
}
