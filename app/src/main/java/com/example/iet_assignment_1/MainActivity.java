package com.example.iet_assignment_1;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {

    private WebView myWebView;
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.listview);
        final ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("B. R. Ambedkar");
        arrayList.add("Vallabhbhai Patel");
        arrayList.add("Bhagat Singh");
        arrayList.add("Subhas Chandra Bose");
        arrayList.add("Mother Teresa");
        arrayList.add("Mahatama Gandhi");
        arrayList.add("Jawaharlal Nehru");
        arrayList.add("Tatia Tope");
        arrayList.add("Lal Bahadur Shastri");
        arrayList.add("Sukhdev");
        arrayList.add("Rani Lakshmi Bai");
        arrayList.add("Bal Gangadhar Tilak");
        arrayList.add("LalaLajpat Rai");
        arrayList.add("Mangal Pandey");
        arrayList.add("Vikram Damodar Savarkar");
        arrayList.add("Dadabhai Naoroji");
        arrayList.add("Ram Prasad Bismil");
        arrayList.add("K. M. Munshi");
        arrayList.add("Bipin Chandra Pal");
        arrayList.add("Chandra Shekhar Azad");
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @SuppressLint("SetJavaScriptEnabled")
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {
                String value = "OPENING : "+arrayList.get(i).toString()+"'s WikiPedia Page.";
                Toast.makeText(MainActivity.this,value,Toast.LENGTH_SHORT).show();
                String freedomfighter = arrayList.get(i).toString();
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    intent.putExtra("url",freedomfighter);
                    startActivity(intent);
            }
        });
    }
}