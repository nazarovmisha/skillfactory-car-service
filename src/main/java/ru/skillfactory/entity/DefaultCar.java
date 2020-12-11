package ru.skillfactory.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DefaultCar {

    @Autowired
    private IEngine engine;

    public float getSpeed() {
        return engine.getEngineRotation() * 1.5F;
    }

    public void setPedalPressure(final float pedalPressure) {
        engine.setFuelConsumptionRate(pedalPressure);
    }
}
