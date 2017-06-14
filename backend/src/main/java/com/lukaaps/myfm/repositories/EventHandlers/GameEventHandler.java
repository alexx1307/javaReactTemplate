package com.lukaaps.myfm.repositories.EventHandlers;

import com.lukaaps.myfm.domain.game.Game;
import com.lukaaps.myfm.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.HandleBeforeSave;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;

/**
 * Created by lukas on 24.02.2017.
 */
@RepositoryEventHandler(Game.class)
public class GameEventHandler {
    private final GameRepository repository;

    @Autowired
    public GameEventHandler(GameRepository repository) {
        this.repository = repository;
    }

    @HandleBeforeSave
    public void handleGameSave(Game newGame) {
        /*if(repository.)
        if(p.isInitialized())*/
    }
}
