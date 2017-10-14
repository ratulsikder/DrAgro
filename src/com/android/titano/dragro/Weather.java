package com.android.titano.dragro;

import android.os.Bundle;
import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.EditText;


public class Weather extends Activity {

	private String url1 = "http://api.openweathermap.org/data/2.5/weather?q=Bangladesh,";
	private String url2 = "&mode=xml";
	private EditText location, temperature, skycondition, humidity, airspeed;
	private HandleXML obj;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.weather);
		
		
		setTitle("আবহাওয়া বার্তা");
		getActionBar().setIcon(R.drawable.icon);
		ActionBar ab = getActionBar(); 
		ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#81a3d0"));    
		ab.setBackgroundDrawable(colorDrawable);		
		
		
		location = (EditText) findViewById(R.id.cityname);
		temperature = (EditText) findViewById(R.id.temp);
		skycondition = (EditText) findViewById(R.id.description);
		humidity = (EditText) findViewById(R.id.humidity);
		airspeed = (EditText) findViewById(R.id.airspeed);
	}

	

	public void open(View view) {
		String url = location.getText().toString();
		String finalUrl = url1 + url + url2;
		location.setText(finalUrl);
		obj = new HandleXML(finalUrl);
		obj.fetchXML();
		while (obj.parsingComplete);
		temperature.setText(obj.getTemperature());		
		skycondition.setText(obj.getSkycondition());		
		humidity.setText(obj.getHumidity());
		airspeed.setText(obj.getAirspeed());

	}

}