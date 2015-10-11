package com.wlwenjiejoy.game2048;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private TextView tvScore;
	private int score = 0;

	private static MainActivity mainActivity = null;
	public static MainActivity getMainActivity() {
		return mainActivity;
	}
	public MainActivity() {
		mainActivity = this;
	}
	public void clearScore() {
		score = 0;
	}
	public void showScore() {
		tvScore.setText("" + score);
	}
	public void addScore(int s) {
		score += s;
		showScore();
	}
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvScore = (TextView) findViewById(R.id.tvScore);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
