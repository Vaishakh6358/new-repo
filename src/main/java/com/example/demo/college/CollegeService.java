package com.example.demo.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class CollegeService{
    @Autowired
    private CollegeRepository collegeRepository;


    public ResponseVO persistMethod (RequestVO requestVO)
    {

        CollegePO collegePO = new CollegePO();
        collegePO.setCollegeName(requestVO.getCollegeName());
        collegePO.setCollegeDepartment(requestVO.getCollegeDepartment());
        collegePO.setCollegeId(requestVO.getCollegeId());
        CollegePO collegeResponsePO = collegeRepository.save(collegePO);

        ResponseVO responseVO = new ResponseVO();
        responseVO.setCollegeId(collegeResponsePO.getCollegeId());
        responseVO.setCollegeName(collegeResponsePO.getCollegeName());
        responseVO.setCollegeDepartment(collegePO.getCollegeDepartment());

        return responseVO;
    }
}
