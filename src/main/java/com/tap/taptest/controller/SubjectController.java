package com.tap.taptest.controller;

import com.tap.taptest.DTO.request.NewSubjectRequest;
import com.tap.taptest.service.SubjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController

@RequestMapping("/subject")
@RequiredArgsConstructor
public class SubjectController {
    private final SubjectService subjectService;

    @PostMapping("add-subject")
    public ResponseEntity<?> addSubject(@RequestBody NewSubjectRequest newSubjectRequest){
        return ResponseEntity.ok(subjectService.addSubject(newSubjectRequest));

    }
    @GetMapping("/find-all")
    public ResponseEntity<?> getAllSubject(){
        return ResponseEntity.ok(subjectService.getAll());
    }
    @DeleteMapping("/delete-by-id/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id")  Integer id){
        return ResponseEntity.ok(subjectService.deleteById(id));


    }

}
