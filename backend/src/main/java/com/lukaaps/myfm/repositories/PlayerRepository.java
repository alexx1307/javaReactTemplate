package com.lukaaps.myfm.repositories;

import com.lukaaps.myfm.domain.player.Player;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by lukas on 15.01.2017.
 */
public interface PlayerRepository extends CrudRepository<Player, Long> {
}
