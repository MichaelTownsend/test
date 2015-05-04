package com.elkpine.gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import com.elkpine.dttfhelpers.AssetLoader;
import com.elkpine.gameobject.Bird;


public class GameRenderer {
	private GameWorld myWorld;
    private OrthographicCamera cam;
    private ShapeRenderer shapeRenderer;
    private Bird bird;
    
    private TextureRegion birdFace;

    private SpriteBatch batcher;
    
    private TextureRegion bg,bgHigher,bgLower;
    
    private int midPointY;
    private int gameHeight;
    public int x = 0;
    
    public GameRenderer(GameWorld world, int gameHeight, int midPointY) {
        myWorld = world;

        this.gameHeight = gameHeight;
        this.midPointY = midPointY;

        cam = new OrthographicCamera();
        cam.setToOrtho(true, 136, gameHeight);

        batcher = new SpriteBatch();
        batcher.setProjectionMatrix(cam.combined);
        shapeRenderer = new ShapeRenderer();
        shapeRenderer.setProjectionMatrix(cam.combined);

        // Call helper methods to initialize instance variables
        initGameObjects();
        initAssets();
    }

    private void initGameObjects() {
    	bird = myWorld.getBird();
        
    }

    private void initAssets() {
    	bg = AssetLoader.bg;
    	bgHigher = AssetLoader.bgHigher;
    	bgLower = AssetLoader.bgLower;
    	birdFace = AssetLoader.bird;
    	    	
    }
   
    public void render(float runTime) {
    	Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        
        batcher.begin();
        batcher.draw(bgHigher, 0,0,301,midPointY );
        batcher.draw(bgLower, 0, midPointY, 301, 900);
        batcher.draw(bg, 0, midPointY - 50  ,200,100);
        	
        batcher.draw(birdFace, bird.getX(), bird.getY(),bird.getHeight() /2.0f, bird.getWidth() /2.0f );
        
        batcher.end();
        
       }
    
    

    }

