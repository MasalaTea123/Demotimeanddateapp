package sg.edu.rp.c346.id20014009.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate;
    Button btnDisplayTime;
    TextView tvDisplay;
    Button btnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp=findViewById(R.id.datePicker);
        tp=findViewById(R.id.timePicker);
        btnDisplayDate=findViewById(R.id.buttonDisplayDate);
        btnDisplayTime=findViewById(R.id.buttonDisplayTime);
        tvDisplay=findViewById(R.id.textView);
        btnReset=findViewById(R.id.resetbutton);

        btnDisplayDate.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                String actualTime="Time is "+tp.getCurrentHour()+":"+tp.getCurrentMinute();
                tvDisplay.setText(actualTime);


            }
        });

        btnDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int currentDay=dp.getDayOfMonth();
                int currentMonth=dp.getMonth()+1;
                int currentYear=dp.getYear();

                String date="Date is "+currentDay+"/"+currentMonth+"/"+crrentYear;
                tvDisplay.setText(date);


            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            tp.setCurrentHour(0);
            tp.setCurrentMinute(0);
            dp.updateDate(2021,01,1);



            }
        });



    }
}