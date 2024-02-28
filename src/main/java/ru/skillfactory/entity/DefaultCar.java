package ru.skillfactory.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DefaultCar implements ICar {

    @Autowired
    private IEngine engine;

    public float getSpeed() {
        return engine.getEngineRotation() * 1.5F;
    }

    public void setPressure(final float pedalPressure) {
        engine.setFuelConsumptionRate(pedalPressure);
    }

    @Override
    public void checkSpeed(float speed) {
        if(speed>20){
            System.out.println("Данный автомобиль нарушает установленный скоростной лимит");
        }
    }
}
