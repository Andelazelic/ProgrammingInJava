package com.andelazelic.vjezba6_1.services;




import com.andelazelic.vjezba6_1.entitites.Data;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

public interface DataService {

    String saveData(Data data, long id);
    Data getDataById(long id);
   // List<Data> getAllData();
   Page<Data> getAllData(Pageable pageable);
   Data updateData(Data data, Long id);
    void deleteDataById(long id);

//    public String accumulateByYear(String year);
//    public  String monthlyUsage(String year, String month);
//    public ArrayList<String> usageByYear(String year);
    public List<String> filterData(Map<String,String> searchParams);
}
