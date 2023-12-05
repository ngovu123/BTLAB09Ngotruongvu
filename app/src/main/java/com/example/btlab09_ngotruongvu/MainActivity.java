package com.example.btlab09_ngotruongvu;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void listview(View view){
        Toast.makeText(getApplicationContext(), "Listview", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, Listview1.class);
        startActivity(intent);
    }
    public void listview2(View view){
        Toast.makeText(getApplicationContext(), "Listview2", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, listview2.class);
        startActivity(intent);
    }
    public void listview3(View view){
        Toast.makeText(getApplicationContext(), "Listview3", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, listview3.class);
        startActivity(intent);
    }
    public void CAUSpinner(View view){
        Toast.makeText(getApplicationContext(), "CAUSpinner", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, BTSpinner.class);
        startActivity(intent);
    }
    public void autotextview(View view){
        Toast.makeText(getApplicationContext(), "autotextview", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, autotextview.class);
        startActivity(intent);
    }
    public void btGridview(View view){
        Toast.makeText(getApplicationContext(), "btGridview", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, btgridview.class);
        startActivity(intent);
    }
    public void btimesection(View view){
        Toast.makeText(getApplicationContext(), "btimesection", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, BTTimeSection.class);
        startActivity(intent);
    }
    public void bttabselector(View view){
        Toast.makeText(getApplicationContext(), "bttabselector", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, TabSelectorActivity.class);
        startActivity(intent);
    }
    public void btcontextmenu1(View view){
        Toast.makeText(getApplicationContext(), "btcontextmenu1", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, contextmenu1.class);
        startActivity(intent);
    }
    public void btcontextmenu2(View view){
        Toast.makeText(getApplicationContext(), "btcontextmenu2", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, Contextmenu2.class);
        startActivity(intent);
    }


}