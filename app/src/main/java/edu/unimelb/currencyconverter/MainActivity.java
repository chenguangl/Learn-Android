package edu.unimelb.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void convert(View view) {
        EditText moneyEditText = (EditText) findViewById(R.id.moneyEditText);
        String pound_String = moneyEditText.getText().toString();
        double pound = Double.parseDouble(pound_String);
        double audollar = pound * 1.79;
        String audollar_String = String.format("%.2f",audollar);
        Toast.makeText(this,  pound_String+" pounds are "+audollar_String+" au dollars",Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
