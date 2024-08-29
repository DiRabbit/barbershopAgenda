package br.com.udemy.planner.service;


import br.com.udemy.planner.model.Record;
import br.com.udemy.planner.repository.RecordRepository;
import org.springframework.stereotype.Service;

@Service
public class RecordService {

    private final RecordRepository repository;

    public RecordService(RecordRepository repository) {
        this.repository = repository;
    }

    public Record save(Record record) {
        return repository.save(record);
    }
}
