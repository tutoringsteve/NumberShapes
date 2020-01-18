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
        EditText editText = (EditText) findViewById(R.id.numberEditText);

        Number number = new Number(editText.getText().toString());
        Log.i("The number is", number.getNumber().toString());

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        String isTriangular = (number.isTriangular() ? "is" : "is not");
        String isSquare = (number.isSquare() ? "is" : "is not");

        CharSequence textSquare = "The number " + number.getNumber().toString() + " " + isSquare + " a square number!";
        CharSequence textTriangular = "The number " + number.getNumber().toString() + " " + isTriangular + " a triangular number!";

        Log.i("SquareTest", textSquare.toString());
        Log.i("TriangularTest", textTriangular.toString());

        Toast toast = Toast.makeText(context, textSquare, duration);
        toast.show();
        toast = Toast.makeText(context, textTriangular, duration);
        toast.show();
    }

}