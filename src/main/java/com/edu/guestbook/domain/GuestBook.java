package com.edu.guestbook.domain;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class GuestBook {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="post_no")
    private Integer id;


    @Column(length=2000)
    private String post;

    @CreationTimestamp
    private LocalDateTime writeDate;

    private String writer;
}