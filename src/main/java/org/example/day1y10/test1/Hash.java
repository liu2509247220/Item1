package org.example.day1y10.test1;

import java.util.HashSet;

/**
 * @author 86150
 * @date 2024/1/10 9:57
 */
public class Hash {
    private int id;

    public Hash() {
    }

    public Hash(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Hash{" +
                "id=" + id +
                '}';
    }


    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        hashSet.add(new Hash(1));
        hashSet.add(new Hash(2));
        hashSet.add(new Hash(3));
        hashSet.add(new Hash(4));
        hashSet.add(new Hash(5));
        hashSet.add(new Hash(5));

        for (Object o : hashSet) {
            if (o instanceof Hash){
                Hash hash = (Hash) o;
                System.out.println(hash.getId());
            }
        }
    }
}
