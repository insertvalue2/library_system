package dao;

import dto.Student;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

    // 새 학생을 데이터베이스에 추가하는 기능
    public void addStudent(Student student) throws SQLException {
        // 쿼리문....
    }

    // 모든 학생 목록을 조회하는 기능
    public List<Student> getAllStudents() throws SQLException {
        List<Student> studentList = new ArrayList<>();


        return studentList;
    }

    // 학생 student_id로 학생 인증(로그인 용) 기능 만들기
    public Student authenticateStudent(String studentId) throws SQLException {
        // 학생이 정확한 학번을 입력하면 Student 객체가 만들어져서 리턴 됨
        // 학생이 잘못된 학번을 입력하면 null 값을 반환함
        // if -- return new Student();
        return  null;
    }

}
