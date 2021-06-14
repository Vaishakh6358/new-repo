package com.example.demo.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.togglz.core.manager.FeatureManager;

@RestController
@RequestMapping(value = "/api/college")
public class CollegeController {
@Autowired
CollegeService collegeService;
    @PostMapping(value = "/post")
    @ResponseBody
    public ResponseEntity<ResponseVO> persistCollege(@RequestBody RequestVO requestVO)
    {
        if (Features.FEATURE_DUMMY.isActive()) {
            ResponseVO responseVO = collegeService.persistMethod(requestVO);
            return ResponseEntity.status(HttpStatus.CREATED).body(responseVO);
        } else
        {
            return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).body(null);
        }
    }
}
