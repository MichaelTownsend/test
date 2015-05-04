package com.elkpine.gameworld;

import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.Rectangle;
import com.elkpine.gameobject.Bird;


public class GameWorld {
	
	private Bird bird;
	private Rectangle ground;
	private GameState currentState;
	
	private int score = 0;
	private int midPointY;
	
	public enum GameState{
		READY,RUNNING,GAMEOVER,HIGHSCORE
	}
	
	public GameWorld(int midPointY){
		currentState = GameState.READY;
		this.midPointY = midPointY;
		bird = new Bird(33, midPointY - 5, 38, 36);
		
		
		ground = new Rectangle(0,midPointY + 66, 136, 11);
		
		
	}
	
	public void update(float delta){
		switch(currentState){
		case READY:
			updateReady(delta);
			break;
		case RUNNING:
			updateRunning(delta);
			break;
		default:
			break;
		}
	}
	
	public void updateReady(float delta){
		
	}
	
	public void updateRunning(float delta) {
		
		if(delta > .15f){
			delta = .15f;
		}
		bird.update(delta);
		
		
    }
	
	public Bird getBird(){
		return bird;
	}
	
	
	public int getScore(){
		return score;
	}
	
	public void addScore(int increment){
		score += increment;
	}
	
	
	
	public boolean isReady() {
        return currentState == GameState.READY;
    }
	
	public void start() {
        currentState = GameState.RUNNING;
    }

    public void restart() {
        currentState = GameState.READY;
        score = 0;
        bird.onRestart(midPointY - 5);
        currentState = GameState.READY;
    }
	
	public boolean isGameOver(){
		return currentState == GameState.GAMEOVER;
	}
	
	public boolean isHighScore(){
		return currentState == GameState.HIGHSCORE;
	}

}
