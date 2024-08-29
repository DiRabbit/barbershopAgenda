package br.com.udemy.planner.controller;

import br.com.udemy.planner.model.Record;
import br.com.udemy.planner.service.RecordService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/record")
@CrossOrigin("*")
public class RecordController {

    private final RecordService recordService;

    public RecordController(RecordService recordService) {
        this.recordService = recordService;
    }

    @PostMapping
    public Record save(@RequestBody Record record) {
        return recordService.save(record);
    }
}
