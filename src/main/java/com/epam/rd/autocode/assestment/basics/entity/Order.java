package com.epam.rd.autocode.assestment.basics.entity;

public class Order {
    private int orderId;
    private Book book;
    private int quantity;
    private double totalPrice;

    public static class Order {
        private int orderId;
        private Book book;
        private int quantity;
        private double totalPrice;

        public Order(int orderId, Book book, int quantity, double totalPrice) {
            this.orderId = orderId;
            this.book = book;
            this.quantity = quantity;
            this.totalPrice = totalPrice;
        }

        // Геттери та сеттери
        public int getOrderId() {
            return orderId;
        }

        public void setOrderId(int orderId) {
            this.orderId = orderId;
        }

        public Book getBook() {
            return book;
        }

        public void setBook(Book book) {
            this.book = book;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public double getTotalPrice() {
            return totalPrice;
        }

        public void setTotalPrice(double totalPrice) {
            this.totalPrice = totalPrice;
        }

        @Override
        public String toString() {
            return "Order{" +
                    "orderId=" + orderId +
                    ", book=" + book +
                    ", quantity=" + quantity +
                    ", totalPrice=" + totalPrice +
                    '}';
        }
    }
}