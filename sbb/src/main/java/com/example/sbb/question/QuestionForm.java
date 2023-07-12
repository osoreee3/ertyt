package com.example.sbb.question;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionForm {

    @NotEmpty
    private String subject;

    @NotEmpty
    private String content;
}
