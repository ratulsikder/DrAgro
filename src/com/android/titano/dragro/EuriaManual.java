package com.android.titano.dragro;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class EuriaManual extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.euria_manual);
		
		setTitle(" ইউরিয়া সারের  পরিমাণ  ");
		getActionBar().setIcon(R.drawable.dr_agro);
		ActionBar ab = getActionBar(); 
		ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#81a3d0"));    
		ab.setBackgroundDrawable(colorDrawable);
		
		
		
		ImageView iv;
		
		iv=(ImageView) findViewById(R.id.euria_mannual);
		
		iv.setImageResource(R.drawable.euria_chart_2);
	}

}
