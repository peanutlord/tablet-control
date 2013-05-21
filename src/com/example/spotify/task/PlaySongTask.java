package com.example.spotify.task;

import org.apache.xmlrpc.XmlRpcException;

import android.content.Context;

public class PlaySongTask extends GenericTask {
	
	/**
	 * 
	 * @param context
	 */
	public PlaySongTask(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	@Override
	protected void doJob() throws XmlRpcException {
		getClient().execute("play", new Object[] { });
	}

}
