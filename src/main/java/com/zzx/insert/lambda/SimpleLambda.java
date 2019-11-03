package com.zzx.insert.lambda;

import org.junit.Before;
import org.junit.Test;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.zzx.insert.lambda.StreamUseEntity.*;


public class SimpleLambda {
    private List<Album> albums;
    private List<Artist> artists;
    private List<Track> tracks;


    @Before
    public void before() {
        Track track = new Track();
        track.setName("hello lambda");
        Track track1 = new Track();
        track1.setName("It's my life");
        tracks = Arrays.asList(track, track1);

        Artist artist = new Artist();
        artist.setName("theband");
        artist.setMembers(Arrays.asList("zhangsan", "lisi"));
        artist.setOrigin("china");

        Artist artist1 = new Artist();
        artist1.setName("theband2");
        artist1.setMembers(Arrays.asList("holi", "mota"));
        artist1.setOrigin("america");

        Artist artist2 = new Artist();
        artist2.setName("person");
        artist2.setMembers(Arrays.asList("zhangsan", "lisi", "wang"));
        artist2.setOrigin("china");
        artists = Arrays.asList(artist, artist1, artist2);

        Album album = new Album();
        album.setArtists(artists);
        album.setTracks(tracks);
        album.setName("album");

        Track trackx = new Track();
        trackx.setName("hello lambda 2");
        Track trackx1 = new Track();
        trackx1.setName("It's my life 2");
        List<Track> tracksx = Arrays.asList(trackx, trackx1);

        Artist artistx = new Artist();
        artistx.setName("theband 2");
        artistx.setMembers(Arrays.asList("zhangsan 2", "lisi 2"));
        artistx.setOrigin("china");

        Artist artistx1 = new Artist();
        artistx1.setName("theband2 2");
        artistx1.setMembers(Arrays.asList("holi 2", "mota 2"));
        artistx1.setOrigin("america");

        Artist artistx2 = new Artist();
        artistx2.setName("person 2");
        artistx2.setMembers(Arrays.asList("zhangsan 2", "lisi 2"));
        artistx2.setOrigin("china");
        List<Artist> artistsx = Arrays.asList(artistx, artistx1, artistx2);
        Album album1 = new Album();
        album1.setArtists(artistsx);
        album1.setTracks(tracksx);
        album1.setName("album1");
        albums = Arrays.asList(album, album1);
    }


    public void test(BinaryOperator<Integer> plus, int a, int b) {
        plus.apply(a, b);
    }

    public interface MyFunction<R, T> {
        R apply(T t);
    }


    public void streamTest() {
        List<String> collected = Stream.of("a", "b", "c")
                .collect(Collectors.toList());
        System.out.println(collected.get(0));
    }


    public void listStream() {
        List<Integer> integerList = Arrays.asList(1, 2, 3);
        Set<String> stringList = integerList.stream().map(String::valueOf).collect(Collectors.toCollection(HashSet::new));
    }


    /**
     * 收集器
     */
    @Test
    public void biggestGroup() {
        Function<Artist, Integer> getCount = artist -> artist.getMembers().size();

        Optional result = artists.stream().collect(Collectors.maxBy(Comparator.comparing(getCount)));
        result.ifPresent(count -> System.out.println(count));
    }


    /**
     * 收集器，求平均
     */
    @Test
    public void avrageMusicNum() {
        double result = albums.stream().collect(Collectors.averagingDouble(target -> target.getTracks().size()));
        System.out.println(result);
    }


    /**
     * 收集器，布尔分组
     */
    @Test
    public void partitionTest() {
        Map<Boolean, List<Artist>> result = albums.stream()
                .flatMap(art -> art.getArtists().stream())
                .collect(Collectors.partitioningBy(arts -> arts.getName().startsWith("the")));
        System.out.println(result);
    }

    /**
     * 收集器，分组
     */
    @Test
    public void groupingByTest() {
        Map<String, List<Artist>> result = albums.stream()
                .flatMap(art -> art.getArtists().stream())
                .collect(Collectors.groupingBy(Artist::getName));
        System.out.println(result);
    }

    /**
     * 收集器，字符串处理
     */
    @Test
    public void toStringTest() {
        String result = albums.stream()
                .flatMap(art -> art.getArtists().stream())
                .map(Artist::getName)
                .collect(Collectors.joining(",", "[", "]"));
        System.out.println(result);
    }

    /**
     * 收集器，分组，并且分组后计数
     */
    @Test
    public void groupingCountTest() {
        Map<String, Long> result = albums.stream()
                .flatMap(art -> art.getArtists().stream())
                .collect(Collectors.groupingBy(Artist::getName, Collectors.counting()));
        System.out.println(result);
    }

    /**
     * 收集器嵌套，分组，并且分组后把一种结果转换成另一种结果
     */

    @Test
    public void groupingCountTest2() {
        Map<String, List<Character>> result = albums.stream()
                .flatMap(art -> art.getArtists().stream())
                .collect(Collectors.groupingBy(Artist::getName, Collectors.mapping(Artist::getName, Collectors.mapping(str -> str.charAt(0), Collectors.toList()))));
        System.out.println(result);
    }

    @Test
    public void diyCollector() {
    }

    /**
     * 练习
     */
    @Test
    public void practice(){
        Map<String, Long> result = Stream.of("sadf", "sdf", "sdf").collect(Collectors.groupingBy(a-> a, Collectors.counting()));
        System.out.println(result);
    }

    /**
     * 并行化
     */
    @Test
    public void mapStream(){
        Map map = new HashMap();
        Stream stream = map.entrySet().stream();
        stream.peek(System.out::println);
    }

}
