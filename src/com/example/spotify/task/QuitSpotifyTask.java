package com.example.spotify.task;

import org.apache.xmlrpc.XmlRpcException;

import android.content.Context;

public class QuitSpotifyTask extends GenericTask {
	
	/**
	 * 
	 * @param context
	 */
	public QuitSpotifyTask(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	@Override
	protected void doJob() throws XmlRpcException {
		getClient().execute("quit", new Object[] { });
	}

}
