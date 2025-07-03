package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Engine {
    private String mark;
    private int power;
    private int cylindersCount;

   /* public Engine() {
        System.out.println("Engine bean has created");
    }*/
}
