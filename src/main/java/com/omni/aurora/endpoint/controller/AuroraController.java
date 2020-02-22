package com.omni.aurora.endpoint.controller;

import com.omni.aurora.core.model.Aurora;
import com.omni.aurora.core.repository.AuroraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("test")
public class AuroraController {

    @Autowired
    private AuroraRepository auroraRepository;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Aurora>> getAurora(final String code) {
        return new ResponseEntity<List<Aurora>>(this.auroraRepository.findAllByCode(code), HttpStatus.OK);
    }
}