package com.lab2.customerdomainmongodb.dto;

import com.lab2.customerdomainmongodb.entity.AddressCis;
import com.lab2.customerdomainmongodb.entity.InvestmentLimitCis;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CustomerCisDto {

    Integer cisId ;
    String customer_id;

}
