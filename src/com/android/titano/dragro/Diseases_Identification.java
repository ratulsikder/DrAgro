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

public class Diseases_Identification extends Activity {
	
	Button dhan;
	Button pat;
	Button gom;
	Button vutta;
	Button akh;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.diseases_identification);
		
		setTitle(" ফসলের রোগ নির্ণয়   ");
		getActionBar().setIcon(R.drawable.dr_agro);
		ActionBar ab = getActionBar(); 
		ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#81a3d0"));    
		ab.setBackgroundDrawable(colorDrawable);
		

		dhan = (Button) findViewById(R.id.dhan);
		
		
		dhan.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(Diseases_Identification.this,Dhan.class);
				
				startActivity(intent); 
				
			}
		});

		
		gom = (Button) findViewById(R.id.gom_button);
		
		
		gom.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Intent go_m = new Intent(Diseases_Identification.this,Gom.class);
				
				startActivity(go_m); 
				
			}
		});
		
		vutta = (Button) findViewById(R.id.vutta_button);
		vutta.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent vut_ta = new Intent(Diseases_Identification.this,Vutta.class);
				startActivity(vut_ta);
				
			}
		});
		

	}

}
