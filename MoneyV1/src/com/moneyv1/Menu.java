package com.moneyv1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.MenuInflater;
import android.view.MenuInflater;
import android.view.MenuItem;

public class Menu extends Activity {

	MenuInflater blowUp;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.menu.activity_menu);
		setContentView(R.layout.activity_about);
		setContentView(R.layout.activity_main);
	}
	
}
