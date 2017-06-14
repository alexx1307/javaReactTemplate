package com.lukaaps.myfm.domain.events;

import java.time.LocalDateTime;

/**
 * Created by lukas on 02.01.2017.
 */
public class DummyGameEventImpl extends GameEvent {
    public DummyGameEventImpl(){
        super(LocalDateTime.MIN);
    }

    public DummyGameEventImpl(LocalDateTime executionTime) {
        super(executionTime);
    }

    @Override
    public void execute() {

    }
}
