package com.moneyv1;

import java.sql.Date;
import java.util.GregorianCalendar;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.DatePicker.OnDateChangedListener;

public class Calendar extends DialogFragment {
	/*public static final String EXTRA_CRIME_ID =
			"com.moneyv1.android.criminalintent.dpCalendar";
	public static final String EXTRA_DATE =
			"com.moneyv1.android.criminalintent.date";
	private static final String DIALOG_DATE = "date";
	private Date mDate;
	

	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		mDate = (Date)getArguments().getSerializable(EXTRA_DATE);
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DAY_OF_MONTH);
	final View v = getActivity().getLayoutInflater()
	.inflate(R.layout.activity_calendar, null);
	DatePicker datePicker = (DatePicker)v.findViewById(R.id.dpCalendar);
	datePicker.init(year, month, day, new OnDateChangedListener() {
	public AlertDialog onDateChanged(DatePicker view, int year, int month, int day) {
	// Преобразование года, месяца и дня в объект Date
	mDate = (Date) new GregorianCalendar(year, month, day).getTime();
	getArguments().putSerializable(EXTRA_DATE, mDate);
	return new AlertDialog.Builder(getActivity())
	.setView(v)
	.setTitle(R.string.date_picker_title)
	.setPositiveButton(android.R.string.ok, null)
	.create();
	}
	public Dialog onCreateDialog1(Bundle savedInstanceState) {
	View v = getActivity().getLayoutInflater()
	.inflate(R.layout.activity_calendar, null);
	return new AlertDialog.Builder(getActivity())
	.setView(v)
	.setTitle(R.string.date_picker_title)
	.setPositiveButton(android.R.string.ok, null)
	.create();
	}
	public Calendar newInstance(Date date) {
		Bundle args = new Bundle();
		args.putSerializable(EXTRA_DATE, date);
		Calendar fragment = new Calendar();
		fragment.setArguments(args);
		return fragment;
}
	private void sendResult(int resultCode) {
		if (getTargetFragment() == null)
		return;
		Intent i = new Intent();
		i.putExtra(EXTRA_DATE, mDate);
		getTargetFragment()
		.onActivityResult(getTargetRequestCode(), resultCode, i);
		}*/
}
