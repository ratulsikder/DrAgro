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

public class Vutta extends Activity {
	
	Button vuttaAuto;
	Button vuttaManual;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
	 setContentView(R.layout.corn);
	
	 setTitle("ভূট্টা  ");
		getActionBar().setIcon(R.drawable.dr_agro);
		ActionBar ab = getActionBar(); 
		ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#81a3d0"));    
		ab.setBackgroundDrawable(colorDrawable);
		
		vuttaAuto = (Button) findViewById(R.id.corn_button_auto);
		
		vuttaAuto.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent vutta_auto = new Intent(Vutta.this,VuttaAuto.class);
				startActivity(vutta_auto);
				
			}
		});
		vuttaManual = (Button) findViewById(R.id.corn_button_manual);
		vuttaManual.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent vutta_manual = new Intent(Vutta.this,VuttaManual.class);
				startActivity(vutta_manual);
				
			}
		});
	
	}

}
