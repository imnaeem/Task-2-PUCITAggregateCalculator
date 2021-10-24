package com.example.pucitaggregatecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    TextView textView;
    EditText editText;
    double matric_marks=0;
    double inter_marks=0;
    double calculate=0.0;

    boolean hafiz_quran=false;


    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.checkBox:
                if (checked)
                hafiz_quran = true;
        else
            hafiz_quran = false;

                break;

        }
    }

    public void Calculate(View view) {
        editText = (EditText) findViewById (R.id.matricmarks);
        matric_marks = Double.parseDouble(editText.getText().toString());
        editText = (EditText) findViewById (R.id.intermediatemarks);
        inter_marks = Double.parseDouble(editText.getText().toString());

//        if (hafiz_quran == true)
//        {
//            inter_marks = inter_marks +20;
//        }
//        matric_marks = (matric_marks*30)/100;
//        inter_marks = (inter_marks*70)/100;
//
//        calculate = matric_marks + inter_marks;
//
//        editText = editText.findViewById(R.id.aggregate);
//
//        editText.setText(Double.toString(calculate));

    }
}