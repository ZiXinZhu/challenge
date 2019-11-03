package com.zzx.insert.lambda;

import lombok.Data;
import java.util.List;


public class StreamUseEntity {

    @Data
    public class Test{
        private String s;
    }

    @Data
    public static class Artist {
        private String name;
        private List<String> members;
        private String origin;
    }

    @Data
    public static class Track {
        private String name;
    }

    @Data
    public static class Album {
        private String name;
        private List<Track> tracks;
        private List<Artist> artists;
    }
}
