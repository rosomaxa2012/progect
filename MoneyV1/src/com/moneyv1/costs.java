package com.moneyv1;

import java.util.ArrayList;
import java.util.Date;


import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.ActionMode.Callback;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;
public class costs extends Fragment implements OnClickListener,
		OnItemSelectedListener {

	Context ourContext;
	// public static final String DIALOG_DATE = "date";
	// String DIALOG_DATE = "date";
	Spinner cost, chalk, category, ChiseCash;
	Button data, save;
	EditText money, coments;
	TextView test;

	// TODO Auto-generated constructor stub
	/*public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View myFragmentView = inflater.inflate(R.layout.fragment1,
				container, false);*/
		
		@Override
		  public View onCreateView(LayoutInflater inflater, ViewGroup container,
		      Bundle savedInstanceState) {
		   View myFragmentView = inflater.inflate(R.layout.activity_main, null);
		myFragmentView = getActivity().findViewById(R.layout.activity_main);
		
		
		initialization(myFragmentView);

		((Button)getActivity().findViewById(R.id.bSave)).setOnClickListener(this);
		//save.setOnClickListener(this);
		
		cost.setAdapter(setupAdapters(R.array.s_cost,
				android.R.layout.simple_spinner_item));
		chalk.setAdapter(setupAdapters(R.array.s_chalk,
				android.R.layout.simple_spinner_item));
		category.setAdapter(setupAdapters(R.array.s_category,
				android.R.layout.simple_spinner_item));

		cost.setOnItemSelectedListener(this);
		chalk.setOnItemSelectedListener(this);
		category.setOnItemSelectedListener(this);
		
		return myFragmentView;

	}

	private ArrayAdapter<String> setupAdapters(int sCost, int simpleSpinnerItem)
	{
		setupAdapters(sCost, simpleSpinnerItem);
		final String[] chhos = getResources().getStringArray(
				sCost);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(),simpleSpinnerItem,chhos);
		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		return adapter;

	}

	public void initialization(View myFragmentView) {
		// TODO Auto-generated method stub
		save = (Button) myFragmentView.findViewById(R.id.bSave);
		cost = (Spinner) myFragmentView.findViewById(R.id.spCost);
		chalk = (Spinner) myFragmentView.findViewById(R.id.spDbit);
		category = (Spinner) myFragmentView.findViewById(R.id.spCategory);
		ChiseCash = (Spinner) myFragmentView.findViewById(R.id.spChiseCash);
		data = (Button) myFragmentView.findViewById(R.id.bDate);
		save = (Button) myFragmentView.findViewById(R.id.bSave);
		money = (EditText) myFragmentView.findViewById(R.id.etMoney);
		coments = (EditText) myFragmentView.findViewById(R.id.etComents);
		test = (TextView) myFragmentView.findViewById(R.id.tvTest);

	}

	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position,
			long id) {
		// TODO Auto-generated method stub
		@SuppressWarnings("unused")
		int costPosition, chalkPosition, categoryPosition;
		costPosition = cost.getSelectedItemPosition();
		chalkPosition = chalk.getSelectedItemPosition();
		categoryPosition = category.getSelectedItemPosition();
		switch (costPosition) {
		case 1:

			break;

		case 2:

			break;

		case 3:

			break;
		}
	}

	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.bDate:

		break;

		case R.id.bSave:
			
			((TextView)getActivity().findViewById(R.id.tvTest)).setText("Access from Fragment1");
			break;
		}
	}

	
}
