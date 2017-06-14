package com.lukaaps.myfm.domain.competitions;

import com.lukaaps.myfm.domain.events.GameEvent;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.time.LocalDateTime;

/**
 * Created by lukas on 06.01.2017.
 */
public class SetupCompetitionEvent extends GameEvent{
    public SetupCompetitionEvent(LocalDateTime executionTime) {
        super(executionTime);
    }

    @Override
    public void execute() {
        throw new NotImplementedException();
    }
}
