package org.letter;

import java.util.Arrays;
import java.util.Comparator;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) throws Exception{

        MovieLoader loader = new NetworkLoader();

        MovieUI ui = new MovieUI(loader);

        ui.printList();
    }
}



//    public static void main(String[] args) {
//
//
//
//
//        Movie[] arr = {
//
//                new Movie("신과함께-죄와 벌",14411525),
//                new Movie("국제시장",14262766),
//                new Movie("베테랑",13414200),
//                new Movie("아바타",13338863),
//                new Movie("명량",17615314),
//        };
//
//        Arrays.sort(arr);
//
//        System.out.println(Arrays.toString(arr));

//        Player[] arr = {
//                new Player("홍길동",0.3),
//                new Player("임꺽정",0.4),
//                new Player("황진이",0.5),
//        };
//
//        double target = 0.4;
//
//        Arrays.sort(arr, new Comparator<Player>() {
//            @Override
//            public int compare(Player o1, Player o2) {
//                double gab1 = Math.abs(o1.rate - target);
//                double gab2 = Math.abs(o2.rate - target);
//                if(gab1 > gab2){
//                    return 1;
//                }else if (gab1 < gab2) {
//                    return -1;
//                }
//                return 0;
//
//            }
//        });
//
//        System.out.println(Arrays.toString(arr));






