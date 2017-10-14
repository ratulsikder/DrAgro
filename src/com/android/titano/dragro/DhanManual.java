package com.android.titano.dragro;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DhanManual extends Activity {
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.dhan_manual);
		
		setTitle(" ধানের রোগ নির্ণয়   ");
		getActionBar().setIcon(R.drawable.dr_agro);
		ActionBar ab = getActionBar(); 
		ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#81a3d0"));    
		ab.setBackgroundDrawable(colorDrawable);
	
	

		ImageView blast_iv,foska_dag_iv,khalpora_iv,patay_badami_iv;
		TextView blast_tv,foska_dag_tv,khalpora_tv,patay_badami_tv;
		String blast,foska,khalpora,patay ;
		
		
		
		blast_iv=(ImageView) findViewById(R.id.dhanblastimage);
		foska_dag_iv=(ImageView) findViewById(R.id.dhanfoskadagimage);
		khalpora_iv=(ImageView) findViewById(R.id.dhankhalporaimage);
		patay_badami_iv=(ImageView) findViewById(R.id.dhanpataybadamiimage);
		
		
		blast_tv=(TextView) findViewById(R.id.dhanblasttext);
		foska_dag_tv=(TextView) findViewById(R.id.dhanfoskadagtext);
		khalpora_tv=(TextView) findViewById(R.id.dhankhalporatext);
		patay_badami_tv=(TextView) findViewById(R.id.dhanpataybadamitext);
		
		
		
		blast_iv.setImageResource(R.drawable.dhan_blast);
		foska_dag_iv.setImageResource(R.drawable.dhan_foska_dag);
		khalpora_iv.setImageResource(R.drawable.dhan_khalpora);
		patay_badami_iv.setImageResource(R.drawable.dhan_patay_badami);
		
		
		blast="ব্লাস্ট রোগঃ\n\nলক্ষনঃ\n\n ১)আক্রান্ত পাতায় প্রথমে হাল্কা ধুসর বা নীলচে রঙের ভিজা ভিজা দাগ দেখা যায়।   \n\n২)আস্তে আস্তে তা বড় হয়ে মাঝখানটা ধুসর বা সাদা ও কিনারা বাদামি রঙ ধারন করে ।দাগগুলো এক্তু লম্বাটে হয় এবং দেখতে অনেকটা চোখের মত হয় ও দাগ শেষ পর্যন্ত বড়  হয়   \n\n৩)গিঁটব্লাস্ট হলে আক্রান্ত গাছের গিঁট কালো এবং দূর্বল হয় এবং জোরে বাতাসের ফলে আক্রান্ত স্থান ভেঙ্গে পড়ে।   \n\n৪)শীষব্লাস্ট হলে শীষের গোড়ায় অথবা যেকোন শাখায় বাদামী দাগ পড়ে এবং এতে শীষ বা শীষের শাখা ভেঙ্গে পড়ে ও ধান চিটা হয়।\n\n\nপ্রতিকারঃ  \n\n১) মাটিতে জৈব সার ব্যবহার করা    \n\n২) সুষম মাত্রাই রাসায়নিক সার ব্যবহার করা    \n\n৩)সুস্থ বীজ ব্যবহার করা    \n\n৪) রোগের প্রাথমিক অবস্থায় বিঘা প্রতি ৫ কেজি পটাশ সার উপ্রিপ্রয়গ করা    \n\n৫)আবহাউয়া অনুকুল হলে রোগের প্রাথমিক অবস্থায় ট্রুপার/নেটিভও নামক ছত্রাকনাসক বিঘাপ্রতি ১০৭ মিলিলিটার ১০০ লিটার পানিতে মিশিয়ে প্রয়োগ করতে হবে। \n\n**********************************";
		patay="পাতায় বাদামি রোগ\n\n\n\nলক্ষণ ঃ \n\n• পাতায় প্রথমে ছোট ছোট বাদামি রঙের দাগ দেখা যায়\n\n • দাগগুলো আস্তে আস্তে বড় হয়ে অনেকটা তিলের বীজের মতো আকার ধারণ করে\n\n • ধানের জাতভেদে দাগের আকার ও বর্ণ বিভিন্ন হতে পারে\n\n • রোগকাতর জাতে দাগে আকার বড় হয় এবং দাগের মাঝখানটা ধূসর বর্ণ বা হালকা বাদামি রঙের হয়; পাতায় অনেক দাগরে সৃষ্টি হয় ফলে পাতাটি মারা যায়।\n\n • অনেক সময় দাগের চারদিকে হলুদ রঙ ধারণ করতে দেখা যায়।\n\n\n\n প্রতিকারঃ\n\n• সুষম সারের ব্যবহার\n\n • অধিক পরিমানে জৈব সারের ব্যবহার\n\n • সঠিক পানি ব্যবস্থাপনা\n\n • সুস্থ বীজের ব্যবহার\n\n • বীজ শোধন করা (ডাইথেন এম ৪৫ বা ভিটাভেক্স ২০০ ছত্রাকনাশক ৩ গ্রাম/ কেজি বীজ) \n\n • সঠিক মাত্রায় সার প্রয়োগ করা।\n\n**********************************";
		foska="ফোস্কা দাগ রোগ\n\nলক্ষণ\n\nপাতার আগা থেকে দাগ আরম্ভ করে নিচের দিকে বাড়তে থাকে। প্রথমত পাতায় ভেজা ভেজা জলপাই রঙের দাগ হয়, যা আস্তে আস্তে গাঢ় বাদামি ও হালকা বাদামি দাগে পরিনত হয় এবং পাশাপাশি একসাথে হয়ে ঢেউয়ের মত দাগের গুচ্ছ ঘটায\n\n প্রতিকারঃ\n\n ১) খড়কুটো জমিতে পুড়িয়ে ফেলা\n\n ২)রোগমুক্ত জমি থেকে বীজ সংগ্রহ করা\n\n ৩)একর প্রতি ১০০০ ১ কেজি থিউভিট, সালফেনাক, সাইক্রোথিওল স্পেশাল বা কুমুরাস ধানের থোড় অবস্থায় প্রয়োগ করতে হবে।\n\n**********************************";
		khalpora="খোলপোড়া\n\nলক্ষণঃ\n\n• খোলপোড়া একটি ছত্রাকজনিত রোগ। ধানগাছের কুশি গজানোর  সময় হতে সাধারণত: এ রোগ দেখা যায়। পানিতে ভাসমান ছত্রাক গুটিকা দিয়ে প্রাথমিক আক্রমণ সংঘটিত হয়।\n\n • প্রথমে খোলে গোলাকার ও লম্বাটে ধরনের ধূসর রঙের জলছাপের মতো দাগ পড়ে এবং তা আস্তে আস্তে বড় হয়ে উপরের দিকে সমস্ত খোলে ও পাতায় ছড়িয়ে পড়ে। এ অবস্থায় খোল দেখতে অনেকটা গোখরা সাপের চামড়ার দাগের মতো মনে হয়।\n\n• গরম ও আর্দ্র আবহাওয়ায় এ রোগটি বেশি হয়। এ ছাড়া রোগপ্রবণ জাত, বেশি মাত্রায় ইউরিয়া ব্যবহার ও ঘন করে চারা রোপণ এ রোগ বিস্তারে সহায়তা করে। আমাদের দেশে আউশ ও আমন মৌসুমে এ রোগের প্রাদুর্ভাব বেশি হয়।\n\n প্রতিকারঃ\n\n• ২৫×২০ সেমি, ২৫×২৫ সেমি বা ২০×২০ সেমি দূরে দূরে চারা রোপণ করা যেতে পারে; \n\n • রোগ দেখা দিলে জমির পানি শুকিয়ে পরে আবার সেচ দিতে হবে; \n\n • রোগের প্রাথমিক অবস্থায় ফলিকুর একর প্রতি ২০০ এম এল, টিল্ট অথবা এ্যাকোনা জোল একর প্রতি ৪০০ মিলিলিটার যে কোন একটি ওষুধ রোগ দেখা দেওয়ার পর ১৫ দিন পরপর দু’বারে প্রয়োগ করা যেতে পারে; \n\n • জমিতে সুষম মাত্রায় সার ব্যবহার করতে হবে; \n\n • রোগ দেখার পর একর প্রতি ১৫ কেজি পটাশ সার ১৫ দিন পরপর দুই কিস্তিতে প্রয়োগ করা যেতে পারে; \n\n • যে সব এলাকায় প্রতি বছরই এ রোগ হয় সেখানে মোটামুটি লম্বা জাতের ধান চাষ করা যেতে পারে।\n\n • রোগাক্রান্ত জমির ধান কাটার পর বছরে অন্তত: একবার নাড়া জমিতে পুড়িয়ে ফেলা ভালো\n\n**********************************";
		
		blast_tv.setText(blast);
		foska_dag_tv.setText(foska);
		khalpora_tv.setText(khalpora);
		patay_badami_tv.setText(patay);
		
	
	
	
	}


}
