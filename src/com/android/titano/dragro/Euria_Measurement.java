package com.android.titano.dragro;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Euria_Measurement extends Activity {
	
	Button euria_auto;
	Button euria_manual;
	Button euria_usage;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.euria_measure);
		
		setTitle(" ইউরিয়া সার  পরিমাপক  ");
		getActionBar().setIcon(R.drawable.dr_agro);
		ActionBar ab = getActionBar(); 
		ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#81a3d0"));    
		ab.setBackgroundDrawable(colorDrawable);
		
		euria_auto = (Button) findViewById(R.id.euria_auto_button);
		
		euria_auto.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent euiraAuto = new Intent(Euria_Measurement.this,EuriaAuto.class);
				startActivity(euiraAuto);
				
			}
		});
		euria_manual = (Button) findViewById(R.id.euria_manual_button);
		euria_manual.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent rash = new Intent(Euria_Measurement.this,EuriaManual.class);
				startActivity(rash);
				
			}
		});
		euria_usage = (Button) findViewById(R.id.euria_usage_button);
		euria_usage.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent pota_sh = new Intent(Euria_Measurement.this,EuriaUsage.class);
				startActivity(pota_sh);
				
			}
		});
	}
	
	

}
