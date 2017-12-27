package com.cyw.caculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    EditText et2;
    TextView tv1;
    TextView tv2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=(EditText)findViewById(R.id.editText);
        et2=(EditText)findViewById(R.id.editText2);
        tv1=(TextView)findViewById(R.id.textView);
        tv1=(TextView)findViewById(R.id.textView2);
        b1=(Button)findViewById(R.id.button);
    }

    public void click1(View v)
    {
        int a=Integer.valueOf(et1.getText().toString());
        int b=Integer.parseInt(et2.getText().toString());
        tv1.setText(String.valueOf(a+b));

    }
}
