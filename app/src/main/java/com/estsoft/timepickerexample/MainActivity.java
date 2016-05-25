package com.estsoft.timepickerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private DatePicker datePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        datePicker = (DatePicker) findViewById(R.id.datePicker);
        datePicker.init(2016, 5, 24, new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                ((TextView)findViewById(R.id.dateText)).setText(year + "-" + monthOfYear + "-" + dayOfMonth );
            }
        });
    }

    public void onClick(View view){
        int year = datePicker.getYear();
        int month = datePicker.getMonth();
        int day = datePicker.getDayOfMonth();

        Toast.makeText(MainActivity.this, year + "년 " + month + "월 " + day + "일", Toast.LENGTH_SHORT).show();
    }
}
