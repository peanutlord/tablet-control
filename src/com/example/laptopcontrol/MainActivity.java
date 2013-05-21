// +-------------------------------------------------------------------+
// | Playground                                                        |
// +-------------------------------------------------------------------+

// Package definition
package com.example.laptopcontrol;

// Required packages
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import com.example.spotify.task.CurrentSongTask;
import com.example.spotify.task.NextSongTask;
import com.example.spotify.task.PauseSongTask;
import com.example.spotify.task.PlaySongTask;
import com.example.spotify.task.PreviousSongTask;
import com.example.spotify.task.QuitSpotifyTask;
import com.example.spotify.task.StopSongTask;

/**
 * Our one and only activity
 * 
 * @author Christopher Marchfelder <marchfelder@googlemail.com>
 */
public class MainActivity extends Activity {

	/**
	 * Gets called when the activity is created
	 * 
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// Trigger current Song
		new CurrentSongTask(this);
	}

	/**
	 * Gets calles when the options menu is created
	 */
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	/**
	 * Handles the click on the previous button
	 * 
	 * @param v
	 */
	public void handlePreviousSong(View v) {
		new PreviousSongTask(this);
		new CurrentSongTask(this);
	}
	
	/**
	 * Handles the click on the next button
	 * 
	 * @param v
	 */
	public void handleNextSong(View v) {
		new NextSongTask(this);
		new CurrentSongTask(this);
	}
	
	/**
	 * Handles the click on the play button
	 * 
	 * @param v
	 */
	public void handlePlay(View v) {
		new PlaySongTask(this);
	}
	
	/**
	 * Handles the click on the stop button
	 * 
	 * @param v
	 */
	public void handleStop(View v) {
		new StopSongTask(this);
	}
	
	/**
	 * Handles the click on the pause button
	 * 
	 * @param v
	 */
	public void handlePause(View v) {
		new PauseSongTask(this);
	}
	
	/**
	 * Handles the click on the quit button
	 * 
	 * @param v
	 */
	public void handleQuit(View v) {
		new QuitSpotifyTask(this);
	}

}
