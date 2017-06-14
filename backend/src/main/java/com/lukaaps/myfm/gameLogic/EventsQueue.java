package com.lukaaps.myfm.gameLogic;

import com.lukaaps.myfm.domain.events.GameEvent;

import java.util.PriorityQueue;

/**
 * Created by lukas on 06.01.2017.
 */
public class EventsQueue {
    private PriorityQueue<GameEvent> queue= new PriorityQueue();
    public GameEvent nextEvent() {
        return queue.peek();
    }

    public GameEvent popEvent() {
        return queue.poll();
    }

    public boolean isNotEmpty() {
        return !queue.isEmpty();
    }

    public void addEvent(GameEvent event) {
        queue.add(event);
    }
}
