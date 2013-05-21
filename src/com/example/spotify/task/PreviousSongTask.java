package com.example.spotify.task;

import org.apache.xmlrpc.XmlRpcException;

import android.content.Context;

public class PreviousSongTask extends GenericTask {
	
	/**
	 * 
	 * @param context
	 */
	public PreviousSongTask(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	@Override
	protected void doJob() throws XmlRpcException {
		getClient().execute("previousSong", new Object[] { });
	}

}
