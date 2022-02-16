package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String numberOne = "";
    String numberTwo = "";
    String operand = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void inputNumber(View view) {
        TextView result = findViewById(R.id.tv_result_label);
        if(operand.isEmpty()){
            String text = ((Button) view).getText().toString();
            numberOne +=text;
            result.setText(numberOne);
        }else {
            String text = ((Button) view).getText().toString();
            numberTwo +=text;
            result.setText(numberTwo);
        }
    }

    public void clearAction (View view) {
        TextView result = findViewById(R.id.tv_result_label);
        numberOne = "";
        numberTwo = "";
        operand = "";
        result.setText("0");
    }

    public void inputOperand (View view) {
        if (operand.isEmpty()){
            String text = ((Button) view).getText().toString();
            operand = text;
            TextView resultLabel = findViewById(R.id.tv_result_label);
        }
    }

    public void resultAction (View view) {
        Double result = null;
        TextView resultLabel = findViewById(R.id.tv_result_label);
        switch (operand){
            case "/":
                Double resDel = Double.parseDouble(numberOne) / Double.parseDouble(numberTwo);
                result = resDel;
                break;
            case "*":
                Double resUmn = Double.parseDouble(numberOne) * Double.parseDouble(numberTwo);
                result = resUmn;
                break;
            case "+":
                Double resSum = Double.parseDouble(numberOne) + Double.parseDouble(numberTwo);
                result = resSum;
                break;
            case "-":
                Double resMin = Double.parseDouble(numberOne) - Double.parseDouble(numberTwo);
                result = resMin;
                break;
            default:
                break;
        }
        resultLabel.setText(result.toString());
    }
}