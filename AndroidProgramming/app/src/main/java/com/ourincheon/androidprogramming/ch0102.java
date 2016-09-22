package com.ourincheon.androidprogramming;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.widget.TextView;

/**
 * Created by YANG-_-V on 2016-09-22.
 */

public class ch0102 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch0102);

        TextView textView4 = (TextView) findViewById(R.id.textView4);
        textView4.setEllipsize(TextUtils.TruncateAt.END);
        textView4.setSingleLine(true);
        textView4.setText("프로그램에서 설정한 생략 문자: 반갑습니다. 봄여름가을겨울!");
    }
}
