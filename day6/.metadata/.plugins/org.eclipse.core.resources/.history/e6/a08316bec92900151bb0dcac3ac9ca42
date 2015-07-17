package com.cy.tulingdemo;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends Activity implements HttpGetDataListener,OnClickListener{

	private HttpData mHttpData;
	
	private List<ListData> lists;
	private ListView lv;
	private EditText sendText;
	private Button sendButton;
	private String context_str;
	private TextAdapter adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
	
	}
	
	
    private void initView(){
    	lv = (ListView) findViewById(R.id.lv);
    	sendText = (EditText) findViewById(R.id.sendText);
    	sendButton = (Button) findViewById(R.id.sendBtn);
    	lists = new ArrayList<ListData>();
    	sendButton.setOnClickListener(this);
    	adapter = new TextAdapter(lists, this);
    	lv.setAdapter(adapter);
    }
	@Override
	public void getDataUrl(String data) {
		//System.out.println(data);
		parseText(data);
		
			
	}
	public void parseText(String str){
		try {
			JSONObject jb = new JSONObject(str);
//			System.out.println(jb.getString("code"));
//			System.out.println(jb.getString("text"));
			ListData listData = new ListData(jb.getString("text"),ListData.RECEIVER);
			lists.add(listData);
			adapter.notifyDataSetChanged();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}


	@Override
	public void onClick(View v) {
		context_str = sendText.getText().toString();
		mHttpData = (HttpData) new HttpData("http://www.tuling123.com/openapi/api?key=b23f47bf5558561aae18a81dd1fe18a1&info="+context_str,this).execute();
		ListData listData = new ListData(context_str,ListData.SEND);
		lists.add(listData);
		adapter.notifyDataSetChanged();

		
	}
}
