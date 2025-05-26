package eu.sulikdan.shoppingbackend.entity;

public enum OrderState {
    PROCESSING,
    WAITING_FOR_PAYMENT,
    PAID,
    COMPLETED,
    REJECTED,
//    RETURNED,
    CANCELLED
}
