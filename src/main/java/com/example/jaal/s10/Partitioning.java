/*
 * Java - Algorithms
 * 
 * https://github.com/egalli64/jaal
 */
package com.example.jaal.s10;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Partitioning {
    private static final Logger log = LoggerFactory.getLogger(Partitioning.class);

    public static int pivotLeft(int[] data) {
        log.trace("Partitioning {}", data);
        return pivotLeft(data, 0, data.length);
    }

    private static int pivotLeft(int[] data, int begin, int end) {
        int pivot = data[begin];
        int i = begin;
        int j = end;
        while (true) {
            while (data[++i] < pivot) {
                if (i == end) {
                    break;
                }
            }
            while (data[--j] > pivot) {
                if (j == begin) {
                    break;
                }
            }
            log.trace("i, j = ({}, {})", i, j);

            if (j < i) {
                break;
            }
            swap(data, i, j);
        }

        swap(data, begin, j);
        return j;
    }

    private static void swap(int[] data, int i, int j) {
        log.trace("Swapping {} and {}", data[i], data[j]);

        int buffer = data[i];
        data[i] = data[j];
        data[j] = buffer;
    }
}
