package Homework;

import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        Map<String,String> IdPass = new HashMap<String,String>();
        Scanner sc = new Scanner(System.in);
        IdPass.put("myId","myPass");
        IdPass.put("myId2","myPass2");
        IdPass.put("myId3","myPass3");

        Boolean login = true;
        while (login){
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id: ");
            String id = sc.next().trim();
            if(IdPass.containsKey(id)){
                System.out.print("password: ");
                String pass = sc.next().trim();
                if(IdPass.get(id).equals(pass)){
                    System.out.println("id와 비밀번호가 일치합니다.");
                    login = false;
                } else {
                    System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
                    continue;
                }
            } else {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요\n");
                continue;
            }
        }
    }
}
