package com.android.titano.dragro;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;

public class MainActivity extends Activity {
	
	
	Button diseases_identy;
	Button npk_measure;
	Button weather;
	Button insect_killing;
	Button first_time_agri;
	Button listBank;
	Button credits;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		setTitle("ড. এ্যাগ্রো ");
		getActionBar().setIcon(R.drawable.dr_agro);
		ActionBar ab = getActionBar(); 
		ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#81a3d0"));    
		ab.setBackgroundDrawable(colorDrawable);
		
		
		
		
		
		diseases_identy = (Button) findViewById(R.id.diseases_id);
		
		diseases_identy.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent diseases = new Intent(MainActivity.this,Diseases_Identification.class);
				startActivity(diseases);
				
			}
		});
		
		npk_measure = (Button) findViewById(R.id.npk_identify);
		
		npk_measure.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				Intent npkMeasure = new Intent(MainActivity.this,Euria_Measurement.class);
				startActivity(npkMeasure);
				
			}
		});
		
		weather = (Button) findViewById(R.id.weather_one);
		
		weather.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent wea_ther = new Intent(MainActivity.this,Weather.class);
				startActivity(wea_ther);
				
			}
		});
		
		insect_killing = (Button) findViewById(R.id.insect_kill);
		
		insect_killing.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent insect = new Intent(MainActivity.this,Insect_killing.class);
				startActivity(insect);
			}
		});
		
		first_time_agri = (Button) findViewById(R.id.first_agri);
		
		first_time_agri.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent agri = new Intent(MainActivity.this,FirstTimeAgri.class);
				startActivity(agri);
				
			}
		});
		
		listBank = (Button) findViewById(R.id.banking);
		
		listBank.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent list = new Intent(MainActivity.this,ListOfBank.class);
				startActivity(list);
				
			}
		});
		credits = (Button) findViewById(R.id.credit_ors);
		
		credits.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent cre = new Intent(MainActivity.this,Credit.class);
				startActivity(cre);
				
			}
		});
	}	
	


}
