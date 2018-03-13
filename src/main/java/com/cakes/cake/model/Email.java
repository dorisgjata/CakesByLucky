package com.cakes.cake.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
public class Email {
@Getter @Setter
    private String from;
 @Getter @Setter
    private String to;
@Getter @Setter    
    private String subject;
@Getter @Setter
    private String content;
}