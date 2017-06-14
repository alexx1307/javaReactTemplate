package com.lukaaps.myfm.gameLogic;

import com.lukaaps.myfm.domain.competitions.ICompetitionsManager;
import com.lukaaps.myfm.domain.events.GameEvent;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * Created by lukas on 05.01.2017.
 */

@Component
public class GameLogic {

     private EventsQueue eventsQueue = new EventsQueue();

    //TODO do wywalenia gdzies
    //setter for testing purpose
    @Setter
    private LocalDateTime currentTime;

    @Autowired
    @Setter
    private ICompetitionsManager competitionsManager;

    @Autowired
    @Setter
    private SignificantEventsProvider significantEventsProvider;

    public void start() {
        initializeGame();
        simulate();
    }

    public void initializeGame() {
        currentTime = LocalDateTime.MIN;
        competitionsManager.setupCompetitions();
        //simulateForclyUntil(gameProperties.getGameStartTime());
    }

    private void simulateForclyUntil(LocalDateTime untilTime) {
        while(eventsQueue.isNotEmpty() && eventsQueue.nextEvent().getExecutionTime().isBefore
                (untilTime)){
            doSingleStep();
        }
    }

    public void doSingleStep() {

        GameEvent nextEvent = eventsQueue.nextEvent();
        nextEvent.execute();
    }

    public void doStepsUntilSignificantEvent() {
        GameEvent nextEvent = eventsQueue.popEvent();
        while (significantEventsProvider.isSignificantEvent(nextEvent)) {
            doSingleStep();
        }
    }

    public void simulate() {
        /*while (currentTime.isAfter(gameProperties.getGameFinishTime())) {
            doSingleStep();
        }*/
        return;
    }

    public void addEvent(GameEvent event) {
        if(event.getExecutionTime().isBefore(currentTime))
            throw new IllegalArgumentException("Event date cannot be in the past. CurrentTime " +
                    "date="+currentTime.toString()+", eventDate="+event.getExecutionTime()
                    .toString());
        eventsQueue.addEvent(event);
    }
}
