package com.example.model;

import jakarta.persistence.*;

@Entity
@Table(name="payment")
public class PaymentPreference {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "payment_preference_seq")
    @SequenceGenerator(name = "payment_preference_seq", sequenceName = "payment_preference_seq", allocationSize = 1)
    private Long id;
    private String username;
    private String paymentMethod;
    
    // Getters and setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPaymentMethod() { return paymentMethod; }
    public void setPaymentMethod(String paymentMethod) { this.paymentMethod = paymentMethod; }
}
