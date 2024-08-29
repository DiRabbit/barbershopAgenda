package br.com.udemy.planner.controller.dto;

import java.time.LocalDateTime;

public record RecordDTO(
        long id,
        String service,
        String customer,
        String location,
        LocalDateTime dateTime,
        boolean done,
        boolean canceled
) {

}
