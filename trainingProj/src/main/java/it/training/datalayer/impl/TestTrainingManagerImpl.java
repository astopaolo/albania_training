package it.training.datalayer.impl;

import org.springframework.stereotype.Component;

import it.training.datalayer.TestTrainingManager;

@Component
public class TestTrainingManagerImpl implements TestTrainingManager {

    @Override
    public double substraction(final double x, final double y) {
	return x - y;

    }

    @Override
    public double sum(final double x, final double y) {

	return x + y;
    }

}
