package com.nanyin.test.design.builder;

import org.junit.Test;

public class App {
    @Test
    public void testBuildCharacter(){
        Characters characters = new CharacterBuilder()
                .buildBasicAttributes("jack",18,"man")
                .buildSkill("Emission laser")
                .billdWeapon("Laser Cannon")
                .build();
        characters.showCharacterBoard();
    }
}
