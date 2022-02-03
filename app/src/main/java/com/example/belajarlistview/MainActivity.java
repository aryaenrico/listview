package com.example.belajarlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {
    String[] Bulan={"Januari","Februari","Maret","April","Mei",
            "Agustus"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,Bulan));
    }

    public void onListItemClick(ListView parent, View view, int position, long id){
        Toast.makeText(this,"Kamu Memilih "+Bulan[position],Toast.LENGTH_SHORT).show();
    }

}