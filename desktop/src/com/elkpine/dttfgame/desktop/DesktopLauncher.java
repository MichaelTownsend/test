package com.elkpine.dttfgame.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.elkpine.dttfgame.DTTFGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Michael is really cool";
		config.width = 270 ;
		config.height = 408;
		new LwjglApplication(new DTTFGame(), config);
	}
}
