package com.assignments.acadgild.project_2_IMDB.JSONGetter;

import android.util.Log;
import android.widget.Toast;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by mukund on 14/4/16.
 */
public class JSONGetter {
    private String mUrl;

    public JSONGetter(String mUrl) {
        this.mUrl = mUrl;
    }

    public String getJSONNowPlaying() {
        String response="";

        HttpGet httpGet = new HttpGet(mUrl);

        HttpClient httpClient = new DefaultHttpClient();

        HttpResponse httpResponse = null;

        try {
            httpResponse = httpClient.execute(httpGet);
            HttpEntity httpEntity=httpResponse.getEntity();
            response = EntityUtils.toString(httpEntity);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Log.e("MMP", response);


        return response;
    }
}
