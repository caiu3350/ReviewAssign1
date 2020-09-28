package Part2;

import java.text.NumberFormat;

public class SalaryTable {

    public static void main(String[] args) {
        int salary = 40000;
        int growth = 0;
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        System.out.format("%10s", "YEAR");
        System.out.format("%20s", "OLD SALARY");
        System.out.format("%20s", "RAISE");
        System.out.format("%20s\n", "NEW SALARY");
        System.out.format("%10s", 1);
        System.out.format("%20s", nf.format(0));
        System.out.format("%20s", nf.format(40000));
        salary += growth;
        System.out.format("%20s\n", nf.format(salary));
        for (int year = 2; year <= 10; year++) {
            System.out.format("%10s", year);
            System.out.format("%20s", nf.format(salary));
            growth = (int) (0.03 * salary);
            System.out.format("%20s", nf.format(growth));
            salary += growth;
            System.out.format("%20s\n", nf.format(salary));
        }

    }
}
