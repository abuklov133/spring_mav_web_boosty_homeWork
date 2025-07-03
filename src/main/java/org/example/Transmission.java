package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transmission {
    private int maxTransmission;
    private String mark;

    /*public Transmission() {
        System.out.println("Transmission Bean");
    }*/
}
