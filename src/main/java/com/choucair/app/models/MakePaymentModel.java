package com.choucair.app.models;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.datatable.DataTable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MakePaymentModel {
    String phone;
    String name;
    String amount;
    String country;

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public String getAmount() {
        return amount;
    }

    public String getCountry() {
        return country;
    }

    public static List<MakePaymentModel> setData(DataTable dataTable) {
        List<MakePaymentModel> dates = new ArrayList<>();
        List<Map<String, String>> mapInfo = dataTable.asMaps();
        for (Map<String, String> map : mapInfo) {
            dates.add(new ObjectMapper().convertValue(map, MakePaymentModel.class));
        }
        return dates;
    }
}
