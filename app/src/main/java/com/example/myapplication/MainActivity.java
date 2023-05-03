package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webView=findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("javascript:addLayer(x, z, width, depth, direction)");
        webView.loadUrl("javascript:generateBox(x, y, z, width, depth, falls)");
        webView.loadUrl("javascript:addOverhang(x, z, width, depth)");
        webView.loadUrl("javascript:cutBox(topLayer, overlap, size, delta)");
        webView.loadUrl("javascript:init()");
        webView.loadUrl("javascript:startGame()");
        webView.loadUrl("javascript:eventHandler()");
        webView.loadUrl("javascript:splitBlockAndAddNextOneIfOverlaps()");
        webView.loadUrl("javascript:missedTheSpot()");
        webView.loadUrl("javascript:animation(time)");
        webView.loadUrl("javascript:updatePhysics(timePassed)");
        webView.loadUrl("javascript:window.addEventListener()");

        webView.loadUrl("file:///android_asset/index.html");
    }
}