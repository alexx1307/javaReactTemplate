package com.lukaaps.myfm.domain.game;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by lukas on 24.02.2017.
 */
@Entity
@Data
public class Game {
    @Id
    @GeneratedValue
    private Long id;

    private boolean running = false;

    private boolean initialized = false;
}
