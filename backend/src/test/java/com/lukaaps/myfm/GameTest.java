package com.lukaaps.myfm;

import com.lukaaps.myfm.domain.competitions.ICompetitionsManager;
import com.lukaaps.myfm.domain.events.DummyGameEventImpl;
import com.lukaaps.myfm.gameLogic.GameLogic;
import com.lukaaps.myfm.gameLogic.SignificantEventsProvider;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.time.LocalDateTime;

/**
 * Created by lukas on 06.01.2017.
 */
public class GameTest {
    LocalDateTime currentTime = LocalDateTime.of(2016, 7, 13, 15, 30);

    @Mock
    private SignificantEventsProvider significantEventsProviderMock;
    @Mock
    private ICompetitionsManager compManagerMock;

    GameLogic game;

    @Before
    public void init() {
        game = new GameLogic();
        game.setCurrentTime(currentTime);
    }


    @Test
    public void shouldAddEventInFuture() throws Exception {


        LocalDateTime timeAfterCurrentTime = currentTime.plusDays(2);

        DummyGameEventImpl eventToAdd = new DummyGameEventImpl(timeAfterCurrentTime);
        game.addEvent(eventToAdd);

    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldNotAddEventInThePast() throws Exception {
        game.setCurrentTime(currentTime);

        LocalDateTime timeBeforeCurrentTime = currentTime.minusDays(2);

        DummyGameEventImpl eventToAdd = new DummyGameEventImpl(timeBeforeCurrentTime);
        game.addEvent(eventToAdd);


    }

}