package com.shop.dto;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Order {
    private int order_no;
    private int user_no;
    private int ship_no;
    private int order_tot;
    private String order_pay;
    private Date order_udate;
}
