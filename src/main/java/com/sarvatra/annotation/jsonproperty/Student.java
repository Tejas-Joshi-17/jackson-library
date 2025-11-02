package com.sarvatra.annotation.jsonproperty;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Student {

    @JsonProperty(value = "id", defaultValue = "100")
    private int studentId;

    @JsonProperty(value = "name", defaultValue = "Tejas Dattatray Joshi")
    private String studentName;

    @JsonProperty(value = "school", defaultValue = "Standford University")
    private String school;

    @JsonProperty(value = "section", access = JsonProperty.Access.WRITE_ONLY)          // At Time of Deserialization value is write but at time of Serialization value is not send
    private String section;

    @JsonProperty(value = "major", access = JsonProperty.Access.WRITE_ONLY)            // At Time of Deserialization value is write but at time of Serialization value is not send
    private String major;

    @JsonProperty(value = "responseCode", access = JsonProperty.Access.READ_ONLY)      // At Time of Serialization value is Sent but at time of Deserialization value is not read
    private String responseCode;

    @JsonProperty(value = "responseTxt", access = JsonProperty.Access.READ_ONLY)       // At Time of Serialization value is Sent but at time of Deserialization value is not read
    private String responseTxt;

}
