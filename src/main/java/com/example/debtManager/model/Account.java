package com.example.debtManager.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Account {


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long Id;
  private String cardName;
  private BigDecimal accountBalance;
  private BigDecimal accountLimit;
  private int paymentDate;
  private double interestRate;
  private double apr;
}
