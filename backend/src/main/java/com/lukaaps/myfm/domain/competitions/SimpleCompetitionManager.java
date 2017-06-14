package com.lukaaps.myfm.domain.competitions;

import com.lukaaps.myfm.gameLogic.GameLogic;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by lukas on 06.01.2017.
 */

public class SimpleCompetitionManager implements ICompetitionsManager {
    @Setter
    private List<ITournament> globalTournaments = new LinkedList();

    @Setter
    private List<ICountryCompetitionsManager> countryCompetitionsManagers =
            new LinkedList<ICountryCompetitionsManager>();

    @Autowired
    @Setter
    private GameLogic game;

    @Override
    public void setupCompetitions() {
        //global competitions setup schedule
        for (ITournament tournament : globalTournaments) {
            game.addEvent(tournament.getSetupEvent());
        }

        //country competitions setup schedule
        for (ICountryCompetitionsManager countryCompetitionsManager : countryCompetitionsManagers) {
            countryCompetitionsManager.scheduleCompetitionsSetup();
        }

    }
}
