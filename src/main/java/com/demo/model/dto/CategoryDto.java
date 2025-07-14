package com.demo.model.dto;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
public class CategoryDto {
private UUID id;
private String name;
private long postcount;
}
