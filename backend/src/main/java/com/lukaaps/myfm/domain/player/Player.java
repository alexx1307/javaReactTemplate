package com.lukaaps.myfm.domain.player;

import com.lukaaps.myfm.domain.player.skills.PlayerSkills;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import javax.crypto.ShortBufferException;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 * Created by lukas on 23.12.2016.
 */
@Data
@Entity
/*@RequiredArgsConstructor
@NoArgsConstructor*/
public class Player {

/*    @Transient
    private PlayerSkills skills;
    @Transient
    private PlayerData data;*/

    @Id
    @GeneratedValue
    private Long id;
    //@NonNull
    private String name;
    //@NonNull
    private int age;
    //@NonNull
    private int skills;

    private Player() {
    }

    public Player(String name, int age, int skills) {
        this.name = name;
        this.age = age;
        this.skills = skills;
    }
}