package org.example.night_market.base;

public enum VehicleConstants {

    LAND_VEHICLE (1),
    SEA_VEHICLE (2),
    AIR_VEHICLE (3),

    VEHICLE_MOVE_V_LOW (20),
    VEHICLE_MOVE_LOW (20),
    VEHICLE_MOVE_MID (40),
    VEHICLE_MOVE_HIGH (60),

    VEHICLE_SDP_LOW (35),
    VEHICLE_SDP_MID (50),
    VEHICLE_SDP_HIGH (60),
    VEHICLE_SDP_V_HIGH (100);


    private final int valueI;

    VehicleConstants(int value) {
        this.valueI = value;
    }

    public int getValueI() {
        return valueI;
    }
}
