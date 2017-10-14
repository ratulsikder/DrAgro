package com.android.titano.dragro;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class VuttaManual extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.corn_manual);
		
		setTitle(" ভূট্টার রোগ নির্ণয়   ");
		getActionBar().setIcon(R.drawable.dr_agro);
		ActionBar ab = getActionBar(); 
		ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#81a3d0"));    
		ab.setBackgroundDrawable(colorDrawable);
		
		
		String a="ভুট্টা পাতা ঝলসানো রোগ\n\n\nলক্ষণ:\n\n১) ছত্রাকের আক্রমণে আক্রান্ত গাছের নিচের দিকের পাতায় ডিম্বাকার ধূসর বণের্র দাগ দেখা যায়৷ পরবতীর্কালে গাছের উপরের অংশে বিস্তার লাভ করে৷ রোগের প্রকোপ বেশি হলে পাতা আগাম শুকিয়ে যায় ও গাছ মরে যায়৷\n\n২) এ রোগের জীবাণু গাছের আক্রান্ত অংশে অনেকদিন বেঁচে থাকে এবং জীবাণুর বীজকণা বা কনিডিয়া বাতাসের সাহায্যে অনেকদূর পযর্ন্ত সুস্থ গাছে ছড়াতে পারে৷ বাতাসে আদ্রতা বেশি হলে এবং ১৮ থেকে ২৭ ডিগ্রি সেন্টিগ্রেড তাপমাত্রায় এ রোগের ব্যাপকতা বৃদ্ধি পায়৷\n\nপ্রতিকার :\n\n১) রোগ প্রতিরোধী জাতের চাষ করতে হয়৷ মোহরজাত অপেক্ষাকৃত রোগ প্রতিরোধী৷\n\n২) আক্রান্ত ফসলে টিল্ট ২৫০ ইসি (০.০৪%) ১৫ দিন পর পর ২ থেকে ৩ বার স্প্রে করতে হয়৷\n\n৩) ভুট্টা উঠানোর পর আক্রান্ত গাছ জমি থেকে সরিয়ে অথবা পুড়িয়ে ফেলতে হয়৷";
		String b="ভুট্টার মোচা ও দানা পচা রোগ\n\n\nলক্ষণ:\n\n১) আক্রান্ত মোচার খোসা ও দানা বিবণর্ হয়ে যায়, দানা কুঁচকে যায়৷\n\n২) অনেক সময় মোচার বিভিন্ন দানার মাঝে বা উপরে ছত্রাকের উপস্থিতি খালি চোখে দেখা যায়৷ মোচা অবস্থায় আক্রান্ত হলে পুরো মোচাই পঁচে যায়৷\n\n৩) ভুট্টা গাছে মোচা আসার প্রাথমিককাল থেকে ভুট্টা পাকা পযর্ন্ত সময়ে বৃষ্টিপাতের পরিমাণ যদি বেশি থাকে তবে এ রোগের প্রাদুভাᐂব দেখা দেয়৷ এ রোগের জীবাণু বীজের অথবা আক্রান্ত গাছের পরিত্যক্ত অংশে বেঁচে থাকে৷\n\nপ্রতিকার :\n\n১) একই জমিতে বার বার ভুট্টা চাষ না করাই ভাল৷\n\n২) ভুট্টা পেকে গেলে দেরি না করে তাড়াতাড়ি কেটে ফেলতে হয়৷\n\n৩) কাটার পর ভুট্টার পরিত্যক্ত অংশ পুড়িয়ে ফেলতে হয়৷";
		
		TextView tv1=(TextView) findViewById(R.id.vuttamocaodanatext);
		TextView tv2=(TextView) findViewById(R.id.vuttapatajholsanotext);
		
		tv1.setText(b);
		tv2.setText(a);
		
		
		
		
		ImageView iv1=(ImageView) findViewById(R.id.vuttamocaodanaimage);
		ImageView iv2=(ImageView) findViewById(R.id.vuttapatajholsanoimage);
		iv1.setImageResource(R.drawable.vutta_moca_o_dana);
		iv2.setImageResource(R.drawable.vutta_pata_jholsano);
	}

}
