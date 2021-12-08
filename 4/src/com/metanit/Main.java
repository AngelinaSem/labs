package com.metanit;

import com.metanit.*;

import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<FootWear> wardrobe = List.of(
                new Shoes(42)
        );
        int index = Math.abs(new Random().nextInt() % 3);
        FootWear boots = wardrobe.get(index);
    }

    // ...................
}
