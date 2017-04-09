package com.example.testcontrol;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class FourthActivity extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_fourth);
		Button button = (Button) findViewById(R.id.button1);
		
		button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Toast toast = new Toast(FourthActivity.this);
				toast.makeText(FourthActivity.this, "test", Toast.LENGTH_SHORT);
				LinearLayout toastLaouut = (LinearLayout) toast.getView();
				ImageView img = new ImageView(getApplicationContext());
				img.setImageResource(R.drawable.ic_launcher);
				toastLaouut.addView(img, 0);
				
				toast.show();
			}
		});
	}
}
