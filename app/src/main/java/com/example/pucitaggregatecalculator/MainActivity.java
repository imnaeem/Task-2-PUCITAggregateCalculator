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

    Button Calculate;
    TextView textView;
    double matric_marks=0;
    double inter_marks=0;
    double aggregate=0.0;

    boolean hafiz_quran=false;


    public void onCheckboxClicked(View view) {
        CheckBox simpleCheckBox = (CheckBox) findViewById(R.id.checkBox);
        Boolean checkBoxState = simpleCheckBox.isChecked();

        if(checkBoxState)
        {
            hafiz_quran = true;
        }
    }

    public void Calculate(View view) {
        textView = (EditText) findViewById (R.id.matricmarks);
        matric_marks = Double.parseDouble(textView.getText().toString());
        textView = (EditText) findViewById (R.id.intermediatemarks);
        inter_marks = Double.parseDouble(textView.getText().toString());

        if (hafiz_quran)
        {
            inter_marks = inter_marks +20;
        }
        matric_marks = (matric_marks*30)/100;
        inter_marks = (inter_marks*70)/100;

        aggregate = matric_marks + inter_marks;

        textView = textView.findViewById(R.id.aggregate);

        textView.setText(Double.toString(aggregate));

    }
}