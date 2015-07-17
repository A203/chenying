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

public class HttpData extends AsyncTask<String, Void, String> {//Void����ĸҲ�Ǵ�д,thread:һ��Ӧ�õ�ִ�й��� (���������)
//AsyncTask��ʹ��������Ӧ�ù��̸���
/*AsyncTask��Android 1.5 Cubake���������ʵ���첽������һ���࣬
 * �ڴ�֮ǰֻ����Java SE���е�Thread��ʵ�ֶ��߳��첽��AsyncTask��Androidƽ̨�Լ����첽���ߣ�
 * ������Androidƽ̨�����ԣ����첽�������ӵİ�ȫ�������ʵ�á�*/
	private HttpClient mHttpClient;//������������
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
