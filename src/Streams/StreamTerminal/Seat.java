package Streams.StreamTerminal;

import java.util.Random;

public record Seat(char rowMaker, int seatNumber, boolean isReserved) {
    public Seat(char rowMaker, int seatNumber) {
        this(rowMaker, seatNumber, new Random().nextBoolean());
    }
}
