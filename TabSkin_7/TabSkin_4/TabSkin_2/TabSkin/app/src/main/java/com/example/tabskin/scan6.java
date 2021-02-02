package com.example.tabskin;

import android.os.AsyncTask;
import android.util.Log;
import android.view.View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class scan6 extends AsyncTask<Void, Void, String> {
    public static void setOnClickListener(View.OnClickListener onClickListener) {
    }


    @Override
    protected String doInBackground(Void... voids) {
        try {
            URL url = new URL("http://192.168.0.81/scan");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            if (httpURLConnection.getResponseCode() != HttpURLConnection.HTTP_OK)
            {
                Log.d("connectstation", "fail....retrying");
                URL url1 = new URL("http://192.168.0.81/scan");
                HttpURLConnection httpURLConnection1 = (HttpURLConnection) url1.openConnection();
                InputStream inputStream1 = httpURLConnection1.getInputStream();
                // android.os.Process.killProcess(android.os.Process.myPid());
            }
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            httpURLConnection.disconnect();


        } catch (MalformedURLException e) {
            Log.v("caution", "Url is not correct");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
