package com.xuecheng.content.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author rsq
 * @program xuecheng
 * @return
 **/
@Data
public class QueryCourseParams {

    @ApiModelProperty(value = "审核状态")
    private String auditStatus;

    @ApiModelProperty(value = "课程名称")
    private String courseName;

    @ApiModelProperty(value = "发布状态")
    private String publishStatus;

}
