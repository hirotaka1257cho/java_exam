import java.time.LocalDate;

public class Ex3 {
public static void main(String[] args) {
    

        int year = 601;  

        String eraName = "";

        if (year >= 2001) {
            eraName = "21世紀";
        } else if (year >= 1901) {
            eraName = "20世紀";
        } else if (year >= 1801) {
            eraName = "19世紀";
        } else if (year >= 1701) {
            eraName = "18世紀";
        } else if (year >= 1601) {
            eraName = "17世紀";
        } else if (year >= 1501) {
            eraName = "16世紀";
        } else if (year >= 1401) {
            eraName = "15世紀";
        } else if (year >= 1301) {
            eraName = "14世紀";
        } else if (year >= 1201) {
            eraName = "13世紀";
        } else if (year >= 1101) {
            eraName = "12世紀";
        } else if (year >= 1001) {
            eraName = "11世紀";
        } else if (year >= 901) {
            eraName = "10世紀";
        } else if (year >= 801) {
            eraName = "9世紀";
        } else if (year >= 701) {
            eraName = "8世紀";
        } else if (year >= 601) {
            eraName = "7世紀";
        } else if (year >= 501) {
            eraName = "6世紀";
        } else if (year >= 401) {
            eraName = "5世紀";
        } else if (year >= 301) {
            eraName = "4世紀";
        } else if (year >= 201) {
            eraName = "3世紀";
        } else if (year >= 101) {
            eraName = "2世紀";
        } else if (year >= 1) {
            eraName = "1世紀";
        }


        System.out.println(year + "年は" + eraName + "です");
    }
}
