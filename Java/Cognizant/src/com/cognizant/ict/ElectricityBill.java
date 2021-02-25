package com.cognizant.ict;

public class ElectricityBill {
    private String consumerNumber;
    private String consumerName;
    private String consumerAddress;
    private int unitsConsumed;
    private double billAmount;

    public String getConsumerNumber() {
        return consumerNumber;
    }

    public void setConsumerNumber(String consumerNumber) {
        this.consumerNumber = consumerNumber;
    }

    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    public String getConsumerAddress() {
        return consumerAddress;
    }

    public void setConsumerAddress(String consumerAddress) {
        this.consumerAddress = consumerAddress;
    }

    public int getUnitsConsumed() {
        return unitsConsumed;
    }

    public void setUnitsConsumed(int unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    /**
     * This method should calculate and set the bill amount based on the units consumed.
     *
     * The calculation goes like this
     * If the units Consumed is 650, then the first 100 units are free and for the next 200 units the charges are 1.50/unit, for next 300 units the charges are 3.50/unit and for the remaining 50 units the charges are 5.5 /unit.
     * The total bill amounts to
     * 1625 = (0 (first 100 free then) + 200 * 1.50 + 300 * 3.50 + 50 * 5.5)
     *
     * Units Consumed	    Rate per unit in rupees
     * <= 100	            Free
     * > 100 and <= 300	    1.5
     * > 300 and <= 600	    3.5
     * > 600 and <= 10000	5.5
     * > 1000	            7.5
     */
    public void calculateBillAmount() {
        billAmount = 0;
        int tempUnits = unitsConsumed;


        if (tempUnits > 100) {
            tempUnits -= 100;

            if (tempUnits > 200) {
                tempUnits -= 200;
                billAmount += 200 * 1.5;

                if (tempUnits > 300) {
                    tempUnits -= 300;
                    billAmount += 300 * 3.5;

                    if (tempUnits > 400) {
                        tempUnits -= 400;
                        billAmount += 400 * 5.5;
                        billAmount += tempUnits * 7.5;
                    } else {
                        billAmount += tempUnits * 5.5;
                    }
                } else {
                    billAmount += tempUnits * 3.5;
                }
            } else {
                billAmount += tempUnits * 1.5;
            }
        }
    }
}
