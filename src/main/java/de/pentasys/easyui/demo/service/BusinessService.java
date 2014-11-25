package de.pentasys.easyui.demo.service;

import de.pentasys.easyui.demo.service.model.BusinessModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by paffenan on 25.11.2014.
 */
public class BusinessService {

    public static List<BusinessModel> receiveBusinessData() {
        List<BusinessModel> businessModels = new ArrayList<BusinessModel>();

        BusinessModel model = new BusinessModel();
        model.setVorname("Hans");
        model.setName("Meiser");
        model.setAlter(70);
        businessModels.add(model);

        model = new BusinessModel();
        model.setVorname("Peter");
        model.setName("Pan");
        model.setAlter(30);
        businessModels.add(model);

        return businessModels;
    }
}
