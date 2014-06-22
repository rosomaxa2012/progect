package com.moneyv1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class About extends Activity {
	Button back_but;
	TextView version, Autor1, Autor2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
		back_but = (Button) findViewById(R.id.bBack);
		back_but.setOnClickListener(new OnClickListener() {
			public void onClick(View pView){
				finish();
			}
		});
	}
	
	
	
}
