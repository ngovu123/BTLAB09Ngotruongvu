package com.example.btlab09_ngotruongvu;

import android.os.Bundle;
import android.app.Activity;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class contextmenu1 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contextmenu1);

        // Registering the RelativeLayout for the context menu
        registerForContextMenu(findViewById(R.id.menu));
    }

    // Creating the context menu for the RelativeLayout
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.mymenu, menu);
    }

    // Handling context menu item clicks
    @Override
    public boolean onContextItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mnuxemdssv:
                // Process for viewing student list here
                Toast.makeText(this, "Xem danh sách Sinh viên", Toast.LENGTH_LONG).show();
                return true;

            case R.id.mnuxoads:
                // Process for deleting list here
                return true;

            // Add cases for other menu items as needed
        }
        return super.onContextItemSelected(item);
    }
}
