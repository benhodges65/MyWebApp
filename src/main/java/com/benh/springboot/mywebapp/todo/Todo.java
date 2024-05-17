package com.benh.springboot.mywebapp.todo;

import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Todo {
    private int id;
    private String username;
    @Size(min = 10, message="Enter at least 10 Characters")
    private String description;
    private LocalDate targetDate;
    private boolean done;

}
