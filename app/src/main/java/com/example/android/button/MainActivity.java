package com.example.android.button;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      final   TextView textView = (TextView)findViewById(R.id.textView);
     final   Button button = (Button)findViewById(R.id.button);
        button.setText("click to see new Text");
        button.setTextColor(Color.GREEN);
        button.setTextSize(25);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setBackgroundColor(Color.YELLOW);
                textView.setVisibility(View.VISIBLE);
                Toast.makeText(getApplicationContext(),"the Message was gone now is visible", Toast.LENGTH_LONG).show();;


            }
        });

    }
}
