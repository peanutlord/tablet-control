// +-------------------------------------------------------------------+
// | Playground                                                        |
// +-------------------------------------------------------------------+

// Our package
package com.example.spotify.task;

// Required packages
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import android.content.Context;
import android.os.AsyncTask;

/**
 * Each Task is a method of the XML-RPC Server
 * 
 * @author Christopher Marchfelder <marchfelder@googlemail.com>
 *
 */
abstract public class GenericTask extends AsyncTask<Void, Void, Void> {

	private static final String SERVER = "http://Host-IP:9999";
	
	/**
	 * Usually the activity
	 */
	private Context context;
	
	private XmlRpcClient client;
	
	/**
	 * Constructor
	 * 
	 * @param context
	 */
	public GenericTask(Context context) {
		this.context = context;
		initClient();
		
		this.execute(new Void[] { });
	}
	
	/**
	 * Inits the XML-RPC Client
	 */
	protected void initClient() {
		XmlRpcClientConfigImpl conf = new XmlRpcClientConfigImpl();
		try {
			conf.setServerURL(new URL(SERVER));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return;
		}
		
		client = new XmlRpcClient();
		client.setConfig(conf);
	}
	
	/**
	 * Returns the XML-Rpc Client
	 * 
	 * @return
	 */
	protected XmlRpcClient getClient() {
		return client;
	}
	
	/**
	 * Returns the context
	 * 
	 * @return
	 */
	protected Context getContext() {
		return context;
	}
	
	/**
	 * 
	 */
	@Override
	protected Void doInBackground(Void... theArguments) {
		try {
			doJob();
		} catch (XmlRpcException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	abstract protected void doJob() throws XmlRpcException;

}
