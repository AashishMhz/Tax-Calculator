package com.example.taxcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText salarytxt;
    private TextView taxamt;
    private Button btncaltax;
    private taxCal taxcal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btncaltax = findViewById(R.id.btncaltax);
        taxamt = findViewById(R.id.taxamt);
        salarytxt = findViewById(R.id.salarytxt);
        taxcal = new taxCal();
        btncaltax.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (TextUtils.isEmpty(salarytxt.getText().toString())) {
            salarytxt.setError("Enter your salary.");
            salarytxt.requestFocus();
            return;

        }

        Double salary = Double.parseDouble(salarytxt.getText().toString());

        taxcal.setSalary(salary);
        taxamt.setText(Double.toString (taxcal.calculation()));
    }
}
