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

public class Gom extends Activity {
	
	Button gomAuto;
	Button gomManual;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
	 setContentView(R.layout.wheat);
	
	 setTitle("গম  ");
		getActionBar().setIcon(R.drawable.dr_agro);
		ActionBar ab = getActionBar(); 
		ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#81a3d0"));    
		ab.setBackgroundDrawable(colorDrawable);
		
		gomAuto = (Button) findViewById(R.id.wheat_auto_one);
		
		gomAuto.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent gom_auto = new Intent(Gom.this,GomAuto.class);
				startActivity(gom_auto);
				
			}
		});
		gomManual = (Button) findViewById(R.id.wheat_manual_one);
		gomManual.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent gom_manual = new Intent(Gom.this,GomManual.class);
				startActivity(gom_manual);
				
			}
		});
	
	}

}
