package org.example.gradeCalculator;

import java.util.List;

public class Courses {

    private final List<Course> courses;

    public Courses(List<Course> courses) {
        this.courses = courses;
    }

    /**
     * 요구사항 평균학점 계산 방법 = (학점수 * 교과목 평점)의 합계 /수강신청 총학점 수 일급 컬렉션 사용
     */


    public double multipliedCreditAndCourseGrade() {
        return courses.stream()
                .mapToDouble(Course::multiplyCreditAndCourseGrade)
                .sum();
    }

    public int calculateToTotalCompletedCredit() {
        return courses.stream()
                .mapToInt(Course::getCredit)
                .sum();
    }
}
