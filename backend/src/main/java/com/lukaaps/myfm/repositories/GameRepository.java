package com.lukaaps.myfm.repositories;

import com.lukaaps.myfm.domain.game.Game;
import com.lukaaps.myfm.domain.player.Player;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by lukas on 24.02.2017.
 */
public interface GameRepository extends CrudRepository<Game, Long> {
}
