package com.android.titano.dragro;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Euria_View extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.auto_view);
		
		setTitle(" ইউরিয়া সারের  পরিমাণ  ");
		getActionBar().setIcon(R.drawable.dr_agro);
		ActionBar ab = getActionBar(); 
		ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#81a3d0"));    
		ab.setBackgroundDrawable(colorDrawable);
		Intent j= getIntent();
		int index=j.getIntExtra("dex",0);
		
		
		ImageView auto_image= (ImageView) findViewById(R.id.auto_image_view);
		  TextView auto_text= (TextView) findViewById(R.id.auto_text_view);
		  
		  if(index==1){
			 
			  
			  auto_image.setImageResource(R.drawable.nitrogen_one);
			  auto_text.setText("রিডিং : ১\n\nসার প্রয়োগ সম্পর্কে বিস্তারিত জানতে 'ব্যবহার বিধি' দেখুন ");
		  }
		  
		  if(index==2){
				 
			  auto_image.setImageResource(R.drawable.nitrogen_two);
			  auto_text.setText("রিডিং : ২\n\nসার প্রয়োগ সম্পর্কে বিস্তারিত জানতে  'ব্যবহার বিধি' দেখুন ");
			 
		  }
		  
		  if(index==3){
				 
			  auto_image.setImageResource(R.drawable.nitrogen_three);
			  auto_text.setText("রিডিং : ৩\n\nসার প্রয়োগ সম্পর্কে বিস্তারিত জানতে  'ব্যবহার বিধি' দেখুন");
		  }
		  
		  if(index==4){
				 
			  auto_image.setImageResource(R.drawable.nitrogen_four);
			  auto_text.setText("রিডিং : ৪\n\nসার প্রয়োগ সম্পর্কে বিস্তারিত জানতে  'ব্যবহার বিধি' দেখুন");
		  }
		  
	}

}
