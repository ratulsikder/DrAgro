package com.android.titano.dragro;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Gom_View extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.auto_view);
		
		setTitle(" গমের রোগ নির্ণয়   ");
		getActionBar().setIcon(R.drawable.dr_agro);
		ActionBar ab = getActionBar(); 
		ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#81a3d0"));    
		ab.setBackgroundDrawable(colorDrawable);
		Intent j= getIntent();
		int index=j.getIntExtra("dex",0);
		
		
		ImageView auto_image= (ImageView) findViewById(R.id.auto_image_view);
		  TextView auto_text= (TextView) findViewById(R.id.auto_text_view);
		  
		  if(index==1){
			 
			  
			  auto_image.setImageResource(R.drawable.gom_kalo_morica);
			  auto_text.setText("গমের কালো মরিচা রোগ\n\n\nএটি মানবজাতির পরিচিত সবচেয়ে পুরনো গমের ছত্রাক ঘটিত রোগ। এটিকে কালো মরিচা রোগ বা গ্রীষ্মকালের মরিচা রোগও বলা হয়। এটি টিলিয়ামের মধ্যে, প্রচুর পরিমাণে টিলিওস্পোর তৈরী করে।  আবহাওয়া ভাল থাকলে এই জীবাণুটি ফসলে আক্রমণ করে এবং এক  মাসের মধ্যে ৫০% পর্যন্ত ক্ষতি করে । খারাপ গাছের জাতে এই রোগ ১০০% পর্যন্তও ক্ষতি করতে পারে।\n\nলক্ষন :\n\nগাছ সাধারনত আক্রমনের ৭-১৫ দিন পর রোগের লক্ষন প্রকাশ করে\n\nসংক্রমণের প্রাথমিক লক্ষণ হিসাবে পাতা, পাতার খাপ, বৃন্ত এবং ফুলের উপর ক্ষুদ্র মরিচার দাগ দেখা যায়।\n\nভাজক কলায় সংক্রমণের ফলে গমের দানা কুঁচকে যায়।\n\nগাছের কান্ডে এই রোগ দেখা দিলে হাওয়া ও বৃষ্টিতে গাছের কান্ড আলগা হয়ে ভেঙ্গে যায়।\n\nতীব্র আক্রমণ হলে, উদ্ভিদের  স্বাভাবিক শস্য উত্পাদন সম্ভব নয়। দানাশস্যের ওজনও হালকা ও গঠন কুঞ্চিত হয়।\n\nঅন্যান্য ব্যাক্টিরিয়া বা ছত্রাক দ্বারা আক্রমন ঘটে।\n\n\nপ্রতিকারঃ\n\n১) জৈবিকভাবে- বারবেরিস এবং মাহনিয়া প্রজাতির উদ্ভিদের দমন করে  এই রোগ নিয়ন্ত্রণ করা সম্ভব\n\n২) নাইট্রোজেন সার মরিচার প্রবণতা বৃদ্ধি করে থাকে আর পটাসিয়াম ঠিক উল্টো প্রভাব দেখায়।তাই এন পি কে-এর অনুপাতে নাইট্রোজেনের পরিমান হ্রাস করলে মরিচা প্রকোপ কমাতে পারে।\n\n৩) মরিচা প্রতিরোধী জাত যেমন-  লারমা রোজো, সোনালীকা, সাফেদ লারমা ইত্যাদি চাষ করতে হবে\n\n৪) রাসায়নিকভাবে- ৪-৫ বার “নাবাম” @ ০.০৫-২.৫৬ পিপিএম এর সঙ্গে জিঙ্ক সালফেট-এর প্র্রয়োগ করতে হবে।");

		  }
		  
		  if(index==2){
				 
			  auto_image.setImageResource(R.drawable.gom_patar_dag);
			  auto_text.setText("গমের পাতার দাগ রোগ\n\n\nলক্ষনঃ\n\nবাইপোলারিস সরোকিনিয়ানা নামক ছত্রাক এ রোগ ঘটায়। গাছ মাটির উপর আসলে প্রথমে নিচের পাত তে ছোট ছোট বাদামি ডিম্বকার দাগ পড়ে। পরবর্তীতে দাগসমূহ আকারে বাড়তে থাকে এবং গমের পাতা ঝলসে দেয়। রোগের জীবাণু বীজে কিংবা ফসলের পরিত্যক্ত অংশে বেঁচে থাকে। বাতাসের অধিক আদ্রতা এবং উচ্চ তাপমাত্রা (২৫ ডিগ্রী সে.) এ রোগ বিস্তারের জন্য সহায়ক। ডেক্সলেরা প্রজাতির ও অলটারনারিয়া প্রজাতির ছত্রাক দ্বারা গমের এ রোগ হয়। এ রোগের ফলে গমের খোসায় বিভিন্ন আকারের বাদামি অথবা কালো দাগ পড়ে। বীজের ভ্রুণে দাগ পড়ে এবং পরবর্তীতে দাগ সম্পূর্ণ বীজে ছড়িয়ে পড়ে। এ রোগের জীবাণু বীজের মাধ্যমে সংক্রমিত হয়ে থাকে।\n\nপ্রতিকার\n\n১) রোগমুক্ত জমি হতে বীজ সংগ্রহ করতে হবে।\n\n২) গাছের পরিত্যক্ত অংশ সংগ্রহ করে পুড়িয়ে ফেলতে হবে।\n\n৩) প্রতি কেজি গম বীজে ২.৫-৩.০ গ্রাম ভিটাভেক্স-২০০ মিশিয়ে বীজ শোধন করতে হবে।\n\n৪) টিল্ট ২৫০ ইসি ছত্রাক নাশক (০.০৪%) ১ মিলি আড়াই লিটার পানিতে মিশিয়ে ১২ দিন পর পর ২-৩ বার সেপ্র করতে হবে।");
		
			 
		  }
		
		  
	
	}

}
