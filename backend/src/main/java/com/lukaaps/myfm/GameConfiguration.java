package com.lukaaps.myfm;

import com.lukaaps.myfm.domain.events.GameEvent;
import com.lukaaps.myfm.domain.competitions.SimpleCompetitionManager;
import com.lukaaps.myfm.gameLogic.SignificantEventsProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

/**
 * Created by lukas on 07.01.2017.
 */
@Configuration
public class GameConfiguration {
    @Bean
    SignificantEventsProvider allSignificantEventsProvider() {
        SignificantEventsProvider significantEventsProvider = new SignificantEventsProvider();
        significantEventsProvider.setSignificantEvents(Collections.singleton(GameEvent.class));
        return significantEventsProvider;

    }

    @Bean
    public SimpleCompetitionManager simpleCompetitionManager() {
        return new SimpleCompetitionManager();
    }
}
