package com.choucair.app.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MortgageRequestModel {
    String firstName;
    String lastName;
    String age;
    String address1;
    String address2;
    String country;
    String typeLoan;
    String typeOfOccupation;
    String yearlyIncome;
    String numberOfYears;

    public String getTypeOfOccupation() {
        return typeOfOccupation;
    }

    public String getYearlyIncome() {
        return yearlyIncome;
    }

    public String getNumberOfYears() {
        return numberOfYears;
    }

    public String getTypeLoan() {
        return typeLoan;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAge() {
        return age;
    }

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCountry() {
        return country;
    }

    public static List<MortgageRequestModel> setData(DataTable dataTable) {
        List<MortgageRequestModel> dates = new ArrayList<>();
        List<Map<String, String>> mapInfo = dataTable.asMaps();
        for (Map<String, String> map : mapInfo) {
            dates.add(new ObjectMapper().convertValue(map, MortgageRequestModel.class));
        }
        return dates;
    }
}
