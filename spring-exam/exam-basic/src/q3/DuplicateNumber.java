package q3;

/**
 * Q3. 配列NUMBERSに含まれる値のうち、2回以上出現する数値をすべて出力しなさい。
 *
 * @author y.morinaga
 */
public class DuplicateNumber {

    private static final int[] NUMBERS = { 1, 1, 2, 1, 3, 1, 4, 2, 5, 3, 6, 6,
        7, 3, 8, 1, 9, 6, 10, 6, 11, 4, 12, 1, 13, 3, 14, 5, 15, 15, 16,
        10, 17, 16, 18, 17, 19, 4, 20, 19, 21, 9, 22, 22, 23, 6, 24, 14,
        25, 14, 26, 24, 27, 27, 28, 27, 29, 27, 30, 6, 31, 8, 32, 28, 33,
        25, 34, 19, 35, 27, 36, 24, 37, 2, 38, 22, 39, 22, 40, 18, 41, 13,
        42, 30, 43, 9, 44, 23, 45, 5, 46, 11, 47, 5, 48, 18, 49, 1, 50, 21,
        51, 26, 52, 17, 53, 30, 54, 33, 55, 22, 56, 6, 57, 12, 58, 14, 59,
        37, 60, 42, 61, 48, 62, 18, 63, 45, 64, 15, 65, 8, 66, 15, 67, 4,
        68, 54, 69, 39, 70, 36, 71, 5, 72, 19, 73, 51, 74, 45, 75, 32, 76,
        55, 77, 70, 78, 63, 79, 35, 80, 24, 81, 79, 82, 18, 83, 72, 84, 80,
        85, 4, 86, 13, 87, 75, 88, 77, 89, 22, 90, 34, 91, 52, 92, 37, 93,
        48, 94, 4, 95, 86, 96, 48, 97, 70, 98, 72, 99, 96, 100, 85 };

    public static void main(String[] args) {
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        int five = 0;
        int six = 0;
        int seven = 0;
        int eight = 0;
        int nine = 0;
        int ten = 0;
        int eleven = 0;
        int twelve = 0;
        int thirteen = 0;
        int fourteen = 0;
        int fifteen = 0;
        int sixteen = 0;
        int seventeen = 0;
        int eighteen = 0;
        int nineteen = 0;
        int twenty = 0;
        int twentyone = 0;
        int twentytwo = 0;
        int twentythree = 0;
        int twentyfour = 0;
        int twentyfive = 0;
        int twentysix = 0;
        int twentyseven = 0;
        int twentyeight = 0;
        int twentynine = 0;
        int thirty = 0;
        int thirtyone = 0;
        int thirtytwo = 0;
        int thirtythree = 0;
        int thirtyfour = 0;
        int thirtyfive = 0;
        int thirtysix = 0;
        int thirtyseven = 0;
        int thirtyeight = 0;
        int thirtynine = 0;
        int fourty = 0;
        int fourtyone = 0;
        int fourtytwo = 0;
        int fourtythree = 0;
        int fourtyfour = 0;
        int fourtyfive = 0;
        int fourtysix = 0;
        int fourtyseven = 0;
        int fourtyeight = 0;
        int fourtynine = 0;
        int fifty = 0;
        int fiftyone = 0;
        int fiftytwo = 0;
        int fiftythree = 0;
        int fiftyfour = 0;
        int fiftyfive = 0;
        int fiftysix = 0;
        int fiftyseven = 0;
        int fiftyeight = 0;
        int fiftynine = 0;
        int sixty = 0;
        int sixtyone = 0;
        int sixtytwo = 0;
        int sixtythree = 0;
        int sixtyfour = 0;
        int sixtyfive = 0;
        int sixtysix = 0;
        int sixtyseven = 0;
        int sixtyeight = 0;
        int sixtynine = 0;
        int seventy = 0;
        int seventyone = 0;
        int seventytwo = 0;
        int seventythree = 0;
        int seventyfour = 0;
        int seventyfive = 0;
        int seventysix = 0;
        int seventyseven = 0;
        int seventyeight = 0;
        int seventynine = 0;
        int eighty = 0;
        int eightyone = 0;
        int eightytwo = 0;
        int eightythree = 0;
        int eightyfour = 0;
        int eightyfive = 0;
        int eightysix = 0;
        int eightyseven = 0;
        int eightyeight = 0;
        int eightynine = 0;
        int ninety = 0;
        int ninetyone = 0;
        int ninetytwo = 0;
        int ninetythree = 0;
        int ninetyfour = 0;
        int ninetyfive = 0;
        int ninetysix = 0;
        int ninetyseven = 0;
        int ninetyeight = 0;
        int ninetynine = 0;
        int onehundred = 0;

        for (int i = 0; i < NUMBERS.length; i++) {
            switch (NUMBERS[i]) {
                case 1: one++; break;
                case 2: two++; break;
                case 3: three++; break;
                case 4: four++; break;
                case 5: five++; break;
                case 6: six++; break;
                case 7: seven++; break;
                case 8: eight++; break;
                case 9: nine++; break;
                case 10: ten++; break;
                case 11: eleven++; break;
                case 12: twelve++; break;
                case 13: thirteen++; break;
                case 14: fourteen++; break;
                case 15: fifteen++; break;
                case 16: sixteen++; break;
                case 17: seventeen++; break;
                case 18: eighteen++; break;
                case 19: nineteen++; break;
                case 20: twenty++; break;
                case 21: twentyone++; break;
                case 22: twentytwo++; break;
                case 23: twentythree++; break;
                case 24: twentyfour++; break;
                case 25: twentyfive++; break;
                case 26: twentysix++; break;
                case 27: twentyseven++; break;
                case 28: twentyeight++; break;
                case 29: twentynine++; break;
                case 30: thirty++; break;
                case 31: thirtyone++; break;
                case 32: thirtytwo++; break;
                case 33: thirtythree++; break;
                case 34: thirtyfour++; break;
                case 35: thirtyfive++; break;
                case 36: thirtysix++; break;
                case 37: thirtyseven++; break;
                case 38: thirtyeight++; break;
                case 39: thirtynine++; break;
                case 40: fourty++; break;
                case 41: fourtyone++; break;
                case 42: fourtytwo++; break;
                case 43: fourtythree++; break;
                case 44: fourtyfour++; break;
                case 45: fourtyfive++; break;
                case 46: fourtysix++; break;
                case 47: fourtyseven++; break;
                case 48: fourtyeight++; break;
                case 49: fourtynine++; break;
                case 50: fifty++; break;
                case 51: fiftyone++; break;
                case 52: fiftytwo++; break;
                case 53: fiftythree++; break;
                case 54: fiftyfour++; break;
                case 55: fiftyfive++; break;
                case 56: fiftysix++; break;
                case 57: fiftyseven++; break;
                case 58: fiftyeight++; break;
                case 59: fiftynine++; break;
                case 60: sixty++; break;
                case 61: sixtyone++; break;
                case 62: sixtytwo++; break;
                case 63: sixtythree++; break;
                case 64: sixtyfour++; break;
                case 65: sixtyfive++; break;
                case 66: sixtysix++; break;
                case 67: sixtyseven++; break;
                case 68: sixtyeight++; break;
                case 69: sixtynine++; break;
                case 70: seventy++; break;
                case 71: seventyone++; break;
                case 72: seventytwo++; break;
                case 73: seventythree++; break;
                case 74: seventyfour++; break;
                case 75: seventyfive++; break;
                case 76: seventysix++; break;
                case 77: seventyseven++; break;
                case 78: seventyeight++; break;
                case 79: seventynine++; break;
                case 80: eighty++; break;
                case 81: eightyone++; break;
                case 82: eightytwo++; break;
                case 83: eightythree++; break;
                case 84: eightyfour++; break;
                case 85: eightyfive++; break;
                case 86: eightysix++; break;
                case 87: eightyseven++; break;
                case 88: eightyeight++; break;
                case 89: eightynine++; break;
                case 90: ninety++; break;
                case 91: ninetyone++; break;
                case 92: ninetytwo++; break;
                case 93: ninetythree++; break;
                case 94: ninetyfour++; break;
                case 95: ninetyfive++; break;
                case 96: ninetysix++; break;
                case 97: ninetyseven++; break;
                case 98: ninetyeight++; break;
                case 99: ninetynine++; break;
                case 100: onehundred++; break;
            }

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
        System.out.println(eight);
        System.out.println(nine);
        System.out.println(ten);
        System.out.println(eleven);
        System.out.println(twelve);
        System.out.println(thirteen);
        System.out.println(fourteen);
        System.out.println(fifteen);
        System.out.println(sixteen);
        System.out.println(seventeen);
        System.out.println(eighteen);
        System.out.println(nineteen);
        System.out.println(twentyone);
        System.out.println(twentytwo);
        System.out.println(twentythree);
        System.out.println(twentyfour);
        System.out.println(twentyfive);
        System.out.println(twentysix);
        System.out.println(twentyseven);
        System.out.println(twentyeight);
        System.out.println(thirty);
        System.out.println(thirtytwo);
        System.out.println(thirtythree);
        System.out.println(thirtyfour);
        System.out.println(thirtyfive);
        System.out.println(thirtysix);
        System.out.println(thirtyseven);
        System.out.println(thirtynine);
        System.out.println(fourtytwo);
        System.out.println(fourtyfive);
        System.out.println(fourtyeight);
        System.out.println(fiftyone);
        System.out.println(fiftytwo);
        System.out.println(fiftyfour);
        System.out.println(fiftyfive);
        System.out.println(sixtythree);
        System.out.println(seventy);
        System.out.println(seventytwo);
        System.out.println(seventyfive);
        System.out.println(seventyseven);
        System.out.println(seventynine);
        System.out.println(eighty);
        System.out.println(eightyfive);
        System.out.println(eightysix);
        System.out.println(ninetysix);
        System.out.println();
        System.out.println();
        }

    }

}
