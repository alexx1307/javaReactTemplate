package com.lukaaps.myfm;

import com.lukaaps.myfm.domain.player.Player;
import com.lukaaps.myfm.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by lukas on 15.01.2017.
 */
@Component
public class DatabaseLoader implements CommandLineRunner {

    private final PlayerRepository repository;

    @Autowired
    public DatabaseLoader(PlayerRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new Player("Joe Biden", 45, 5));
        this.repository.save(new Player("President Obama", 54, 8));
        this.repository.save(new Player("Crystal Mac", 34, 12));
        this.repository.save(new Player("James Henry", 33, 2));
    }
}
