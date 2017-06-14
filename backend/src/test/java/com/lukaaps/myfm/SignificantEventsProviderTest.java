package com.lukaaps.myfm;

import com.lukaaps.myfm.domain.events.DummyGameEventImpl;
import com.lukaaps.myfm.gameLogic.SignificantEventsProvider;
import org.junit.Test;

import java.util.Collections;

import static org.junit.Assert.*;

/**
 * Created by lukas on 10.01.2017.
 */
public class SignificantEventsProviderTest {
    class BaseEvent extends DummyGameEventImpl {

    }
    class ChildEvent extends BaseEvent {

    }
    class AnotherEvent extends BaseEvent {

    }

    @Test
    public void shouldDerivedClassBeSignificantIfBaseIs() throws Exception {
        SignificantEventsProvider sep = new SignificantEventsProvider();
        sep.setSignificantEvents(Collections.singleton(BaseEvent.class));
        ChildEvent childEvent = new ChildEvent();

        assertTrue(sep.isSignificantEvent(childEvent));

    }

    @Test
    public void shouldEventBeSignificantIfAddedToSignificantSet() throws Exception {
        SignificantEventsProvider sep = new SignificantEventsProvider();

        sep.setSignificantEvents(Collections.singleton(ChildEvent.class));
        ChildEvent childEvent = new ChildEvent();

        assertTrue(sep.isSignificantEvent(childEvent));

    }

    @Test
    public void shouldntEventBeSignificantIfNotAddedToSet() throws Exception {
        SignificantEventsProvider sep = new SignificantEventsProvider();

        sep.setSignificantEvents(Collections.singleton(ChildEvent.class));
        AnotherEvent anotherEvent = new AnotherEvent();

        assertFalse(sep.isSignificantEvent(anotherEvent));

    }

}