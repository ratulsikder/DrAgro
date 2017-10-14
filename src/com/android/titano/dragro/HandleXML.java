package com.android.titano.dragro;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

public class HandleXML {

	private String skycondition = "weather";
	private String temperature = "temperature";
	private String humidity = "humidity";
	private String airspeed = "speed";
	private String urlString = null;
	private XmlPullParserFactory xmlFactoryObject;
	public volatile boolean parsingComplete = true;

	public HandleXML(String url) {
		this.urlString = url;
	}

	public String getTemperature() {
		return temperature;
	}

	public String getSkycondition() {
		return skycondition;
	}

	public String getHumidity() {
		return humidity;
	}

	public String getAirspeed() {
		return airspeed;
	}

	public void parseXMLAndStoreIt(XmlPullParser myParser) {
		int event;
		String text=null;
		try {
			event = myParser.getEventType();
			while (event != XmlPullParser.END_DOCUMENT) {
				String name = myParser.getName();
				switch (event) {
				case XmlPullParser.START_TAG:
					break;
				case XmlPullParser.TEXT:
					text = myParser.getText();
					break;

				case XmlPullParser.END_TAG:
					if (name.equals("temperature")) {
						temperature = myParser.getAttributeValue(null, "value");
					} else if (name.equals("weather")) {
						skycondition = myParser.getAttributeValue(null, "value");
					} else if (name.equals("humidity")) {
						humidity = myParser.getAttributeValue(null, "value");
					}
					else if (name.equals("speed")) {
						airspeed = myParser.getAttributeValue(null, "value");
					}
					
					
					else {
					}
					break;
				}
				event = myParser.next();

			}
			parsingComplete = false;
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void fetchXML() {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					URL url = new URL(urlString);
					HttpURLConnection conn = (HttpURLConnection) url.openConnection();
					conn.setReadTimeout(60000);
					conn.setConnectTimeout(65000);
					conn.setRequestMethod("GET");
					conn.setDoInput(true);
					conn.connect();
					InputStream stream = conn.getInputStream();

					xmlFactoryObject = XmlPullParserFactory.newInstance();
					XmlPullParser myparser = xmlFactoryObject.newPullParser();

					myparser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);
					myparser.setInput(stream, null);
					parseXMLAndStoreIt(myparser);
					stream.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		thread.start();

	}

}