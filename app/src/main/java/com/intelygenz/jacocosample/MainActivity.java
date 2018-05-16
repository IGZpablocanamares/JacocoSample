package com.intelygenz.jacocosample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
	
	private MainPresenter presenter;
	
	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		presenter = new MainPresenter();
	}
	
	@Override
	protected void onResume() {
		super.onResume();
		doActivityStuff();
	}
	
	private void doActivityStuff() {
		Log.d("TAG", "doActivityStuff");
		presenter.doPresenterStuff();
	}
	
}
