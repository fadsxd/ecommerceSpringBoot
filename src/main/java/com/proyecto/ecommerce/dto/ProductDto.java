package com.proyecto.ecommerce.dto;


import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ProductDto {

  private String name;
  private String description;
  private String imageUrl;
  private double price;
  private int stock;
  private boolean active;
  private UUID categoryId;
}
