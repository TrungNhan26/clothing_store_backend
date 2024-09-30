package com.example.haibazo_test.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "Style")
public class Style {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long StyleId;

    @Column(name = "style_type", nullable = false)
    String styleType;

    // Bạn có thể thêm các trường khác nếu cần
    @Column(name = "description")
    String description;
}