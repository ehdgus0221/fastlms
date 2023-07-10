package com.zerobase.fastlms.course.model;

import com.zerobase.fastlms.admin.model.CommonParam;
import lombok.Data;

@Data
public class TakeCourseInput {

    String userId;
    long courseId;

    long takeCourseId;  //take_cour_id
}
