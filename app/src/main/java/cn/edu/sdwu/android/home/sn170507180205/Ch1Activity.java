package cn.edu.sdwu.android.home.sn170507180205;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ch1Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ch1);
        Button button = (Button) findViewById(R.id.ch1_1_13);
        button.setOnClickListener(new myclass());
        Button button1 = (Button) findViewById(R.id.ch1_1_14);
        button1.setOnClickListener(this);


        //加法（内部匿名类）
        Button button3 = (Button) findViewById(R.id.ch1_1_12);
        button3.setOnClickListener(new View.OnClickListener() {
                                       public void onClick(View view) {
               /*获取输入框里的值*/
                                           EditText editText1 = (EditText) findViewById(R.id.ch1_1_16);
                                           String num1 = editText1.getText().toString();

                                           EditText editText2 = (EditText) findViewById(R.id.ch1_1_17);
                                           String num2 = editText2.getText().toString();

                /*转化成 数值类型*/
                                           int num_1 = Integer.parseInt(num1);
                                           int num_2 = Integer.parseInt(num2);
                                           final int count = num_1 + num_2;
                                           final
                                           TextView textView = (TextView) findViewById(R.id.ch1_1_11);
                                           textView.setText(count);

                                       }
                                   }
        );

    }

    //减法（匿名类）
    class myclass implements View.OnClickListener {

        @Override
        public void onClick(View view) {
             /*获取输入框里的值*/
            EditText editText1 =(EditText ) findViewById(R.id.ch1_1_16);
            String num1 = editText1.getText().toString();

            EditText editText2 = (EditText) findViewById(R.id.ch1_1_17);
            String num2 = editText2.getText().toString();
                  /*转化成 数值类型*/
            int num_1 = Integer.parseInt(num1);
            int num_2 = Integer.parseInt(num2);
            final int count = num_1 + num_2;
            final
            TextView textView = (TextView) findViewById(R.id.ch1_1_11);
            textView.setText(count);

        }
    }
    //乘法（直接实现）
    @Override
    public void onClick(View view) {

    /*获取输入框里的值*/
        EditText editText1 =(EditText ) findViewById(R.id.ch1_1_16);
        String num1 = editText1.getText().toString();

        EditText editText2 = (EditText) findViewById(R.id.ch1_1_17);
        String num2 = editText2.getText().toString();
    /*转化成 数值类型*/
        int num_1 = Integer.parseInt(num1);
        int num_2 = Integer.parseInt(num2);
        final int count = num_1 * num_2;
        final
        TextView textView = (TextView) findViewById(R.id.ch1_1_11);
        textView.setText(count);


    }

    //除法（XML中调用）
    public void xml(View view){
        /*获取输入框里的值*/
        EditText editText1 =(EditText ) findViewById(R.id.ch1_1_16);
        String num1 = editText1.getText().toString();

        EditText editText2 = (EditText) findViewById(R.id.ch1_1_17);
        String num2 = editText2.getText().toString();
    /*转化成 数值类型*/
        int num_1 = Integer.parseInt(num1);
        int num_2 = Integer.parseInt(num2);
        final int count = num_1 /num_2;
        final
        TextView textView = (TextView) findViewById(R.id.ch1_1_11);

    }


}