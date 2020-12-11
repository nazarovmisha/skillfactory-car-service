package ru.skillfactory.entity;

import org.springframework.stereotype.Component;

@Component
public class DefaultEngine implements IEngine {

    private float engineRotation = 0;

    public float getEngineRotation() {
        return engineRotation;
    }

    public void setFuelConsumptionRate(final float fuelFlow) {
        engineRotation = fuelFlow * 1.5F;
    }
}


