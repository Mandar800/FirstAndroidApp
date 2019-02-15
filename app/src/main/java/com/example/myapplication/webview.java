package com.example.myapplication;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webview extends AppCompatActivity {
    private WebView webview;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        webview=(WebView)findViewById(R.id.wv);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("http://www.e-ducate.in");
    }
}
