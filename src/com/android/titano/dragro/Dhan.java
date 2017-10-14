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

public class Dhan extends Activity {
	
	Button dhanAuto;
	Button dhanManual;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
	 setContentView(R.layout.dhan);
	
	 setTitle(" ধান   ");
		getActionBar().setIcon(R.drawable.dr_agro);
		ActionBar ab = getActionBar(); 
		ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#81a3d0"));    
		ab.setBackgroundDrawable(colorDrawable);
		
		dhanAuto = (Button) findViewById(R.id.dhan_auto);
		
		dhanAuto.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent dhan_auto = new Intent(Dhan.this,DhanAuto.class);
				startActivity(dhan_auto);
				
			}
		});
		dhanManual = (Button) findViewById(R.id.dhan_manual);
		dhanManual.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent dhan_manual = new Intent(Dhan.this,DhanManual.class);
				startActivity(dhan_manual);
				
			}
		});
	
	}

}
