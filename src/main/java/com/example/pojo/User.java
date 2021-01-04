package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 方俊
 * @date 2021-1-4 , 0004 13:56
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User{
  private Long id;
  private String name;
  private Integer age;
  private String email;

}
