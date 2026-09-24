package Homework;

import java.util.Scanner;

class Student{
    int id;
    String name;
    String major;
    int phone;

    int getId() {
        return id;
    }

    String getName() {
        return name;
    }

    String getMajor() {
        return major;
    }

    int getPhone() {
        return phone;
    }

    void setId(int id) {
        this.id = id;
    }
    void setName(String name) {
        this.name = name;
    }

    void setMajor(String major) {
        this.major = major;
    }

    void setPhone(int phone) {
        this.phone = phone;
    }

}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] studentArray = new Student[3];

        for (int i = 0; i < 3; i++) {
            studentArray[i] = new Student();

            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");

            String information = sc.nextLine();
            String[] studentInfo = information.split(" ");

            studentArray[i].setId(Integer.parseInt(studentInfo[0]));
            studentArray[i].setName(studentInfo[1]);
            studentArray[i].setMajor(studentInfo[2]);
            studentArray[i].setPhone(Integer.parseInt(studentInfo[3]));
        }

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");

        for (int i = 0; i < 3; i++) {
            System.out.printf(
                    "%d번째 학생: %d %s %s 010-%04d-%04d%n",
                    i + 1,
                    studentArray[i].getId(),
                    studentArray[i].getName(),
                    studentArray[i].getMajor(),
                    (studentArray[i].getPhone() / 10000) % 10000,
                    studentArray[i].getPhone() % 10000
            );
        }
    }
}
