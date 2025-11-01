package com.sarvatra.annotation.jsonproperty;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Student {

    @JsonProperty(value = "id", defaultValue = "100")
    private int studentId;

    @JsonProperty(value = "name", defaultValue = "Tejas Nillekar")
    private String studentName;

    @Override
    public String toString() {
        return "Student{" +
               "studentId=" + studentId +
               ", studentName='" + studentName + '\'' +
               '}';
    }

}
