package com.android.titano.dragro;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

import javax.xml.datatype.Duration;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.PixelFormat;
import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.PictureCallback;
import android.hardware.Camera.ShutterCallback;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore.Images.Media;
import android.view.LayoutInflater;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class EuriaAuto extends Activity implements SurfaceHolder.Callback{

 Camera camera;
 SurfaceView surfaceView;
 SurfaceHolder surfaceHolder;
 boolean previewing = false;
 LayoutInflater controlInflater = null;
 
 Button buttonTakePicture;
 
 final int RESULT_SAVEIMAGE = 0;
 
   
   @Override
   public void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.camera);
       setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
      
       getWindow().setFormat(PixelFormat.UNKNOWN);
       surfaceView = (SurfaceView)findViewById(R.id.camerapreview);
       surfaceHolder = surfaceView.getHolder();
       surfaceHolder.addCallback(this);
       surfaceHolder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);
      
       controlInflater = LayoutInflater.from(getBaseContext());
       
       View viewControl = controlInflater.inflate(R.layout.control, null);
       LayoutParams layoutParamsControl
        = new LayoutParams(LayoutParams.FILL_PARENT,
        LayoutParams.FILL_PARENT);
       this.addContentView(viewControl, layoutParamsControl);
       
      
       buttonTakePicture = (Button)findViewById(R.id.takepicture);
       buttonTakePicture.setOnClickListener(new Button.OnClickListener(){

   @Override
   public void onClick(View arg0) {
    
    camera.takePicture(myShutterCallback,
      myPictureCallback_RAW, myPictureCallback_JPG);
   }});
      
       LinearLayout layoutBackground = (LinearLayout)findViewById(R.id.background);
       layoutBackground.setOnClickListener(new LinearLayout.OnClickListener(){

   @Override
   public void onClick(View arg0) {
    // TODO Auto-generated method stub

    buttonTakePicture.setEnabled(false);
    camera.autoFocus(myAutoFocusCallback);
   }});
   }
  
   AutoFocusCallback myAutoFocusCallback = new AutoFocusCallback(){

  @Override
  public void onAutoFocus(boolean arg0, Camera arg1) {
   // TODO Auto-generated method stub
   buttonTakePicture.setEnabled(true);
  }};
  
   ShutterCallback myShutterCallback = new ShutterCallback(){

  @Override
  public void onShutter() {
   // TODO Auto-generated method stub
   
  }};
  
 PictureCallback myPictureCallback_RAW = new PictureCallback(){

  @Override
  public void onPictureTaken(byte[] arg0, Camera arg1) {
   // TODO Auto-generated method stub
   
  }};
  
 PictureCallback myPictureCallback_JPG = new PictureCallback(){

  @Override
  public void onPictureTaken(byte[] arg0, Camera arg1) {
   // TODO Auto-generated method stub
   Bitmap bitmapPicture
    = BitmapFactory.decodeByteArray(arg0, 0, arg0.length);
  //********************************* 
   int x,y;
   x=bitmapPicture.getWidth();
   y=bitmapPicture.getHeight();
   
   int m=x/6;
   
  //camera.startPreview();
   x=(x-m)/2;
   y=(y-m)/2;
   System.err.println("x="+x+"y="+y);
   Bitmap bitmap_scan=Bitmap.createBitmap(bitmapPicture, x,y,m, m);
   x=bitmap_scan.getWidth();
   y=bitmap_scan.getHeight();
   System.err.println("x="+x+"y="+y);
   
   //rotate*************
// create a matrix object
   Matrix matrix = new Matrix();
   matrix.postRotate(90); // anti-clockwise by 90 degrees
   Bitmap bitmap = Bitmap.createBitmap(bitmap_scan , 0, 0, bitmap_scan.getWidth(), bitmap_scan.getHeight(), matrix, true);
   
   int redColors = 0;
   int greenColors = 0;
   int blueColors = 0;
   int pixelCount = 0;
   
   for (int b = 0; b < m; b++)
   {
       for (int a = 0; a < m; a++)
       {
           int c = bitmap.getPixel(a, b);
           pixelCount++;
           redColors += Color.red(c);
           greenColors += Color.green(c);
           blueColors += Color.blue(c);
       }
   }
   // calculate average of bitmap r,g,b values
   int red = (redColors/pixelCount);
   int green = (greenColors/pixelCount);
   int blue = (blueColors/pixelCount);
   
   //************start coding for inserting picture and matching*****************
   
   //************importing image from drawable.mdpi******************************
   //************import picture with the following code**************************
   //************for each picture add the two lines code*************************
   //************here we import two pictures named "one.jpg" and "two.jpg"*******
   //************pictures should be at "drawable-mdpi" folder********************
   //************size "500x500"  format ".jpg"************************************
   
   Bitmap img1 = BitmapFactory.decodeResource(getResources(), R.drawable.nitrogen_one);
   img1 = Bitmap.createScaledBitmap(img1, m, m, false);
   
   Bitmap img2 = BitmapFactory.decodeResource(getResources(), R.drawable.nitrogen_two);
   img2 = Bitmap.createScaledBitmap(img2, m, m, false);
   
   Bitmap img3 = BitmapFactory.decodeResource(getResources(), R.drawable.nitrogen_three);
   img3 = Bitmap.createScaledBitmap(img3, m, m, false);
   
   Bitmap img4 = BitmapFactory.decodeResource(getResources(), R.drawable.nitrogen_four);
   img4 = Bitmap.createScaledBitmap(img4, m, m, false);
   
   
   //*********finished importing pictures*****************************************
   
   
   
   //*******getting avg rgb of drawable img**************************************
   
   
   //*******set the total number of pictures at "numberofimage" variable******
   //***********************************
   int numberofimage=4;
   //***********************************
   
   
   //*******do not modify the following codes************
   int index=1;
   redColors = 0;
   greenColors = 0;
   blueColors = 0;
   pixelCount = 0;
   
   int rgb[] = new int[numberofimage];
   //
   for(int i=0;i<numberofimage;i++)
   {
	   for (int b = 0; b < m; b++)
	   {
	       for (int a = 0; a < m; a++)
	       {//*************************************
	           int c=0;
	    	   if(i==0)
	        	   c = img1.getPixel(a, b);
	    	   else if(i==1)
	        	   c = img2.getPixel(a, b);
	    	   else if(i==2)
	        	   c = img3.getPixel(a, b);
	    	   else if(i==3)
	        	   c = img4.getPixel(a, b);
	        	   
	    	 
	        //*************************************
	           pixelCount++;
	           redColors += Color.red(c);
	           greenColors += Color.green(c);
	           blueColors += Color.blue(c);
	       }
	  }
	   // calculate average of bitmap r,g,b values
	   int red1 = Math.abs(red-(redColors/pixelCount));
	   //debugging variable
	   System.err.println("r="+red1);
	   //debugging variable
	   //if(red1>50)
		//   red1=100;
	   int green1 = Math.abs(green-(greenColors/pixelCount));
	   //debugging variable
	   System.err.println("g="+green1);
	   //debugging variable
	 //  if(green1>50)
		  // green1=100;
	   int blue1 = Math.abs(blue-(blueColors/pixelCount));
	   //debugging variable
	   System.err.println("b="+blue1);
	   //debugging variable
	  // if(blue1>50)
		 //  blue1=100;
	   rgb[i]=red1+green1+blue1;
	   pixelCount = 0;
	   redColors = 0;
	   greenColors = 0;
	   blueColors = 0;
	   //debugging variable
	   System.err.println("rgb="+rgb[i]);
	   //debugging variable
   }
   
   
   int min=rgb[0];
   for(int j=0;j<numberofimage-1;j++)
   {
 		if(min>rgb[j+1])
 			min=rgb[j+1];
 	  
   }
   System.err.println("min="+min);
   for(int i=0;i<numberofimage;i++)
   {
 	  if(rgb[i]==min){
 		  index=i+1;
 		  break;
   }}
  
  
  
  //debugging variable
  System.err.println("index="+index);
  //debugging variable
  
  
  
  //*********Now the variable named "index" is keeping the matched picture number*****
  //*********It is containing an integer value****************************************
  
 
  
 
   
  Intent image_view=new Intent(EuriaAuto.this,Euria_View.class);
  image_view.putExtra("dex", index);
  startActivity(image_view);
  
   
  
  //****************  finish!!  **********************
  }};

 @Override
 public void surfaceChanged(SurfaceHolder holder, int format, int width,
   int height) {
  // TODO Auto-generated method stub
  if(previewing){
   camera.stopPreview();
   previewing = false;
  }
  
  if (camera != null){
   try {
    camera.setPreviewDisplay(surfaceHolder);
    camera.startPreview();
    previewing = true;
   } catch (IOException e) {
    // TODO Auto-generated catch block
    e.printStackTrace();
   }
  }
 }

 @Override
 public void surfaceCreated(SurfaceHolder holder) {
  // TODO Auto-generated method stub
  camera = Camera.open();
 }

 @Override
 public void surfaceDestroyed(SurfaceHolder holder) {
  // TODO Auto-generated method stub
  camera.stopPreview();
  camera.release();
  camera = null;
  previewing = false;
 }
}