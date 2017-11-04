package com.jezh.baseImpl;

import com.jezh.base.Track;
import org.springframework.stereotype.Component;

@Component
public class Longer implements Track {

    @Override
    public int getDistance() {
        return 951;
    }
}
