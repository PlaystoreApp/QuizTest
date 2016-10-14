package com.brilliance.databasejson.quiztest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by user-1 on 23-Jan-16.
 */
public class Loop1 extends AppCompatActivity {



    RadioGroup rg;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loop1);

        LinearLayout ll = (LinearLayout) findViewById(R.id.linearLayout2);
        LinearLayout lk = (LinearLayout) findViewById(R.id.linearLayout1);






        //add radio buttons
        final RadioButton[] rb = new RadioButton[5];
        RadioGroup rg = new RadioGroup(this); //create the RadioGroup
        rg.setOrientation(RadioGroup.VERTICAL);//or RadioGroup.VERTICAL
        for (int i = 0; i < 3; i++) {
            rb[i] = new RadioButton(this);
            rb[i].setText("Dynamic Radio Button " + i);
            rb[i].setId(i);
            rg.addView(rb[i]); //the RadioButtons are added to the radioGroup instead of the layout

        }
        ll.addView(rg);//you add the whole RadioGroup to the layout

for (int i=0; i<4 ;i++){


    // add text view
    TextView tv = new TextView(this);
   // tv.setText("Dynamic Text!");
    tv = (TextView) findViewById(R.id.textView5);
    lk.addView(tv);

    // add text view
    TextView tb = new TextView(this);
    tb.setText("Dynamic !");
    ll.addView(tb);

}




    }
}