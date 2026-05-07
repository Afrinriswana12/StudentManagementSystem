package com.example;

import javax.swing.*;
import java.util.ArrayList;

public class App {

    static ArrayList<Double> expenses = new ArrayList<>();

    public static void main(String[] args) {

        JFrame frame = new JFrame("Expense Tracker");

        JTextField amountField = new JTextField();
        amountField.setBounds(150, 50, 150, 30);

        JButton addButton = new JButton("Add");
        addButton.setBounds(150, 100, 100, 30);

        JButton totalButton = new JButton("Total");
        totalButton.setBounds(150, 140, 100, 30);

        JLabel result = new JLabel("");
        result.setBounds(50, 200, 300, 30);

        addButton.addActionListener(e -> {
            try {
                double amount = Double.parseDouble(amountField.getText());
                expenses.add(amount);
                result.setText("Added: " + amount);
            } catch (Exception ex) {
                result.setText("Invalid input!");
            }
        });

        totalButton.addActionListener(e -> {
            double total = 0;
            for (double exp : expenses) {
                total += exp;
            }
            result.setText("Total: " + total);
        });

        frame.add(amountField);
        frame.add(addButton);
        frame.add(totalButton);
        frame.add(result);

        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}