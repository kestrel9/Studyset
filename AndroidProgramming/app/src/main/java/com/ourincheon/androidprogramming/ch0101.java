package com.ourincheon.androidprogramming;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

public class ch0101 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch0101);

        TextView textView2 = (TextView) findViewById(R.id.textView2);
        textView2.setAutoLinkMask(Linkify.WEB_URLS);
        textView2.setText("프로그램에서 설정한 URL:http://www.infopub.co.kr");
    }
}
