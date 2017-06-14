package com.lukaaps.myfm.gameLogic;

import com.lukaaps.myfm.domain.events.GameEvent;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

/**
 * Created by lukas on 10.01.2017.
 */
public class SignificantEventsProvider {

    @Getter
    @Setter
    private Set<Class<? extends GameEvent>> significantEvents;

    public boolean isSignificantEvent(GameEvent event) {
        Class eventClass = event.getClass();
        while (eventClass != null && !getSignificantEvents().contains(eventClass)) {
            eventClass = eventClass.getSuperclass();
            if (!GameEvent.class.isAssignableFrom(eventClass)) {
                return false;
            }
        }
        return eventClass != null;
    }


}
