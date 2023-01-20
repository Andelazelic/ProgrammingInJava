package com.andelazelic.vjezba4.services;

import com.andelazelic.vjezba4.entitites.Data;
import com.andelazelic.vjezba4.repositories.DataRepository;
import com.andelazelic.vjezba4.repositories.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Service
public class DataServiceImplementation implements DataService {

    @Autowired
    private DataRepository dataRepository;
    @Autowired
   private DeviceRepository deviceRepository;

    @Override
    public Data saveData(Data data, long id) {
        data.setDevice(deviceRepository.findById(id).get());
        return dataRepository.save(data);
    }

    @Override
    public Data getDataById(long id) {
        return dataRepository.findById(id).get();
    }

    @Override
    public List<Data> getAllData() {
        List<Data> datas = new ArrayList<Data>();
        dataRepository.findAll().forEach(data -> datas.add(data));
        return datas;
    }



}
