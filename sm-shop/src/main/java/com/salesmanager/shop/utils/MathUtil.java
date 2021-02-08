package com.salesmanager.shop.utils;

public class MathUtil {


    /**
     * Calculates discount percentage
     *
     * @param originalPrice
     * @param finalPrice
     * @return
     */
    public static double calculateDiscountPercentage(String originalPrice, String finalPrice) {
        double originalP = Double.parseDouble(originalPrice.replace("$", ""));
        double finalP = Double.parseDouble(finalPrice.replace("$", ""));

        return ((originalP - finalP) / originalP) * 100;
    }

    /**
     *
     * @param originalPrice
     * @param finalPrice
     * @return
     */
    public static double calculateDiscountPercentage(Double originalPrice, Double finalPrice) {
        return ((originalPrice - finalPrice) / originalPrice) * 100;
    }
}
