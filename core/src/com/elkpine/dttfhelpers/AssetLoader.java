package com.elkpine.dttfhelpers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Preferences;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class AssetLoader {
	
	public static Texture texture, texture2;
	public static TextureRegion bg, bgLower,bgHigher ;
	
	public static Animation fireAnimation;
	public static TextureRegion fire,rightFire,leftFire;
	
	public static TextureRegion barH, barV;
	
	public static TextureRegion bird;
	
	public static Preferences prefs;
	
	
	
	public static void dispose(){
		texture.dispose();
		
	}
	
	public static void setHighScore(int val){
		prefs.putInteger("highScore", val);
		prefs.flush();
	}
	
	public static int getHighScore(){
		return prefs.getInteger("highScore");
	}

	public static void load() {
		// TODO Auto-generated method stub
		texture = new Texture(Gdx.files.local("Dont Touch The Fire.png"));
		texture.setFilter(TextureFilter.Nearest, TextureFilter.Nearest);
		
		texture2 = new Texture(Gdx.files.local("texture.png"));
        texture.setFilter(TextureFilter.Nearest, TextureFilter.Nearest);
		
		bg = new TextureRegion(texture, 0,0, 302,164);
		bg.flip(false, true);
		
		bgHigher = new TextureRegion(texture,0,0,301,3);
		bgHigher.flip(false, true);
		
		bgLower = new TextureRegion(texture,0,127,302,164);
		bgLower.flip(false, true);
		
		bird = new TextureRegion(texture, 406, 13, 39, 37);
        bird.flip(false, true);
		
		prefs = Gdx.app.getPreferences("Dont touch the fire");
		
	}

	
	
	

}
