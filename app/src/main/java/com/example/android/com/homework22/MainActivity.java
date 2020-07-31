package com.example.android.com.homework22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Items> words = new ArrayList<Items>();
        words.add(new Items(R.drawable.ic_item, getString(R.string.unit1),
                getString(R.string.home_work1_1)));
        words.add(new Items(R.drawable.ic_item, getString(R.string.unit1),
                getString(R.string.home_work1_2)));
        words.add(new Items(R.drawable.ic_item, getString(R.string.unit1),
                getString(R.string.home_work1_3)));
        words.add(new Items(R.drawable.ic_item2, getString(R.string.unit2),
                getString(R.string.home_work2_1)));
        words.add(new Items(R.drawable.ic_item2, getString(R.string.unit2),
                getString(R.string.home_work2_2)));
        words.add(new Items(R.drawable.ic_item3, getString(R.string.unit3),
                getString(R.string.home_work3_1)));
        words.add(new Items(R.drawable.ic_item3, getString(R.string.unit3),
                getString(R.string.home_work3_2)));
        words.add(new Items(R.drawable.ic_item3, getString(R.string.unit3),
                getString(R.string.home_work3_3)));
        words.add(new Items(R.drawable.ic_item4, getString(R.string.unit4),
                getString(R.string.home_work4_1)));
        words.add(new Items(R.drawable.ic_item, getString(R.string.unit1),
                getString(R.string.home_work1_1)));
        words.add(new Items(R.drawable.ic_item, getString(R.string.unit1),
                getString(R.string.home_work1_2)));
        words.add(new Items(R.drawable.ic_item, getString(R.string.unit1),
                getString(R.string.home_work1_3)));
        words.add(new Items(R.drawable.ic_item2, getString(R.string.unit2),
                getString(R.string.home_work2_1)));
        words.add(new Items(R.drawable.ic_item2, getString(R.string.unit2),
                getString(R.string.home_work2_2)));
        words.add(new Items(R.drawable.ic_item3, getString(R.string.unit3),
                getString(R.string.home_work3_1)));
        words.add(new Items(R.drawable.ic_item3, getString(R.string.unit3),
                getString(R.string.home_work3_2)));
        words.add(new Items(R.drawable.ic_item3, getString(R.string.unit3),
                getString(R.string.home_work3_3)));
        words.add(new Items(R.drawable.ic_item4, getString(R.string.unit4),
                getString(R.string.home_work4_1)));

        Adapter adapter = new Adapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                TextView textView = (TextView) view.findViewById(R.id.textView);
                String message = textView.getText().toString();
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }
}