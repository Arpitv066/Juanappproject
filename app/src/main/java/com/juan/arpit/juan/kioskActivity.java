package com.juan.arpit.juan;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class kioskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kiosk);


        WebView webView=new WebView(this);

        webView.getSettings().setJavaScriptEnabled(true);



        setContentView(webView);

        webView.loadUrl("http://125.19.185.49:8080/JaypeeU");
        webView.setWebViewClient(new WebViewClient(){

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url){
                view.loadUrl(url);
                return true;
            }
        });

    }
}
