package cn.edu.sdwu.android.home.sn170507180205;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Ch5Activity extends AppCompatActivity {

    String text = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ch5);
        final TextView textView = (TextView) findViewById(R.id.textView);
        final Button btn_1 = (Button) findViewById(R.id.btn_1);
        final Button btn_2 = (Button) findViewById(R.id.btn_2);
        final Button btn_3 = (Button) findViewById(R.id.btn_3);
        final Button btn_4 = (Button) findViewById(R.id.btn_4);
        final Button btn_5 = (Button) findViewById(R.id.btn_5);
        final Button btn_6 = (Button) findViewById(R.id.btn_6);
        final Button btn_7 = (Button) findViewById(R.id.btn_7);
        final Button btn_8 = (Button) findViewById(R.id.btn_8);
        final Button btn_9 = (Button) findViewById(R.id.btn_9);
        final Button btn_0 = (Button) findViewById(R.id.btn_0);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = btn_1.getText().toString();
                text += s;
                textView.setText(text);
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = btn_2.getText().toString();
                text += s;
                textView.setText(text);
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = btn_3.getText().toString();
                text += s;
                textView.setText(text);
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = btn_4.getText().toString();
                text += s;
                textView.setText(text);
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = btn_5.getText().toString();
                text += s;
                textView.setText(text);
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = btn_6.getText().toString();
                text += s;
                textView.setText(text);
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = btn_7.getText().toString();
                text += s;
                textView.setText(text);
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = btn_9.getText().toString();
                text += s;
                textView.setText(text);
            }
        });
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = btn_0.getText().toString();
                text += s;
                textView.setText(text);
              }
          });

       }
    }