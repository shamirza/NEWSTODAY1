package com.shatraders.newstoday;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView mywebobj = (WebView) this.findViewById(R.id.webview);
        mywebobj.getSettings().setJavaScriptEnabled(true);
        mywebobj.loadUrl("https://news.google.co.in/");
    }
}
