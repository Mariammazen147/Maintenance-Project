package com.example.LMS.DTOs;

import java.util.List;

public class StudentAssignmentDTO {
    private Long courseId;
    private List<Integer> studentIds;

    public StudentAssignmentDTO() {}

    public StudentAssignmentDTO(Long courseId, List<Integer> studentIds) {
        this.courseId = courseId;
        this.studentIds = studentIds;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public List<Integer> getStudentIds() {
        return studentIds;
    }

    public void setStudentIds(List<Integer> studentIds) {
        this.studentIds = studentIds;
    }
}
