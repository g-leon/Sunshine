package com.example.therokc.sunshine.app;

import android.content.Context;
import android.os.AsyncTask;


public class FetchWeatherTask extends AsyncTask<String, Void, Void> {

	private final String LOG_TAG = FetchWeatherTask.class.getSimpleName();
	private final Context mContext;


	public FetchWeatherTask(Context context) {
		mContext = context;
	}

	@Override
	protected Void doInBackground(String... strings) {
		return null;
	}
}
