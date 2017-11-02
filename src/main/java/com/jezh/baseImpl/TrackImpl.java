package com.jezh.baseImpl;

import com.jezh.base.Track;

public class TrackImpl implements Track {

    private int distance;

    public TrackImpl(int distance) {
        this.distance = distance;
    }

    @Override
    public int getDistance() {
        return distance;
    }
}
