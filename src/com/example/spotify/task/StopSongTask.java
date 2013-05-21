package com.example.spotify.task;

import org.apache.xmlrpc.XmlRpcException;

import android.content.Context;

public class StopSongTask extends GenericTask {
	
	/**
	 * 
	 * @param context
	 */
	public StopSongTask(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	@Override
	protected void doJob() throws XmlRpcException {
		getClient().execute("stop", new Object[] { });
	}

}
