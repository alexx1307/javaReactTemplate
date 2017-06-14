package com.lukaaps.myfm;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * Created by lukas on 17.01.2017.
 */
@Component
public class LoggingBean implements InitializingBean {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private Environment env;

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("**************************************");
        logActiveSpringProfiles();
        logRelevantProperties();
        logger.info("**************************************");
    }


    private void logActiveSpringProfiles() {

        String activeProfilesKey = "spring.profiles.active";
        String activeSpringProfiles = getValueOfProperty(activeProfilesKey, null);
        logger.info("{} = {}", activeProfilesKey, activeSpringProfiles);
    }

    private void logRelevantProperties() {
        String propertyKey = "game.startDate";
        String propertyValue = getValueOfProperty(propertyKey, null);
        logger.info("{} = {}", propertyKey, propertyValue);
    }

    private final String getValueOfProperty(final String key, final String defaultValue) {
        String propertyValue = env.getProperty(key);
        if (propertyValue == null) {
            propertyValue = defaultValue;
            logger.warn("No property of key {} defined. Default property value will be used: {}",
                    key, defaultValue);
        }
        if (propertyValue == null) {
            logger.warn("No property set for key {}", key);
        }
        return propertyValue;
    }
}
