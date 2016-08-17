package com.example.daffyduck.monadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);
        LayoutInflater layoutInflater = LayoutInflater.from(this);
        List<Contact> liste = new ArrayList<Contact>();
        Contact contact = new Contact("nom1","06 12 45 78 98", R.drawable.p1);
        liste.add(contact);
        contact = new Contact("nom2","06 12 45 78 98", R.drawable.p2);
        liste.add(contact);
        contact = new Contact("nom3","06 12 45 78 98", R.drawable.p3);
        liste.add(contact);
        RepertoireAdapter repertoireAdapter = new RepertoireAdapter(liste, layoutInflater);
        listView.setAdapter(repertoireAdapter);
    }
}
