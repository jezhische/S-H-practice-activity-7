package com.jezh.baseImpl;

import com.jezh.base.Track;
import org.springframework.stereotype.Component;

@Component
public class Shorter implements Track {

    @Override
    public int getDistance() {
        return 17;
    }
}
