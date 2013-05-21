package com.example.spotify.task;

import org.apache.xmlrpc.XmlRpcException;

import android.content.Context;

public class PauseSongTask extends GenericTask {
	
	/**
	 * 
	 * @param context
	 */
	public PauseSongTask(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	@Override
	protected void doJob() throws XmlRpcException {
		getClient().execute("playPause", new Object[] { });
	}

}
