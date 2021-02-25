package com.cognizant.ict;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ElectricityBoard {
    /**
     * This method should validate the consumerNumber,
     * if valid return true else this method should throw an user defined exception.
     *
     * The consumerNumber should start with zero and it should contain 10 digits.
     * If the consumerNumber is valid then parse the data and calculate the bill amount
     * else throw a user defined Exception “InvalidConsumerNumberException”
     * with a message "Invalid Consumer Number".
     *
     * @param consumerNumber Consumer Number of an user
     * @return true if pattern is match
     * @throws InvalidConsumerNumberException when pattern is matched
     */
    public boolean validate(String consumerNumber) throws InvalidConsumerNumberException {
        Pattern pattern = Pattern.compile("^0\\d{9}$");
        Matcher matcher = pattern.matcher(consumerNumber);

        if (matcher.matches()) {
            return true;
        } else {
            throw new InvalidConsumerNumberException("Invalid Consumer Number");
        }
    }

    /**
     * This method should add all the ElectricityBill details into the ElectricityBill table.
     * Connect to the database by invoking the establishConnection() method of DBHandler class.
     * @param billList List of ElectricityBills
     * @see ElectricityBill
     */
    public void addBill(List<ElectricityBill> billList) {
        Connection connection = new DBHandler().establishConnection();

        try {
            for (ElectricityBill bill : billList) {
                PreparedStatement preparedStatement = connection.prepareStatement("insert into ElectricityBill values(?,?,?,?,?);");
                preparedStatement.setString(1, bill.getConsumerNumber());
                preparedStatement.setString(2, bill.getConsumerName());
                preparedStatement.setString(3, bill.getConsumerAddress());
                preparedStatement.setInt(4, bill.getUnitsConsumed());
                preparedStatement.setFloat(5, (float) bill.getBillAmount());

                // Adding Electricity Bills to the database
                int result = preparedStatement.executeUpdate();
            }

            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * This method takes the file path as argument
     * and it should parse the data stored in the file and it should validate the consumer number
     * by invoking the validate() method,
     * if valid,construct a ElectricityBill object for each record in the file,
     * then calculate the bill amount by invoking the calculateBillAmount method of ElectricityBill class.
     * After calculating the bill amount, each ElectricityBill should be added into the list and this method should return the list of ElectricityBill.
     * @param filePath Path of the file where records are stored
     * @return List of ElectricityBill of the users after retrieving them from the file
     * @see ElectricityBill
     */
    public List<ElectricityBill> generateBill(String filePath) {
        List<ElectricityBill> electricityBills = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(new BufferedReader(new FileReader(filePath)));

            while (scanner.hasNext()) {
                String[] inputs = scanner.nextLine().split(",");

                try {
                    String consumerNumber = inputs[0];
                    boolean validConsumerNumber = validate(consumerNumber);

                    // Validating consumer number
                    if (validConsumerNumber) {
                        String consumerName = inputs[1];
                        String consumerAddress = inputs[2];
                        int unitsConsumed = Integer.parseInt(inputs[3]);

                        ElectricityBill electricityBill = new ElectricityBill();
                        electricityBill.setConsumerNumber(consumerNumber);
                        electricityBill.setConsumerName(consumerName);
                        electricityBill.setConsumerAddress(consumerAddress);
                        electricityBill.setUnitsConsumed(unitsConsumed);
                        electricityBill.calculateBillAmount();
                        electricityBills.add(electricityBill);
                    }
                } catch (InvalidConsumerNumberException e) {
                    System.out.println(e.getMessage());
                }
            }

            scanner.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return electricityBills;
    }
}
