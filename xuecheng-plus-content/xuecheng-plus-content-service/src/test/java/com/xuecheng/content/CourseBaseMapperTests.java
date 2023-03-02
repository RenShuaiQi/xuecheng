package com.xuecheng.content;

import com.xuecheng.content.mapper.CourseBaseMapper;
import com.xuecheng.content.model.po.CourseBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author rsq
 * @program xuecheng
 * @return
 **/
@SpringBootTest(classes = ContentApiApplication.class)
public class CourseBaseMapperTests {
    @Autowired
    CourseBaseMapper courseBaseMapper;


    @Test
    void testCourseBaseMapper() {
        CourseBase courseBase = courseBaseMapper.selectById(74L);
        Assertions.assertNotNull(courseBase);
    }
}
