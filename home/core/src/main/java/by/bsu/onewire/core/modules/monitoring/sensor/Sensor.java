package by.bsu.onewire.core.modules.monitoring.sensor;

import by.bsu.onewire.core.device.Device;

/**
 * Interface for sensor devices, e.g. temperature or humidity sensor.
 * 
 * @author Aliaksandr Zlobich
 * 
 */
public interface Sensor extends Device {

    /**
     * Return sensor value.
     */
    public double getValue();

    /**
     * Return sensor type. See {@link SensorType} for available types.
     */
    public SensorType getSensorType();
}