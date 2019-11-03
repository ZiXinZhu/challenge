package com.zzx.insert.lambda.define;

import javax.swing.text.DateFormatter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import static org.junit.Assert.*;


public class Action {
    public static void main(String[] args) throws ParseException {
        int a = 1;
        new Thread(() -> {
//            int a=1;
            int b = 2;
            System.out.println(a + b);
        }).start();

        Operate operate = (c) -> c > 5;

        boolean b=operate.getResult(3);
        System.out.println(b);

        ThreadLocal<DateFormatter> threadLocal = ThreadLocal
                .withInitial(() -> new DateFormatter(new SimpleDateFormat("dd-MM-yyyy")));
        System.out.println(threadLocal.get().valueToString(new Date()));

        List<Artist> list=new ArrayList<>();
        Artist artist1=new Artist("1",15,"chain");
        Artist artist2=new Artist("2",16,"American");
        Artist artist3=new Artist("3",17,"chain");
        Artist artist4=new Artist("4",18,"chain");
        list.add(artist1);
        list.add(artist2);
        list.add(artist3);
        list.add(artist4);

        long count =list.stream().filter(artist->{
        System.out.println(artist.getName());
        return artist.getFrom().equals("chain");
        }).count();

        List<String> collected = Stream.of("a", "b", "c").collect(Collectors.toList());
        assertEquals(Arrays.asList("a", "b", "c"), collected);


        Artist artist=list.stream().min(Comparator.comparing(age->age.getAge())).get();
        System.out.println(artist.getAge());
    }

}
