package cn.edu.sdwu.android.home.sn170507180205;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class Ch4Activity extends AppCompatActivity {
    private Spinner spinner = null;
    private ArrayList list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_ch4);


        Spinner spinner = (Spinner) findViewById(R.id.spinner1);
//准备数据
        list = new ArrayList();
        list.add("食品");
        list.add("家电");
        list.add("");
        //实例化数组适配器
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.layout_spinner_item, list);
        //设置到spinner中
        spinner.setAdapter(arrayAdapter);
        //处理事件响应
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> adapterView, android.view.View view, int i, long l) {
                //参数i，代表当前选中的索引值
                String content = list.get(i).toString();
                Toast.makeText(Ch4Activity.this, content, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
