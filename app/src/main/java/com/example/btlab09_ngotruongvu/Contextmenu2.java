package com.example.btlab09_ngotruongvu;

import android.app.Activity;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.Button;

public class Contextmenu2 extends Activity  {

    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contextmenu2);

        btn1 = (Button) findViewById(R.id.btnctmnui);
        btn2 = (Button) findViewById(R.id.btnctmnu2);

        registerForContextMenu(btn1);
        registerForContextMenu(btn2);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        if (v.getId() == R.id.btnctmnui) {
            getMenuInflater().inflate(R.menu.contextmenul, menu);
        } else if (v.getId() == R.id.btnctmnu2) {
            contextmenu2(menu);
        }
    }

    public void contextmenu2(Menu menu) {
        int groupId = 1;
        menu.add(groupId, 113, 0, "Red");
        menu.add(groupId, 114, 1, "Green");
        menu.add(groupId, 115, 2, "Blue");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Typeface type = Typeface.createFromAsset(getAssets(), "arial.ttf");

        switch (item.getItemId()) {
            case R.id.mnubold:
                btn1.setTypeface(type, Typeface.BOLD);
                break;
            case R.id.mnuItalic:
                btn1.setTypeface(type, Typeface.ITALIC);
                break;
            case R.id.mnuunderline:
                btn1.setPaintFlags(btn1.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
                break;
            case 113:
                btn2.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                break;
            case 114:
                btn2.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                break;
            case 115:
                btn2.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark));
                break;
        }
        return super.onContextItemSelected(item);
    }
}