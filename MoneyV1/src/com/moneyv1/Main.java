package com.moneyv1;

//import com.moneyv1.costs;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentTabHost;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.TabHost.TabSpec;

public class Main extends Activity {


	TabHost thInfo;
	MenuInflater blowUp;
	TabSpec ts_test;
	Spinner cost, chalk, category, ChiseCash;
	Button data, save;
	EditText money,coments;
	TextView test;
   costs choose;
   FragmentTransaction fTrans;
   
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initialization();
		
		thInfo = (TabHost) findViewById(android.R.id.tabhost);
		thInfo.setup();

		ts_test = thInfo.newTabSpec("tag1");
		ts_test.setContent(R.id.tab1);
		ts_test.setIndicator("Рахунки");
		thInfo.addTab(ts_test);

		ts_test = thInfo.newTabSpec("tag2");
		ts_test.setContent(R.id.tab2);
		ts_test.setIndicator("Витрати");
		thInfo.addTab(ts_test);

		ts_test = thInfo.newTabSpec("tag3");
		ts_test.setContent(R.id.tab3);
		ts_test.setIndicator("Iсторія");
		thInfo.addTab(ts_test);
		
		ts_test = thInfo.newTabSpec("tag4");
		ts_test.setContent(R.id.tab4);
		ts_test.setIndicator("Нотатки");
		thInfo.addTab(ts_test);
    choose = new costs();
    fTrans = getFragmentManager().beginTransaction();
   // fTrans.commit();
    
		
	}
	
	
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		// TODO Auto-generated method stub
		blowUp = getMenuInflater();
		blowUp.inflate(R.menu.activity_menu, menu);
		return super.onCreateOptionsMenu(menu);
	
	}
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
	
		switch(item.getItemId()){
		case R.id.About :
			Intent About = new Intent("android.intent.action.About");
			startActivity(About);
			break;
		case R.id.Language :
			Intent Lang = new Intent("android.intent.action.Language");
			startActivity(Lang);
			break;
		case R.id.mEx:
			finish();
			
			break;
	}
		return false; 
	}
	
	public void initialization() {
		// TODO Auto-generated method stub
		cost = (Spinner) findViewById(R.id.spCost);
		chalk = (Spinner) findViewById(R.id.spDbit);
		category = (Spinner) findViewById(R.id.spCategory);
		ChiseCash = (Spinner) findViewById(R.id.spChiseCash);
		//data = (Button) findViewById(R.id.bDate);
		save = (Button) findViewById(R.id.bSave);
		money = (EditText) findViewById(R.id.etMoney);
		coments = (EditText) findViewById(R.id.etComents);
		test = (TextView) findViewById(R.id.tvTest);
	
	}
}

