package com.example.tpspringbootlorenzo.llopis.service;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import com.example.tpspringbootlorenzo.llopis.model.GameModel;

@Component
@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
public class PartieEnCours {
    private GameModel gameModel;

            public GameModel getGameModel() {
                return gameModel;
            }

            public void setGameModel(GameModel gameModel) {
                this.gameModel = gameModel;
            }
}
