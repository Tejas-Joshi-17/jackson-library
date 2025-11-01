package com.sarvatra.annotation.jsonproperty;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/jackson-library")
public class JsonPropertyController {

    @PostMapping(value = "/value")              // Default Property
    public ResponseEntity<Map<String, Object>> valueProperty(@RequestBody Student studentData) {
        Map<String, Object> map = new HashMap<>();
        map.put("student-id", studentData.getStudentId());
        map.put("student-name", studentData.getStudentName());
        return new ResponseEntity<>(map, HttpStatus.OK);
    }
    // Request :-   { "id" : 1, "name" : "Tejas Joshi" }
    // Response :-  {  "student-name": "Tejas Joshi", "student-id": 1 }

    // Request :-   { "id-card-no" : 1, "name" : "Tejas Joshi" }
    // Response :-  {  "student-name": "Tejas Joshi", "student-id": 0 }

    // Request :-   { "id" : 1, "name" : "Tejas Joshi" }
    // Response :-  {  "student-name": null, "student-id": 1 }



}
