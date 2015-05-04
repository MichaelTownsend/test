package com.elkpine.dttfgame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.elkpine.dttfhelpers.AssetLoader;
import com.elkpine.screens.GameScreen;

public class DTTFGame extends Game {
	
	
	@Override
	public void create () {
		Gdx.app.log("DTTF", "created");
		AssetLoader.load();
		setScreen(new GameScreen());
		
	}
	
	public void dispose(){
		super.dispose();
		AssetLoader.dispose();
	}

}
