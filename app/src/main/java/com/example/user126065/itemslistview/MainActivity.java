package com.example.user126065.itemslistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity
{
    String[] names = {"mark","mary","rob", "candy", "elysia","sandy","kara"};
    ListView myList;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListAdapter myadapdter = new ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1,names);
        myList = (ListView) findViewById(R.id.FirstList);
        myList.setAdapter(myadapdter);
    }
}
