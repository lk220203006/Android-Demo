package com.example.digitalforest.listviewdemo;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    String[] datasource = {"北京","上海","广州","长沙"};
    ListView listView;
    String[] courses;
    TextView textView;
    List<String> listDataSource = new ArrayList<String>();
    List<Map<String,String>> data = new ArrayList<Map<String,String >>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        courses = getResources().getStringArray(R.array.course);
        textView = findViewById(R.id.textView);

        listView = findViewById(R.id.tvlistview);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.listitem,R.id.tvCity,courses);
//        listView.setAdapter(adapter);
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String s = courses[position];
//                textView.setText(s);
//            }
//        });

//        String[] array = getResources().getStringArray(R.array.test);
//        for (int i=0;i<array.length;i++){
//            listDataSource.add(array[i]);
//        }

//        listView.setAdapter(new MyAdapter());
        fill();
        SimpleAdapter adapter = new SimpleAdapter(this,data,R.layout.listitem2,new String[]{"name","age"},new int[]{R.id.tvname,R.id.tvage});
        listView.setAdapter(adapter);
    }

    void fill(){
        Map<String,String> map = new HashMap<String, String>();
        map.put("name","张三");
        map.put("age","23");
        data.add(map);

        map = new HashMap<String, String>();
        map.put("name","李四");
        map.put("age","25");
        data.add(map);
    }

    class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return listDataSource.size();
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
            //布局文件解析成view
            LayoutInflater inflater = getLayoutInflater();
            View row = inflater.inflate(R.layout.listitem,parent,false);
            //查找到相应的控件
            TextView tv = row.findViewById(R.id.tvCity);
            //设置显示的内容
            tv.setText(listDataSource.get(position));
            ImageView imageView = row.findViewById(R.id.tvimageView);
            if (position%2==0) {
                imageView.setBackgroundColor(Color.RED);
            }
            else{
                imageView.setBackgroundColor(Color.BLUE);
            }
            return row;
        }
    }
}
