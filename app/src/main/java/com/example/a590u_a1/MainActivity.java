package com.example.a590u_a1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView label_name, label_result, text_name;
    private EditText input_name;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindview();
    }

    private void bindview(){
        label_name = findViewById(R.id.label_name);
        label_result =findViewById(R.id.label_result);
        text_name = findViewById(R.id.text_name);
        input_name = findViewById(R.id.input_name);
    }

    public void submit(View view) {
        name = String.valueOf(input_name.getText());
        text_name.setText(name);
//        Snackbar.make(getWindow().getDecorView().getRootView(), "Name submitted.", Snackbar.LENGTH_LONG).show();
    }

}
