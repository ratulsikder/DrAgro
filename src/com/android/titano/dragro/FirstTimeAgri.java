package com.android.titano.dragro;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

public class FirstTimeAgri extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.first_time_agriculture);
		
		setTitle(" কৃষিতে হাতেখড়ি   ");
		getActionBar().setIcon(R.drawable.dr_agro);
		ActionBar ab = getActionBar(); 
		ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#81a3d0"));    
		ab.setBackgroundDrawable(colorDrawable);
	}

}
