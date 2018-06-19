package com.example.digitalforest.a14database;

import android.content.ContentProvider;
import android.content.ContentResolver;
import android.database.Cursor;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ContentResolver resolver = getContentResolver();
        String[] projection = {ContactsContract.Profile._ID, ContactsContract.Profile.DISPLAY_NAME};
        Cursor cursor = resolver.query(ContactsContract.Contacts.CONTENT_URI,projection,null,null,null);

        ListView listView = findViewById(R.id.);
    }
}
