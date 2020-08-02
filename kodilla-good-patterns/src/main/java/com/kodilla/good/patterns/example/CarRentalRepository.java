package com.kodilla.good.patterns.example;

import java.time.LocalDateTime;

public class CarRentalRepository implements RentalRepository {
    @Override
    public void createRental(User user, LocalDateTime from, LocalDateTime to) {
        System.out.println("info sent to repository");
    }
}
