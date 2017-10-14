package com.android.titano.dragro;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class EuriaUsage extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.euira_usage);
		setTitle(" ব্যবহার বিধি   ");
		getActionBar().setIcon(R.drawable.dr_agro);
		ActionBar ab = getActionBar(); 
		ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#81a3d0"));    
		ab.setBackgroundDrawable(colorDrawable);
		
		
		
		TextView tv;
		String euria_text="সাধারনত এলসিসি ব্যবহার করে ইউরিয়া সার প্রয়োগ করলে জমিতে সঠিক পরিমানে ইউরিয়া সার ব্যবহার করা সম্ভব হয় । এতে আমন মৌসুমে তিন বার এবং বোরো মৌসুমে ৪-৫ বার ইউরয়া সার প্রয়োগ করতে হয় । এতে ২২.৫-৩৬ কেজি/বিঘা সার লাগে । পর পর ৭-১০ দিন এই স্কেল দিয়ে মাপ নিতে হবে । নিজের ছায়ায় এই মাপ নিতে হয় , কারন সূর্যের আলোয় পাতার রং সঠিক পাওয়া যায় না । সকাল এবং বিকালে এই মাপ নিতে হয় । যদি স্কেল এর গড় ৩ এর বেশি হয় তাহলে ৩ পর্যন্ত না আসা পর্যন্ত কিছু পরিমাণ করে ইউরিয়া সার জমি থেকে উঠিয়ে ফেলতে হবে । আর যদি ৩ এর কম হয় তাহলে ৩ না আসা পর্যন্ত ইউরিয়া সার দিতে হবে । কালার চার্টের সব থেকে হাল্কা সবুজ অংশের মান ১ , তারপরের টির ২ , তারপরের টির ৩ এবং সবার শেষেরটি ৪ ।";
		ImageView iv;
		
		tv=(TextView) findViewById(R.id.euriya_text);
		tv.setText(euria_text);
		
		iv=(ImageView) findViewById(R.id.euriya_image_manual);
		iv.setImageResource(R.drawable.euria_chart_2);
		
		
	}
}
