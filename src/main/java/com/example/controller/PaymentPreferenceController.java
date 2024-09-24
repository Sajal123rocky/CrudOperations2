package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.PaymentPreferenceService;

@RestController
public class PaymentPreferenceController {
	@Autowired
    private PaymentPreferenceService service;

    @PostMapping("/setPaymentPreference")
    public ResponseEntity<String> setPaymentPreference(@RequestParam String username, @RequestParam String paymentMethod) {
        service.savePaymentPreference(username, paymentMethod);
        return ResponseEntity.ok("Payment preference saved");
    }

    @GetMapping("/getPaymentPreference")
    public ResponseEntity<String> getPaymentPreference(@RequestParam String username) {
        String paymentMethod = service.getPaymentPreference(username);
        return ResponseEntity.ok(paymentMethod);
    }
}
