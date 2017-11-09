package com.mouath.hw12;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonPressed(View v){
        EditText string1 = (EditText)findViewById(R.id.editText1);
        EditText string2 = (EditText)findViewById(R.id.editText2);
        TextView result = (TextView)findViewById(R.id.resultView);

        String string1_rev = reverseString(string1.getText().toString());
        String string2_rev = reverseString(string2.getText().toString());

        String answer = string1_rev + string2_rev;
        result.setText(answer);

    }

    private String reverseString(String s){
        String temp = "";
        for(int i = s.length()-1; i >= 0; i--){
            temp = temp + s.charAt(i);
        }
        s = temp;
        return s;
    }
}
