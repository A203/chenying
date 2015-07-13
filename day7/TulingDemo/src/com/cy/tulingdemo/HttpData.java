package com.cy.tulingdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.os.AsyncTask;

public class HttpData extends AsyncTask<String, Void, String> {//Void首字母也是大写,thread:一个应用的执行过程 (计算机用语)
//AsyncTask类使交互界面应用过程更简单
/*AsyncTask是Android 1.5 Cubake加入的用于实现异步操作的一个类，
 * 在此之前只能用Java SE库中的Thread来实现多线程异步，AsyncTask是Android平台自己的异步工具，
 * 融入了Android平台的特性，让异步操作更加的安全，方便和实用。*/
	private HttpClient mHttpClient;//创建网络请求
	private HttpGet mHttpGet;
	private String url;
	private HttpResponse mHttpResponse;
	private HttpEntity mHttpEntity;
	private InputStream in;
	private HttpGetDataListener listener;
	public HttpData(String url,HttpGetDataListener listener){
		this.url=url;
		this.listener = listener;
		}
	@Override
	protected String doInBackground(String... params) {
		try {
			mHttpClient = new DefaultHttpClient();
		    mHttpGet = new HttpGet(url);
            mHttpResponse = mHttpClient.execute(mHttpGet);
            mHttpEntity = mHttpResponse.getEntity();
            in = mHttpEntity.getContent();
            BufferedReader br=new BufferedReader(new InputStreamReader(in));
            String line = null;
            StringBuffer sb = new StringBuffer();
            while((line=br.readLine())!=null){
            	sb.append(line);
            }
            return sb.toString();
            
		}catch (Exception e) {
			e.printStackTrace();}
		return null;
	}
	@Override
	protected void onPostExecute(String result) {
		listener.getDataUrl(result);
		super.onPostExecute(result);
	}

}
