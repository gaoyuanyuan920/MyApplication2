package cn.edu.sdwu.android.home.sn170507180205;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Ch2Activity extends AppCompatActivity {
    private ArrayList list;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //加载界面
        setContentView(R.layout.layout_ch2);
        list = new ArrayList();
        textView = (TextView) findViewById(R.id.ch4_3_tv);
        //通过界面容器 找到他包含的所有子元素，再来注册监听器
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ch4_3_11);
        int count = linearLayout.getChildCount();//获取有几个
        for (int i = 0; i < count; i++) {
            View view = linearLayout.getChildAt(i);
            if (view instanceof CheckBox) {
                CheckBox checkBox = (CheckBox) view;
                checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                        //参数b代表是否选中 第一个CompoundButton 参数代表事件源
                        int j = 0;
                        if (b) {
                            list.add(compoundButton);
                        } else {
                            list.remove(compoundButton);
                        }
                        String content = "你的选择是：";
                        for (j = 0; j <= list.size(); j++) {
                            CheckBox checkBox1 = (CheckBox) list.get(j);
                            String sel = checkBox1.getText().toString();
                            content += sel + ",";
                            j = j++;
                        }
                        Toast.makeText(getApplicationContext(), content.toString() + "共" + j + "项", Toast.LENGTH_SHORT).show();
                    }

                });
            }
        }
    }
}