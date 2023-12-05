package com.example.btlab09_ngotruongvu;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class BTTimeSection extends Activity  {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bttime_section);
        doWork();
    }

    public void doWork() {
        Button b1 = findViewById(R.id.btnAnalogClocl);
        b1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                AnalogClock analog = new AnalogClock(BTTimeSection.this);
                ((LinearLayout) findViewById(R.id.mylayout)).addView(analog);
            }
        });

        Button b2 = findViewById(R.id.btnChronometer);
        b2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                Chronometer cro = new Chronometer(BTTimeSection.this);
                ((LinearLayout) findViewById(R.id.mylayout)).addView(cro);
            }
        });

        Button b3 = findViewById(R.id.btnTimePicker);
        b3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                TimePickerDialog.OnTimeSetListener callback = new TimePickerDialog.OnTimeSetListener() {
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        TextView textView = findViewById(R.id.txtdate);
                        textView.setText(hourOfDay + " - " + minute + "@@@" + view.getCurrentHour() + " - " + view.getCurrentMinute());
                    }
                };

                Calendar cal = Calendar.getInstance();
                int hour = cal.get(Calendar.HOUR_OF_DAY);
                int minute = cal.get(Calendar.MINUTE);

                TimePickerDialog time = new TimePickerDialog(
                        BTTimeSection.this,
                        callback,
                        hour,
                        minute,
                        true
                );
                time.show();
            }
        });

        Button b4 = findViewById(R.id.btnDatePickerDialog);
        b4.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                DatePickerDialog.OnDateSetListener callback = new DatePickerDialog.OnDateSetListener() {
                    public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                        TextView textView = findViewById(R.id.txtdate);
                        textView.setText((dayOfMonth) + "/" + (monthOfYear + 1) + "/" + year);
                    }
                };

                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        BTTimeSection.this,
                        callback,
                        year,
                        month,
                        day
                );
                datePickerDialog.setTitle("My Date Time Picker");
                datePickerDialog.show();
            }
        });
    }
}