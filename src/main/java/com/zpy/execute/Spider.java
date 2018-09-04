package com.zpy.execute;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.InputStream;

public class Spider {
    public static void main(String[] args) throws Exception{
        CloseableHttpClient httpClient= HttpClients.createDefault();
        HttpGet httpGet = new HttpGet("http://paper.people.com.cn");
        CloseableHttpResponse response = httpClient.execute(httpGet);
        HttpEntity httpEntity= response.getEntity();
        InputStream inputStream=httpEntity.getContent();
        
    }
}
