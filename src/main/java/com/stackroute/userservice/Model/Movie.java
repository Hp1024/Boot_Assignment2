package com.stackroute.userservice.Model;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(description = "All details about the Movies. ")
@Document
public class Movie {
    @Id
    @ApiModelProperty(notes = "id of the movie")
    private long id;
    @ApiModelProperty(notes = "title of the movie")
    private String  original_title;
    @ApiModelProperty(notes = "language of the movie")
    private String  original_language;
    @ApiModelProperty(notes = "released date of the movie")
    private String  release_date;
}
