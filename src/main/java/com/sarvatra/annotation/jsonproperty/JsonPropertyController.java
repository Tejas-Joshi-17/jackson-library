package com.sarvatra.annotation.jsonproperty;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/@JsonProperty")
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

    @PostMapping(value = "/access")
    public ResponseEntity<Student> accessProperty(@RequestBody Student studentData) {
        Student student = new Student();
        student.setStudentId(studentData.getStudentId());
        student.setStudentName(studentData.getStudentName());
        student.setSchool(studentData.getSchool());
        student.setSection(studentData.getSection());
        student.setMajor(studentData.getMajor());
        student.setResponseCode(studentData.getResponseCode());
        student.setResponseTxt(studentData.getResponseTxt());
        return new ResponseEntity<>(student, HttpStatus.OK);
    }
    // Request  :-  {"id":1, "name":"Tejas Joshi", "school":"Sant Meera School", "section":"A", "major":"Mathematics", "responseCode":"2278", "responseTxt":"EveryThing is ok"}
    // Response :-  {"id":1, "name":"Tejas Joshi", "school":"Sant Meera School", "responseCode":null, "responseTxt":null}

    @PostMapping(value = "defaultValue")
    public ResponseEntity<Student> defaultValueProperty(@RequestBody Student studentData) {
        log.info("Input Data is :- {}", studentData);
        Student student = new Student();
        student.setStudentId(studentData.getStudentId());
        student.setStudentName(studentData.getStudentName());
        student.setSchool(studentData.getSchool());
        student.setSection(studentData.getSection());
        student.setMajor(studentData.getMajor());
        student.setResponseCode(studentData.getResponseCode());
        student.setResponseTxt(studentData.getResponseTxt());
        return new ResponseEntity<>(student, HttpStatus.OK);
    }
    // Request  :-  {"id":1, "name":"Tejas Joshi", "school":"Sant Meera School", "section":"A", "major":"Mathematics", "responseCode":"2278", "responseTxt":"EveryThing is ok"}
    // Response :-  {"id":1, "name":"Tejas Joshi", "school":"Sant Meera School", "responseCode":null, "responseTxt":null}


}
