package com.lukaaps.myfm.domain.events;


import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

/**
 * Created by lukas on 02.01.2017.
 */
@RequiredArgsConstructor
public abstract class GameEvent {
    @NonNull
    @Getter
    private LocalDateTime executionTime;

    public abstract void execute();
}
