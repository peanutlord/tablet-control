package com.example.spotify.task;

import org.apache.xmlrpc.XmlRpcException;

import android.app.Activity;
import android.content.Context;
import android.widget.TextView;

import com.example.laptopcontrol.R;

public class CurrentSongTask extends GenericTask {

	private String currentTitle;
	
	/**
	 * 
	 * @param context
	 */
	public CurrentSongTask(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	@Override
	protected void doJob() throws XmlRpcException {
		Object song   = getClient().execute("getCurrentSong", new Object[] { });
		Object artist = getClient().execute("getCurrentArtist", new Object[] { });
		
		currentTitle = ((String) song) + " ("+((String) artist)+")";
	}
	
	/**
	 * 
	 */
	@Override
	protected void onPostExecute(Void result) {
		TextView v = (TextView) ((Activity) getContext()).findViewById(R.id.currentSong);
		v.setText(currentTitle);
	}

}
