package com.zzx.insert.redis;

public class MyMap<K,V> {

    private K k;
    private V v;

    public void set(K k, V v){
        this.k=k;
        this.v=v;
    }

    public V get(K k){
        return v;
    }


    @Override
    public String toString() {
        return "MyMap{" +
                "k=" + k +
                ", v=" + v +
                '}';
    }
}
