package com.ludo.game.entities;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

public class LudoBoard {

    private int rows;
    private int cols;
    private int tileSize; // Tamanho de cada quadrado do tabuleiro
    private int screenWidth;
    private int screenHeight;

    private boolean[][] selected; // Array para controlar se um quadrado está selecionado
    private TextureRegion highlightTextureRegion; // Textura para destacar o quadrado selecionado
    private Vector2 selectedSquare; // Quadrado atualmente selecionado

    public LudoBoard(int rows, int cols, int tileSize, int screenWidth, int screenHeight) {
        this.rows = rows;
        this.cols = cols;
        this.tileSize = tileSize;
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;

        selected = new boolean[rows][cols];
        highlightTextureRegion = new TextureRegion(new Texture("peaoAzul.png")); // Textura para destacar o quadrado selecionado
        selectedSquare = new Vector2(-1, -1); // Inicializa como nenhum quadrado selecionado (-1, -1)
    }

    public void selectSquare(int row, int col) {
        // Verifica se as coordenadas estão dentro dos limites do tabuleiro
        if (row >= 0 && row < rows && col >= 0 && col < cols) {
            selectedSquare.set(row, col); // Define o quadrado selecionado
            selected[row][col] = true; // Marca o quadrado como selecionado
        }
    }

    public void clearSelection() {
        selectedSquare.set(-1, -1); // Limpa a seleção
        clearSelectedArray(); // Limpa o array de seleção
    }

    private void clearSelectedArray() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                selected[i][j] = false; // Marca todos os quadrados como não selecionados
            }
        }
    }

    public void render(SpriteBatch batch, TextureRegion textureRegion) {
        // Calcula o deslocamento para centralizar o tabuleiro na tela
        int offsetX = (screenWidth - cols * tileSize) / 2;
        int offsetY = (screenHeight - rows * tileSize) / 2;

        // Desenhe o tabuleiro
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                // Calcule as coordenadas de renderização de cada quadrado do tabuleiro
                int x = col * tileSize + offsetX;
                int y = row * tileSize + offsetY;

                // Desenha o quadrado do tabuleiro
                batch.setColor(Color.WHITE);
                batch.draw(textureRegion, x, y, tileSize, tileSize);

                // Verifica se este quadrado está selecionado
                if (selected[row][col]) {
                    // Desenha o destaque sobre o quadrado selecionado
                    batch.draw(highlightTextureRegion, x, y, tileSize, tileSize);
                }
            }
        }
    }

    // Métodos adicionais para interação com o tabuleiro, como verificar posições, etc.
}
