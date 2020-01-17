package com.altoros.ssm.services;

import com.altoros.ssm.domain.Payment;
import com.altoros.ssm.domain.PaymentEvent;
import com.altoros.ssm.domain.PaymentState;
import org.springframework.statemachine.StateMachine;

public interface PaymentService {

    Payment newPayment(Payment payment);

    StateMachine<PaymentState, PaymentEvent> preAuth(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> authorize(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> declineAuth(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> authorizePayment(Long paymentId);
}
