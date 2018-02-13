package com.cakes.cake.model;

import lombok.Data;
@Data
public class Email {

    private String from;
    private String to;
    private String subject;
    private String content;
}