package com.intelygenz.jacocosample;

import com.intelygenz.core.Core;

public class MainPresenter {
	
	private Core core = new Core();
	
	public void doPresenterStuff() {
		System.out.println("doPresenterStuff");
		core.doCoreStuff();
	}
	
}
