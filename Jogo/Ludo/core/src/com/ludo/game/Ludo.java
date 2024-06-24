package com.ludo.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.ScreenUtils;
import com.ludo.game.entities.LudoBoard;

public class Ludo extends ApplicationAdapter {


    private SpriteBatch batch;
    private LudoBoard board;
    private TextureRegion boardTextureRegion; // Textura do tabuleiro
    private int boardSize = 15; // Tamanho do tabuleiro (15x15)

    @Override
    public void create() {
        batch = new SpriteBatch();

        int screenWidth = 1920;
        int screenHeight = 1080;

        // Calcula o tamanho máximo que pode ser usado para cada quadrado
        int tileSize = Math.min(screenWidth / boardSize, screenHeight / boardSize);

        board = new LudoBoard(boardSize, boardSize, tileSize, screenWidth, screenHeight); // Tabuleiro 15x15 com quadrados do tamanho calculado

        // Carregue uma textura (exemplo: "board_texture.png" na pasta assets)
        Texture boardTexture = new Texture(Gdx.files.internal("whiteBlock.png"));
        boardTextureRegion = new TextureRegion(boardTexture); // Crie uma região de textura

        // Exemplo: selecionar o quadrado na posição (0, 0)
        board.selectSquare(0, 0);
    }

    @Override
    public void render() {
        Gdx.gl.glClearColor(0.5f, 0.5f, 0.5f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        batch.begin();
        board.render(batch, boardTextureRegion); // Renderize o tabuleiro com a textura do tabuleiro
        batch.end();
    }

    @Override
    public void dispose() {
        batch.dispose();
        boardTextureRegion.getTexture().dispose(); // Lembre-se de liberar recursos
    }
}
