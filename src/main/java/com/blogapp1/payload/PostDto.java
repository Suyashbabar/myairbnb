package com.blogapp1.payload;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import lombok.Data;

@Data
public class PostDto {
    private long id;
    @NotEmpty
    @Size(min = 3, message = "title should be atleast3 character")
    private String title;
    @NotEmpty
    private String description;
    private String content;
}
