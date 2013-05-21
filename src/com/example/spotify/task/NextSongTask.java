package com.example.spotify.task;

import org.apache.xmlrpc.XmlRpcException;

import android.content.Context;

public class NextSongTask extends GenericTask {
	
	/**
	 * 
	 * @param context
	 */
	public NextSongTask(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	@Override
	protected void doJob() throws XmlRpcException {
		getClient().execute("nextSong", new Object[] { });
	}

}
