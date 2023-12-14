package com.andelazelic.vjezba4.services;




import com.andelazelic.vjezba4.entitites.Data;

import java.util.ArrayList;
import java.util.List;

public interface DataService {

    Data saveData(Data data, long id);
    Data getDataById(long id);
    List<Data> getAllData();


}
