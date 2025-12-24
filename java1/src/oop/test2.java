package oop;

import java.util.ArrayList;

public class test2 {

    public static void main(String[] args) {

        String[][] arr1 = {
            {"honggi","hong@nate.com","서울"},
            {"kangkamchan","kangch@nate.com","강원"},
            {"leesoonsin","leesoonsin@nate.com","서울"},
            {"jangbg","jbg3030@naver.com","서울"},
            {"leedo1742","leedo@nate.com","대구"},
            {"hansk_36","hansk_36@gmail.com","대전"},
            {"tejongking","kings_korea@naver.com","전북"},
            {"anjk3634","anjk@gmail.com","제주도"}
        };

        // 1️⃣ 2차원 ArrayList 변환
        ArrayList<ArrayList<String>> all = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            ArrayList<String> al = new ArrayList<>();
            for (int j = 0; j < arr1[i].length; j++) {
                al.add(arr1[i][j]);
            }
            all.add(al);
        }

        // 2️⃣ nate.com AND 서울 사용자 id만 출력
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < all.size(); i++) {
            String email = all.get(i).get(1);
            String area  = all.get(i).get(2);

            if (email.contains("nate.com") && area.equals("서울")) {
                sb.append(all.get(i).get(0)); // id
                sb.append(", ");
            }
        }

        // 마지막 ", " 제거
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 2);
        }

        System.out.println(sb.toString());
    }
}
