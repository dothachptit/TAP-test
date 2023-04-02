package com.tap.taptest.controller;

import com.tap.taptest.DTO.request.DivisionRequest;
import com.tap.taptest.service.DivisonService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/division")
@RequiredArgsConstructor

public class DivisionController {
    private final DivisonService divisonService;
    private final ModelMapper mapper;
    @PostMapping("/add-division")
    public ResponseEntity<?> addDivision(@RequestBody DivisionRequest divisionRequest){
        return ResponseEntity.ok(divisonService.addDivision(divisionRequest));

    }
    @GetMapping("/find-all")
    public ResponseEntity<?> getAllDivision(){
        return ResponseEntity.ok(divisonService.getAllDivision());
    }
    @DeleteMapping("/delete-by-id/{id}")
    public ResponseEntity<?> deleteDivision(@PathVariable("id") Integer id){
        return ResponseEntity.ok(divisonService.deleteById(id));
    }


}
