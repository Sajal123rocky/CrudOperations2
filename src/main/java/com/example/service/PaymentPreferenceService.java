package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.PaymentPreference;
import com.example.repository.PaymentPreferenceRepository;

@Service
public class PaymentPreferenceService {
	@Autowired
    private PaymentPreferenceRepository repository;

    public void savePaymentPreference(String username, String paymentMethod) {
        PaymentPreference preference = repository.findByUsername(username);
        if (preference == null) {
            preference = new PaymentPreference();
            preference.setUsername(username);
        }
        preference.setPaymentMethod(paymentMethod);
        repository.save(preference);
    }

    public String getPaymentPreference(String username) {
        PaymentPreference preference = repository.findByUsername(username);
        return preference != null ? preference.getPaymentMethod() : "Payment preference not found";
    }
}
