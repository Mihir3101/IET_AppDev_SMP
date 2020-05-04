package com.example.iet_assignment_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Main2Activity extends AppCompatActivity {

    private WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent =getIntent();
        String freedomfighter=intent.getStringExtra("url");
        freedomfighter="https://en.wikipedia.org/wiki/"+freedomfighter;
        myWebView = (WebView) findViewById(R.id.wv);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl(freedomfighter);
        myWebView.setWebViewClient(new WebViewClient());
    }
    @Override
    public void onBackPressed() {
        if (myWebView.canGoBack()) {
            myWebView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
