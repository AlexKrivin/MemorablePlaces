package com.example.worck.memorableplaces;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView mainActLstV = (ListView)findViewById(R.id.mainActLstV);
        ArrayList<String> savedPlacesForMainActLstV = new ArrayList<>();
        savedPlacesForMainActLstV.add("Add a new place");
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,savedPlacesForMainActLstV);
        mainActLstV.setAdapter(arrayAdapter);
        mainActLstV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
                intent.putExtra("Place number ", position);
                startActivity(intent);
            }
        });
    }
}
