package com.sample_problem_for_hashmap_and_hashing.implementation_of_custum_hashmap;
import java.util.*;
//creating the custum hashmap
class CustomHashMap<K, V> {
    //creating attributes for the hashmap
    private static final int SIZE = 16;
    private LinkedList<Entry<K, V>>[] buckets;

    //creating the constructor to initialize the hashmap
    public CustomHashMap() {
        buckets = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    //creating the method to get the index of the key
    private int getBucketIndex(K key) {
        return Math.abs(key.hashCode() % SIZE);
    }

    //creating method to put the key value on the hashmap
    public void put(K key, V value) {
        int index = getBucketIndex(key);
        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }
        buckets[index].add(new Entry<>(key, value));
    }

    //creating method to get the value of the particular key
    public V get(K key) {
        int index = getBucketIndex(key);
        for (Entry<K, V> entry : buckets[index]) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
        }
        return null;
    }

    //creating the method to remove the value of the hashmap at some key
    public void remove(K key) {
        int index = getBucketIndex(key);
        buckets[index].removeIf(entry -> entry.key.equals(key));
    }

    //creating method to display the key_values pair of the hash map
    public void display() {
        for (int i = 0; i < SIZE; i++) {
            if (!buckets[i].isEmpty()) {
                for (Entry<K, V> entry : buckets[i]) {
                    System.out.println("Key: " + entry.key + ", Value: " + entry.value);
                }
            }
        }
    }

    //creating generic class to store key values
    private static class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    //Main method to control the flow of execution
    public static void main(String[] args) {
        CustomHashMap<String, Integer> map = new CustomHashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        System.out.println("Value for 'Two': " + map.get("Two"));
        map.remove("Two");

        System.out.println("After removing 'Two':");
        map.display();
    }
}

