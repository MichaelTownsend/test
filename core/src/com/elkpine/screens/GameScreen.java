package com.elkpine.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.elkpine.dttfhelpers.InputHandler;
import com.elkpine.gameworld.GameRenderer;
import com.elkpine.gameworld.GameWorld;


public class GameScreen implements Screen {
	
	private GameWorld world;
	private GameRenderer renderer;
	private float runTime;
	
	public GameScreen(){
		float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();
        float gameWidth = 136;
        float gameHeight = screenHeight / (screenWidth / gameWidth);	
        
        int midPointY = (int) (gameHeight / 2);

        world = new GameWorld(midPointY);
        renderer = new GameRenderer(world, (int) gameHeight, midPointY);
        
        Gdx.input.setInputProcessor(new InputHandler(world));
        System.out.println("hey Markus");
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		runTime += delta;
		world.update(delta);
		renderer.render(runTime);
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
