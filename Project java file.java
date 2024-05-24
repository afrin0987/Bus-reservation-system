import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class Main {
    static String[] ch = {"Manglore Express", "Karwar Express", "Airavat Express", "SeaBird Express", "Newport Express", "VRL Express"};
    static String[][] name = new String[32][100];
    static int[][] number = new int[32][2];
    static int[] num1 = new int[32];
    static int trno;

    public static void main(String[] args) {
        login();
        int num;
        do {
            clearScreen();
            System.out.println("\n\n\n");
            System.out.println("====================================== WELCOME TO BUS RESERVATION SYSTEM ======================================\n\n\n");
            System.out.println("\t\t\t\t\t[1]=> View Bus List\n");
            System.out.println("\n");
            System.out.println("\t\t\t\t\t[2]=> Book Tickets\n");
            System.out.println("\n");
            System.out.println("\t\t\t\t\t[3]=> Cancel Booking\n");
            System.out.println("\n");
            System.out.println("\t\t\t\t\t[4]=> Bus Status Board\n");
            System.out.println("\n");
            System.out.println("\t\t\t\t\t[5]=> Exit\n\n");
            System.out.println("===============================================================================================================\n\n");
            System.out.print("\t\t\tEnter Your Choice:: ");
            Scanner scanner = new Scanner(System.in);
            num = scanner.nextInt();
            switch (num) {
                case 1:
                    bus();
                    break;
                case 2:
                    booking();
                    break;
                case 3:
                    cancel();
                    break;
                case 4:
                    status();
                    break;
            }
            scanner.nextLine();
        } while (num != 5);
        clearScreen();
        System.out.println("\t----------------------------------------------------------------------------------------------------------\n");
        System.out.println("\t\t\t\t\tThank You For Using This System\t\t\t\t\t\t\n");
        System.out.println("\t----------------------------------------------------------------------------------------------------------\n");
    }

    public static void bus() {
        clearScreen();
        System.out.println("\n\n\n");
        System.out.println("=========================================== BUS RESERVATION SYSTEM ============================================\n\n\n");
        System.out.println("\t\t\t\t\t[1]  =>  " + ch[0]);
        System.out.println("\n");
        System.out.println("\t\t\t\t\t[2]  =>  " + ch[1]);
        System.out.println("\n");
        System.out.println("\t\t\t\t\t[3]  =>  " + ch[2]);
        System.out.println("\n");
        System.out.println("\t\t\t\t\t[4]  =>  " + ch[3]);
        System.out.println("\n");
        System.out.println("\t\t\t\t\t[5]  =>  " + ch[4]);
    }

    public static void booking() {
        int i = 0;
        String numstr;
        clearScreen();
        System.out.println("=========================================== BUS RESERVATION SYSTEM ============================================\n\n\n");
        bus();
        System.out.print("Enter the Bus number:--->");
        Scanner scanner = new Scanner(System.in);
        trno = scanner.nextInt();
        clearScreen();
        System.out.println("=========================================== BUS RESERVATION SYSTEM ============================================\n\n\n");
        System.out.println("Your Bus Number is " + trno + " ********** " + ch[trno - 1]);
        status_1(trno);
        File f1;
        String str1 = "32", str2, str3;
        int seat1, seat2, booking = 0;
        if (trno == 1) {
            f1 = new File("tr1.txt");
            try {
                Scanner fileScanner = new Scanner(f1);
                str1 = fileScanner.nextLine();
                fileScanner.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else if (trno == 2) {
            f1 = new File("tr2.txt");
            try {
                Scanner fileScanner = new Scanner(f1);
                str1 = fileScanner.nextLine();
                fileScanner.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else if (trno == 3) {
            f1 = new File("tr3.txt");
            try {
                Scanner fileScanner = new Scanner(f1);
                str1 = fileScanner.nextLine();
                fileScanner.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else if (trno == 4) {
            f1 = new File("tr4.txt");
            try {
                Scanner fileScanner = new Scanner(f1);
                str1 = fileScanner.nextLine();
                fileScanner.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else if (trno == 5) {
            f1 = new File("tr5.txt");
            try {
                Scanner fileScanner = new Scanner(f1);
                str1 = fileScanner.nextLine();
                fileScanner.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        seat1 = Integer.parseInt(str1);
        if (seat1 <= 0) {
            System.out.println("There is no blank seat in this bus ");
        } else {
            System.out.println("\n\n\n\t\t\t\tAvailable Seats:------>" + seat1 + "\n");
            System.out.print("\t\t\t\tNumber of Tickets:----->");
            booking = scanner.nextInt();
            System.out.println("\n");
            seat1 = seat1 - booking;
            numstr = Integer.toString(trno);
            name_number(booking, numstr);
            System.out.println("\n\t\t\t\tThe Total booking amount is " + 200 * booking);
            str1 = Integer.toString(seat1);
            if (trno == 1) {
                f1 = new File("tr1.txt");
                try {
                    FileWriter fileWriter = new FileWriter(f1);
                    fileWriter.write(str1);
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (trno == 2) {
                f1 = new File("tr2.txt");
                try {
                    FileWriter fileWriter = new FileWriter(f1);
                    fileWriter.write(str1);
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (trno == 3) {
                f1 = new File("tr3.txt");
                try {
                    FileWriter fileWriter = new FileWriter(f1);
                    fileWriter.write(str1);
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (trno == 4) {
                f1 = new File("tr4.txt");
                try {
                    FileWriter fileWriter = new FileWriter(f1);
                    fileWriter.write(str1);
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else if (trno == 5) {
                f1 = new File("tr5.txt");
                try {
                    FileWriter fileWriter = new FileWriter(f1);
                    fileWriter.write(str1);
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void name_number(int booking, String numstr) {
        String tempstr, tempstr1 = "status", tempstr2 = "number";
        int number;
        File a, b;
        int i = 0;
        numstr += ".txt";
        tempstr1 += numstr;
        tempstr2 += numstr;
        try {
            a = new File(tempstr1);
            b = new File(tempstr2);
            FileWriter fileWriter1 = new FileWriter(a, true);
            FileWriter fileWriter2 = new FileWriter(b, true);
            for (i = 0; i < booking; i++) {
                System.out.println("============================Enter the details for ticket no " + (i + 1) + "============================\n\n\n");
                System.out.print("\t\t\t\tEnter the seat number:--->");
                Scanner scanner = new Scanner(System.in);
                number = scanner.nextInt();
                System.out.print("\t\t\t\tEnter the name of person:--->");
                scanner.nextLine();
                name[number - 1] = new String[]{scanner.nextLine()};
                System.out.println("\n======================================================================================================\n\n");
                System.out.println("\n");
                tempstr = Integer.toString(number);
                fileWriter1.write(name[number - 1] + " ");
                fileWriter2.write(tempstr + " ");
            }
            fileWriter1.close();
            fileWriter2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int read_number(int trno) {
        String tempstr, tempstr2 = "number";
        File a;
        int i = 0, j = 0, k;
        tempstr = Integer.toString(trno);
        tempstr += ".txt";
        tempstr2 += tempstr;
        try {
            a = new File(tempstr2);
            Scanner fileScanner = new Scanner(a);
            while (fileScanner.hasNext()) {
                number[i][j] = fileScanner.nextInt();
                if (number[i][j] == ' ') {
                    j = 0;
                    i++;
                } else {
                    j++;
                }
            }
            k = i;
            for (i = 0; i < k; i++) {
                num1[i] = number[i][0];
            }
            fileScanner.close();
            return k;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static void read_name(int trno) {
        String tempstr1 = "status";
        File b;
        int i = 0, j = 0, k = 0;
        String numstr = Integer.toString(trno);
        numstr += ".txt";
        tempstr1 += numstr;
        try {
            b = new File(tempstr1);
            Scanner fileScanner = new Scanner(b);
            while (fileScanner.hasNext()) {
                name[i][j] = fileScanner.next();
                if (name[i][j].equals(" ")) {
                    j = 0;
                    i++;
                } else {
                    j++;
                }
            }
            name[i][j] = "Empty";
            k = i;
            fileScanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void status() {
        clearScreen();
        System.out.println("=========================================== BUS RESERVATION SYSTEM ============================================\n\n\n");
        int i, trno, index = 0, j;
        System.out.print("Enter the number of bus:---->");
        Scanner scanner = new Scanner(System.in);
        trno = scanner.nextInt();
        j = read_number(trno);
        read_name(trno);
        System.out.println("\n");
        System.out.println("                                      Bus.no-->" + trno + "---->" + ch[trno - 1]);
        System.out.println("\n");
        String[][] tempname = new String[33][10];
        for (i = 0; i < j; i++) {
            tempname[num1[i]] = name[i];
        }
        for (i = 0; i < 8; i++) {
            System.out.print("\t\t\t\t");
            for (j = 0; j < 4; j++) {
                System.out.print(index + 1 + "." + tempname[index + 1] + "\t");
                index++;
            }
            System.out.println();
        }
    }

    public static void status_1(int trno) {
        System.out.println("Your Bus Number is " + trno + " ********** " + ch[trno - 1]);
        clearScreen();
        System.out.println("=========================================== BUS RESERVATION SYSTEM ============================================\n\n\n");
        int i, index = 0, j;
        j = read_number(trno);
        read_name(trno);
        String[][] tempname = new String[33][10];
        for (i = 0; i < j; i++) {
            tempname[num1[i]] = name[i];
        }
        for (i = 0; i < 8; i++) {
            System.out.print("\t\t\t\t");
            for (j = 0; j < 4; j++) {
                System.out.print(index + 1 + "." + tempname[index + 1] + "\t");
                index++;
            }
            System.out.println();
        }
    }

    public static void cancel() {
        int seat_no, i, j;
        String numstr, tempstr2 = "number", tempstr1 = "status";
        System.out.print("Enter the bus number:---->");
        Scanner scanner = new Scanner(System.in);
        trno = scanner.nextInt();
        numstr = Integer.toString(trno);
        numstr += ".txt";
        tempstr1 += numstr;
        tempstr2 += numstr;
        read_number(trno);
        read_name(trno);
        status_1(trno);
        System.out.print("Enter the seat number:--->");
        seat_no = scanner.nextInt();
        File a, b;
        try {
            a = new File(tempstr1);
            b = new File(tempstr2);
            FileWriter fileWriter1 = new FileWriter(a);
            FileWriter fileWriter2 = new FileWriter(b);
            for (i = 0; i < 32; i++) {
                if (num1[i] == seat_no) {
                    for (j = 0; j < 32; j++) {
                        if (num1[j] != seat_no && num1[j] != 0) {
                            fileWriter2.write(num1[j] + " ");
                            fileWriter1.write(Arrays.toString(name[j]));
                        } else if (num1[j] == seat_no && num1[j] != 0) {
                            name[j] = new String[]{"Empty"};
                        }
                    }
                }
            }
            fileWriter1.close();
            fileWriter2.close();
            System.out.println("\n\n");
            System.out.println("======================================================================================================\n");
            System.out.println("\t\t\t\tYour 200 rupees has been Returned\t\t\t\n");
            System.out.println("======================================================================================================\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void login() {
        int a = 0, i = 0;
        String uname, pword, code;
        String user = "user";
        String pass = "pass";
        do {
            clearScreen();
            System.out.println("\n  =========================  LOGIN FORM  =========================  ");
            System.out.print("                       ENTER USERNAME:-");
            Scanner scanner = new Scanner(System.in);
            uname = scanner.nextLine();
            System.out.print("                       ENTER PASSWORD:-");
            pword = scanner.nextLine();
            if (uname.equals("user") && pword.equals("pass")) {
                System.out.println("  \n\n\n       WELCOME TO OUR SYSTEM !!!! LOGIN IS SUCCESSFUL");
                System.out.println("\n\n\n\t\t\t\tPress any key to continue...");
                scanner.nextLine();
                break;
            } else {
                System.out.println("\n        SORRY !!!!  LOGIN IS UNSUCESSFUL");
                a++;
                scanner.nextLine();
            }
        } while (a <= 2);
        if (a > 2) {
            System.out.println("\nSorry you have entered the wrong username and password for four times!!!");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
        }
        clearScreen();
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}