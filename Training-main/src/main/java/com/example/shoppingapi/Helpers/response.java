package com.example.shoppingapi.Helpers;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@Data
@ToString
public class response {
    
    int code;
    String msg;
    Object object;
}
