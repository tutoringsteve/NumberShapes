package com.myappcompany.steve.numbershapes;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class NumberShapesMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_shapes_main);
    }

    public void clickFunction(View view) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        EditText editText = findViewById(R.id.numberEditText);

        String text = editText.getText().toString();

        if(text.isEmpty() || text.equals("")) {
            Toast.makeText(context, "You need to enter a number!", duration).show();
        } else {
            evaluateNumber(text, context, duration);
        }

    }

    private void evaluateNumber(String text, Context context, int duration){
        Number number = new Number(text);

        Log.i("The number is", number.getNumber().toString());


        String isTriangular = (number.isTriangular() ? "is" : "is not");
        String isSquare = (number.isSquare() ? "is" : "is not");

        CharSequence textSquare = "The number " + number.getNumber().toString() + " " + isSquare + " a square number!";
        CharSequence textTriangular = "The number " + number.getNumber().toString() + " " + isTriangular + " a triangular number!";

        Log.i("SquareTest", textSquare.toString());
        Log.i("TriangularTest", textTriangular.toString());

        Toast.makeText(context, textSquare, duration).show();
        Toast.makeText(context, textTriangular, duration).show();
    }

}